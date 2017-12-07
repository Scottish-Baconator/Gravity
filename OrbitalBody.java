import java.awt.Color;

public class OrbitalBody {

	private double mass;//Mass in kilograms
	private double radius;//radius of body in meters
	private double[] pos = new double[2];//position, in meters, x,y
	private double[] vel = new double[2];//velocity in m/s
	private Color col;
	
	public OrbitalBody(double m, double r, double x, double y, double vx, double vy, Color c) {
		mass = m;
		radius = r;
		pos[0] = x;
		pos[1] = y;
		vel[0] = vx;
		vel[1] = vy;
		col = c;
	}
	
	public double getMass() {
		return mass;
	}
	
	public double[] getPos() {
		return pos;
	}
	
	//acc: acceleration in m/s/s, x,y
	//time: time in seconds
	public void applyAcc(double[] acc, double time) {
		vel[0] += acc[0] * time;
		vel[1] += acc[1] * time;
	}
	
	public void tickVel(double time) {
		pos[0] += vel[0] * time;
		pos[1] += vel[1] * time;
	}

	public double getRad() {
		return radius;
	}

	public double[] getVel() {
		return vel;
	}
	
	public Color getCol() {
		return col;
	}
}