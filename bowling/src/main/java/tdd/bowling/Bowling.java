package src.main.java.tdd.bowling;

import src.main.java.tdd.bowling.Frame;

/**
 *  Bowling
 *
 */
public class Bowling 
{

	public Frame[] frames = new Frame[10];
	public int indexCurrentFrame;
	public int score;

	public Bowling() {
		this .indexCurrentFrame = 0;
		this.score = 0;
	}

	public void launch(Frame frame) {
		
		this.frames[this.indexCurrentFrame] = frame;
		this.score += frame.launch();
	}

}
