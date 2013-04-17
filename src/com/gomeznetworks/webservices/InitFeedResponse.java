/**
 * InitFeedResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gomeznetworks.webservices;

public class InitFeedResponse  implements java.io.Serializable {
    private com.gomeznetworks.webservices.COpStatusData status;

    private com.gomeznetworks.webservices.CGpnUniversalGlobalConstraints GPNGlobalConstraints;

    private com.gomeznetworks.webservices.CGpnUniversalAccountConstraints GPNAccountConstraints;

    private java.lang.String currentTime;

    private java.lang.String sessionToken;

    private int[] acceptedMonitors;

    private int[] acceptedSites;

    public InitFeedResponse() {
    }

    public InitFeedResponse(
           com.gomeznetworks.webservices.COpStatusData status,
           com.gomeznetworks.webservices.CGpnUniversalGlobalConstraints GPNGlobalConstraints,
           com.gomeznetworks.webservices.CGpnUniversalAccountConstraints GPNAccountConstraints,
           java.lang.String currentTime,
           java.lang.String sessionToken,
           int[] acceptedMonitors,
           int[] acceptedSites) {
           this.status = status;
           this.GPNGlobalConstraints = GPNGlobalConstraints;
           this.GPNAccountConstraints = GPNAccountConstraints;
           this.currentTime = currentTime;
           this.sessionToken = sessionToken;
           this.acceptedMonitors = acceptedMonitors;
           this.acceptedSites = acceptedSites;
    }


    /**
     * Gets the status value for this InitFeedResponse.
     * 
     * @return status
     */
    public com.gomeznetworks.webservices.COpStatusData getStatus() {
        return status;
    }


    /**
     * Sets the status value for this InitFeedResponse.
     * 
     * @param status
     */
    public void setStatus(com.gomeznetworks.webservices.COpStatusData status) {
        this.status = status;
    }


    /**
     * Gets the GPNGlobalConstraints value for this InitFeedResponse.
     * 
     * @return GPNGlobalConstraints
     */
    public com.gomeznetworks.webservices.CGpnUniversalGlobalConstraints getGPNGlobalConstraints() {
        return GPNGlobalConstraints;
    }


    /**
     * Sets the GPNGlobalConstraints value for this InitFeedResponse.
     * 
     * @param GPNGlobalConstraints
     */
    public void setGPNGlobalConstraints(com.gomeznetworks.webservices.CGpnUniversalGlobalConstraints GPNGlobalConstraints) {
        this.GPNGlobalConstraints = GPNGlobalConstraints;
    }


    /**
     * Gets the GPNAccountConstraints value for this InitFeedResponse.
     * 
     * @return GPNAccountConstraints
     */
    public com.gomeznetworks.webservices.CGpnUniversalAccountConstraints getGPNAccountConstraints() {
        return GPNAccountConstraints;
    }


    /**
     * Sets the GPNAccountConstraints value for this InitFeedResponse.
     * 
     * @param GPNAccountConstraints
     */
    public void setGPNAccountConstraints(com.gomeznetworks.webservices.CGpnUniversalAccountConstraints GPNAccountConstraints) {
        this.GPNAccountConstraints = GPNAccountConstraints;
    }


    /**
     * Gets the currentTime value for this InitFeedResponse.
     * 
     * @return currentTime
     */
    public java.lang.String getCurrentTime() {
        return currentTime;
    }


    /**
     * Sets the currentTime value for this InitFeedResponse.
     * 
     * @param currentTime
     */
    public void setCurrentTime(java.lang.String currentTime) {
        this.currentTime = currentTime;
    }


    /**
     * Gets the sessionToken value for this InitFeedResponse.
     * 
     * @return sessionToken
     */
    public java.lang.String getSessionToken() {
        return sessionToken;
    }


    /**
     * Sets the sessionToken value for this InitFeedResponse.
     * 
     * @param sessionToken
     */
    public void setSessionToken(java.lang.String sessionToken) {
        this.sessionToken = sessionToken;
    }


    /**
     * Gets the acceptedMonitors value for this InitFeedResponse.
     * 
     * @return acceptedMonitors
     */
    public int[] getAcceptedMonitors() {
        return acceptedMonitors;
    }


    /**
     * Sets the acceptedMonitors value for this InitFeedResponse.
     * 
     * @param acceptedMonitors
     */
    public void setAcceptedMonitors(int[] acceptedMonitors) {
        this.acceptedMonitors = acceptedMonitors;
    }


    /**
     * Gets the acceptedSites value for this InitFeedResponse.
     * 
     * @return acceptedSites
     */
    public int[] getAcceptedSites() {
        return acceptedSites;
    }


    /**
     * Sets the acceptedSites value for this InitFeedResponse.
     * 
     * @param acceptedSites
     */
    public void setAcceptedSites(int[] acceptedSites) {
        this.acceptedSites = acceptedSites;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InitFeedResponse)) return false;
        InitFeedResponse other = (InitFeedResponse) obj;
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
            ((this.GPNGlobalConstraints==null && other.getGPNGlobalConstraints()==null) || 
             (this.GPNGlobalConstraints!=null &&
              this.GPNGlobalConstraints.equals(other.getGPNGlobalConstraints()))) &&
            ((this.GPNAccountConstraints==null && other.getGPNAccountConstraints()==null) || 
             (this.GPNAccountConstraints!=null &&
              this.GPNAccountConstraints.equals(other.getGPNAccountConstraints()))) &&
            ((this.currentTime==null && other.getCurrentTime()==null) || 
             (this.currentTime!=null &&
              this.currentTime.equals(other.getCurrentTime()))) &&
            ((this.sessionToken==null && other.getSessionToken()==null) || 
             (this.sessionToken!=null &&
              this.sessionToken.equals(other.getSessionToken()))) &&
            ((this.acceptedMonitors==null && other.getAcceptedMonitors()==null) || 
             (this.acceptedMonitors!=null &&
              java.util.Arrays.equals(this.acceptedMonitors, other.getAcceptedMonitors()))) &&
            ((this.acceptedSites==null && other.getAcceptedSites()==null) || 
             (this.acceptedSites!=null &&
              java.util.Arrays.equals(this.acceptedSites, other.getAcceptedSites())));
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
        if (getGPNGlobalConstraints() != null) {
            _hashCode += getGPNGlobalConstraints().hashCode();
        }
        if (getGPNAccountConstraints() != null) {
            _hashCode += getGPNAccountConstraints().hashCode();
        }
        if (getCurrentTime() != null) {
            _hashCode += getCurrentTime().hashCode();
        }
        if (getSessionToken() != null) {
            _hashCode += getSessionToken().hashCode();
        }
        if (getAcceptedMonitors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAcceptedMonitors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAcceptedMonitors(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAcceptedSites() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAcceptedSites());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAcceptedSites(), i);
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
        new org.apache.axis.description.TypeDesc(InitFeedResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "InitFeedResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "COpStatusData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GPNGlobalConstraints");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "GPNGlobalConstraints"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "CGpnUniversalGlobalConstraints"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GPNAccountConstraints");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "GPNAccountConstraints"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "CGpnUniversalAccountConstraints"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("sessionToken");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "SessionToken"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acceptedMonitors");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "AcceptedMonitors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "mid"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acceptedSites");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "AcceptedSites"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "sid"));
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
