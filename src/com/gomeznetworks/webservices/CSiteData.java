/**
 * CSiteData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gomeznetworks.webservices;

public class CSiteData  implements java.io.Serializable {
    private java.lang.String sid;  // attribute

    private java.lang.String name;  // attribute

    private java.lang.String status;  // attribute

    private java.lang.String city;  // attribute

    private java.lang.String state;  // attribute

    private java.lang.String country;  // attribute

    private java.lang.String IP;  // attribute

    private java.lang.String backboneId;  // attribute

    private java.lang.String backbone;  // attribute

    private java.lang.String isURL;  // attribute

    private java.lang.String isEmpirix;  // attribute

    private java.lang.String isUTA;  // attribute

    public CSiteData() {
    }

    public CSiteData(
           java.lang.String sid,
           java.lang.String name,
           java.lang.String status,
           java.lang.String city,
           java.lang.String state,
           java.lang.String country,
           java.lang.String IP,
           java.lang.String backboneId,
           java.lang.String backbone,
           java.lang.String isURL,
           java.lang.String isEmpirix,
           java.lang.String isUTA) {
           this.sid = sid;
           this.name = name;
           this.status = status;
           this.city = city;
           this.state = state;
           this.country = country;
           this.IP = IP;
           this.backboneId = backboneId;
           this.backbone = backbone;
           this.isURL = isURL;
           this.isEmpirix = isEmpirix;
           this.isUTA = isUTA;
    }


    /**
     * Gets the sid value for this CSiteData.
     * 
     * @return sid
     */
    public java.lang.String getSid() {
        return sid;
    }


    /**
     * Sets the sid value for this CSiteData.
     * 
     * @param sid
     */
    public void setSid(java.lang.String sid) {
        this.sid = sid;
    }


    /**
     * Gets the name value for this CSiteData.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this CSiteData.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the status value for this CSiteData.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this CSiteData.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the city value for this CSiteData.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this CSiteData.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the state value for this CSiteData.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this CSiteData.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the country value for this CSiteData.
     * 
     * @return country
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this CSiteData.
     * 
     * @param country
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }


    /**
     * Gets the IP value for this CSiteData.
     * 
     * @return IP
     */
    public java.lang.String getIP() {
        return IP;
    }


    /**
     * Sets the IP value for this CSiteData.
     * 
     * @param IP
     */
    public void setIP(java.lang.String IP) {
        this.IP = IP;
    }


    /**
     * Gets the backboneId value for this CSiteData.
     * 
     * @return backboneId
     */
    public java.lang.String getBackboneId() {
        return backboneId;
    }


    /**
     * Sets the backboneId value for this CSiteData.
     * 
     * @param backboneId
     */
    public void setBackboneId(java.lang.String backboneId) {
        this.backboneId = backboneId;
    }


    /**
     * Gets the backbone value for this CSiteData.
     * 
     * @return backbone
     */
    public java.lang.String getBackbone() {
        return backbone;
    }


    /**
     * Sets the backbone value for this CSiteData.
     * 
     * @param backbone
     */
    public void setBackbone(java.lang.String backbone) {
        this.backbone = backbone;
    }


    /**
     * Gets the isURL value for this CSiteData.
     * 
     * @return isURL
     */
    public java.lang.String getIsURL() {
        return isURL;
    }


    /**
     * Sets the isURL value for this CSiteData.
     * 
     * @param isURL
     */
    public void setIsURL(java.lang.String isURL) {
        this.isURL = isURL;
    }


    /**
     * Gets the isEmpirix value for this CSiteData.
     * 
     * @return isEmpirix
     */
    public java.lang.String getIsEmpirix() {
        return isEmpirix;
    }


    /**
     * Sets the isEmpirix value for this CSiteData.
     * 
     * @param isEmpirix
     */
    public void setIsEmpirix(java.lang.String isEmpirix) {
        this.isEmpirix = isEmpirix;
    }


    /**
     * Gets the isUTA value for this CSiteData.
     * 
     * @return isUTA
     */
    public java.lang.String getIsUTA() {
        return isUTA;
    }


    /**
     * Sets the isUTA value for this CSiteData.
     * 
     * @param isUTA
     */
    public void setIsUTA(java.lang.String isUTA) {
        this.isUTA = isUTA;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CSiteData)) return false;
        CSiteData other = (CSiteData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sid==null && other.getSid()==null) || 
             (this.sid!=null &&
              this.sid.equals(other.getSid()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.IP==null && other.getIP()==null) || 
             (this.IP!=null &&
              this.IP.equals(other.getIP()))) &&
            ((this.backboneId==null && other.getBackboneId()==null) || 
             (this.backboneId!=null &&
              this.backboneId.equals(other.getBackboneId()))) &&
            ((this.backbone==null && other.getBackbone()==null) || 
             (this.backbone!=null &&
              this.backbone.equals(other.getBackbone()))) &&
            ((this.isURL==null && other.getIsURL()==null) || 
             (this.isURL!=null &&
              this.isURL.equals(other.getIsURL()))) &&
            ((this.isEmpirix==null && other.getIsEmpirix()==null) || 
             (this.isEmpirix!=null &&
              this.isEmpirix.equals(other.getIsEmpirix()))) &&
            ((this.isUTA==null && other.getIsUTA()==null) || 
             (this.isUTA!=null &&
              this.isUTA.equals(other.getIsUTA())));
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
        if (getSid() != null) {
            _hashCode += getSid().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getIP() != null) {
            _hashCode += getIP().hashCode();
        }
        if (getBackboneId() != null) {
            _hashCode += getBackboneId().hashCode();
        }
        if (getBackbone() != null) {
            _hashCode += getBackbone().hashCode();
        }
        if (getIsURL() != null) {
            _hashCode += getIsURL().hashCode();
        }
        if (getIsEmpirix() != null) {
            _hashCode += getIsEmpirix().hashCode();
        }
        if (getIsUTA() != null) {
            _hashCode += getIsUTA().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CSiteData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "CSiteData"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("sid");
        attrField.setXmlName(new javax.xml.namespace.QName("", "sid"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("name");
        attrField.setXmlName(new javax.xml.namespace.QName("", "name"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("status");
        attrField.setXmlName(new javax.xml.namespace.QName("", "status"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("city");
        attrField.setXmlName(new javax.xml.namespace.QName("", "city"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("state");
        attrField.setXmlName(new javax.xml.namespace.QName("", "state"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("country");
        attrField.setXmlName(new javax.xml.namespace.QName("", "country"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("IP");
        attrField.setXmlName(new javax.xml.namespace.QName("", "IP"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("backboneId");
        attrField.setXmlName(new javax.xml.namespace.QName("", "backboneId"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("backbone");
        attrField.setXmlName(new javax.xml.namespace.QName("", "backbone"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("isURL");
        attrField.setXmlName(new javax.xml.namespace.QName("", "isURL"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("isEmpirix");
        attrField.setXmlName(new javax.xml.namespace.QName("", "isEmpirix"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("isUTA");
        attrField.setXmlName(new javax.xml.namespace.QName("", "isUTA"));
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
