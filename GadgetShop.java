/**
 * The GadgetShop class is used for the implementation of the GUI.
 * It is mainly used to create the list of gadgets and to enable a user to create and perform certain operations with said gadgets.
 *
 * @author (Ion Bogza)
 * @version (01/05/2024)
 */

//Importing swing, awt, and awt.event to get access to the requiered GUI tool kit and Action Listener.
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
//Importing java.util.ArrayList to get access to using ArrayLists.
import java.util.ArrayList;
//Importing jave.util.Iterator to get acces to using Iterators.
import java.util.Iterator;

public class GadgetShop implements ActionListener
{
    private ArrayList <Gadget> gadgets;
    
    //Declaring the names, types and access levels of the soon to be used frames.
    private JFrame mainFrame;
    private JFrame mobileFrame;
    private JFrame mp3Frame;
    
    //Declaring the names, types and access levels of the soon to be used buttons.
    private JButton mobileBtn;
    private JButton mp3Btn;
    private JButton displayAllBtn;
    private JButton addMobileBtn;
    private JButton removeMobileBtn;
    private JButton addCreditBtn;
    private JButton getCreditBtn;
    private JButton makeCallBtn;
    private JButton addMP3Btn;
    private JButton removeMP3Btn;
    private JButton getMemoryBtn;
    private JButton downloadSongBtn;
    private JButton deleteSongBtn;
    private JButton clearMobileBtn;
    private JButton clearMP3Btn;
    private JButton addPhoneNumBtn;
    private JButton displayPhonesBtn;
    private JButton displaySongsBtn;
    
    //Declaring the names, types and access levels of the soon to be used text fields.
    private JTextField mobileModelFld;
    private JTextField mobileSizeFld;
    private JTextField mobileWeightFld;
    private JTextField mobilePriceFld;
    private JTextField mobileIndexFld;
    private JTextField mp3ModelFld;
    private JTextField mp3SizeFld;
    private JTextField mp3WeightFld;
    private JTextField mp3PriceFld;
    private JTextField mp3IndexFld;
    private JTextField memoryFld;
    private JTextField creditFld;
    private JTextField phoneNumberFld;
    private JTextField durationFld;
    private JTextField titleFld;
    private JTextField songSizeFld;
    
    //The constructor will be executed in the Main method.
    public GadgetShop()
    {
        //Creating the ArrayList for stored gadgets.
        gadgets = new ArrayList <Gadget>();
        
        //Calling the method for creating the Main frame.
        getMainFrame();
        
        //Calling the method for creating the Mobile frame.
        getMobileFrame();
        
        //Calling the method for creating the MP3 frame.
        getMP3Frame();
    }
    
    //The method used to create the main frame.
    //The main frame will hold the buttons that lead to the other two frames,
    //and the buttons for methods that apply to the whole list of gadgets.
    public void getMainFrame()
    {
        mainFrame = new JFrame("Gadget Collection");
        mainFrame.setSize(333, 222);
        mainFrame.setLocationRelativeTo(null);
        
        Container contentPane = mainFrame.getContentPane();
        contentPane.setLayout(new GridLayout(3,1));
        
            Container top = new Container();
            top.setLayout(new GridLayout(2,1));
            contentPane.add(top);
            
                Container top1 = new Container();
                top1.setLayout(new FlowLayout());
                top.add(top1);
            
                    JLabel label1 = new JLabel("Welcome!");
                    top1.add(label1);
                    
                Container top2 = new Container();
                top2.setLayout(new FlowLayout());
                top.add(top2);
                
                    JLabel label2 = new JLabel("This is your gadget collection!");
                    top2.add(label2);
            
            Container middle = new Container();
            middle.setLayout(new FlowLayout());
            contentPane.add(middle);
            
                mobileBtn = new JButton("Mobile");
                mobileBtn.setPreferredSize(new Dimension(100, 30));
                mobileBtn.addActionListener(this);
                middle.add(mobileBtn);
                
                JLabel orLabel = new JLabel("  or  ");
                middle.add(orLabel);
                
                mp3Btn = new JButton("MP3");
                mp3Btn.setPreferredSize(new Dimension(100, 30));
                mp3Btn.addActionListener(this);
                middle.add(mp3Btn);
            
            Container bottom = new Container();
            bottom.setLayout(new FlowLayout());
            contentPane.add(bottom);
            
                displayAllBtn = new JButton("Display All");
                displayAllBtn.setPreferredSize(new Dimension(110, 30));
                displayAllBtn.addActionListener(this);
                bottom.add(displayAllBtn);
                
        mainFrame.setVisible(true);
    }
    
