package babliakis;

public class Plane {
	Point3D[] points;
	
	public Plane(){
		
		points=null;
		
	}
	
	public Plane(int n){
		points=new Point3D[n];
	}
	
	double  euklideanDistance(Point p1,Point p2){
		return Math.sqrt((p1.x-p2.x)*(p1.x-p2.x) +(p1.y-p2.y)*(p1.y-p2.y));
		
	}
	
	Point3D closestPoint(Point p){
		double min=euklideanDistance(p,points[0]);
		int index=0;
		for (int i=1;i<points.length;i++){
			if(min>euklideanDistance(p,points[i])){
				min=euklideanDistance(p,points[i]);
				index=i;
				
			}
			
		}
		return points[index];
	}
	
	Point3D maxHeight(Point3D[]points){
		double max=points[0].h;
		int index=0;
		for (int i=1;i<points.length;i++){
			if(max<points[i].h){
				max=points[i].h;
				index=i;
			}
		}
		return points[index];
	}

}
