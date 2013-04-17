/**
 * GpnDataExportServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gomeznetworks.webservices;

public interface GpnDataExportServiceSoap extends java.rmi.Remote {

    /**
     * Method for initializing GPN data feed session
     */
    public com.gomeznetworks.webservices.InitFeedResponse openDataFeed(java.lang.String sUsername, java.lang.String sPassword, int[] iMonitorIdSet, int[] iSiteIdSet, java.lang.String sMonitorClassDesignator, java.lang.String sDataDesignator, java.lang.String sStartTime, java.lang.String sEndTime, java.lang.String sOrderDesignator) throws java.rmi.RemoteException;

    /**
     * Method for initializing GPN data feed session
     */
    public com.gomeznetworks.webservices.InitFeedResponse openDataFeed2(java.lang.String sUsername, java.lang.String sPassword, int[] iMonitorIdSet, int[] iSiteIdSet, java.lang.String sMonitorClassDesignator, java.lang.String sDataDesignator, java.lang.String sLastN, java.lang.String sStartTime, java.lang.String sEndTime, java.lang.String sOrderDesignator) throws java.rmi.RemoteException;

    /**
     * Method for initializing GPN data feed session with time designator
     * support
     */
    public com.gomeznetworks.webservices.InitFeedResponse openDataFeed3(java.lang.String sUsername, java.lang.String sPassword, int[] iMonitorIdSet, int[] iSiteIdSet, java.lang.String sMonitorClassDesignator, java.lang.String sDataDesignator, java.lang.String sLastN, java.lang.String sStartTime, java.lang.String sEndTime, java.lang.String sOrderDesignator, java.lang.String sTimeDesignator) throws java.rmi.RemoteException;

    /**
     * Method for terminating GPN data feed session
     */
    public com.gomeznetworks.webservices.COpStatusData closeDataFeed(java.lang.String sSessionToken) throws java.rmi.RemoteException;

    /**
     * Method for returning a set of UTA Response via embedded XML
     * document
     */
    public com.gomeznetworks.webservices.CGpnUniversalXmlDocResponse getResponseData(java.lang.String sSessionToken) throws java.rmi.RemoteException;

    /**
     * Method for exporting raw error code descriptions
     */
    public com.gomeznetworks.webservices.CGpnErrorCodeResponse getErrorCodes() throws java.rmi.RemoteException;
}
