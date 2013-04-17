package com.gomeznetworks.webservices;

public class GpnDataExportServiceSoapProxy implements com.gomeznetworks.webservices.GpnDataExportServiceSoap {
  private String _endpoint = null;
  private com.gomeznetworks.webservices.GpnDataExportServiceSoap gpnDataExportServiceSoap = null;
  
  public GpnDataExportServiceSoapProxy() {
    _initGpnDataExportServiceSoapProxy();
  }
  
  public GpnDataExportServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initGpnDataExportServiceSoapProxy();
  }
  
  private void _initGpnDataExportServiceSoapProxy() {
    try {
      gpnDataExportServiceSoap = (new com.gomeznetworks.webservices.GpnDataExportServiceLocator()).getGpnDataExportServiceSoap();
      if (gpnDataExportServiceSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)gpnDataExportServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)gpnDataExportServiceSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (gpnDataExportServiceSoap != null)
      ((javax.xml.rpc.Stub)gpnDataExportServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.gomeznetworks.webservices.GpnDataExportServiceSoap getGpnDataExportServiceSoap() {
    if (gpnDataExportServiceSoap == null)
      _initGpnDataExportServiceSoapProxy();
    return gpnDataExportServiceSoap;
  }
  
  public com.gomeznetworks.webservices.InitFeedResponse openDataFeed(java.lang.String sUsername, java.lang.String sPassword, int[] iMonitorIdSet, int[] iSiteIdSet, java.lang.String sMonitorClassDesignator, java.lang.String sDataDesignator, java.lang.String sStartTime, java.lang.String sEndTime, java.lang.String sOrderDesignator) throws java.rmi.RemoteException{
    if (gpnDataExportServiceSoap == null)
      _initGpnDataExportServiceSoapProxy();
    return gpnDataExportServiceSoap.openDataFeed(sUsername, sPassword, iMonitorIdSet, iSiteIdSet, sMonitorClassDesignator, sDataDesignator, sStartTime, sEndTime, sOrderDesignator);
  }
  
  public com.gomeznetworks.webservices.InitFeedResponse openDataFeed2(java.lang.String sUsername, java.lang.String sPassword, int[] iMonitorIdSet, int[] iSiteIdSet, java.lang.String sMonitorClassDesignator, java.lang.String sDataDesignator, java.lang.String sLastN, java.lang.String sStartTime, java.lang.String sEndTime, java.lang.String sOrderDesignator) throws java.rmi.RemoteException{
    if (gpnDataExportServiceSoap == null)
      _initGpnDataExportServiceSoapProxy();
    return gpnDataExportServiceSoap.openDataFeed2(sUsername, sPassword, iMonitorIdSet, iSiteIdSet, sMonitorClassDesignator, sDataDesignator, sLastN, sStartTime, sEndTime, sOrderDesignator);
  }
  
  public com.gomeznetworks.webservices.InitFeedResponse openDataFeed3(java.lang.String sUsername, java.lang.String sPassword, int[] iMonitorIdSet, int[] iSiteIdSet, java.lang.String sMonitorClassDesignator, java.lang.String sDataDesignator, java.lang.String sLastN, java.lang.String sStartTime, java.lang.String sEndTime, java.lang.String sOrderDesignator, java.lang.String sTimeDesignator) throws java.rmi.RemoteException{
    if (gpnDataExportServiceSoap == null)
      _initGpnDataExportServiceSoapProxy();
    return gpnDataExportServiceSoap.openDataFeed3(sUsername, sPassword, iMonitorIdSet, iSiteIdSet, sMonitorClassDesignator, sDataDesignator, sLastN, sStartTime, sEndTime, sOrderDesignator, sTimeDesignator);
  }
  
  public com.gomeznetworks.webservices.COpStatusData closeDataFeed(java.lang.String sSessionToken) throws java.rmi.RemoteException{
    if (gpnDataExportServiceSoap == null)
      _initGpnDataExportServiceSoapProxy();
    return gpnDataExportServiceSoap.closeDataFeed(sSessionToken);
  }
  
  public com.gomeznetworks.webservices.CGpnUniversalXmlDocResponse getResponseData(java.lang.String sSessionToken) throws java.rmi.RemoteException{
    if (gpnDataExportServiceSoap == null)
      _initGpnDataExportServiceSoapProxy();
    return gpnDataExportServiceSoap.getResponseData(sSessionToken);
  }
  
  public com.gomeznetworks.webservices.CGpnErrorCodeResponse getErrorCodes() throws java.rmi.RemoteException{
    if (gpnDataExportServiceSoap == null)
      _initGpnDataExportServiceSoapProxy();
    return gpnDataExportServiceSoap.getErrorCodes();
  }
  
  
}