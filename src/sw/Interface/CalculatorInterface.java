package sw.Interface;

import java.rmi.Remote;
import java.rmi.RemoteException;


public interface CalculatorInterface extends Remote{
	int calculate(int x,int y) throws RemoteException;
}
