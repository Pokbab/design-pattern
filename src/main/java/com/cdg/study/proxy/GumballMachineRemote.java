package com.cdg.study.proxy;

import java.rmi.*;

/**
 * RMI를 통해 원격프록시를 구현하기위한 인터페이스
 * 
 * @author Kanghoon Choi
 */
public interface GumballMachineRemote extends Remote {

	public int getCount() throws RemoteException;

	public String getLocation() throws RemoteException;

	public State getState() throws RemoteException;
}
