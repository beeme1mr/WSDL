/**
 * CGpnErrorCodeResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gomeznetworks.webservices;

public class CGpnErrorCodeResponse  implements java.io.Serializable {
    private com.gomeznetworks.webservices.COpStatusData status;

    private com.gomeznetworks.webservices.CGpnErrorCode[] errorCodes;

    public CGpnErrorCodeResponse() {
    }

    public CGpnErrorCodeResponse(
           com.gomeznetworks.webservices.COpStatusData status,
           com.gomeznetworks.webservices.CGpnErrorCode[] errorCodes) {
           this.status = status;
           this.errorCodes = errorCodes;
    }


    /**
     * Gets the status value for this CGpnErrorCodeResponse.
     * 
     * @return status
     */
    public com.gomeznetworks.webservices.COpStatusData getStatus() {
        return status;
    }


    /**
     * Sets the status value for this CGpnErrorCodeResponse.
     * 
     * @param status
     */
    public void setStatus(com.gomeznetworks.webservices.COpStatusData status) {
        this.status = status;
    }


    /**
     * Gets the errorCodes value for this CGpnErrorCodeResponse.
     * 
     * @return errorCodes
     */
    public com.gomeznetworks.webservices.CGpnErrorCode[] getErrorCodes() {
        return errorCodes;
    }


    /**
     * Sets the errorCodes value for this CGpnErrorCodeResponse.
     * 
     * @param errorCodes
     */
    public void setErrorCodes(com.gomeznetworks.webservices.CGpnErrorCode[] errorCodes) {
        this.errorCodes = errorCodes;
    }

    public com.gomeznetworks.webservices.CGpnErrorCode getErrorCodes(int i) {
        return this.errorCodes[i];
    }

    public void setErrorCodes(int i, com.gomeznetworks.webservices.CGpnErrorCode _value) {
        this.errorCodes[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CGpnErrorCodeResponse)) return false;
        CGpnErrorCodeResponse other = (CGpnErrorCodeResponse) obj;
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
            ((this.errorCodes==null && other.getErrorCodes()==null) || 
             (this.errorCodes!=null &&
              java.util.Arrays.equals(this.errorCodes, other.getErrorCodes())));
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
        if (getErrorCodes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getErrorCodes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getErrorCodes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CGpnErrorCodeResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "CGpnErrorCodeResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "COpStatusData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorCodes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "ErrorCodes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "CGpnErrorCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
