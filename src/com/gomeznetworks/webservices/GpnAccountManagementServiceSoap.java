/**
 * GpnAccountManagementServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gomeznetworks.webservices;

public interface GpnAccountManagementServiceSoap extends java.rmi.Remote {

    /**
     * Method for authenticating a GPN Username/Password and returning
     * a set of account constraints
     */
    public com.gomeznetworks.webservices.CAccountAuthenticationDataExport GSRAuthenticate(java.lang.String sUsername, java.lang.String sPassword) throws java.rmi.RemoteException;

    /**
     * Method for retreiving a complete account configuration package
     */
    public com.gomeznetworks.webservices.CAccountConfigPackage getAccountConfigPackage(java.lang.String sUsername, java.lang.String sPassword) throws java.rmi.RemoteException;

    /**
     * Method for retreiving a complete account configuration package
     * for a monitor class (UTATX | UTAONLY | SINGLEURL | EMPIRIXTX)
     */
    public com.gomeznetworks.webservices.CAccountConfigPackage getAccountPackageByMonitorClass(java.lang.String sUsername, java.lang.String sPassword, java.lang.String sMonitorClasss) throws java.rmi.RemoteException;

    /**
     * Method for retreiving a set of tests for an account. sMonitorSetDesignator=(ALL
     * | SINGLEURL | SINGLEURLBENCHMARK | SINGLEURLANDBENCHMARK | EMPIRIXTX
     * | EMPIRIXTXBENCHMARK | EMPIRIXTXANDBENCHMARK | UTATX | UTATXBENCHMARK
     * | UTATXANDBENCHMARK | TRANSACTION | TRANSACTIONBENCHMARK | TRANSACTIONANDBENCHMARK),
     * sStatusDesignator = (ALL | ACTIVE | INACTIVE)
     */
    public com.gomeznetworks.webservices.CMonitorDataExport getAccountMonitors(java.lang.String sUsername, java.lang.String sPassword, java.lang.String sMonitorSetDesignator, java.lang.String sStatusDesignator) throws java.rmi.RemoteException;

    /**
     * Method for retreiving a set of GPN Backbones
     */
    public com.gomeznetworks.webservices.CBackboneDataExport getAccountBackbones(java.lang.String sUsername, java.lang.String sPassword) throws java.rmi.RemoteException;

    /**
     * Method for retreiving the set of non-deleted tests which reference
     * the specified script
     */
    public com.gomeznetworks.webservices.CMonitorDataExport getReferencingMonitors(java.lang.String sUsername, java.lang.String sPassword, int iMonitorId) throws java.rmi.RemoteException;

    /**
     * Method for retreiving a set of available sites for an account.
     */
    public com.gomeznetworks.webservices.CSiteDataExport getAccountSites(java.lang.String sUsername, java.lang.String sPassword) throws java.rmi.RemoteException;

    /**
     * Method for retreiving a set of available sites for a monitor.
     */
    public com.gomeznetworks.webservices.CSiteDataExport getMonitorSites(java.lang.String sUsername, java.lang.String sPassword, int iMonitorId) throws java.rmi.RemoteException;

    /**
     * Method for retrieving account summary information.
     */
    public com.gomeznetworks.webservices.CAccountDataExport getAccountSummary(java.lang.String sUsername, java.lang.String sPassword) throws java.rmi.RemoteException;
}
