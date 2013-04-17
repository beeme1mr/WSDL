/**
 * CAccountConfigPackage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gomeznetworks.webservices;

public class CAccountConfigPackage  implements java.io.Serializable {
    private com.gomeznetworks.webservices.COpStatusData status;

    private com.gomeznetworks.webservices.CAccountData accountInfo;

    private com.gomeznetworks.webservices.CMonitorData[] monitorSet;

    private com.gomeznetworks.webservices.CSiteData[] siteSet;

    private com.gomeznetworks.webservices.CBackboneData[] backboneSet;

    private java.lang.String[][] geoSet;

    public CAccountConfigPackage() {
    }

    public CAccountConfigPackage(
           com.gomeznetworks.webservices.COpStatusData status,
           com.gomeznetworks.webservices.CAccountData accountInfo,
           com.gomeznetworks.webservices.CMonitorData[] monitorSet,
           com.gomeznetworks.webservices.CSiteData[] siteSet,
           com.gomeznetworks.webservices.CBackboneData[] backboneSet,
           java.lang.String[][] geoSet) {
           this.status = status;
           this.accountInfo = accountInfo;
           this.monitorSet = monitorSet;
           this.siteSet = siteSet;
           this.backboneSet = backboneSet;
           this.geoSet = geoSet;
    }


    /**
     * Gets the status value for this CAccountConfigPackage.
     * 
     * @return status
     */
    public com.gomeznetworks.webservices.COpStatusData getStatus() {
        return status;
    }


    /**
     * Sets the status value for this CAccountConfigPackage.
     * 
     * @param status
     */
    public void setStatus(com.gomeznetworks.webservices.COpStatusData status) {
        this.status = status;
    }


    /**
     * Gets the accountInfo value for this CAccountConfigPackage.
     * 
     * @return accountInfo
     */
    public com.gomeznetworks.webservices.CAccountData getAccountInfo() {
        return accountInfo;
    }


    /**
     * Sets the accountInfo value for this CAccountConfigPackage.
     * 
     * @param accountInfo
     */
    public void setAccountInfo(com.gomeznetworks.webservices.CAccountData accountInfo) {
        this.accountInfo = accountInfo;
    }


    /**
     * Gets the monitorSet value for this CAccountConfigPackage.
     * 
     * @return monitorSet
     */
    public com.gomeznetworks.webservices.CMonitorData[] getMonitorSet() {
        return monitorSet;
    }


    /**
     * Sets the monitorSet value for this CAccountConfigPackage.
     * 
     * @param monitorSet
     */
    public void setMonitorSet(com.gomeznetworks.webservices.CMonitorData[] monitorSet) {
        this.monitorSet = monitorSet;
    }


    /**
     * Gets the siteSet value for this CAccountConfigPackage.
     * 
     * @return siteSet
     */
    public com.gomeznetworks.webservices.CSiteData[] getSiteSet() {
        return siteSet;
    }


    /**
     * Sets the siteSet value for this CAccountConfigPackage.
     * 
     * @param siteSet
     */
    public void setSiteSet(com.gomeznetworks.webservices.CSiteData[] siteSet) {
        this.siteSet = siteSet;
    }


    /**
     * Gets the backboneSet value for this CAccountConfigPackage.
     * 
     * @return backboneSet
     */
    public com.gomeznetworks.webservices.CBackboneData[] getBackboneSet() {
        return backboneSet;
    }


    /**
     * Sets the backboneSet value for this CAccountConfigPackage.
     * 
     * @param backboneSet
     */
    public void setBackboneSet(com.gomeznetworks.webservices.CBackboneData[] backboneSet) {
        this.backboneSet = backboneSet;
    }


    /**
     * Gets the geoSet value for this CAccountConfigPackage.
     * 
     * @return geoSet
     */
    public java.lang.String[][] getGeoSet() {
        return geoSet;
    }


    /**
     * Sets the geoSet value for this CAccountConfigPackage.
     * 
     * @param geoSet
     */
    public void setGeoSet(java.lang.String[][] geoSet) {
        this.geoSet = geoSet;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CAccountConfigPackage)) return false;
        CAccountConfigPackage other = (CAccountConfigPackage) obj;
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
            ((this.accountInfo==null && other.getAccountInfo()==null) || 
             (this.accountInfo!=null &&
              this.accountInfo.equals(other.getAccountInfo()))) &&
            ((this.monitorSet==null && other.getMonitorSet()==null) || 
             (this.monitorSet!=null &&
              java.util.Arrays.equals(this.monitorSet, other.getMonitorSet()))) &&
            ((this.siteSet==null && other.getSiteSet()==null) || 
             (this.siteSet!=null &&
              java.util.Arrays.equals(this.siteSet, other.getSiteSet()))) &&
            ((this.backboneSet==null && other.getBackboneSet()==null) || 
             (this.backboneSet!=null &&
              java.util.Arrays.equals(this.backboneSet, other.getBackboneSet()))) &&
            ((this.geoSet==null && other.getGeoSet()==null) || 
             (this.geoSet!=null &&
              java.util.Arrays.equals(this.geoSet, other.getGeoSet())));
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
        if (getAccountInfo() != null) {
            _hashCode += getAccountInfo().hashCode();
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
        if (getSiteSet() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSiteSet());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSiteSet(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBackboneSet() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBackboneSet());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBackboneSet(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGeoSet() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGeoSet());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGeoSet(), i);
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
        new org.apache.axis.description.TypeDesc(CAccountConfigPackage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "CAccountConfigPackage"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "COpStatusData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "AccountInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "CAccountData"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siteSet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "SiteSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "CSiteData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "Site"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("backboneSet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "BackboneSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "CBackboneData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "Backbone"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geoSet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "GeoSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "CGeographyData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "Geo"));
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
