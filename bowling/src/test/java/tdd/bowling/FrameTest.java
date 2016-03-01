package src.test.java.tdd.bowling;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.main.java.tdd.bowling.Frame;
import src.main.java.tdd.bowling.Frame.TypeFrame;

public class FrameTest {

	@Test
	public void testLaunchFrameRien() {
		Frame frame = new Frame(0, 0);
		int result = frame.launch();
		assertEquals(TypeFrame.TROU, frame.state);
		assertEquals(0, result);
	}
	
	@Test
	public void testLaunchFrameTrou() {
		Frame frame = new Frame(4, 2);
		int result = frame.launch();
		assertEquals(6, result);
	}
	
	@Test
	public void testLaunchFrameSpare() {
		Frame frame = new Frame(7, 3);
		int result = frame.launch();
		assertEquals(10 + Frame.BONUS_SPARE, result);
	}
	
	@Test
	public void testLaunchFrameStrike() {
		Frame frame = new Frame(10, 0);
		int result = frame.launch();
		assertEquals(10 + Frame.BONUS_STRIKE, result);
	}

}
