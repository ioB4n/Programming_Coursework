//importing java.util.ArrayList to be able to use ArrayLists.
import java.util.ArrayList;
//importing java.util.Iterator to be able to use the Iterator function.
import java.util.Iterator;

public class MP3 extends Gadget
{
    //Attributes unique only to object of type <MP3>.
    private int theMemory;
    private int availableMemory;
    private ArrayList <Song> songs;
    
    //The constructor will be executed any time a new mp3 gadget will be created.
    public MP3(String model, String size, int weight, double price, int memory)
    {
        super(model, size, weight, price);//Calling the superclass constructor.
        theMemory = memory;
        availableMemory = memory;
        songs = new ArrayList <Song>();//Creating a new ArrayList songs of type <Song>.
    }
    
    // This method is used to return the total memory of the mp3;
    public int getMemory()
    {
        return theMemory;
    }
    
    //The getAvailableMemory method returns an Integer value representing the available memory on the mp3.
    public int getAvailableMemory()
    {
        int occupiedSpace = 0;//Will hold the value for the space occupied by the song objects in the list.
        
        //Iterates through the list of songs.
        for(Song song : songs){
            occupiedSpace += song.getSize();//Adding the size of the current song to the occupiedSpace.
        }
        
        availableMemory = theMemory - occupiedSpace;//updating the value of the availableMemory variable.
        
        return availableMemory;
    }
    
    //The downloadMusic method creates a new song object and adds it to the list of songs.
    public void downloadMusic(int size, String title)
    {
        Song song = new Song(title, size);//Creating.
        songs.add(song);//Adding to the list.
    }
    
    //The enoughMemory method returns a boolean value which will represent whether there is enough memory
    //on the mp3 gadget.
    public boolean enoughMemory(int size)
    {
        getAvailableMemory();//Updating the availableMemory variable.
        boolean isEnough = true;
        
        //Checks if the size of the song is larger than the available memory.
        if(size > availableMemory){
            isEnough = false;//If the song size is too large, isEnough is set to 'false'.
        }
        
        return isEnough;
    }
    
    //The containsSong method returns a boolean variable which will represent whether a song is present in 
    //the list based on it's title.
    public boolean containsSong(String title)
    {
        boolean doesExist = false;
        
        //Iterates through the list of songs.
        for(Song song : songs){
            
            //Checks if the title that the user input is the same as the current list element.
            if(song.getTitle().equals(title)){
                doesExist = true;//If there is a match, doesExist is set to 'true'.
                break;
            }
        }
        
        return doesExist;
    }
    
    //The deleteMusic method is used to remove a song form the list of songs.
    public void deleteMusic(String title)
    {
        Iterator <Song> iterator = songs.iterator();//Creating an iterator for the list of songs.
        
        //Loops through the list as long as there is an element after the current one.
        do{
            Song song = iterator.next();//Assigning the value of the iterator to a song variable.
            
            //Checks if the titles match.
            if(song.getTitle().equals(title)){
                iterator.remove();//If the titles match, the current element in the list is removed.
                getAvailableMemory();//Updating the available memory as an element has been removed.
                break;
            }
            
        } while(iterator.hasNext());
    }
    
    //The isSongListEmpty method returns a boolean value which will represent whether the list of songs is
    //empty or not.
    public boolean isSongListEmpty()
    {
        boolean isEmpty = false;
        
        //Checks if the list of songs is empty.
        if(songs.isEmpty()){
            isEmpty = true;//If the list is empty, isEmpty is set to 'true'.
        }
        
        return isEmpty;
    }
    
    //The displaySongs method is used to print the elements of a songs list to the screen.
    public void displaySongs()
    {
        System.out.println("*****************************");
        System.out.println(">>> Downloaded Songs");
        
        //Iterating through the list and printing the details of each element.
        for(Song song : songs){
            System.out.println("#" + (songs.indexOf(song)+1) + 
            "Title: " + song.getTitle());
            System.out.println("#" + (songs.indexOf(song)+1) + 
            "Size: " + song.getSize());
        }
        
        System.out.println("*****************************");
    }
    
    //The diaplay method is used to display the details of the MP3 object.
    public void display(int index)
    {
        System.out.println("*****************************");
        System.out.println("#" + index + " MP3 Player");
        super.display(); // Calling the display method from the superclass.
        System.out.println("Total memory: " + theMemory + "MB");
        System.out.println("Free memory: " + getAvailableMemory() + "MB");
        System.out.println("*****************************");
    }
}

//The song class is used to create objects and to populate a list of songs inside an MP3 object.
class Song
{
    private String theTitle;
    private int theSize;
    
    //The constructor is used when creating a new Song object.
    public Song(String title, int size)
    {
        theTitle = title;
        theSize = size;
    }
    
    //The getTitle method returns the title of the song.
    public String getTitle()
    {
        return theTitle;
    }
    
    //The getSize method returns the size of the song.
    public int getSize()
    {
        return theSize;
    }
}
