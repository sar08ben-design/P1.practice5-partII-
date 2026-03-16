import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 7.0
 */
public class MusicOrganizer
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<String> files;
        
    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer()
    {
        files = new ArrayList<>();
    }
    
    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(String filename)
    {
        files.add(filename);
    }
    
    public void checkIndex(int index){
    if (!(index >= 0 && index < files.size())){
        System.out.println("Invalid Index. Please use a value in the range 0-"+(files.size()-1));
        }
    }    

    public boolean validIndex(int index){
    if (!(index >= 0 && index < files.size())){
        return false;
        }
        else{
        return true;
    }
    
    }  
    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }
    
    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        
    //????????????
    }
    
    public void listWithIndex() {
    int position = 0;
    for(String filename : files) {
        System.out.println(position + ": " + filename);
        position++;   // increment position manually each iteration
    }
}

public void listMatching(String searchString) {
    for(String filename : files) {
        if(filename.contains(searchString)) {
            System.out.println(filename);
        }
    }
}       
    
    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        if(index >= 0 && index < files.size()) {
            files.remove(index);
        }
    }
}
