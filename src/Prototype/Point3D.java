package Prototype;

public class Point3D {

	private float x, y, z;
	
	public static final Point3D ZERO = new Point3D(0, 0, 0);
	
	public Point3D(float x, float y, float z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	@Override public String toString() {
		final StringBuilder sb = new StringBuilder("Point3D{");
		sb.append("x=").append(x);
		sb.append(", y=").append(y);
		sb.append(", z=").append(z);
		sb.append('}');
		return sb.toString();
	}

	public Point3D normalize() {
		float mag = magnitude();
		return new Point3D(x/mag, y/mag, z/mag);
	}
	
	private float magnitude() {
		return (float)Math.sqrt(x*x + y*y + z*z);
	}
	
	public Point3D multiply(float scale) {
		return new Point3D(x*scale, y*scale, z*scale);
	}
	
	public Point3D add(Point3D vect) {
		return new Point3D(x+vect.x, y+vect.y, z+vect.z);
	}
}
