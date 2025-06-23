package calmacalabreso;
import robocode.*;
import java.awt.Color;
import robocode.util.Utils;
/**
 * Calmacalabreso - a robot by Kanna, Kaléu, Michel & Rafael
 */
public class Calmacalabreso extends AdvancedRobot {

	public void run() {
		
		setBodyColor(Color.black); //cor do corpo (ou lataria)
		setRadarColor(Color.red);  //cor do radar
		setGunColor(Color.black);  //cor da arma
		setBulletColor(Color.magenta); //cor da bala
		
		//faz o radar e arma se moverem independentemente do robô.
		setAdjustRadarForGunTurn(true);
    	setAdjustGunForRobotTurn(true);
	
		while(true) {

			// gira o radar infinitamente até encontrar um inimigo. depois roda todo o código dentro do evento scanned robot.
			
			turnRadarRightRadians(Double.POSITIVE_INFINITY);
		
		}
	}


	public void onScannedRobot(ScannedRobotEvent e) {
	
	}

	public void onHitRobot(HitRobotEvent e){

}
	

	public void onHitWall(HitWallEvent e) {
	
	}	
}
