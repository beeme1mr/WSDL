/**
 * CMonitorData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gomeznetworks.webservices;

public class CMonitorData  implements java.io.Serializable {
    private java.lang.String mid;  // attribute

    private java.lang.String desc;  // attribute

    private java.lang.String url;  // attribute

    private java.lang.String _class;  // attribute

    private java.lang.String status;  // attribute

    private java.lang.String account;  // attribute

    private java.lang.String timeoutinsec;  // attribute

    private java.lang.String frequencyinms;  // attribute

    private java.lang.String docomponents;  // attribute

    private java.lang.String created;  // attribute

    private java.lang.String modified;  // attribute

    public CMonitorData() {
    }

    public CMonitorData(
           java.lang.String mid,
           java.lang.String desc,
           java.lang.String url,
           java.lang.String _class,
           java.lang.String status,
           java.lang.String account,
           java.lang.String timeoutinsec,
           java.lang.String frequencyinms,
           java.lang.String docomponents,
           java.lang.String created,
           java.lang.String modified) {
           this.mid = mid;
           this.desc = desc;
           this.url = url;
           this._class = _class;
           this.status = status;
           this.account = account;
           this.timeoutinsec = timeoutinsec;
           this.frequencyinms = frequencyinms;
           this.docomponents = docomponents;
           this.created = created;
           this.modified = modified;
    }


    /**
     * Gets the mid value for this CMonitorData.
     * 
     * @return mid
     */
    public java.lang.String getMid() {
        return mid;
    }


    /**
     * Sets the mid value for this CMonitorData.
     * 
     * @param mid
     */
    public void setMid(java.lang.String mid) {
        this.mid = mid;
    }


    /**
     * Gets the desc value for this CMonitorData.
     * 
     * @return desc
     */
    public java.lang.String getDesc() {
        return desc;
    }


    /**
     * Sets the desc value for this CMonitorData.
     * 
     * @param desc
     */
    public void setDesc(java.lang.String desc) {
        this.desc = desc;
    }


    /**
     * Gets the url value for this CMonitorData.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this CMonitorData.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }


    /**
     * Gets the _class value for this CMonitorData.
     * 
     * @return _class
     */
    public java.lang.String get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this CMonitorData.
     * 
     * @param _class
     */
    public void set_class(java.lang.String _class) {
        this._class = _class;
    }


    /**
     * Gets the status value for this CMonitorData.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this CMonitorData.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the account value for this CMonitorData.
     * 
     * @return account
     */
    public java.lang.String getAccount() {
        return account;
    }


    /**
     * Sets the account value for this CMonitorData.
     * 
     * @param account
     */
    public void setAccount(java.lang.String account) {
        this.account = account;
    }


    /**
     * Gets the timeoutinsec value for this CMonitorData.
     * 
     * @return timeoutinsec
     */
    public java.lang.String getTimeoutinsec() {
        return timeoutinsec;
    }


    /**
     * Sets the timeoutinsec value for this CMonitorData.
     * 
     * @param timeoutinsec
     */
    public void setTimeoutinsec(java.lang.String timeoutinsec) {
        this.timeoutinsec = timeoutinsec;
    }


    /**
     * Gets the frequencyinms value for this CMonitorData.
     * 
     * @return frequencyinms
     */
    public java.lang.String getFrequencyinms() {
        return frequencyinms;
    }


    /**
     * Sets the frequencyinms value for this CMonitorData.
     * 
     * @param frequencyinms
     */
    public void setFrequencyinms(java.lang.String frequencyinms) {
        this.frequencyinms = frequencyinms;
    }


    /**
     * Gets the docomponents value for this CMonitorData.
     * 
     * @return docomponents
     */
    public java.lang.String getDocomponents() {
        return docomponents;
    }


    /**
     * Sets the docomponents value for this CMonitorData.
     * 
     * @param docomponents
     */
    public void setDocomponents(java.lang.String docomponents) {
        this.docomponents = docomponents;
    }


    /**
     * Gets the created value for this CMonitorData.
     * 
     * @return created
     */
    public java.lang.String getCreated() {
        return created;
    }


    /**
     * Sets the created value for this CMonitorData.
     * 
     * @param created
     */
    public void setCreated(java.lang.String created) {
        this.created = created;
    }


    /**
     * Gets the modified value for this CMonitorData.
     * 
     * @return modified
     */
    public java.lang.String getModified() {
        return modified;
    }


    /**
     * Sets the modified value for this CMonitorData.
     * 
     * @param modified
     */
    public void setModified(java.lang.String modified) {
        this.modified = modified;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CMonitorData)) return false;
        CMonitorData other = (CMonitorData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mid==null && other.getMid()==null) || 
             (this.mid!=null &&
              this.mid.equals(other.getMid()))) &&
            ((this.desc==null && other.getDesc()==null) || 
             (this.desc!=null &&
              this.desc.equals(other.getDesc()))) &&
            ((this.url==null && other.getUrl()==null) || 
             (this.url!=null &&
              this.url.equals(other.getUrl()))) &&
            ((this._class==null && other.get_class()==null) || 
             (this._class!=null &&
              this._class.equals(other.get_class()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.account==null && other.getAccount()==null) || 
             (this.account!=null &&
              this.account.equals(other.getAccount()))) &&
            ((this.timeoutinsec==null && other.getTimeoutinsec()==null) || 
             (this.timeoutinsec!=null &&
              this.timeoutinsec.equals(other.getTimeoutinsec()))) &&
            ((this.frequencyinms==null && other.getFrequencyinms()==null) || 
             (this.frequencyinms!=null &&
              this.frequencyinms.equals(other.getFrequencyinms()))) &&
            ((this.docomponents==null && other.getDocomponents()==null) || 
             (this.docomponents!=null &&
              this.docomponents.equals(other.getDocomponents()))) &&
            ((this.created==null && other.getCreated()==null) || 
             (this.created!=null &&
              this.created.equals(other.getCreated()))) &&
            ((this.modified==null && other.getModified()==null) || 
             (this.modified!=null &&
              this.modified.equals(other.getModified())));
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
        if (getMid() != null) {
            _hashCode += getMid().hashCode();
        }
        if (getDesc() != null) {
            _hashCode += getDesc().hashCode();
        }
        if (getUrl() != null) {
            _hashCode += getUrl().hashCode();
        }
        if (get_class() != null) {
            _hashCode += get_class().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getAccount() != null) {
            _hashCode += getAccount().hashCode();
        }
        if (getTimeoutinsec() != null) {
            _hashCode += getTimeoutinsec().hashCode();
        }
        if (getFrequencyinms() != null) {
            _hashCode += getFrequencyinms().hashCode();
        }
        if (getDocomponents() != null) {
            _hashCode += getDocomponents().hashCode();
        }
        if (getCreated() != null) {
            _hashCode += getCreated().hashCode();
        }
        if (getModified() != null) {
            _hashCode += getModified().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CMonitorData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "CMonitorData"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("mid");
        attrField.setXmlName(new javax.xml.namespace.QName("", "mid"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("desc");
        attrField.setXmlName(new javax.xml.namespace.QName("", "desc"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("url");
        attrField.setXmlName(new javax.xml.namespace.QName("", "url"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("_class");
        attrField.setXmlName(new javax.xml.namespace.QName("", "class"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("status");
        attrField.setXmlName(new javax.xml.namespace.QName("", "status"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("account");
        attrField.setXmlName(new javax.xml.namespace.QName("", "account"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("timeoutinsec");
        attrField.setXmlName(new javax.xml.namespace.QName("", "timeoutinsec"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("frequencyinms");
        attrField.setXmlName(new javax.xml.namespace.QName("", "frequencyinms"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("docomponents");
        attrField.setXmlName(new javax.xml.namespace.QName("", "docomponents"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("created");
        attrField.setXmlName(new javax.xml.namespace.QName("", "created"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("modified");
        attrField.setXmlName(new javax.xml.namespace.QName("", "modified"));
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
