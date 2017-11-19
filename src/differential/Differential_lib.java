package differential;

public class Differential_lib implements Differential_if{
	
	private double a,h,i;
	
	public Differential_lib(double a, double h) {
		this.a=a;
		this.h=h;
	}

	@Override
	public double getRx() {
		
		return 2 * this.a;
	}
	
	@Override
	public double getDx() {
		return (Math.pow(this.a+this.h, 2)-Math.pow(this.a, 2))/h;

	}
	
	@Override
	public double getAx() {
		//return (2 * this.a)-((Math.pow(this.a+this.h, 2)-Math.pow(this.a, 2))/h);
		i = ((2 * this.a)-((Math.pow(this.a+this.h, 2)-Math.pow(this.a, 2))/h))*100;
		if(i<0) {
			i = i * (-1);
		}
	return i;
		
	}
	
	
}
