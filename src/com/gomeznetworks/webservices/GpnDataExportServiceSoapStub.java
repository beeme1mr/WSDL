/**
 * GpnDataExportServiceSoapStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gomeznetworks.webservices;

public class GpnDataExportServiceSoapStub extends org.apache.axis.client.Stub implements com.gomeznetworks.webservices.GpnDataExportServiceSoap {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[6];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("OpenDataFeed");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "sUsername"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "sPassword"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "iMonitorIdSet"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "ArrayOfInt"), int[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "int"));
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "iSiteIdSet"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "ArrayOfInt"), int[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "int"));
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "sMonitorClassDesignator"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "sDataDesignator"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "sStartTime"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "sEndTime"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "sOrderDesignator"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "InitFeedResponse"));
        oper.setReturnClass(com.gomeznetworks.webservices.InitFeedResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "GpnOpenUtaDataFeedResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("OpenDataFeed2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "sUsername"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "sPassword"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "iMonitorIdSet"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "ArrayOfInt"), int[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "int"));
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "iSiteIdSet"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "ArrayOfInt"), int[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "int"));
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "sMonitorClassDesignator"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "sDataDesignator"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "sLastN"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "sStartTime"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "sEndTime"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "sOrderDesignator"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "InitFeedResponse"));
        oper.setReturnClass(com.gomeznetworks.webservices.InitFeedResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "GpnOpenUtaDataFeedResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("OpenDataFeed3");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "sUsername"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "sPassword"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "iMonitorIdSet"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "ArrayOfInt"), int[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "int"));
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "iSiteIdSet"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "ArrayOfInt"), int[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "int"));
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "sMonitorClassDesignator"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "sDataDesignator"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "sLastN"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "sStartTime"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "sEndTime"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "sOrderDesignator"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "sTimeDesignator"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "InitFeedResponse"));
        oper.setReturnClass(com.gomeznetworks.webservices.InitFeedResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "GpnOpenUtaDataFeedResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CloseDataFeed");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "sSessionToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "COpStatusData"));
        oper.setReturnClass(com.gomeznetworks.webservices.COpStatusData.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "CloseDataFeedResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetResponseData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "sSessionToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "CGpnUniversalXmlDocResponse"));
        oper.setReturnClass(com.gomeznetworks.webservices.CGpnUniversalXmlDocResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "GpnResponseData"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetErrorCodes");
        oper.setReturnType(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "CGpnErrorCodeResponse"));
        oper.setReturnClass(com.gomeznetworks.webservices.CGpnErrorCodeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "GpnErrorCodeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

    }

    public GpnDataExportServiceSoapStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public GpnDataExportServiceSoapStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public GpnDataExportServiceSoapStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/AbstractTypes", "StringArray");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", ">CGpnUniversalXmlDocResponse>XmlDocument");
            cachedSerQNames.add(qName);
            cls = com.gomeznetworks.webservices.CGpnUniversalXmlDocResponseXmlDocument.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", ">GetErrorCodes");
            cachedSerQNames.add(qName);
            cls = com.gomeznetworks.webservices.GetErrorCodes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", ">GetErrorCodesResponse");
            cachedSerQNames.add(qName);
            cls = com.gomeznetworks.webservices.GetErrorCodesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "ArrayOfInt");
            cachedSerQNames.add(qName);
            cls = int[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int");
            qName2 = new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "int");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "ArrayOfInt1");
            cachedSerQNames.add(qName);
            cls = int[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int");
            qName2 = new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "mid");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "ArrayOfInt2");
            cachedSerQNames.add(qName);
            cls = int[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int");
            qName2 = new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "sid");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "CGpnErrorCode");
            cachedSerQNames.add(qName);
            cls = com.gomeznetworks.webservices.CGpnErrorCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "CGpnErrorCodeResponse");
            cachedSerQNames.add(qName);
            cls = com.gomeznetworks.webservices.CGpnErrorCodeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "CGpnUniversalAccountConstraints");
            cachedSerQNames.add(qName);
            cls = com.gomeznetworks.webservices.CGpnUniversalAccountConstraints.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "CGpnUniversalGlobalConstraints");
            cachedSerQNames.add(qName);
            cls = com.gomeznetworks.webservices.CGpnUniversalGlobalConstraints.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "CGpnUniversalXmlDocResponse");
            cachedSerQNames.add(qName);
            cls = com.gomeznetworks.webservices.CGpnUniversalXmlDocResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "COpStatusData");
            cachedSerQNames.add(qName);
            cls = com.gomeznetworks.webservices.COpStatusData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "InitFeedResponse");
            cachedSerQNames.add(qName);
            cls = com.gomeznetworks.webservices.InitFeedResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "StatusType");
            cachedSerQNames.add(qName);
            cls = com.gomeznetworks.webservices.StatusType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.gomeznetworks.webservices.InitFeedResponse openDataFeed(java.lang.String sUsername, java.lang.String sPassword, int[] iMonitorIdSet, int[] iSiteIdSet, java.lang.String sMonitorClassDesignator, java.lang.String sDataDesignator, java.lang.String sStartTime, java.lang.String sEndTime, java.lang.String sOrderDesignator) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://gomeznetworks.com/webservices/OpenDataFeed");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "OpenDataFeed"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sUsername, sPassword, iMonitorIdSet, iSiteIdSet, sMonitorClassDesignator, sDataDesignator, sStartTime, sEndTime, sOrderDesignator});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gomeznetworks.webservices.InitFeedResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gomeznetworks.webservices.InitFeedResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.gomeznetworks.webservices.InitFeedResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gomeznetworks.webservices.InitFeedResponse openDataFeed2(java.lang.String sUsername, java.lang.String sPassword, int[] iMonitorIdSet, int[] iSiteIdSet, java.lang.String sMonitorClassDesignator, java.lang.String sDataDesignator, java.lang.String sLastN, java.lang.String sStartTime, java.lang.String sEndTime, java.lang.String sOrderDesignator) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://gomeznetworks.com/webservices/OpenDataFeed2");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "OpenDataFeed2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sUsername, sPassword, iMonitorIdSet, iSiteIdSet, sMonitorClassDesignator, sDataDesignator, sLastN, sStartTime, sEndTime, sOrderDesignator});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gomeznetworks.webservices.InitFeedResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gomeznetworks.webservices.InitFeedResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.gomeznetworks.webservices.InitFeedResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gomeznetworks.webservices.InitFeedResponse openDataFeed3(java.lang.String sUsername, java.lang.String sPassword, int[] iMonitorIdSet, int[] iSiteIdSet, java.lang.String sMonitorClassDesignator, java.lang.String sDataDesignator, java.lang.String sLastN, java.lang.String sStartTime, java.lang.String sEndTime, java.lang.String sOrderDesignator, java.lang.String sTimeDesignator) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://gomeznetworks.com/webservices/OpenDataFeed3");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "OpenDataFeed3"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sUsername, sPassword, iMonitorIdSet, iSiteIdSet, sMonitorClassDesignator, sDataDesignator, sLastN, sStartTime, sEndTime, sOrderDesignator, sTimeDesignator});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gomeznetworks.webservices.InitFeedResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gomeznetworks.webservices.InitFeedResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.gomeznetworks.webservices.InitFeedResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gomeznetworks.webservices.COpStatusData closeDataFeed(java.lang.String sSessionToken) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://gomeznetworks.com/webservices/CloseDataFeed");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "CloseDataFeed"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sSessionToken});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gomeznetworks.webservices.COpStatusData) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gomeznetworks.webservices.COpStatusData) org.apache.axis.utils.JavaUtils.convert(_resp, com.gomeznetworks.webservices.COpStatusData.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gomeznetworks.webservices.CGpnUniversalXmlDocResponse getResponseData(java.lang.String sSessionToken) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://gomeznetworks.com/webservices/GetResponseData");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "GetResponseData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sSessionToken});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gomeznetworks.webservices.CGpnUniversalXmlDocResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gomeznetworks.webservices.CGpnUniversalXmlDocResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.gomeznetworks.webservices.CGpnUniversalXmlDocResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.gomeznetworks.webservices.CGpnErrorCodeResponse getErrorCodes() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://gomeznetworks.com/webservices/GetErrorCodes");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://gomeznetworks.com/webservices/", "GetErrorCodes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.gomeznetworks.webservices.CGpnErrorCodeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.gomeznetworks.webservices.CGpnErrorCodeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.gomeznetworks.webservices.CGpnErrorCodeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
