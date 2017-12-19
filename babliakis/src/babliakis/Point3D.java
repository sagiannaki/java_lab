package babliakis;

public class Point3D extends Point {
	
	
	double h;
	
	
	public Point3D(){//constructor
		super();  //giati einai extends
		h=0;
	}
	
	public Point3D(int x, int y, double h){
		super(x,y);
		this.h=h;
		
	}
}
