/**
 * 
 */
package src.test.java.tdd.bowling;

import static org.junit.Assert.*;

import org.junit.Test;
import src.main.java.tdd.bowling.Bowling;
import src.main.java.tdd.bowling.Frame;


/**
 * @author bikuri
 *
 */
public class BowlingTest {

	@Test
	public void testLaunch() {
		Bowling bowling = new Bowling();
		Frame frame = new Frame(0,0);
		bowling.launch(frame);
		assertEquals(0, bowling.score);
		
		
		
	}
	
}
