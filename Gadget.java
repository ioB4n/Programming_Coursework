//The Gadget class is the used as a superclass for the Mobile class and MP3 class.
//It holds the atributes and methods shared between the two subclasses.
public class Gadget
{
    //Attributes shared amongst all <Gadget> type objects.
    private String theModel;
    private String theSize;
    private int theWeight;
    private double thePrice;
    
    //The constructor method that is used for initiating the basic information about an object.
    public Gadget(String model, String size, int weight, double price)
    {
        theModel = model;
        theSize = size;
        theWeight = weight;
        thePrice = price;
    }
    
    //The getModel method returns the model of an object.
    public String getModel()
    {
        return theModel;
    }
    
    //The getSize method returns the size of an object.
    public String getSize()
    {
        return theSize;
    }
    
    //The getWeight method returns the weight of an object.
    public int getWeight()
    {
        return theWeight;
    }
    
    //The getPrice method returns the price of an object.
    public double getPrice()
    {
        return thePrice;
    }
    
    //The display method prints the model, size, weight, and price of an object to the screen.
    public void display()
    {
        System.out.println("Model: " + theModel);
        System.out.println("Size: " + theSize + " inches");
        System.out.println("Weight: " + theWeight + "g");
        System.out.println("Price: £" + thePrice);
    }
}
