package strings_and_dialogs;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
public static void main(String[] args) {
	
Robot a = new Robot();
   
a.penDown();

a.setSpeed(9999999);
 

	
a.move(200);

a.turn(180);

a.move(400);

a.turn(180);

a.move(200);

a.turn(45);

a.move(260);

a.turn(180);

a.move(260);

a.turn(-90);

a.move(260);
}
}
