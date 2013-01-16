/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eel.seprphase2.Persistence;

import java.io.File;
import java.util.Calendar;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import eel.seprphase2.Persistence.Utils;
/**
 *
 * @author James
 */
public class SaveGameFileTest {
    
    public SaveGameFileTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of SaveToDisk method, of class SaveGameFile.
    
    @Test
    public void testSaveToDisk() {
   
        SaveGameFile instance = new SaveGameFile("filename","data");
        instance.SaveToDisk();
    
    }*/
    
    @Test
    public void shouldCreateDir()
    {
        SaveGameFile instance = new SaveGameFile();
        File f = new File(instance.FullSavePath());
        try
        {
            instance.CreateSavePath();
        }
        catch(Exception e)
        {
            fail(e.getMessage());
        }
        
        assertTrue(f.exists());
    }
    
    @Test
    public void shouldNotBreakIfTryingToCreateTheSameFolderTwice()
    {
        SaveGameFile instance = new SaveGameFile();
        File f = new File(instance.FullSavePath());
        try
        {
            instance.CreateSavePath();
        }
        catch(Exception e)
        {
            fail(e.getMessage());
        }
        
        assertTrue(f.exists());
        
        
        try
        {
            instance.CreateSavePath();
        }
        catch(Exception e)
        {
            fail(e.getMessage());
        }
        
        assertTrue(f.exists());
    }
    
    @Test
    public void shouldCreateAnEmptyFile()
    {
        
        Calendar cal = Calendar.getInstance();
        long time = cal.getTimeInMillis();
        SaveGameFile instance = new SaveGameFile("test_"+time,"");
        
        assertTrue(new File(instance.FilePath()).exists());
    }
    
    @Test
    public void shouldCreateAFileWithContent()
    {
        
        Calendar cal = Calendar.getInstance();
        long time = cal.getTimeInMillis();
        SaveGameFile instance = new SaveGameFile("test_"+time,"hello");
        
        assertTrue(new File(instance.FilePath()).exists());
        
        try
        {
            assertEquals(Utils.readFile(instance.FilePath()),"hello");
        }
        catch(Exception e)
        {
            fail("Reading file failed");
        }
        
    }
}