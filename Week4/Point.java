package Week4;

public class Point {
	private int x;
	private int y;

	public Point(int initalyX, int initalyY) {
		setLocation(initalyX, initalyY);
	}

	public void setLocation(int newX, int newY) {
		x = newX;
		y = newY;
	}

	public void translate(int dx, int dy) {
		setLocation(x + dx, y + dy);
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public double distanceFromOrigin() {
		return Math.sqrt(x * x + y * y);
	}

	public String toString() {
		return "(" + x + "," + y + ")";
	}

}
