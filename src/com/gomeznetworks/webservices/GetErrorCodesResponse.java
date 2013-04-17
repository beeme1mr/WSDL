/**
 * GetErrorCodesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gomeznetworks.webservices;

public class GetErrorCodesResponse  implements java.io.Serializable {
    private com.gomeznetworks.webservices.CGpnErrorCodeResponse gpnErrorCodeResponse;

    public GetErrorCodesResponse() {
    }

    public GetErrorCodesResponse(
           com.gomeznetworks.webservices.CGpnErrorCodeResponse gpnErrorCodeResponse) {
           this.gpnErrorCodeResponse = gpnErrorCodeResponse;
    }


    /**
     * Gets the gpnErrorCodeResponse value for this GetErrorCodesResponse.
     * 
     * @return gpnErrorCodeResponse
     */
    public com.gomeznetworks.webservices.CGpnErrorCodeResponse getGpnErrorCodeResponse() {
        return gpnErrorCodeResponse;
    }


    /**
     * Sets the gpnErrorCodeResponse value for this GetErrorCodesResponse.
     * 
     * @param gpnErrorCodeResponse
     */
    public void setGpnErrorCodeResponse(com.gomeznetworks.webservices.CGpnErrorCodeResponse gpnErrorCodeResponse) {
        this.gpnErrorCodeResponse = gpnErrorCodeResponse;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetErrorCodesResponse)) return false;
        GetErrorCodesResponse other = (GetErrorCodesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.gpnErrorCodeResponse==null && other.getGpnErrorCodeResponse()==null) || 
             (this.gpnErrorCodeResponse!=null &&
              this.gpnErrorCodeResponse.equals(other.getGpnErrorCodeResponse())));
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
        if (getGpnErrorCodeResponse() != null) {
            _hashCode += getGpnErrorCodeResponse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetErrorCodesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", ">GetErrorCodesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gpnErrorCodeResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "GpnErrorCodeResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "CGpnErrorCodeResponse"));
        elemField.setNillable(true);
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
