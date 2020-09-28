import stanford.karel.*;

public class VotingBox extends SuperKarel{
	public void run() {
		while (frontIsClear()) {
			move();
			if (beepersPresent()) {
				move();
			} else {
				pickchad();
			}

		}
	}
	private void pickchad() {
		turnLeft();
		move();
		while (beepersPresent()) {
			pickBeeper();
		}
		turnAround();
		move();
		move();
		while (beepersPresent()) {
			pickBeeper();
		}
		turnAround(); 
		move();
		turnRight();
		move();	
	}
}
