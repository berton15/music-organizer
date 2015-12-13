import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class MusicOrganizerTest.
 *
 * @author  Tone Berg
 * @version 2015.12.13
 */
public class MusicOrganizerTest
{
    private MusicOrganizer musicOrg1;


    /**
     * Default constructor for test class MusicOrganizerTest
     */
    public MusicOrganizerTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        musicOrg1 = new MusicOrganizer();
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testRemoveFileBeforeAdding()
    {
        musicOrg1.removeFile(0);
    }

    @Test
    public void testAddFilesAndCheckNumber()
    {
        musicOrg1.addFile("BigBillBroonzy-BabyPleaseDontGo1.mp3");
        musicOrg1.addFile("BlindBlake-EarlyMorningBlues.mp3");
        musicOrg1.addFile("BlindLemonJefferson-matchBoxBlues.mp3");
        musicOrg1.addFile("BlindLemonJefferson-OneDimeBlues.mp3");
        assertEquals(4, musicOrg1.getNumberOfFiles());
        musicOrg1.listFile(0);
    }
}

