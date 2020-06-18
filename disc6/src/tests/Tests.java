package tests;

import static org.junit.Assert.*;
import junit.framework.TestCase;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.Iterator;
import junit.framework.TestCase;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import words.*;

public class Tests{

	//Words w; 
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testaddWordsToArray1() {
		Words w = new Words("data/common_names.txt");
		String result = w.getWord(4);
		String expected = "william";
		assertEquals(expected,result);
	}

	
	
	@Test
	public void testContains1() {
		Words w = new Words("data/names.txt");
		boolean result = w.contains("frank");
		assertTrue(result);
	}
	
	
	
	
	
	
	@Test
	public void testContainsSentence1() {
		Words w = new Words("data/1000words.txt");
		boolean result = w.containsSentence("i buy book");
		assertTrue(result);
	}
	
	
	
	
	@Test
	public void testReverseSentence1() {
		Words w = new Words("data/1000words.txt");
		String result = w.reverseSentence("i love you");
		String expected = "you love i";
		assertEquals(expected, result);
	}
	
	
	
	
	@Test
	public void testCount1() {
		
		Words w = new Words("data/test1.txt");
		int result = w.count("abcd");
		int expected = 2;
		assertEquals(expected,result);
	}
	
	
	
	
	@Test
	public void testAnagram1() {
		Words w = new Words("data/1000words.txt");
		boolean result = w.anagram("abcd", "bcda");
		assertTrue(result);
	}
	
	
	
	
	
	
	public void testIterators() throws Exception, Throwable{
		//this shouldnt error
		Words w = new Words();
		Iterator<String> find = w.findWords("virginia", "1000words.txt");
		Iterator<String> anagram = w.findAnagram("");
		find.next();
		anagram.next();
		while(find.hasNext()) {
			String value = find.next();
			if(w.anagram(value, "vase")) {
				break;
			}
		}
		while(anagram.hasNext()) {
			;;
		}
		assertTrue(true);
		
	
	}
	
	
	
	/**
	 * Executes a run of the OrdersProcessor program by reading the data
	 * in the specified file using input redirection.  The file inputFileName
	 * has the item's data file, whether multiple threads will be used,
	 * number of orders, base file name for the orders, and the 
	 * result file name.
	 * 
	 * @param inputFilename
	 * @throws Exception
	 * @throws Throwable
	 */
	private void runProgramWithInput(String word, String inputFilename) throws Exception, Throwable {
		
		/* Retrieving the name of the results file */
		
		String filename="";
		int i = inputFilename.lastIndexOf('.');
		if (i > 0) {
		    filename = inputFilename.substring(0,i);
		}
		
		String resultsFilename = "data/" + filename + "_out.txt";
		String officialResultsFilename = "data/" + filename + "_expected.txt";
		
		/* Deleting results file (in case it exists) */
		File file = new File(resultsFilename);
		file.delete();

		/* Actual execution of the test by using input redirection and calling 
		/* OrdersProcessor.main(null) */
		TestingSupport.redirectStandardInputTo("data/" + inputFilename);
		ByteArrayOutputStream b = TestingSupport.redirectStandardOutputToByteArrayStream();
		
		Words w = new Words("data/" + inputFilename);
		
		Iterator<String> iter = w.findAnagram(word);
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		String output = b.toString();
		TestingSupport.writeToFile(resultsFilename, output);
		
		/* Checking if we got the right results */
		assertTrue(TestingSupport.sameContents(resultsFilename, officialResultsFilename));
	}
	
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(Tests.class);
	    for (Failure failure : result.getFailures()) {
	      System.out.println(failure.toString());
	    }	}
	
	
}
