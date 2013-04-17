/**
 * CMonitorDataExport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gomeznetworks.webservices;

public class CMonitorDataExport  implements java.io.Serializable {
    private com.gomeznetworks.webservices.COpStatusData status;

    private com.gomeznetworks.webservices.CMonitorData[] monitorSet;

    public CMonitorDataExport() {
    }

    public CMonitorDataExport(
           com.gomeznetworks.webservices.COpStatusData status,
           com.gomeznetworks.webservices.CMonitorData[] monitorSet) {
           this.status = status;
           this.monitorSet = monitorSet;
    }


    /**
     * Gets the status value for this CMonitorDataExport.
     * 
     * @return status
     */
    public com.gomeznetworks.webservices.COpStatusData getStatus() {
        return status;
    }


    /**
     * Sets the status value for this CMonitorDataExport.
     * 
     * @param status
     */
    public void setStatus(com.gomeznetworks.webservices.COpStatusData status) {
        this.status = status;
    }


    /**
     * Gets the monitorSet value for this CMonitorDataExport.
     * 
     * @return monitorSet
     */
    public com.gomeznetworks.webservices.CMonitorData[] getMonitorSet() {
        return monitorSet;
    }


    /**
     * Sets the monitorSet value for this CMonitorDataExport.
     * 
     * @param monitorSet
     */
    public void setMonitorSet(com.gomeznetworks.webservices.CMonitorData[] monitorSet) {
        this.monitorSet = monitorSet;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CMonitorDataExport)) return false;
        CMonitorDataExport other = (CMonitorDataExport) obj;
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
            ((this.monitorSet==null && other.getMonitorSet()==null) || 
             (this.monitorSet!=null &&
              java.util.Arrays.equals(this.monitorSet, other.getMonitorSet())));
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
        if (getMonitorSet() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMonitorSet());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMonitorSet(), i);
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
        new org.apache.axis.description.TypeDesc(CMonitorDataExport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "CMonitorDataExport"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "COpStatusData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monitorSet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "MonitorSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "CMonitorData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "Monitor"));
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
