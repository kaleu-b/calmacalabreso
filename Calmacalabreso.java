package calmacalabreso;
import robocode.*;
import java.awt.Color;
import robocode.util.Utils;
/**
 * Calmacalabreso - a robot by Kanna, Kaléu, Michel & Rafael
 */
public class Calmacalabreso extends AdvancedRobot {

	public void run() {
	
		while(true) {
		
		}
	}


	public void onScannedRobot(ScannedRobotEvent e) {
	
	}

	public void onHitRobot(HitRobotEvent e){

}
	

	public void onHitWall(HitWallEvent e) {
			/*se o robô bater numa parede, parar de se mover primeiro e depois alterar a direção na qual ele rodopia.
		pelo menos até parar de bater na parede.*/
		setAhead(0);
		setTurnRight(0);
		setTurnLeft(e.getBearing());
		setBack(100);

	}	
}
