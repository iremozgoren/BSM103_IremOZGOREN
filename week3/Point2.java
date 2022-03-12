package donem2.week3;

public class Point2 {

	int x;
	int y;

	public double distanceFromOrigin() {
		return Math.sqrt(x * x + y * y);
	}

	public void translate(int dx, int dy) {
		x += dx;
		y += dy;
	}

}
