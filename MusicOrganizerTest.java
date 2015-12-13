

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class MusicOrganizerTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
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
    public void testIncrementPlayCount()
    {
        musicOrg1.playTrack(1);
        musicOrg1.stopPlaying();
    }
}

