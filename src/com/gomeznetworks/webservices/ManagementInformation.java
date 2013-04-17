package com.gomeznetworks.webservices;

import java.io.File;
import java.rmi.RemoteException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class ManagementInformation {
	
	private String account;
	private String password;
	private String script;

	public ManagementInformation (String accountName, String accountPassword, String scriptName){
		this.account = accountName;
		this.password = accountPassword;
		this.script = scriptName;
	}
	
	public boolean createConfigXml(){
		GpnAccountManagementServiceSoapProxy managementSoapService = new GpnAccountManagementServiceSoapProxy();
		CAccountConfigPackage accountPackage = new CAccountConfigPackage();
		try {
			accountPackage = managementSoapService.getAccountConfigPackage(account, password);
			CMonitorData[] xml = accountPackage.getMonitorSet();

			if (accountPackage.getStatus().getEStatus().toString().equals("STATUS_SUCCESS")){
				for(int x = 0; x < xml.length; x = x+1){
					if (xml[x].getDesc().toString().toLowerCase().equals(script.toLowerCase())){
						DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
						DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
				 
						// root elements
						Document doc = docBuilder.newDocument();
						Element rootElement = doc.createElement("config");
						doc.appendChild(rootElement);
				 
						// script name elements
						Element scriptname = doc.createElement("scriptName");
						scriptname.appendChild(doc.createTextNode(xml[x].getDesc()));
						rootElement.appendChild(scriptname);

						// script id elements
						Element scriptId = doc.createElement("scriptId");
						scriptId.appendChild(doc.createTextNode(xml[x].getMid()));
						rootElement.appendChild(scriptId);
				 
						// transaction type elements
						Element transactionType = doc.createElement("transactionType");
						transactionType.appendChild(doc.createTextNode(xml[x].get_class()));
						rootElement.appendChild(transactionType);
	
						// runtime elements
						// creating the last run time to be one hour back from GMT
						DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
						dateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
						Calendar cal = Calendar.getInstance();
						cal.add(Calendar.HOUR, -1);
						Date date = cal.getTime();
						String runTime = dateFormat.format(date).toString();
						
						Element runtime = doc.createElement("runtime");
						runtime.appendChild(doc.createTextNode(runTime));
						rootElement.appendChild(runtime);
				 
						// write the content into xml file
						TransformerFactory transformerFactory = TransformerFactory.newInstance();
						Transformer transformer = transformerFactory.newTransformer();
						DOMSource source = new DOMSource(doc);
						StreamResult result = new StreamResult(new File(xml[x].getDesc() + ".xml"));

						transformer.transform(source, result);
				 
						break;
					}
				}
			}else{
				System.out.println(accountPackage.getStatus().getEStatus());
				System.out.println(accountPackage.getStatus().getSErrorMessage());
				return false;
			}
			

			
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		} catch (TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
		
	}
}
