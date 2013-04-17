/**
 * CGpnUniversalGlobalConstraints.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gomeznetworks.webservices;

public class CGpnUniversalGlobalConstraints  implements java.io.Serializable {
    private int maxDataRequestsPerHourPerSession;  // attribute

    private int maxTotalSessions;  // attribute

    public CGpnUniversalGlobalConstraints() {
    }

    public CGpnUniversalGlobalConstraints(
           int maxDataRequestsPerHourPerSession,
           int maxTotalSessions) {
           this.maxDataRequestsPerHourPerSession = maxDataRequestsPerHourPerSession;
           this.maxTotalSessions = maxTotalSessions;
    }


    /**
     * Gets the maxDataRequestsPerHourPerSession value for this CGpnUniversalGlobalConstraints.
     * 
     * @return maxDataRequestsPerHourPerSession
     */
    public int getMaxDataRequestsPerHourPerSession() {
        return maxDataRequestsPerHourPerSession;
    }


    /**
     * Sets the maxDataRequestsPerHourPerSession value for this CGpnUniversalGlobalConstraints.
     * 
     * @param maxDataRequestsPerHourPerSession
     */
    public void setMaxDataRequestsPerHourPerSession(int maxDataRequestsPerHourPerSession) {
        this.maxDataRequestsPerHourPerSession = maxDataRequestsPerHourPerSession;
    }


    /**
     * Gets the maxTotalSessions value for this CGpnUniversalGlobalConstraints.
     * 
     * @return maxTotalSessions
     */
    public int getMaxTotalSessions() {
        return maxTotalSessions;
    }


    /**
     * Sets the maxTotalSessions value for this CGpnUniversalGlobalConstraints.
     * 
     * @param maxTotalSessions
     */
    public void setMaxTotalSessions(int maxTotalSessions) {
        this.maxTotalSessions = maxTotalSessions;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CGpnUniversalGlobalConstraints)) return false;
        CGpnUniversalGlobalConstraints other = (CGpnUniversalGlobalConstraints) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.maxDataRequestsPerHourPerSession == other.getMaxDataRequestsPerHourPerSession() &&
            this.maxTotalSessions == other.getMaxTotalSessions();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getMaxDataRequestsPerHourPerSession();
        _hashCode += getMaxTotalSessions();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CGpnUniversalGlobalConstraints.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "CGpnUniversalGlobalConstraints"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("maxDataRequestsPerHourPerSession");
        attrField.setXmlName(new javax.xml.namespace.QName("", "MaxDataRequestsPerHourPerSession"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("maxTotalSessions");
        attrField.setXmlName(new javax.xml.namespace.QName("", "MaxTotalSessions"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
