/**
 * MyService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mypackage;

public interface MyService extends java.rmi.Remote {
    public mypackage.Place createPlace(mypackage.Place arg0) throws java.rmi.RemoteException;
    public mypackage.Place[] getListplace() throws java.rmi.RemoteException;
    public mypackage.User createUser(mypackage.User arg0) throws java.rmi.RemoteException;
    public mypackage.User getUserByUsernameAndPassword(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException;
}
