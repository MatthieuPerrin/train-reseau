package fr.perrin.trains.simulator;

public class Complex {
	public final double x;
	public final double y;
	
	public Complex (double x, double y) {
		this.x = x;
		this.y = y;
	}
	// essai
	
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
	
	public double longueur() {
		return Math.sqrt(x*x+y*y);
	}
	public double angle() {
		return Math.atan2(y, x);
	}

	public static Complex exp(Complex c) {
		double longueur = Math.exp(c.x);
		return new Complex(longueur * Math.cos(c.y),longueur * Math.sin(c.y));
	}

	public static Complex sum(Complex c1, Complex c2) {
		return new Complex(c1.x + c2.x, c1.y + c2.y);
	}

	public static Complex sub(Complex c1, Complex c2) {
		return new Complex(c1.x - c2.x, c1.y - c2.y);
	}

	public static Complex mult(Complex c1, Complex c2) {
		return new Complex(c1.x * c2.x - c1.y*c2.y, c1.x * c2.y + c2.x * c1.y);
	}
	
	public static Complex div(Complex c1, Complex c2) {
		double l2 = c2.x*c2.x+c2.y*c2.y;
		return new Complex((c1.x * c2.x + c1.y*c2.y)/l2, (c2.x * c1.y - c1.x * c2.y)/l2);
	}

	public static Complex pow(Complex c1, Complex c2) {
		// (r exp(i theta)) ^ (a + i b)
		// r ^ (a + i b) *  exp(i theta) ^ (a + i b) 
		// e ^ (a ln(r)) * e ^ (i b ln(r)) * e ^ (i a theta) * e ^ (- b theta)
		// e ^ (a ln(r) - b theta + i (b ln(r) + a theta))
		// e ^ (a ln(r) - b theta) *  (cos(b ln(r) + a theta) + i * sin(b ln(r) + a theta))
		double lnr = Math.log(c1.longueur());
		double theta = c1.angle();
		double longueur = Math.exp(c2.x * lnr - c2.y * theta);
		double angle = c2.y * lnr + c2.x * theta;
		return new Complex(longueur * Math.cos(angle), longueur * Math.sin(angle));
	}
}