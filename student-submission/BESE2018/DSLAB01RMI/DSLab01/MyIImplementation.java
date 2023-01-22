public class myImplementation implements MyInterface{
    private double taxRate;
    public void printmsg()
    {
        system.out.println("Hello Implementation Class");
    }
    public void calculateAreaOfCircle(double radius)
    {
        final double PI= 3.1415;
        system.out.println("The area of circle is:"+PI*radius*radius);
    }
    public void setTaxRate(double taxRate)
    {
        this.taxRate=taxRate;
    }
    public void calculateTax(double amount)
    {
        system.out.println("The tax amount is:"+amount*taxRate/100);
    }
    public void calculateVolumeOfRectangle(double length, double breadth, double height)
    {
        system.out.println("The volume of Rectangle is:"+length*breadth*height);
    }
}