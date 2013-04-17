package com.gomeznetworks.webservices;

import java.io.File;
import java.rmi.RemoteException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.TimeZone;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.apache.axis.AxisFault;

import com.gomeznetworks.jaxb.data.*;
import com.gomeznetworks.jaxb.save.Config;
import com.gomeznetworks.webservices.GpnDataExportServiceSoapProxy;



public class Main{

	/**
	 * @param args
	 * @throws JAXBException 
	 */
	public static final String scriptName = "Regions.Com - FF Agent";
	//public static final int[] scriptId = {9099768}; //8967360
	public static final String gomezUserName = "beems";
	public static final String gomezPassword = "testacct1";
	public static final String gomezType = "BROWSERTX"; //BROWSERTX
	public static final String gomezGroup = "TIMEGROUP";
	public static final String gomezOrder = "TIME";
	public static boolean debug = true;
	
	public static void main(String[] args) throws JAXBException {

			try {
				//checks to see if configuration xml exists
				File f = new File(scriptName + ".xml");
				if(! f.exists()){
					//creates the XML
					ManagementInformation manage = new ManagementInformation(gomezUserName, gomezPassword, scriptName);
					if (debug) System.out.println("File saved!");
					if (! manage.createConfigXml()){
						if (debug) System.out.println("an error has occured");
					}
				} else {
					if (debug) System.out.println("No need to create a new file!");
				}
				
				//This is the the container that stores the received message.
				CGpnUniversalXmlDocResponse response;
				
				//This is the container for the actual XML Doc object, the raw XML can be obtained by calling get_any() method, which returns an array. 
				CGpnUniversalXmlDocResponseXmlDocument xmlDoc;
				
				//JAXB magic Stuff.
				JAXBContext jaxbContext = JAXBContext.newInstance(com.gomeznetworks.jaxb.data.ObjectFactory.class);
				Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
				JAXBContext jaxbContext2 = JAXBContext.newInstance(com.gomeznetworks.jaxb.save.ObjectFactory.class);
				Unmarshaller unmarshaller2 = jaxbContext2.createUnmarshaller();
				
				//Pull in the config file
				Config config = (Config) unmarshaller2.unmarshal(new File(scriptName + ".xml"));
				
				//format time the current time in GMT
				DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				dateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
				Date date = new Date();
				String runTime = dateFormat.format(date).toString();
				
				//Start to pull data
				GpnDataExportServiceSoapProxy soapProxy = new GpnDataExportServiceSoapProxy();
				
				// set script id
				int[] iMonitorIdSet = {Integer.parseInt(config.getScriptId())};
				
				// set site id (an empty array means all sites)
				int[] iSiteIdSet = {};
				
				//Gets the seeionToken
				InitFeedResponse sessionObject = soapProxy.openDataFeed(gomezUserName, gomezPassword, iMonitorIdSet, iSiteIdSet, gomezType, gomezGroup, config.getRuntime(), runTime, gomezOrder);
				//String sessionToken = soSapProxy.openDataFeed(gomezUserName, gomezPassword, iMonitorIdSet, iSiteIdSet, gomezType, "TIMEGROUP", config.getRuntime(), runTime, "TIME").getSessionToken();
				
				//gracefully fail if the open data feed fails for any reason
				if (sessionObject.getStatus().getEStatus().getValue().toString() != "STATUS_SUCCESS"){
					if (debug) System.out.println("Username: " + gomezUserName);
					if (debug) System.out.println("Password: " + gomezPassword);
					if (debug) System.out.println("Monitor ID: " + Arrays.toString(iMonitorIdSet));
					if (debug) System.out.println("Site ID: " + Arrays.toString(iSiteIdSet));
					if (debug) System.out.println("Gomez Type: " + gomezType);
					if (debug) System.out.println("Gomez Group: " + gomezGroup);
					if (debug) System.out.println("Start Time: " + config.getRuntime());
					if (debug) System.out.println("Current Time: " + runTime);
					if (debug) System.out.println("Script Name: " + scriptName);
					if (debug) System.out.println("Script Type: " + config.getTransactionType());
					
					System.out.println(sessionObject.getStatus().getEStatus().getValue());
					System.out.println(sessionObject.getStatus().getSErrorMessage());
					return;
				}
				
				String sessionToken = sessionObject.getSessionToken();
				//String sessionToken = "6f3c953a-f2a9-4eb1-bf25-01c3604f4aeb";

				if (debug) System.out.println(sessionToken);
				
				//Assign the actual response to the empty response container object.
				response = soapProxy.getResponseData(sessionToken);
				
				//checks to see if we get a valid response with the session token
				if (response.getStatus().getEStatus().getValue() != "STATUS_SUCCESS"){
					System.out.println(response.getStatus().getEStatus().getValue());
					System.out.println(response.getStatus().getSErrorMessage());
					return;
				}

				//Close the data feed now, because we are now done with it.
				soapProxy.closeDataFeed(sessionToken);
				
				//Assign the XMLDoc contents of this message to the empty container.
				xmlDoc = response.getXmlDocument();
				
				//Print out the raw XML as a test.
				if (debug) System.out.println(xmlDoc.get_any()[0]);
				
				//Unmarshal the raw XML into the GpnResponseData, I automatically generated this class using the GpnResponseData.xsd
				//I generated the GpnResponseData.xsd by copying and pasting the raw XML from the response message into a reverse engineering tool.
				GpnResponseData responseData = (GpnResponseData) unmarshaller.unmarshal(xmlDoc.get_any()[0]);
				
				if (debug) System.out.println(scriptName + " between " + config.getRuntime() + " to " + runTime);
				System.out.println("Availability: " + responseData.getTXTIMEGROUP().getAvail());
				System.out.println("Average Response Time: " + responseData.getTXTIMEGROUP().getAvgresp());
				System.out.println("Average DNS Time: " + responseData.getTXTIMEGROUP().getAvgDNS());
				System.out.println("Average Connect Time: " + responseData.getTXTIMEGROUP().getAvgConnect());
				System.out.println("Average First Byte Time: " + responseData.getTXTIMEGROUP().getAvgFirstByte());
				System.out.println("Average SSL Time: " + responseData.getTXTIMEGROUP().getAvgSSL());
				
				// Update the time stamp
				config.setRuntime(runTime);
				
				//Update the file
				javax.xml.bind.Marshaller marshaller2 = jaxbContext2.createMarshaller();
				marshaller2.marshal(config, new File(scriptName + ".xml"));
			
			} catch (AxisFault e) {
				// TODO Auto-generated catch block
				System.out.println("Axis");
				e.printStackTrace();
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("Remote");
			} catch (NullPointerException e) {
				e.printStackTrace();
				System.out.println("NullPointer!");
			}
	}

}
