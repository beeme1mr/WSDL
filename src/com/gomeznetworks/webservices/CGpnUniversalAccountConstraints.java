/**
 * CGpnUniversalAccountConstraints.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gomeznetworks.webservices;

public class CGpnUniversalAccountConstraints  implements java.io.Serializable {
    private int maxDataRecordsPerRequest;  // attribute

    private int maxConcurrentSessions;  // attribute

    private int maxConcurrentRequests;  // attribute

    private int maxRequestIntervalBeforeExpirationInMinutes;  // attribute

    public CGpnUniversalAccountConstraints() {
    }

    public CGpnUniversalAccountConstraints(
           int maxDataRecordsPerRequest,
           int maxConcurrentSessions,
           int maxConcurrentRequests,
           int maxRequestIntervalBeforeExpirationInMinutes) {
           this.maxDataRecordsPerRequest = maxDataRecordsPerRequest;
           this.maxConcurrentSessions = maxConcurrentSessions;
           this.maxConcurrentRequests = maxConcurrentRequests;
           this.maxRequestIntervalBeforeExpirationInMinutes = maxRequestIntervalBeforeExpirationInMinutes;
    }


    /**
     * Gets the maxDataRecordsPerRequest value for this CGpnUniversalAccountConstraints.
     * 
     * @return maxDataRecordsPerRequest
     */
    public int getMaxDataRecordsPerRequest() {
        return maxDataRecordsPerRequest;
    }


    /**
     * Sets the maxDataRecordsPerRequest value for this CGpnUniversalAccountConstraints.
     * 
     * @param maxDataRecordsPerRequest
     */
    public void setMaxDataRecordsPerRequest(int maxDataRecordsPerRequest) {
        this.maxDataRecordsPerRequest = maxDataRecordsPerRequest;
    }


    /**
     * Gets the maxConcurrentSessions value for this CGpnUniversalAccountConstraints.
     * 
     * @return maxConcurrentSessions
     */
    public int getMaxConcurrentSessions() {
        return maxConcurrentSessions;
    }


    /**
     * Sets the maxConcurrentSessions value for this CGpnUniversalAccountConstraints.
     * 
     * @param maxConcurrentSessions
     */
    public void setMaxConcurrentSessions(int maxConcurrentSessions) {
        this.maxConcurrentSessions = maxConcurrentSessions;
    }


    /**
     * Gets the maxConcurrentRequests value for this CGpnUniversalAccountConstraints.
     * 
     * @return maxConcurrentRequests
     */
    public int getMaxConcurrentRequests() {
        return maxConcurrentRequests;
    }


    /**
     * Sets the maxConcurrentRequests value for this CGpnUniversalAccountConstraints.
     * 
     * @param maxConcurrentRequests
     */
    public void setMaxConcurrentRequests(int maxConcurrentRequests) {
        this.maxConcurrentRequests = maxConcurrentRequests;
    }


    /**
     * Gets the maxRequestIntervalBeforeExpirationInMinutes value for this CGpnUniversalAccountConstraints.
     * 
     * @return maxRequestIntervalBeforeExpirationInMinutes
     */
    public int getMaxRequestIntervalBeforeExpirationInMinutes() {
        return maxRequestIntervalBeforeExpirationInMinutes;
    }


    /**
     * Sets the maxRequestIntervalBeforeExpirationInMinutes value for this CGpnUniversalAccountConstraints.
     * 
     * @param maxRequestIntervalBeforeExpirationInMinutes
     */
    public void setMaxRequestIntervalBeforeExpirationInMinutes(int maxRequestIntervalBeforeExpirationInMinutes) {
        this.maxRequestIntervalBeforeExpirationInMinutes = maxRequestIntervalBeforeExpirationInMinutes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CGpnUniversalAccountConstraints)) return false;
        CGpnUniversalAccountConstraints other = (CGpnUniversalAccountConstraints) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.maxDataRecordsPerRequest == other.getMaxDataRecordsPerRequest() &&
            this.maxConcurrentSessions == other.getMaxConcurrentSessions() &&
            this.maxConcurrentRequests == other.getMaxConcurrentRequests() &&
            this.maxRequestIntervalBeforeExpirationInMinutes == other.getMaxRequestIntervalBeforeExpirationInMinutes();
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
        _hashCode += getMaxDataRecordsPerRequest();
        _hashCode += getMaxConcurrentSessions();
        _hashCode += getMaxConcurrentRequests();
        _hashCode += getMaxRequestIntervalBeforeExpirationInMinutes();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CGpnUniversalAccountConstraints.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "CGpnUniversalAccountConstraints"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("maxDataRecordsPerRequest");
        attrField.setXmlName(new javax.xml.namespace.QName("", "MaxDataRecordsPerRequest"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("maxConcurrentSessions");
        attrField.setXmlName(new javax.xml.namespace.QName("", "MaxConcurrentSessions"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("maxConcurrentRequests");
        attrField.setXmlName(new javax.xml.namespace.QName("", "MaxConcurrentRequests"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("maxRequestIntervalBeforeExpirationInMinutes");
        attrField.setXmlName(new javax.xml.namespace.QName("", "MaxRequestIntervalBeforeExpirationInMinutes"));
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
