
public class Complex extends SimpleComplex {
	
	public Complex(){
		super();
	}
	
	public Complex(float a, float b){
		super(a,b);
	}
	
	public Complex conjugate(){
		Complex mpampis =new Complex(getReal(),-getIm());
		return mpampis;
	}
	
	public static Complex multi(Complex a, Complex b){ //thelo na einai static
		float x= (a.getReal()*b.getReal())-(a.getIm()*b.getIm());
		float y=(a.getReal()*b.getIm())-(a.getIm()*b.getReal());
		return new Complex(x,y);
		
		
	}
	

	public static void main(String[] args) {
		Complex[] compArray = new Complex[10];
		float[] norms =new float [10];
		
		for (int i=0; i<compArray.length; i++){
			compArray[i]=new Complex((float)Math.random(),(float)Math.random());
			norms[i]=compArray[i].ComputeNorm();
		
		System.out.print(compArray[i].getReal()+" +i"+compArray[i].getIm()+" ");
		System.out.print(norms[i]+" ");
		System.out.print(compArray[i].conjugate().getReal()+"+i"+compArray[i].conjugate().getIm()+" ");
		
		System.out.println( Complex.multi(compArray[i],compArray[i].conjugate()).getReal());
		
		}

	}

}