    //This method is used to create the Mobile frame.
    //The mobile frame is where all the mobile related methods and buttons will be displayed.
    public void getMobileFrame()
    {
        mobileFrame = new JFrame("Gadget Collection: Moblie");
        mobileFrame.setLocation(165, 400);
        
        Container contentPane = mobileFrame.getContentPane();
        contentPane.setLayout(new GridLayout(3,1));
        
            Container top = new Container();
            top.setLayout(new FlowLayout());
            contentPane.add(top);
            
                Container top1 = new Container();
                top1.setLayout(new GridLayout(2,1));
                top.add(top1);
                
                    JLabel modelLabel = new JLabel("Model");
                    top1.add(modelLabel);
                    
                    mobileModelFld = new JTextField(10);
                    top1.add(mobileModelFld);
                
                Container top2 = new Container();
                top2.setLayout(new GridLayout(2,1));
                top.add(top2);
                
                    JLabel sizeLabel = new JLabel("Size [inches]");
                    top2.add(sizeLabel);
                    
                    mobileSizeFld = new JTextField(10);
                    top2.add(mobileSizeFld);
                
                Container top3 = new Container();
                top3.setLayout(new GridLayout(2,1));
                top.add(top3);
                
                    JLabel weightLabel = new JLabel("Weight [grams]");
                    top3.add(weightLabel);
                    
                    mobileWeightFld = new JTextField(10);
                    top3.add(mobileWeightFld);
                
                Container top4 = new Container();
                top4.setLayout(new GridLayout(2,1));
                top.add(top4);
                
                    JLabel priceLabel = new JLabel("Price [£]");
                    top4.add(priceLabel);
                    
                    mobilePriceFld = new JTextField(10);
                    top4.add(mobilePriceFld);
                
                Container top5 = new Container();
                top5.setLayout(new GridLayout(2,1));
                top.add(top5);
                
                    JLabel creditLabel = new JLabel("Credit [£]");
                    top5.add(creditLabel);
                    
                    creditFld = new JTextField(10);
                    top5.add(creditFld);  
            
            Container middle = new Container();
            middle.setLayout(new FlowLayout());
            contentPane.add(middle);
            
                Container indexGrid = new Container();
                indexGrid.setLayout(new GridLayout(2,1));
                middle.add(indexGrid);
                    
                    JLabel indexLabel = new JLabel("Index");
                    indexGrid.add(indexLabel);
                    
                    mobileIndexFld = new JTextField(5);
                    indexGrid.add(mobileIndexFld);
            
                addMobileBtn = new JButton("Add Mobile");
                addMobileBtn.addActionListener(this);
                middle.add(addMobileBtn);
                
                removeMobileBtn = new JButton("Remove Mobile");
                removeMobileBtn.addActionListener(this);
                middle.add(removeMobileBtn);
                
                addCreditBtn = new JButton("Add Credit");
                addCreditBtn.addActionListener(this);
                middle.add(addCreditBtn);
                
                getCreditBtn = new JButton("Get Credit");
                getCreditBtn.addActionListener(this);
                middle.add(getCreditBtn);
                
                clearMobileBtn = new JButton("Reset");
                clearMobileBtn.addActionListener(this);
                middle.add(clearMobileBtn);
            
            Container bottom = new Container();
            bottom.setLayout(new FlowLayout());
            contentPane.add(bottom);
            
                Container bottom1 = new Container();
                bottom1.setLayout(new GridLayout(2,1));
                bottom.add(bottom1);
                
                    JLabel phoneNumber = new JLabel("Phone Number [075*****]");
                    bottom1.add(phoneNumber);
                    
                    phoneNumberFld = new JTextField(15);
                    bottom1.add(phoneNumberFld);
            
                Container bottom2 = new Container();
                bottom2.setLayout(new GridLayout(3,1));
                bottom.add(bottom2);
                    
                    addPhoneNumBtn = new JButton("Add Phone Number");
                    addPhoneNumBtn.addActionListener(this);
                    bottom2.add(addPhoneNumBtn);
                    
                    displayPhonesBtn = new JButton("Display Agenda");
                    bottom2.add(displayPhonesBtn);
                    displayPhonesBtn.addActionListener(this);
                    
                    makeCallBtn = new JButton("Make Call");
                    makeCallBtn.addActionListener(this);
                    bottom2.add(makeCallBtn);
                
                Container bottom3 = new Container();
                bottom3.setLayout(new GridLayout(2,1));
                bottom.add(bottom3);
                
                    JLabel duration = new JLabel("Duration [minutes]");
                    bottom3.add(duration);
                    
                    durationFld = new JTextField(15);
                    bottom3.add(durationFld);
            
        mobileFrame.pack();
    }
    
