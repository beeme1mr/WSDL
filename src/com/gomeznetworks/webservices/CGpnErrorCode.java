/**
 * CGpnErrorCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gomeznetworks.webservices;

public class CGpnErrorCode  implements java.io.Serializable {
    private java.lang.String errornum;  // attribute

    private java.lang.String description;  // attribute

    public CGpnErrorCode() {
    }

    public CGpnErrorCode(
           java.lang.String errornum,
           java.lang.String description) {
           this.errornum = errornum;
           this.description = description;
    }


    /**
     * Gets the errornum value for this CGpnErrorCode.
     * 
     * @return errornum
     */
    public java.lang.String getErrornum() {
        return errornum;
    }


    /**
     * Sets the errornum value for this CGpnErrorCode.
     * 
     * @param errornum
     */
    public void setErrornum(java.lang.String errornum) {
        this.errornum = errornum;
    }


    /**
     * Gets the description value for this CGpnErrorCode.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this CGpnErrorCode.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CGpnErrorCode)) return false;
        CGpnErrorCode other = (CGpnErrorCode) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.errornum==null && other.getErrornum()==null) || 
             (this.errornum!=null &&
              this.errornum.equals(other.getErrornum()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription())));
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
        if (getErrornum() != null) {
            _hashCode += getErrornum().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CGpnErrorCode.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "CGpnErrorCode"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("errornum");
        attrField.setXmlName(new javax.xml.namespace.QName("", "errornum"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("description");
        attrField.setXmlName(new javax.xml.namespace.QName("", "description"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
