package ru.job4j.condition;

/** Triangle.
*
* @author Daniil Emelyanov.
* @version %Id%
* @since 09/04/17.
*/

public class Triangle {
	/** .
	* Private field Point a.
	*/
	private Point a;
	/** .
	* Private field Point b.
	*/
	private Point b;
	/** .
	* Private field Point c.
	*/
	private Point c;

	/**
	* Class constructor.
	* @param a - initializes field Point a
	* @param b - initializes field Point b
	* @param c - initializes field Point c
	*/

	public Triangle(Point a, Point b, Point c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	/**
	* Calculate length side.
	* @param firstPoint - triangle side a
	* @param secondPoint - triangle side b
	* @return the length of a side of the triangle
	*/
	public static double lineLeng(Point firstPoint, Point secondPoint) {
		return Math.sqrt(Math.pow(firstPoint.getX() - secondPoint.getX(), 2) + (Math.pow(firstPoint.getY() - secondPoint.getY(), 2)));

	}

	/**
	* Method calculates the area of a trangle.
	* For calculation area use Heron's formula.
	* @return - the area triangle, if triangle does not exist then return -1.
	*/
	public double area() {
		double sideAB = Triangle.lineLeng(this.a, this.b);
		double sideBC = Triangle.lineLeng(this.b, this.c);
		double sideAC = Triangle.lineLeng(this.a, this.c);
		double halfPerimeter;
		if (sideAB < sideBC + sideAC && sideAC < sideAB + sideBC && sideBC < sideAB + sideAC) {
			halfPerimeter = (sideAB + sideBC + sideAC) / 2;
			return Math.sqrt(halfPerimeter * (halfPerimeter - sideAB) * (halfPerimeter - sideBC) * (halfPerimeter - sideAC));
		} else {
		return -1;
	}
}
}