    // This mathod adds a new mobile gadget to the list.
    public void addMobile()
    {
        // A try-catch method is used to catch any user input error, that occures when trying to parse an Integet or a Double.
        try{
            // Retreiving the values from the necessery text fields.
            String model = mobileModelFld.getText();
            String size = mobileSizeFld.getText();
            int weight = Integer.parseInt(mobileWeightFld.getText()); // Parsing the data as all text fields hold strings.
            double price = Double.parseDouble(mobilePriceFld.getText()); // Parsing the data as needed.
            int credit = Integer.parseInt(creditFld.getText()); // Parsing the data as needed.
            // Checks if the numerical values input by the user are above 0.
            if(price > 0 && weight > 0 && credit > 0){
                // If so, a new mobile object is created and added to the list.
                Mobile mobile = new Mobile(model, size, weight, price, credit);
                gadgets.add(mobile);
                // Displaying a confirmation message.
                JOptionPane.showMessageDialog(mobileFrame, "Mobile gadget added to the list.",
                    "Info Message", JOptionPane.INFORMATION_MESSAGE);
                clearMobile(); // Clearing the text fields.
            } else {
                // Displaying warning message, regarding any invalid inputs for either the price, weight, or credit.
                JOptionPane.showMessageDialog(mobileFrame, "Price, weight, and credit must be larger than 0!",
                    "Warning Message", JOptionPane.WARNING_MESSAGE);
                clearMobile(); // Clearing the text fields.
            }
        }
        // The 'catch' is specifically looking for NumberFormatExceptions.
        catch(NumberFormatException e){
            // Displaying error message, regarding the invalid text format.
            JOptionPane.showMessageDialog(mobileFrame, "Please input valid numbers!\n" + e.getMessage(),
                "Error Message", JOptionPane.ERROR_MESSAGE);
        } 
        // In case any other kind of exception occurs, this 'catch' will take care of it.
        catch(Exception e){
            // Displaying error message, regarding any invalid input.
            JOptionPane.showMessageDialog(mobileFrame, "Invalid input!\n" + e.getMessage(),
                "Error Message", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    // This method is used to remove a mobile gadget from the list.
    public void removeMobile()
    {
        // A try-catch method is used to catch any user input error, that occures when trying to parse an Integet or a Double.
        try{
            int index = Integer.parseInt(mobileIndexFld.getText()); // Parsing the data as needed.
            // This if statement checks to see if the list is empty and if the index input by the user is valid.
            // If the list of gadgets is empty, there are no gadgets that can be removed from the list, so a warning message will be displayed. 
            // If the list isn't empty but the index is invalid, a warning message will be displayed. Otherwise, the gadget will be removed.
            if(gadgets.isEmpty()){
                // Displaying warning message, because the list is empty.
                JOptionPane.showMessageDialog(mobileFrame, "The gadget list is empty!",
                    "Warning Message", JOptionPane.WARNING_MESSAGE);
                clearMobile(); // Clearing the text fields.
            } else if(index >= gadgets.size() || index < 0){
                // Displaying warning message, regarding the invalid index.
                JOptionPane.showMessageDialog(mobileFrame, "The index is not valid!",
                    "Warning Message", JOptionPane.WARNING_MESSAGE);
                clearMobile(); // Clearing the text fields.
            } else {
                // Displaying confirmation message.
                gadgets.remove(index);
                JOptionPane.showMessageDialog(mobileFrame, "Removed gadget from the list.",
                    "Information Message", JOptionPane.INFORMATION_MESSAGE);
                clearMobile(); // Clearing the text fields.
            }
        }
        // The 'catch' is specifically looking for NumberFormatExceptions.
        catch(NumberFormatException e){
            // Displaying error message, regarding the invalid text format.
            JOptionPane.showMessageDialog(mobileFrame, "Please input valid numbers!\n" + e.getMessage(),
                "Error Message", JOptionPane.ERROR_MESSAGE);
        } 
        // In case any other kind of exception occurs, this 'catch' will take care of it.
        catch(Exception e){
            // Displaying error message, regarding any invalid input.
            JOptionPane.showMessageDialog(mobileFrame, "Invalid input!\n" + e.getMessage(),
                "Error Message", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    // This method is used to display the credit information of a <Mobile> type gadget from the list.
    public void getCredit()
    {
        // A try-catch method is used to catch any user input error, that occures when trying to parse an Integet or a Double.
        try{
            int index = Integer.parseInt(mobileIndexFld.getText()); // Parsing the data as needed.
            // This if statement checks to see if the list is empty, if the index is valid, and if the gadget at that index is of type <Mobile>.
            // If the list of gadgets is empty, there is no credit information that can be displayed.
            // If the index is valid, but the gadget at that index is not of type <Mobile>, the getCredit method can't be invoked.
            if(gadgets.isEmpty()){
                // Displaying warning message, because the list is empty.
                JOptionPane.showMessageDialog(mobileFrame, "The gadget list is empty!",
                    "Warning Message", JOptionPane.WARNING_MESSAGE);
                clearMobile(); // Clearing the text fields.
            } else if(index >= gadgets.size() || index < 0){
                // Displaying warning message, regarding the invalid index.
                JOptionPane.showMessageDialog(mobileFrame, "The index is not valid!",
                    "Warning Message", JOptionPane.WARNING_MESSAGE);
                clearMobile(); // Clearing the text fields.
            } else {
                // Creating an object of type <Gadget>, and assigning it the value at the index chosen by the user.
                Gadget gadget = gadgets.get(index);
                // Checking if the object is of type <Mobile>, using the 'instanceof' statement.
                if(gadget instanceof Mobile){
                    // Casting the gadget object to Mobile, so the getCredit method can be used.
                    Mobile mobile = (Mobile) gadget;
                    // Displaying confirmation message.
                    JOptionPane.showMessageDialog(mobileFrame, "You have " + mobile.getCredit() + " minutes worth of credit.",
                        "Info Message", JOptionPane.INFORMATION_MESSAGE);
                    clearMobile(); // Clearing the text fields.
                } else {
                    // Displaying warning message, regarding the type of the object chosen.
                    JOptionPane.showMessageDialog(mobileFrame, "Gadget at index is not of type Mobile!",
                        "Warning Message", JOptionPane.WARNING_MESSAGE);
                    clearMobile(); // Clearing the text fields.
                }
            }
        }
        // The 'catch' is specifically looking for NumberFormatExceptions.
        catch(NumberFormatException e){
            // Displaying error message, regarding the invalid text format.
            JOptionPane.showMessageDialog(mobileFrame, "Please input valid numbers!\n" + e.getMessage(),
                "Error Message", JOptionPane.ERROR_MESSAGE);
        } 
        // In case any other kind of exception occurs, this 'catch' will take care of it.
        catch(Exception e){
            // Displaying error message, regarding any invalid input.
            JOptionPane.showMessageDialog(mobileFrame, "Invalid input!\n" + e.getMessage(),
                "Error Message", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    // This method is used to add more credit to a gadget of type <Mobile> in the list.
    public void addCredit()
    {
        // A try-catch method is used to catch any user input error, that occures when trying to parse an Integet.
        try{
            int index = Integer.parseInt(mobileIndexFld.getText()); // Parsing the data as needed.
            int credit = Integer.parseInt(creditFld.getText()); // Parsing the data as needed.
            // This if statement checks to see if the list is empty, if the index is valid, if the gadget at that index is of type <Mobile>,
            // and if the cradit input by the user is valid.
            if(gadgets.isEmpty()){
                // Displaying warning message, because the list is empty.
                JOptionPane.showMessageDialog(mobileFrame, "The gadget list is empty!",
                    "Warning Message", JOptionPane.WARNING_MESSAGE);
                clearMobile(); // Clearing the text fields.
            } else if(index >= gadgets.size() || index < 0){
                // Displaying warning message, regarding the invalid index.
                JOptionPane.showMessageDialog(mobileFrame, "The index is not valid!",
                    "Warning Message", JOptionPane.WARNING_MESSAGE);
                clearMobile(); // Clearing the text fields.
            } else {
                // Creating an object of type <Gadget>, and assigning it the value at the index chosen by the user.
                Gadget gadget = gadgets.get(index);
                if(!(gadget instanceof Mobile)){
                    // Displaying warning message, regarding the invalid object type.
                    JOptionPane.showMessageDialog(mobileFrame, "Gadget at index is not of type Mobile!",
                        "Warning Message", JOptionPane.WARNING_MESSAGE);
                    clearMobile(); // Clearing the text fields.
                } else if(credit <= 0){
                    // Displaying warning message, regarding the invalid credit.
                    JOptionPane.showMessageDialog(mobileFrame, "Credit can't be less than or equal to 0!",
                        "Warning Message", JOptionPane.WARNING_MESSAGE);
                    clearMobile(); // Clearing the text fields.
                } else {
                    // Casting the gadget object to Mobile, so the getCredit method can be used.
                    Mobile mobile = (Mobile) gadget;
                    // Adding the credit by calling the addCredit method of the mobile gadget.
                    mobile.addCredit(credit);
                    // Displaying confirmation message.
                    JOptionPane.showMessageDialog(mobileFrame, "You have " + mobile.getCredit() + " minutes worth of credit.",
                        "Info Message", JOptionPane.INFORMATION_MESSAGE);
                    clearMobile(); // Clearing the text fields.
                }
            }
        }
        // The 'catch' is specifically looking for NumberFormatExceptions.
        catch(NumberFormatException e){
            // Displaying error message, regarding the invalid text format.
            JOptionPane.showMessageDialog(mobileFrame, "Please input valid numbers!\n" + e.getMessage(),
                "Error Message", JOptionPane.ERROR_MESSAGE);
        } 
        // In case any other kind of exception occurs, this 'catch' will take care of it.
        catch(Exception e){
            // Displaying error message, regarding any invalid input.
            JOptionPane.showMessageDialog(mobileFrame, "Invalid input!\n" + e.getMessage(),
                "Error Message", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //This method is used to add a phone number to the list of numbers inside a specific Mobile gadget.
    public void addPhoneNumber()
    {
        // A try-catch method is used to catch any user input error, that occures when trying to parse an Integet.
        try{
            // Retrieving the necessary values from the text fields.
            String number = phoneNumberFld.getText();
            int index = Integer.parseInt(mobileIndexFld.getText()); // Parsing the data as needed.
            // If the gadget list isn't empty, the index is valid, the gadget at that index is of type <Mobile>, and the phone number format
            // input by the user is valid, the addPhoneNumber method is called to add the number to the list.
            if(gadgets.isEmpty()){
                // Displaying warning message, because the list is empty.
                JOptionPane.showMessageDialog(mobileFrame, "The gadget list is empty!",
                    "Warning Message", JOptionPane.WARNING_MESSAGE);
                clearMobile(); // Clearing the text fields.
            } else if(index >= gadgets.size() || index < 0){
                // Displaying warning message, regarding the invalid index.
                JOptionPane.showMessageDialog(mobileFrame, "The index is not valid!",
                    "Warning Message", JOptionPane.WARNING_MESSAGE);
                clearMobile(); // Clearing the text fields.
            } else {
                // Creating an object of type <Gadget>, and assigning it the value at the index chosen by the user.
                Gadget gadget = gadgets.get(index);
                if(!(gadget instanceof Mobile)){
                    // Displaying warning message, regarding the invalid object type.
                    JOptionPane.showMessageDialog(mobileFrame, "Gadget at index is not of type Mobile!",
                        "Warning Message", JOptionPane.WARNING_MESSAGE);
                    clearMobile(); // Clearing the text fields.
                } else if(!number.matches("\\d+")){
                    // Displaying warning message, regarding the invalid number format.
                    JOptionPane.showMessageDialog(mobileFrame, "Phone number must be formed of digits only!",
                        "Warning Message", JOptionPane.WARNING_MESSAGE);
                    clearMobile(); // Clearing the text fields.
                } else if(number.length() > 15 || number.length() < 3){
                    // Displaying warning message, regarding the invalid number length.
                    JOptionPane.showMessageDialog(mobileFrame, "Phone number must be between 3 and 15 digits only!",
                        "Warning Message", JOptionPane.WARNING_MESSAGE);
                    clearMobile(); // Clearing the text fields.
                } else {
                    // Casting the gadget object to Mobile, so the getCredit method can be used.
                    Mobile mobile = (Mobile) gadget;
                    //Add the phone number to the list inside the mobile gadget.
                    mobile.addPhoneNumber(number);
                    // Displaying confirmation message.
                    JOptionPane.showMessageDialog(mobileFrame, "Phone number added to your agenda.",
                        "Info Message",JOptionPane.INFORMATION_MESSAGE);
                    clearMobile(); // Clearing the text fields.
                }
            }
        }
        // The 'catch' is specifically looking for NumberFormatExceptions.
        catch(NumberFormatException e){
            // Displaying error message, regarding the invalid text format.
            JOptionPane.showMessageDialog(mobileFrame, "Please input valid numbers!\n" + e.getMessage(),
                "Error Message", JOptionPane.ERROR_MESSAGE);
        } 
        // In case any other kind of exception occurs, this 'catch' will take care of it.
        catch(Exception e){
            // Displaying error message, regarding any invalid input.
            JOptionPane.showMessageDialog(mobileFrame, "Invalid input!\n" + e.getMessage(),
                "Error Message", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    // This method is used to execute the makeCall method for a specific Mobile gadget.
    public void makeCall()
    {
        // A try-catch method is used to catch any user input error, that occures when trying to parse an Integet.
        try{
            String number = phoneNumberFld.getText();
            int duration = Integer.parseInt(durationFld.getText()); // Parsing the data as needed.
            int index = Integer.parseInt(mobileIndexFld.getText()); // Parsing the data as needed.
            //If the list isn't empty, the index is valid, the gadget is of type <Mobile>, the phone number list is not empty, the list 
            // contains the specified number, the duration of the call is valid, and there is enough credit, the makeCall method is invoked.
            if(gadgets.isEmpty()){
                // Displaying warning message, because the list is empty.
                JOptionPane.showMessageDialog(mobileFrame, "The gadget list is empty!",
                    "Warning Message", JOptionPane.WARNING_MESSAGE);
                clearMobile(); // Clearing the text fields.
            } else if(index >= gadgets.size() || index < 0){
                // Displaying warning message, regarding the invalid index.
                JOptionPane.showMessageDialog(mobileFrame, "The index is not valid!",
                    "Warning Message", JOptionPane.WARNING_MESSAGE);
                clearMobile(); // Clearing the text fields.
            } else {
                // Creating an object of type <Gadget>, and assigning it the value at the index chosen by the user.
                Gadget gadget = gadgets.get(index);
                if(!(gadget instanceof Mobile)){
                    // Displaying warning message, regarding the invalid object type.
                    JOptionPane.showMessageDialog(mobileFrame, "Gadget at index is not of type Mobile!",
                        "Warning Message", JOptionPane.WARNING_MESSAGE);
                    clearMobile(); // Clearing the text fields.
                } else {
                    // Casting the gadget object to Mobile, so the getCredit method can be used.
                    Mobile mobile = (Mobile) gadget;
                    if(duration <= 0){
                        // Displaying warning message, regarding the invalid duration.
                        JOptionPane.showMessageDialog(mobileFrame, "Duration can't be less than or equal to 0!",
                            "Warning Message", JOptionPane.WARNING_MESSAGE);
                        clearMobile(); // Clearing the text fields.
                    } else if(!mobile.enoughCredit(duration)){
                        // Displaying warning message, regarding the insufficient credit.
                        JOptionPane.showMessageDialog(mobileFrame, "Not enough credit!",
                            "Warning Message", JOptionPane.WARNING_MESSAGE);
                        clearMobile(); // Clearing the text fields.
                    } else {
                        // Displaying confirmation message and executing the makeCall method.
                        JOptionPane.showMessageDialog(mobileFrame,
                            "Making call...\nCall Finished.\nCredit left: " + mobile.makeCall(duration) + " minutes.",
                            "Info Message", JOptionPane.INFORMATION_MESSAGE);
                        clearMobile(); // Clearing the text fields.
                    }
                }
            }
        }
        // The 'catch' is specifically looking for NumberFormatExceptions.
        catch(NumberFormatException e){
            // Displaying error message, regarding the invalid text format.
            JOptionPane.showMessageDialog(mobileFrame, "Please input valid numbers!\n" + e.getMessage(),
                "Error Message", JOptionPane.ERROR_MESSAGE);
        } 
        // In case any other kind of exception occurs, this 'catch' will take care of it.
        catch(Exception e){
            // Displaying error message, regarding any invalid input.
            JOptionPane.showMessageDialog(mobileFrame, "Invalid input!\n" + e.getMessage(),
                "Error Message", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //This method is used to display the list of phone numbers inside a Mobile gadget.
    public void displayPhoneNumbers()
    {
        // A try-catch method is used to catch any user input error, that occures when trying to parse an Integet.
        try{
            int index = Integer.parseInt(mobileIndexFld.getText()); // Parsing the data as needed.
            // If the gadget list isn't empty, the index is valid, the gadget is of type <Mobile>, and the phone number list is also not
            // empty, the list of phone numbers is displayed to the screen.
            if(gadgets.isEmpty()){
                // Displaying warning message, because the list is empty.
                JOptionPane.showMessageDialog(mobileFrame, "The gadget list is empty!",
                    "Warning Message", JOptionPane.WARNING_MESSAGE);
                clearMobile(); // Clearing the text fields.
            } else if(index >= gadgets.size() || index < 0){
                // Displaying warning message, regarding the invalid index.
                JOptionPane.showMessageDialog(mobileFrame, "The index is not valid!",
                    "Warning Message", JOptionPane.WARNING_MESSAGE);
                clearMobile(); // Clearing the text fields.
            } else {
                // Creating an object of type <Gadget>, and assigning it the value at the index chosen by the user.
                Gadget gadget = gadgets.get(index);
                if(!(gadget instanceof Mobile)){
                    // Displaying warning message, regarding the invalid object type.
                    JOptionPane.showMessageDialog(mobileFrame, "Gadget at index is not of type Mobile!",
                        "Warning Message", JOptionPane.WARNING_MESSAGE);
                    clearMobile(); // Clearing the text fields.
                } else {
                    // Casting the gadget object to Mobile, so the getCredit method can be used.
                    Mobile mobile = (Mobile) gadget;
                    if(mobile.isNumberListEmpty() == true){
                        // Displaying warning message, because the phone number list is empty.
                        JOptionPane.showMessageDialog(mobileFrame, "Phone number agenda is empty!",
                            "Warning Message", JOptionPane.WARNING_MESSAGE);
                        clearMobile(); // Clearing the text fields.
                    } else {
                        //Displaying the list.
                        mobile.displayPhoneNumbers();
                        clearMobile(); // Clearing the text fields.
                    }
                }
            }
        } 
        // The 'catch' is specifically looking for NumberFormatExceptions.
        catch(NumberFormatException e){
            // Displaying error message, regarding the invalid text format.
            JOptionPane.showMessageDialog(mobileFrame, "Please input valid numbers!\n" + e.getMessage(),
                "Error Message", JOptionPane.ERROR_MESSAGE);
        } 
        // In case any other kind of exception occurs, this 'catch' will take care of it.
        catch(Exception e){
            // Displaying error message, regarding any invalid input.
            JOptionPane.showMessageDialog(mobileFrame, "Invalid input!\n" + e.getMessage(),
                "Error Message", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //This method is used to create the MP3 frame.
    //The MP3 frame is where all the MP3 related methods and buttons will be displayed.
    public void getMP3Frame()
    {
        mp3Frame = new JFrame("Gadget Collection: MP3");
        mp3Frame.setLocation(1140, 400);
        
        Container contentPane = mp3Frame.getContentPane();
        contentPane.setLayout(new GridLayout(3,1));
        
            Container top = new Container();
            top.setLayout(new FlowLayout());
            contentPane.add(top);
            
                Container top1 = new Container();
                top1.setLayout(new GridLayout(2,1));
                top.add(top1);
                
                    JLabel modelLabel = new JLabel("Model");
                    top1.add(modelLabel);
                    
                    mp3ModelFld = new JTextField(10);
                    top1.add(mp3ModelFld);
                
                Container top2 = new Container();
                top2.setLayout(new GridLayout(2,1));
                top.add(top2);
                
                    JLabel sizeLabel = new JLabel("Size [inches]");
                    top2.add(sizeLabel);
                    
                    mp3SizeFld = new JTextField(10);
                    top2.add(mp3SizeFld);
                
                Container top3 = new Container();
                top3.setLayout(new GridLayout(2,1));
                top.add(top3);
                
                    JLabel weightLabel = new JLabel("Weight [grams]");
                    top3.add(weightLabel);
                    
                    mp3WeightFld = new JTextField(10);
                    top3.add(mp3WeightFld);
                
                Container top4 = new Container();
                top4.setLayout(new GridLayout(2,1));
                top.add(top4);
                
                    JLabel priceLabel = new JLabel("Price [£]");
                    top4.add(priceLabel);
                    
                    mp3PriceFld = new JTextField(10);
                    top4.add(mp3PriceFld);
                
                Container top5 = new Container();
                top5.setLayout(new GridLayout(2,1));
                top.add(top5);
                
                    JLabel creditLabel = new JLabel("Memory [MB]");
                    top5.add(creditLabel);
                    
                    memoryFld = new JTextField(10);
                    top5.add(memoryFld);
            
            Container middle = new Container();
            middle.setLayout(new FlowLayout());
            contentPane.add(middle);
            
                Container indexGrid = new Container();
                indexGrid.setLayout(new GridLayout(2,1));
                middle.add(indexGrid);
                    
                    JLabel indexLabel = new JLabel("Index");
                    indexGrid.add(indexLabel);
                    
                    mp3IndexFld = new JTextField(5);
                    indexGrid.add(mp3IndexFld);
            
                addMP3Btn = new JButton("Add MP3");
                addMP3Btn.addActionListener(this);
                middle.add(addMP3Btn);
                
                removeMP3Btn = new JButton("Remove MP3");
                removeMP3Btn.addActionListener(this);
                middle.add(removeMP3Btn);
                
                getMemoryBtn = new JButton("Get Memory");
                getMemoryBtn.addActionListener(this);
                middle.add(getMemoryBtn);
                
                clearMP3Btn = new JButton("Reset ");
                clearMP3Btn.addActionListener(this);
                middle.add(clearMP3Btn);
            
            Container bottom = new Container();
            bottom.setLayout(new FlowLayout());
            contentPane.add(bottom);
            
                Container bottom1 = new Container();
                bottom1.setLayout(new GridLayout(2,1));
                bottom.add(bottom1);
                
                    JLabel songTitle = new JLabel("Song Title");
                    bottom1.add(songTitle);
                    
                    titleFld = new JTextField(15);
                    bottom1.add(titleFld);
                    
                Container bottom2 = new Container();
                bottom2.setLayout(new GridLayout(3,1));
                bottom.add(bottom2);
                    
                    downloadSongBtn = new JButton("Download");
                    downloadSongBtn.addActionListener(this);
                    bottom2.add(downloadSongBtn);
                    
                    deleteSongBtn = new JButton("Delete");
                    deleteSongBtn.addActionListener(this);
                    bottom2.add(deleteSongBtn);
                    
                    displaySongsBtn = new JButton("Display Playlist");
                    displaySongsBtn.addActionListener(this);
                    bottom2.add(displaySongsBtn);
                    
                Container bottom3 = new Container();
                bottom3.setLayout(new GridLayout(2,1));
                bottom.add(bottom3);
                
                    JLabel songSize = new JLabel("Song Size [MB]");
                    bottom3.add(songSize);
                    
                    songSizeFld = new JTextField(15);
                    bottom3.add(songSizeFld);
                    
        mp3Frame.pack();
    }
    
    //This method is used to add a MP3 gadget to the list of gadgets.
    public void addMP3()
    {
        // A try-catch method is used to catch any user input error, that occures when trying to parse an Integet or a Double.
        try{
            // Retreiving the values from the necessery text fields.
            String model = mp3ModelFld.getText();
            String size = mp3SizeFld.getText();
            int weight = Integer.parseInt(mp3WeightFld.getText()); // Parsing the data as all text fields hold strings.
            double price = Double.parseDouble(mp3PriceFld.getText()); // Parsing the data as needed.
            int memory = Integer.parseInt(memoryFld.getText()); // Parsing the data as needed.
            // Checks if the numerical values input by the user are above 0.
            if(price > 0 && weight > 0 && memory > 0){
                // If so, a new mobile object is created and added to the list.
                MP3 mp3 = new MP3(model, size, weight, price, memory);
                gadgets.add(mp3);
                // Displaying a confirmation message.
                JOptionPane.showMessageDialog(mp3Frame, 
                    "MP3 added to the list!\n", "Info Message", JOptionPane.INFORMATION_MESSAGE);
                clearMP3(); // Clearing the text fields.
            } else {
                // Displaying warning message, regarding any invalid inputs for either the price, weight, or memory.
                JOptionPane.showMessageDialog(mp3Frame, 
                    "Price, weight, and memory must be larger than 0!", "Warning Message",
                    JOptionPane.WARNING_MESSAGE);
                clearMP3(); // Clearing the text fields.
            }
        }
        // The 'catch' is specifically looking for NumberFormatExceptions.
        catch(NumberFormatException e){
            // Displaying error message, regarding the invalid text format.
            JOptionPane.showMessageDialog(mp3Frame, "Make sure you input valid numbers!\n" + e.getMessage(),
                "Error Message", JOptionPane.ERROR_MESSAGE);
        } 
        // In case any other kind of exception occurs, this 'catch' will take care of it.
        catch(Exception e){
            // Displaying error message, regarding any invalid input.
            JOptionPane.showMessageDialog(mp3Frame, "Invalid input!\n" + e.getMessage(),
                "Error Message", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //This method is used to remove a gadget of type <MP3> from the list.
    public void removeMP3()
    {
        // A try-catch method is used to catch any user input error, that occures when trying to parse an Integet or a Double.
        try{
            int index = Integer.parseInt(mp3IndexFld.getText()); // Parsing the data as needed.
            // This if statement checks to see if the list is empty and if the index input by the user is valid.
            // If the list of gadgets is empty, there are no gadgets that can be removed from the list, so a warning message will be displayed. 
            // If the list isn't empty but the index is invalid, a warning message will be displayed. Otherwise, the gadget will be removed.
            if(gadgets.isEmpty()){
                // Displaying warning message, because the list is empty.
                JOptionPane.showMessageDialog(mp3Frame, "The gadget list is empty!",
                    "Warning Message", JOptionPane.WARNING_MESSAGE);
                clearMP3(); // Clearing the text fields.
            } else if(index >= gadgets.size() || index < 0){
                // Displaying warning message, regarding the invalid index.
                JOptionPane.showMessageDialog(mp3Frame, "The index is not valid!",
                    "Warning Message", JOptionPane.WARNING_MESSAGE);
                clearMP3(); // Clearing the text fields.
            } else {
                // Displaying confirmation message.
                gadgets.remove(index);
                JOptionPane.showMessageDialog(mp3Frame, "Removed gadget from the list!",
                    "Information Message", JOptionPane.INFORMATION_MESSAGE);
                clearMP3(); // Clearing the text fields.
            }
        }
        // The 'catch' is specifically looking for NumberFormatExceptions.
        catch(NumberFormatException e){
            // Displaying error message, regarding the invalid text format.
            JOptionPane.showMessageDialog(mp3Frame, "Please input valid numbers!\n" + e.getMessage(),
                "Error Message", JOptionPane.ERROR_MESSAGE);
        }
        // In case any other kind of exception occurs, this 'catch' will take care of it.
        catch(Exception e){
            // Displaying error message, regarding any invalid input.
            JOptionPane.showMessageDialog(mp3Frame, "Invalid input!\n" + e.getMessage(),
                "Error Message", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //This method is used to display the memory information of a specific mp3 gadget in the list.
    public void getMemory()
    {
        // A try-catch method is used to catch any user input error, that occures when trying to parse an Integet or a Double.
        try{
            int index = Integer.parseInt(mp3IndexFld.getText()); // Parsing the data as needed.
            // This if statement checks to see if the list is empty, if the index is valid, and if the gadget at that index is of type <Mobile>.
            // If the list of gadgets is empty, there is no credit information that can be displayed.
            // If the index is valid, but the gadget at that index is not of type <MP3>, the getAvailableMemory method can't be invoked.
            if(gadgets.isEmpty()){
                // Displaying warning message, because the list is empty.
                JOptionPane.showMessageDialog(mp3Frame, "The gadget list is empty!",
                    "Warning Message", JOptionPane.WARNING_MESSAGE);
                clearMP3(); // Clearing the text fields.
            } else if(index >= gadgets.size() || index < 0){
                // Displaying warning message, regarding the invalid index.
                JOptionPane.showMessageDialog(mp3Frame, "The index is not valid!",
                    "Warning Message", JOptionPane.WARNING_MESSAGE);
                clearMP3(); // Clearing the text fields.
            } else {
                // Creating an object of type <Gadget>, and assigning it the value at the index chosen by the user.
                Gadget gadget = gadgets.get(index);
                // Checking if the object is of type <MP3>, using the 'instanceof' statement.
                if(gadget instanceof MP3){
                    // Casting the gadget object to MP3, so the getCredit method can be used.
                    MP3 mp3 = (MP3) gadget;
                    // Displaying confirmation message.
                    JOptionPane.showMessageDialog(mp3Frame, "You have " + mp3.getAvailableMemory() + "MB worth of available memory.",
                        "Info Message", JOptionPane.INFORMATION_MESSAGE);
                    clearMP3(); // Clearing the text fields.
                } else {
                    // Displaying warning message, regarding the type of the object chosen.
                    JOptionPane.showMessageDialog(mp3Frame, "Gadget at index is not of type MP3!",
                        "Warning Message", JOptionPane.WARNING_MESSAGE);
                    clearMP3(); // Clearing the text fields.
                }
            }
        }
        // The 'catch' is specifically looking for NumberFormatExceptions.
        catch(NumberFormatException e){
            // Displaying error message, regarding the invalid text format.
            JOptionPane.showMessageDialog(mp3Frame, "Please input valid numbers!\n" + e.getMessage(),
                "Error Message", JOptionPane.ERROR_MESSAGE);
        } 
        // In case any other kind of exception occurs, this 'catch' will take care of it.
        catch(Exception e){
            // Displaying error message, regarding any invalid input.
            JOptionPane.showMessageDialog(mp3Frame, "Invalid input!\n" + e.getMessage(),
                "Error Message", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //This method is used to add an element to the songs list in a specific MP3 gadget.
    public void downloadSong()
    {
        // A try-catch method is used to catch any user input error, that occures when trying to parse an Integet.
        try{
            // Retrieving the necessary values from the text fields.
            int size = Integer.parseInt(songSizeFld.getText()); // Parsing the data as needed.
            String title = titleFld.getText();
            int index = Integer.parseInt(mp3IndexFld.getText()); // Parsing the data as needed.
            // If the gadget list isn't empty, the index is valid, the gadget at that index is of type <Mobile>, and the phone number format
            // input by the user is valid, the addPhoneNumber method is called to add the number to the list.
            if(gadgets.isEmpty()){
                // Displaying warning message, because the list is empty.
                JOptionPane.showMessageDialog(mp3Frame, "The gadget list is empty!",
                    "Warning Message", JOptionPane.WARNING_MESSAGE);
                clearMP3(); // Clearing the text fields.
            } else if(index >= gadgets.size() || index < 0){
                // Displaying warning message, regarding the invalid index.
                JOptionPane.showMessageDialog(mp3Frame, "The index is not valid!",
                    "Warning Message", JOptionPane.WARNING_MESSAGE);
                clearMP3(); // Clearing the text fields.
            } else {
                // Creating an object of type <Gadget>, and assigning it the value at the index chosen by the user.
                Gadget gadget = gadgets.get(index);
                if(!(gadget instanceof MP3)){
                    // Displaying warning message, regarding the invalid object type.
                    JOptionPane.showMessageDialog(mp3Frame, "Gadget at index is not of type MP3!",
                        "Warning Message", JOptionPane.WARNING_MESSAGE);
                    clearMP3(); // Clearing the text fields.
                } else {
                    // Casting the Gadget object to MP3, so the downloadMusic method can be used.
                    MP3 mp3 = (MP3) gadget;
                    if(size <= 0){
                        // Displaying warning message, regarding the invalid size.
                        JOptionPane.showMessageDialog(mp3Frame, "Size must be larger than 0!",
                            "Warning Message", JOptionPane.WARNING_MESSAGE);
                        clearMP3(); // Clearing the text fields.
                    } else if(!mp3.enoughMemory(size)){
                        // Displaying warning message, because there isn't enough memory..
                        JOptionPane.showMessageDialog(mp3Frame, "Not enough memory on this MP3 gadget!",
                            "Warning Message", JOptionPane.WARNING_MESSAGE);
                        clearMP3(); // Clearing the text fields.
                    } else {
                        //Executing the downloadMusic for the chosen mp3 gadget.
                        mp3.downloadMusic(size, title);
                        JOptionPane.showMessageDialog(mp3Frame, "Song downloaded.\nAvailable memory: " + mp3.getAvailableMemory() + "MB",
                            "Info Message", JOptionPane.INFORMATION_MESSAGE);
                        clearMP3(); // Clearing the text fields.
                    }
                }
            }
        }
        // The 'catch' is specifically looking for NumberFormatExceptions.
        catch(NumberFormatException e){
            // Displaying error message, regarding the invalid text format.
            JOptionPane.showMessageDialog(mp3Frame, "Please input valid numbers!\n" + e.getMessage(),
                "Error Message", JOptionPane.ERROR_MESSAGE);
        } 
        // In case any other kind of exception occurs, this 'catch' will take care of it.
        catch(Exception e){
            // Displaying error message, regarding any invalid input.
            JOptionPane.showMessageDialog(mp3Frame, "Invalid input!\n" + e.getMessage(),
                "Error Message", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //This method removes an element from the 'songs' list inside a specific mp3 gadget.
    public void deleteSong()
    {
        // A try-catch method is used to catch any user input error, that occures when trying to parse an Integet.
        try{
            // Retrieving the necessary values from the text fields.
            String title = titleFld.getText();
            int index = Integer.parseInt(mp3IndexFld.getText()); // Parsing the data as needed.
            // If the gadget list isn't empty, the index is valid, the gadget at that index is of type <Mobile>, and the phone number format
            // input by the user is valid, the addPhoneNumber method is called to add the number to the list.
            if(gadgets.isEmpty()){
                // Displaying warning message, because the list is empty.
                JOptionPane.showMessageDialog(mp3Frame, "The gadget list is empty!",
                    "Warning Message", JOptionPane.WARNING_MESSAGE);
                clearMP3(); // Clearing the text fields.
            } else if(index >= gadgets.size() || index < 0){
                // Displaying warning message, regarding the invalid index.
                JOptionPane.showMessageDialog(mp3Frame, "The index is not valid!",
                    "Warning Message", JOptionPane.WARNING_MESSAGE);
                clearMP3(); // Clearing the text fields.
            } else {
                // Creating an object of type <Gadget>, and assigning it the value at the index chosen by the user.
                Gadget gadget = gadgets.get(index);
                if(!(gadget instanceof MP3)){
                    // Displaying warning message, regarding the invalid object type.
                    JOptionPane.showMessageDialog(mp3Frame, "Gadget at index is not of type MP3!",
                        "Warning Message", JOptionPane.WARNING_MESSAGE);
                    clearMP3(); // Clearing the text fields.
                } else {
                    // Casting the Gadget object to MP3, so the deleteMusic method can be used.
                    MP3 mp3 = (MP3) gadget;
                    if(mp3.isSongListEmpty()){
                        // Displaying warning message, regarding the invalid size.
                        JOptionPane.showMessageDialog(mp3Frame, "Song library is empty!",
                            "Warning Message", JOptionPane.WARNING_MESSAGE);
                        clearMP3(); // Clearing the text fields.
                    } else if(!mp3.containsSong(title)){
                        // Displaying warning message, because there isn't enough memory..
                        JOptionPane.showMessageDialog(mp3Frame, "Song doesn't exist in the library!",
                            "Warning Message", JOptionPane.WARNING_MESSAGE);
                        clearMP3(); // Clearing the text fields.
                    } else {
                        //Removing the element from the 'songs' list inside the mp3.
                        mp3.deleteMusic(title);
                        JOptionPane.showMessageDialog(mp3Frame, "Song removed from playlist.",
                            "Info Message", JOptionPane.INFORMATION_MESSAGE);
                        clearMP3(); // Clearing the text fields.
                    }
                }
            }
        }
        // The 'catch' is specifically looking for NumberFormatExceptions.
        catch(NumberFormatException e){
            // Displaying error message, regarding the invalid text format.
            JOptionPane.showMessageDialog(mp3Frame, "Please input valid numbers!\n" + e.getMessage(),
                "Error Message", JOptionPane.ERROR_MESSAGE);
        } 
        // In case any other kind of exception occurs, this 'catch' will take care of it.
        catch(Exception e){
            // Displaying error message, regarding any invalid input.
            JOptionPane.showMessageDialog(mp3Frame, "Invalid input!\n" + e.getMessage(),
                "Error Message", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void displaySongs()
    {
        // A try-catch method is used to catch any user input error, that occures when trying to parse an Integet.
        try{
            // Retrieving the necessary values from the text fields.
            int index = Integer.parseInt(mp3IndexFld.getText()); // Parsing the data as needed.
            // If the gadget list isn't empty, the index is valid, the gadget at that index is of type <Mobile>, and the phone number format
            // input by the user is valid, the addPhoneNumber method is called to add the number to the list.
            if(gadgets.isEmpty()){
                // Displaying warning message, because the list is empty.
                JOptionPane.showMessageDialog(mp3Frame, "The gadget list is empty!",
                    "Warning Message", JOptionPane.WARNING_MESSAGE);
                clearMP3(); // Clearing the text fields.
            } else if(index >= gadgets.size() || index < 0){
                // Displaying warning message, regarding the invalid index.
                JOptionPane.showMessageDialog(mp3Frame, "The index is not valid!",
                    "Warning Message", JOptionPane.WARNING_MESSAGE);
                clearMP3(); // Clearing the text fields.
            } else {
                // Creating an object of type <Gadget>, and assigning it the value at the index chosen by the user.
                Gadget gadget = gadgets.get(index);
                if(!(gadget instanceof MP3)){
                    // Displaying warning message, regarding the invalid object type.
                    JOptionPane.showMessageDialog(mp3Frame, "Gadget at index is not of type MP3!",
                        "Warning Message", JOptionPane.WARNING_MESSAGE);
                    clearMP3(); // Clearing the text fields.
                } else {
                    // Casting the Gadget object to MP3, so the displaySongs method can be used.
                    MP3 mp3 = (MP3) gadget;
                    if(mp3.isSongListEmpty()){
                        // Displaying warning message, regarding the invalid size.
                        JOptionPane.showMessageDialog(mp3Frame, "Song library is empty!",
                            "Warning Message", JOptionPane.WARNING_MESSAGE);
                        clearMP3(); // Clearing the text fields.
                    } else {
                        //Displays elements of song list.
                        mp3.displaySongs();
                        clearMP3(); // Clearing the text fields.
                    }
                }
            }
        }
        // The 'catch' is specifically looking for NumberFormatExceptions.
        catch(NumberFormatException e){
            // Displaying error message, regarding the invalid text format.
            JOptionPane.showMessageDialog(mp3Frame, "Please input valid numbers!\n" + e.getMessage(),
                "Error Message", JOptionPane.ERROR_MESSAGE);
        } 
        // In case any other kind of exception occurs, this 'catch' will take care of it.
        catch(Exception e){
            // Displaying error message, regarding any invalid input.
            JOptionPane.showMessageDialog(mp3Frame, "Invalid input!\n" + e.getMessage(),
                "Error Message", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    // This method is used to display all elements of the list gadgets.
    public void displayAll()
    {
        // If the gadget list is empty, a warning message will be displayed. Otherwise, while iterating through the list, each element
        // will be checked to see wether it is of type Mobile or MP3, then the display method will be called accordingly.
        if(gadgets.isEmpty()){
            // Diaplaying warning message, because the list is empty.
            JOptionPane.showMessageDialog(mainFrame, "The list of gadgets is empty!",
                "Warning Message", JOptionPane.WARNING_MESSAGE);
        } else {
            // Starting a for loop to iterate through the list and retrieve each element at a time.
            for(Gadget gadget : gadgets){
                if(gadget instanceof Mobile){
                    // Casting the Gadget object to Mobile so the display method can be called specifically for it.
                    Mobile mobile = (Mobile) gadget;
                    // Calling the display method.
                    mobile.display(gadgets.indexOf(gadget));
                } else if(gadget instanceof MP3){
                    // Casting the Gadget object to MP3 so the display method can be called specifically for it.
                    MP3 mp3 = (MP3) gadget;
                    // Calling the display method.
                    mp3.display(gadgets.indexOf(gadget));
                }
            }
        }
    }
    
    //This method is used to clear all text fields on the mobile frame.
    public void clearMobile()
    {
        // Setting all text field blank.
        mobileModelFld.setText("");
        mobileSizeFld.setText("");
        mobileWeightFld.setText("");
        mobilePriceFld.setText("");
        creditFld.setText("");
        phoneNumberFld.setText("");
        durationFld.setText("");
        mobileIndexFld.setText("");
    }
    
    //This method is used to clear all text fields on the mp3 frame.
    public void clearMP3()
    {
        // Setting all text field blank.
        mp3ModelFld.setText("");
        mp3SizeFld.setText("");
        mp3WeightFld.setText("");
        mp3PriceFld.setText("");
        titleFld.setText("");
        songSizeFld.setText("");
        memoryFld.setText("");
        mp3IndexFld.setText("");
    }
    
    public static void main(String[] args)
    {
        GadgetShop collection = new GadgetShop();
    }
    
    public void actionPerformed(ActionEvent event)
    {
        String command = event.getActionCommand();
        
        if(command == "Mobile"){
            mobileFrame.setVisible(true);
        }
        if(command == "MP3"){
            mp3Frame.setVisible(true);
        }
        if(command == "Add Mobile"){
            addMobile();
        }
        if(command == "Remove Mobile"){
            removeMobile();
        }
        if(command == "Add Credit"){
            addCredit();
        }
        if(command == "Get Credit"){
            getCredit();
        }
        if(command == "Make Call"){
            makeCall();
        }
        if(command == "Add MP3"){
            addMP3();
        }
        if(command == "Remove MP3"){
            removeMP3();
        }
        if(command == "Get Memory"){
            getMemory();
        }
        if(command == "Download"){
            downloadSong();
        }
        if(command == "Delete"){
            deleteSong();
        }
        if(command == "Reset"){
            mainFrame.setVisible(true);
            clearMobile();
        }
        if(command == "Reset "){
            mainFrame.setVisible(true);
            clearMP3();
        }
        if(command == "Display All"){
            displayAll();
        }
        if(command == "Add Phone Number"){
            addPhoneNumber();
        }
        if(command == "Display Agenda"){
            displayPhoneNumbers();
        }
        if(command == "Display Playlist"){
            displaySongs();
        }
    }
}
