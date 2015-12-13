import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2011.07.31
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
        files = new ArrayList<String>();
    }

    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(String filename)
    {
        files.add(filename);
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
        if( validIndex(index) ) {
            String filename = files.get(index);
            System.out.println(filename);
        }
    }

    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        if( validIndex(index) ) {
            files.remove(index);
        }
    }

    /**
     * Check if an index is valid for the current state of the collection.
     * @param index The index to be checked.
     */
    public void checkIndex(int index)
    {
        int lastindex = files.size() - 1;
        if ( index < 0 || index > lastindex ) {
            System.out.println("Valid range is 0 to " + lastindex + ".");
        }
    }

    /**
     * Check if an index is valid for the current state of the collection.
     * @param index The index to be checked.
     */
    public boolean validIndex(int index)
    {
        if ( index >= 0 && index < files.size() ) {
            return true;
        }
        return false;
    }
}
