import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.*;
public class client{
    private client(){

    }
    public static void main(String[] args) {
        try{
            Registry registry=LocateRegistry.getRegistry("localhost");
            MyInterface stub=(MyInterface)registry.lookup("MyInterface");
            stub.printmsg();
            stub.calculateAreaOfCircle(21.0);
            stub.calculateVolumeOfRectangle(10.0,12.0,15.0);
            Scanner Scanner=new Scanner(system.in);
            system.out.println("Enter the amount:");
            double amount=Scanner.nextDouble();
            stub.setTaxRate(taxRate);
            stub.calculateTax(amount);
        }catch(Exception e){
            system.err.println("Client exception:"+e.toString());
            e.printstackTrace();
        }
    }
}