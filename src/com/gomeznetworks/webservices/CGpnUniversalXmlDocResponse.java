/**
 * CGpnUniversalXmlDocResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gomeznetworks.webservices;

public class CGpnUniversalXmlDocResponse  implements java.io.Serializable {
    private com.gomeznetworks.webservices.COpStatusData status;

    private int numRecords;

    private java.lang.String currentTime;

    private com.gomeznetworks.webservices.CGpnUniversalXmlDocResponseXmlDocument xmlDocument;

    public CGpnUniversalXmlDocResponse() {
    }

    public CGpnUniversalXmlDocResponse(
           com.gomeznetworks.webservices.COpStatusData status,
           int numRecords,
           java.lang.String currentTime,
           com.gomeznetworks.webservices.CGpnUniversalXmlDocResponseXmlDocument xmlDocument) {
           this.status = status;
           this.numRecords = numRecords;
           this.currentTime = currentTime;
           this.xmlDocument = xmlDocument;
    }


    /**
     * Gets the status value for this CGpnUniversalXmlDocResponse.
     * 
     * @return status
     */
    public com.gomeznetworks.webservices.COpStatusData getStatus() {
        return status;
    }


    /**
     * Sets the status value for this CGpnUniversalXmlDocResponse.
     * 
     * @param status
     */
    public void setStatus(com.gomeznetworks.webservices.COpStatusData status) {
        this.status = status;
    }


    /**
     * Gets the numRecords value for this CGpnUniversalXmlDocResponse.
     * 
     * @return numRecords
     */
    public int getNumRecords() {
        return numRecords;
    }


    /**
     * Sets the numRecords value for this CGpnUniversalXmlDocResponse.
     * 
     * @param numRecords
     */
    public void setNumRecords(int numRecords) {
        this.numRecords = numRecords;
    }


    /**
     * Gets the currentTime value for this CGpnUniversalXmlDocResponse.
     * 
     * @return currentTime
     */
    public java.lang.String getCurrentTime() {
        return currentTime;
    }


    /**
     * Sets the currentTime value for this CGpnUniversalXmlDocResponse.
     * 
     * @param currentTime
     */
    public void setCurrentTime(java.lang.String currentTime) {
        this.currentTime = currentTime;
    }


    /**
     * Gets the xmlDocument value for this CGpnUniversalXmlDocResponse.
     * 
     * @return xmlDocument
     */
    public com.gomeznetworks.webservices.CGpnUniversalXmlDocResponseXmlDocument getXmlDocument() {
        return xmlDocument;
    }


    /**
     * Sets the xmlDocument value for this CGpnUniversalXmlDocResponse.
     * 
     * @param xmlDocument
     */
    public void setXmlDocument(com.gomeznetworks.webservices.CGpnUniversalXmlDocResponseXmlDocument xmlDocument) {
        this.xmlDocument = xmlDocument;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CGpnUniversalXmlDocResponse)) return false;
        CGpnUniversalXmlDocResponse other = (CGpnUniversalXmlDocResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            this.numRecords == other.getNumRecords() &&
            ((this.currentTime==null && other.getCurrentTime()==null) || 
             (this.currentTime!=null &&
              this.currentTime.equals(other.getCurrentTime()))) &&
            ((this.xmlDocument==null && other.getXmlDocument()==null) || 
             (this.xmlDocument!=null &&
              this.xmlDocument.equals(other.getXmlDocument())));
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
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        _hashCode += getNumRecords();
        if (getCurrentTime() != null) {
            _hashCode += getCurrentTime().hashCode();
        }
        if (getXmlDocument() != null) {
            _hashCode += getXmlDocument().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CGpnUniversalXmlDocResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "CGpnUniversalXmlDocResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "COpStatusData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numRecords");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "NumRecords"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "CurrentTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmlDocument");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "XmlDocument"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", ">CGpnUniversalXmlDocResponse>XmlDocument"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
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
