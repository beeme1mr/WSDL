/**
 * COpStatusData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gomeznetworks.webservices;

public class COpStatusData  implements java.io.Serializable {
    private com.gomeznetworks.webservices.EStat eStatus;

    private java.lang.String sErrorMessage;

    public COpStatusData() {
    }

    public COpStatusData(
           com.gomeznetworks.webservices.EStat eStatus,
           java.lang.String sErrorMessage) {
           this.eStatus = eStatus;
           this.sErrorMessage = sErrorMessage;
    }


    /**
     * Gets the eStatus value for this COpStatusData.
     * 
     * @return eStatus
     */
    public com.gomeznetworks.webservices.EStat getEStatus() {
        return eStatus;
    }


    /**
     * Sets the eStatus value for this COpStatusData.
     * 
     * @param eStatus
     */
    public void setEStatus(com.gomeznetworks.webservices.EStat eStatus) {
        this.eStatus = eStatus;
    }


    /**
     * Gets the sErrorMessage value for this COpStatusData.
     * 
     * @return sErrorMessage
     */
    public java.lang.String getSErrorMessage() {
        return sErrorMessage;
    }


    /**
     * Sets the sErrorMessage value for this COpStatusData.
     * 
     * @param sErrorMessage
     */
    public void setSErrorMessage(java.lang.String sErrorMessage) {
        this.sErrorMessage = sErrorMessage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof COpStatusData)) return false;
        COpStatusData other = (COpStatusData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.eStatus==null && other.getEStatus()==null) || 
             (this.eStatus!=null &&
              this.eStatus.equals(other.getEStatus()))) &&
            ((this.sErrorMessage==null && other.getSErrorMessage()==null) || 
             (this.sErrorMessage!=null &&
              this.sErrorMessage.equals(other.getSErrorMessage())));
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
        if (getEStatus() != null) {
            _hashCode += getEStatus().hashCode();
        }
        if (getSErrorMessage() != null) {
            _hashCode += getSErrorMessage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(COpStatusData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "COpStatusData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "eStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "eStat"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SErrorMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "sErrorMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
