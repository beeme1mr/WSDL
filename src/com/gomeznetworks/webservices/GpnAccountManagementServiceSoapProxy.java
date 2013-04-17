package com.gomeznetworks.webservices;

public class GpnAccountManagementServiceSoapProxy implements com.gomeznetworks.webservices.GpnAccountManagementServiceSoap {
  private String _endpoint = null;
  private com.gomeznetworks.webservices.GpnAccountManagementServiceSoap gpnAccountManagementServiceSoap = null;
  
  public GpnAccountManagementServiceSoapProxy() {
    _initGpnAccountManagementServiceSoapProxy();
  }
  
  public GpnAccountManagementServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initGpnAccountManagementServiceSoapProxy();
  }
  
  private void _initGpnAccountManagementServiceSoapProxy() {
    try {
      gpnAccountManagementServiceSoap = (new com.gomeznetworks.webservices.GpnAccountManagementServiceLocator()).getGpnAccountManagementServiceSoap();
      if (gpnAccountManagementServiceSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)gpnAccountManagementServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)gpnAccountManagementServiceSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (gpnAccountManagementServiceSoap != null)
      ((javax.xml.rpc.Stub)gpnAccountManagementServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.gomeznetworks.webservices.GpnAccountManagementServiceSoap getGpnAccountManagementServiceSoap() {
    if (gpnAccountManagementServiceSoap == null)
      _initGpnAccountManagementServiceSoapProxy();
    return gpnAccountManagementServiceSoap;
  }
  
  public com.gomeznetworks.webservices.CAccountAuthenticationDataExport GSRAuthenticate(java.lang.String sUsername, java.lang.String sPassword) throws java.rmi.RemoteException{
    if (gpnAccountManagementServiceSoap == null)
      _initGpnAccountManagementServiceSoapProxy();
    return gpnAccountManagementServiceSoap.GSRAuthenticate(sUsername, sPassword);
  }
  
  public com.gomeznetworks.webservices.CAccountConfigPackage getAccountConfigPackage(java.lang.String sUsername, java.lang.String sPassword) throws java.rmi.RemoteException{
    if (gpnAccountManagementServiceSoap == null)
      _initGpnAccountManagementServiceSoapProxy();
    return gpnAccountManagementServiceSoap.getAccountConfigPackage(sUsername, sPassword);
  }
  
  public com.gomeznetworks.webservices.CAccountConfigPackage getAccountPackageByMonitorClass(java.lang.String sUsername, java.lang.String sPassword, java.lang.String sMonitorClasss) throws java.rmi.RemoteException{
    if (gpnAccountManagementServiceSoap == null)
      _initGpnAccountManagementServiceSoapProxy();
    return gpnAccountManagementServiceSoap.getAccountPackageByMonitorClass(sUsername, sPassword, sMonitorClasss);
  }
  
  public com.gomeznetworks.webservices.CMonitorDataExport getAccountMonitors(java.lang.String sUsername, java.lang.String sPassword, java.lang.String sMonitorSetDesignator, java.lang.String sStatusDesignator) throws java.rmi.RemoteException{
    if (gpnAccountManagementServiceSoap == null)
      _initGpnAccountManagementServiceSoapProxy();
    return gpnAccountManagementServiceSoap.getAccountMonitors(sUsername, sPassword, sMonitorSetDesignator, sStatusDesignator);
  }
  
  public com.gomeznetworks.webservices.CBackboneDataExport getAccountBackbones(java.lang.String sUsername, java.lang.String sPassword) throws java.rmi.RemoteException{
    if (gpnAccountManagementServiceSoap == null)
      _initGpnAccountManagementServiceSoapProxy();
    return gpnAccountManagementServiceSoap.getAccountBackbones(sUsername, sPassword);
  }
  
  public com.gomeznetworks.webservices.CMonitorDataExport getReferencingMonitors(java.lang.String sUsername, java.lang.String sPassword, int iMonitorId) throws java.rmi.RemoteException{
    if (gpnAccountManagementServiceSoap == null)
      _initGpnAccountManagementServiceSoapProxy();
    return gpnAccountManagementServiceSoap.getReferencingMonitors(sUsername, sPassword, iMonitorId);
  }
  
  public com.gomeznetworks.webservices.CSiteDataExport getAccountSites(java.lang.String sUsername, java.lang.String sPassword) throws java.rmi.RemoteException{
    if (gpnAccountManagementServiceSoap == null)
      _initGpnAccountManagementServiceSoapProxy();
    return gpnAccountManagementServiceSoap.getAccountSites(sUsername, sPassword);
  }
  
  public com.gomeznetworks.webservices.CSiteDataExport getMonitorSites(java.lang.String sUsername, java.lang.String sPassword, int iMonitorId) throws java.rmi.RemoteException{
    if (gpnAccountManagementServiceSoap == null)
      _initGpnAccountManagementServiceSoapProxy();
    return gpnAccountManagementServiceSoap.getMonitorSites(sUsername, sPassword, iMonitorId);
  }
  
  public com.gomeznetworks.webservices.CAccountDataExport getAccountSummary(java.lang.String sUsername, java.lang.String sPassword) throws java.rmi.RemoteException{
    if (gpnAccountManagementServiceSoap == null)
      _initGpnAccountManagementServiceSoapProxy();
    return gpnAccountManagementServiceSoap.getAccountSummary(sUsername, sPassword);
  }
  
  
}