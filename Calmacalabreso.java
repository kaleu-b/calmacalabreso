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
		double radarTurn = getHeadingRadians() + e.getBearingRadians() - getRadarHeadingRadians();
        	setTurnRadarRightRadians(2 * Utils.normalRelativeAngle(radarTurn));
		setMaxVelocity(10);
		setAhead( e.getBearing() + (e.getDistance() * 1.2));
		setTurnRight(1000);
		double absoluteBearing = getHeadingRadians() + e.getBearingRadians();
		double bulletPower = Math.min(500 / e.getDistance(), 5);
		double enemyVelocity = e.getVelocity();
        	if (enemyVelocity != 0) {
            	gunTurn += Math.asin(enemyVelocity / Rules.getBulletSpeed(bulletPower) * Math.sin(e.getHeadingRadians() - absoluteBearing));
        	}
		setTurnGunRightRadians(gunTurn);
		setFire(bulletPower);
	}

	public void onHitRobot(HitRobotEvent e){

}
	

	public void onHitWall(HitWallEvent e) {
	
	}	
}
