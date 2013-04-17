/**
 * CAccountAuthenticationDataExport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gomeznetworks.webservices;

public class CAccountAuthenticationDataExport  implements java.io.Serializable {
    private com.gomeznetworks.webservices.COpStatusData status;

    private com.gomeznetworks.webservices.CAccountAuthenticationData accountConstraints;

    public CAccountAuthenticationDataExport() {
    }

    public CAccountAuthenticationDataExport(
           com.gomeznetworks.webservices.COpStatusData status,
           com.gomeznetworks.webservices.CAccountAuthenticationData accountConstraints) {
           this.status = status;
           this.accountConstraints = accountConstraints;
    }


    /**
     * Gets the status value for this CAccountAuthenticationDataExport.
     * 
     * @return status
     */
    public com.gomeznetworks.webservices.COpStatusData getStatus() {
        return status;
    }


    /**
     * Sets the status value for this CAccountAuthenticationDataExport.
     * 
     * @param status
     */
    public void setStatus(com.gomeznetworks.webservices.COpStatusData status) {
        this.status = status;
    }


    /**
     * Gets the accountConstraints value for this CAccountAuthenticationDataExport.
     * 
     * @return accountConstraints
     */
    public com.gomeznetworks.webservices.CAccountAuthenticationData getAccountConstraints() {
        return accountConstraints;
    }


    /**
     * Sets the accountConstraints value for this CAccountAuthenticationDataExport.
     * 
     * @param accountConstraints
     */
    public void setAccountConstraints(com.gomeznetworks.webservices.CAccountAuthenticationData accountConstraints) {
        this.accountConstraints = accountConstraints;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CAccountAuthenticationDataExport)) return false;
        CAccountAuthenticationDataExport other = (CAccountAuthenticationDataExport) obj;
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
            ((this.accountConstraints==null && other.getAccountConstraints()==null) || 
             (this.accountConstraints!=null &&
              this.accountConstraints.equals(other.getAccountConstraints())));
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
        if (getAccountConstraints() != null) {
            _hashCode += getAccountConstraints().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CAccountAuthenticationDataExport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "CAccountAuthenticationDataExport"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "COpStatusData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountConstraints");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "AccountConstraints"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "CAccountAuthenticationData"));
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
