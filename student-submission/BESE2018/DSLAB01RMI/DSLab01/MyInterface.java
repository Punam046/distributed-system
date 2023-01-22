import java.rmi.Remote;
import java.rmi.RemoteException;
public interface myInterface extends Remote{
    public void calculateAreaOfCircle(double radius)throws RemoteException;
    public void printmsg()throws RemoteException;
    public void calculateTax(double amount)throws RemoteException;
    public void setTaxRate(double taxRate)throws  RemoteException;
    public void calculateAreaOfRectangle(double length, double breadth, double height)throws RemoteException;
}