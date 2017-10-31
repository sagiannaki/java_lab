
public class SimpleComplex {
	
	
	private float real, im ;
	public SimpleComplex() {//arxikopoio
		real=0;
		im=0;
	}
	public SimpleComplex(float a, float b){
		real=a;
		im=b;
	}
	
	
	public float getReal(){
		return real;
	}
	public float getIm(){
		return im;
	}
	public void setReal(float s){
		real=s;
		
	}
	public void setIm(float i){
		im=i;
	}
	
	
	public float ComputeNorm(){
		return (float) Math.sqrt((real*real)+ (im*im));//[real^2+im^2]^(1/2)
		
	}
	
}
