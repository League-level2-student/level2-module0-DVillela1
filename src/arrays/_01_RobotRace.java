package arrays;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
	//2. create an array of 5 robots.
	Robot[] robots = new Robot[9];
	//3. use a for loop to initialize the robots.
	for (int x = 0; x < robots.length; x++) {
		robots[x] = new Robot();
		
	}
		//4. make each robot start at the bottom of the screen, side by side, facing up
	for (int i = 0; i < robots.length; i++) {
		robots[i].setX(i*100+50);
		robots[i].setY(550);
	}
	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
	for (int a = 0; a < robots.length; a++) {
		robots[a].move(50-(a*8));
	}
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
	for (int n = 0; n < robots.length; n++) {
	while (robots[n].getY() > 100) {
			robots[n].move(100);
	}
	}
	//7. declare that robot the winner and throw it a party!
	System.out.println("robots[1] is the winner!");
	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
}
}
