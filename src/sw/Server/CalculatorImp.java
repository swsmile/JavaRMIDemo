package sw.Server;

import sw.Interface.CalculatorInterface;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class CalculatorImp extends UnicastRemoteObject implements CalculatorInterface {

	private static final long serialVersionUID = 1L;
	public CalculatorImp()  throws RemoteException{
		super();
	}
	// all remote methods will throw RemoteException
	@Override
	public int calculate(int x,int y) throws RemoteException {
		return x+y;
	}
}
