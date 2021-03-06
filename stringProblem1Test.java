/**
 * 
 */
package stringProblem;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author ssubrama
 *
 */
public class stringProblem1Test {
	stringProblem1 myStringProblem1Obj = null;
	
	@Before
	public void setUp() throws Exception {
		myStringProblem1Obj = new stringProblem1();
	}

	/**
	 * @throws java.lang.Exception
	 */
	

	/**
	 * Test method for {@link stringProblem.stringProblem1#replaceChar(java.lang.String, java.lang.Character)}.
	 */
	@Test
	public void testReplaceChar() {
		assertEquals("Verifying the character is removed","ABCDEFGHIJKLMNOPQRSTUVWY", myStringProblem1Obj.replaceChar("ABCDEFGHIJKLMNOPQRSTUVWXYX",'X'));
		assertEquals("Verifying that the string or character is not null","String to be tested or character cannot be null", myStringProblem1Obj.replaceChar(null,'X'));
		assertEquals("Verifying that the string or character is not null","String to be tested or character cannot be null", myStringProblem1Obj.replaceChar("ABCDEFGHIJKLMNOPQRSTUVWXYX",null));
		assertEquals("Verifying the character is removed from the beginning of the string","ABCDEFGHIJKLMNOPQRSTUVWY", myStringProblem1Obj.replaceChar("XABCDEFGHIJKLMNOPQRSTUVWXYX",'X'));
	
	}

	/**
	 * Test method for {@link stringProblem.stringProblem1#deleteChar(java.lang.String, java.lang.Character)}.
	 */
	@Test
	public void testDeleteChar() {
		String myResultString = myStringProblem1Obj.deleteChar("xabcdefghijklmnopqrstuvxxyzx",'x');
		String myExpectedString = " abcdefghijklmnopqrstuv  yz ";
		assertEquals("Verifying the character is removed","abcdefghijklmnopqrstuv  yz ", myStringProblem1Obj.deleteChar("abcdefghijklmnopqrstuvxxyzx",'x'));
		assertEquals("Verifying that the string or character is not null","String or character to be removed cannot be null", myStringProblem1Obj.deleteChar(null,'x'));
		assertEquals("Verifying that the string or character is not null","String or character to be removed cannot be null", myStringProblem1Obj.deleteChar("abcdefghijklmnopqrstuvxxyzx",null));
		assertEquals("Verifying the character is removed from the beginning of the string",myExpectedString, myResultString);
	}

	

}
