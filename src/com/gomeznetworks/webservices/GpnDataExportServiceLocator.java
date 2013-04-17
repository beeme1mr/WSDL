/**
 * GpnDataExportServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gomeznetworks.webservices;

public class GpnDataExportServiceLocator extends org.apache.axis.client.Service implements com.gomeznetworks.webservices.GpnDataExportService {

/**
 * GPN DATA EXPORT WEB SERVICE
 */

    public GpnDataExportServiceLocator() {
    }


    public GpnDataExportServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public GpnDataExportServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for GpnDataExportServiceSoap
    private java.lang.String GpnDataExportServiceSoap_address = "http://gpn.webservice.gomez.com/DataExportService40/GpnDataExportService.asmx";

    public java.lang.String getGpnDataExportServiceSoapAddress() {
        return GpnDataExportServiceSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String GpnDataExportServiceSoapWSDDServiceName = "GpnDataExportServiceSoap";

    public java.lang.String getGpnDataExportServiceSoapWSDDServiceName() {
        return GpnDataExportServiceSoapWSDDServiceName;
    }

    public void setGpnDataExportServiceSoapWSDDServiceName(java.lang.String name) {
        GpnDataExportServiceSoapWSDDServiceName = name;
    }

    public com.gomeznetworks.webservices.GpnDataExportServiceSoap getGpnDataExportServiceSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(GpnDataExportServiceSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getGpnDataExportServiceSoap(endpoint);
    }

    public com.gomeznetworks.webservices.GpnDataExportServiceSoap getGpnDataExportServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.gomeznetworks.webservices.GpnDataExportServiceSoapStub _stub = new com.gomeznetworks.webservices.GpnDataExportServiceSoapStub(portAddress, this);
            _stub.setPortName(getGpnDataExportServiceSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setGpnDataExportServiceSoapEndpointAddress(java.lang.String address) {
        GpnDataExportServiceSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.gomeznetworks.webservices.GpnDataExportServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.gomeznetworks.webservices.GpnDataExportServiceSoapStub _stub = new com.gomeznetworks.webservices.GpnDataExportServiceSoapStub(new java.net.URL(GpnDataExportServiceSoap_address), this);
                _stub.setPortName(getGpnDataExportServiceSoapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("GpnDataExportServiceSoap".equals(inputPortName)) {
            return getGpnDataExportServiceSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "GpnDataExportService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "GpnDataExportServiceSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("GpnDataExportServiceSoap".equals(portName)) {
            setGpnDataExportServiceSoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
