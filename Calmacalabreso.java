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
		double radarTurn = getHeadingRadians() + e.getBearingRadians() - getRadarHeadingRadians();
        setTurnRadarRightRadians(2 * Utils.normalRelativeAngle(radarTurn));
		setMaxVelocity(10);
		setAhead(1000);
		setTurnRight(e.getBearing() + e.getDistance());
		double absoluteBearing = getHeadingRadians() + e.getBearingRadians();
		 double gunTurn = Utils.normalRelativeAngle(absoluteBearing - getGunHeadingRadians());
		double bulletPower = Math.min(500 / e.getDistance(), 5);
		double enemyVelocity = e.getVelocity();
        	if (enemyVelocity != 0) {
            	gunTurn += Math.asin(enemyVelocity / Rules.getBulletSpeed(bulletPower) * Math.sin(e.getHeadingRadians() - absoluteBearing));
        	}
		setTurnGunRightRadians(gunTurn);
		setFire(bulletPower);
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
			/*se o robô bater numa parede, parar de se mover primeiro e depois alterar a direção na qual ele rodopia.
		pelo menos até parar de bater na parede.*/
		setAhead(0);
		setTurnRight(0);
		setTurnLeft(e.getBearing());
		setBack(100);

	}	
}
