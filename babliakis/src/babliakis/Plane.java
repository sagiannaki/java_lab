package babliakis;

import java.util.ArrayList;

public class Plane  {
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
	
	Point3D[]insideSquare(Point leftUp, Point leftDown, Point rightUp,Point rightDown){
		ArrayList<Point3D> inside=new ArrayList<Point3D>();
		for (int i=0;i<points.length;i++){
			if (points[i].x>leftDown.x && points[i].x<rightDown.x &&
					points[i].y>leftDown.y && points[i].y<leftUp.y){
				inside.add (points[i]);
				
			}
		}
		Point3D[] inArray =new Point3D[inside.size()];
		for (int i=0; i <inArray.length; i++){
			inArray[i]=inside.get(i);
		}
		return inArray;
		
	}
	
	public static void main(String[] args){
		Plane plane =new Plane(100);
		for(int i=0; i<plane.points.length;i++){
			plane.points[i]=new Point3D((int)(Math.random()*200),
					
					(int)(Math.random()*200), (Math.random()*20));
					}
		
		System.out.println(plane.closestPoint(new Point(100,100)) + 
				","+plane.closestPoint(new Point(100,100)) );
		
		Point3D[] in= plane.insideSquare(new Point(25,75),new Point(25,25),
				new Point(75,75),new Point(75,25));
		System.out.println(in.length);
		System.out.println(plane.maxHeight(in).h);
	}
	
	

}
