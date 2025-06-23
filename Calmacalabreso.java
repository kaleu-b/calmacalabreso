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
	/*se o inimigo estiver bem na nossa frente, atirar com o máximo de potência.
como ele está na nossa frente, não precisa ajustar ângulo nem nada. é só atirar com o máximo de potência.
problema: não pensei ainda numa forma de lidar com o caso de algum inimigo que não está sendo trackeado bater no nosso por trás ou até pela frente.*/
	if (e.getBearing() > -90 && e.getBearing() <= 90){
	setFire(10);
	}	
}
	

	public void onHitWall(HitWallEvent e) {
	
}
