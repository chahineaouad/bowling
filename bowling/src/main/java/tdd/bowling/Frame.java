package src.main.java.tdd.bowling;

public class Frame {

	public final static Integer BONUS_SPARE = 15;
	public final static Integer BONUS_STRIKE = 20;

	public Integer x;
	public Integer y;
	public TypeFrame state;

	public static enum TypeFrame {
		ERROR,
		TROU,
		SPARE,
		STRIKE;
	}


	public Frame (Integer x, Integer y) {
		/* Comment s'assurer de la cohérence ? assert ?
		 * 
		 * On suppose dans ce qui suit que :
		 * 0 <= x + y <= 10 
		 *    
		 */
		this.x = x;
		this.y = y;
		if (x+y <0 || x+y >10) {
			this.state = TypeFrame.ERROR;
		} else  if (x + y < 10) {
			this.state = TypeFrame.TROU;
		} else if (x != 10) {
			this.state = TypeFrame.SPARE;
		} else  {
			this.state = TypeFrame.STRIKE;
		}
	}

	public Integer launch() {
		int frameScore = 0;
		switch (this.state) {
		case ERROR :
			break;
		case TROU :
			frameScore = (this.x + this.y);
			break;
		case SPARE : 
			frameScore =  10 + BONUS_SPARE;
			break;
		case STRIKE : 
			frameScore = 10 + BONUS_STRIKE;
			break;
		}

		return frameScore;
	}
}
