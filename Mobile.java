//importing java.util.ArrayList to be able to use ArrayLists.
import java.util.ArrayList;

//The Mobile class extends or is a subclass of the Gadget class.
public class Mobile extends Gadget
{
    //Attributes unique only to the objects of type <Mobile>.
    private int theCredit;
    private static final int CALL_COST = 10;//The CALL_COST attribute is a constant class variable, 
                                                //used to store the ratio of minutes per pound.
                                                //In this scenario, you get 10 minutes per pound.
    private ArrayList <String> phoneNumbers;//The phoneNumbers attribure is an ArrayList that will hold 
                                            //the phone numbers saved on a mobile gadget.
    
    //The constructor will be executed any time a new mobile gadget will be created.
    public Mobile(String model, String size, int weight, double price, int credit)
    {
        super(model, size, weight, price);//Calling the superclass constructor.
        theCredit = credit * CALL_COST;
        phoneNumbers = new ArrayList <String>();//Creating a new ArrayList phoneNumbers.
    }
    
    //The getCredit method will return the total credit on a mobile gadget.
    public int getCredit()
    {
        return theCredit;
    }
    
    //The addCredit will add more credit to a mobile gadget.
    public void addCredit(int amount)
    {
        theCredit = amount * CALL_COST;
    }
    
    //The addPhoneNumber will add a new phone number to the phoneNumbers list.
    //In this cas, the phone numbers are just Strings.
    public void addPhoneNumber(String number)
    {
        phoneNumbers.add(number);
    }
    
    //The enoughCredit method returns a boolean value which will represent whether there is enough credit
    //on a chosen mobile gadget to make a call of the desired duration.
    public boolean enoughCredit(int duration)
    {
        boolean isEnough = true;
        
        //Checks if the amount is larger than the available credit.
        if(duration > theCredit){
            isEnough = false;//If the amount needed is larger than the available credit, isEnough is set to 'false'.
        }
        
        return isEnough;
    }
    
    //The makeCall method is used to calculate the amount of credit needed for the call and than reduce it
    //from the total credit.
    public int makeCall(int duration)
    {
        theCredit = theCredit - duration;//theCredit is an Integer variable, so we need to turn the value of the amount to an Integer also.
        return theCredit;
    }
    
    //The isNumberListEmpty method returns a boolean value which will represent whether the list
    //phoneNumbers is empty or not.
    public boolean isNumberListEmpty()
    {
        boolean isEmpty = false;
        
        //Checks if the list is empty.
        if(phoneNumbers.isEmpty()){
            isEmpty = true;//If the list is empty, the value 'true' is assigned to isEmpty.
        }
        
        return isEmpty;
    }
    
    //The displayPhoneNumber method is used to print the list of phone numbers on the screen.
    public void displayPhoneNumbers()
    {
        System.out.println("*****************************");
        System.out.println(">>> Phone Number Agenda:");
        
        //Iterates through the list and prints the phone numbers.
        for(String phoneNumber : phoneNumbers){
            System.out.println("#" + (phoneNumbers.indexOf(phoneNumber)+1)
            + "  " + phoneNumber);
        }
        
        System.out.println("*****************************");
    }
    
    //The display method print the details of the object on the screen.
    public void display(int index)
    {
        System.out.println("*****************************");
        System.out.println("#" + index + " Moblie Phone");
        super.display(); // Calling the display method from the superclass.
        System.out.println("Credit: " + theCredit + " minutes");
        System.out.println("*****************************");
    }
}
