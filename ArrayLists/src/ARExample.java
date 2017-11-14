import java.util.*;//gia na mporo na xrisimopoiiso tis arraylists

public class ARExample {
	
ArrayList<Float> a; //8eto 2 lists
ArrayList<Float> b;//prepei na ta balo me kefalaio to proto to float

public ARExample() { //
	a= new ArrayList<Float>();
	b= new ArrayList<Float>();
}

public ARExample(int n){
	a= new ArrayList<Float>(n);
	b= new ArrayList<Float>(n);
}

float vProd(){
	float prod=0;
	if(a.size()==b.size()){ //elegxw ta megethi tis a kai b
		for (int i=0;i<a.size(); i++){
			prod=prod+(a.get(i)*b.get(i));
			
		}
		return prod;
		
	}
	else {
		return Float.NEGATIVE_INFINITY;
	}
}

boolean vOrtho(){ //mou epistrefei an einai true or false
	return(vProd()==0);
}

void fill(int n){
	for(int i=0; i<n; i++){
		a.add( (float)(Math.random()*100));//random ari8mous mexri to 100
		b.add( (float)(Math.random()*100));//add lai oxi set 
		
	}
}
static void statistics (ArrayList<Float> al){
	float max=al.get(0);
	for (int i=0; i<al.size(); i++){
		if(al.get(i)>max){
			max=al.get(i);
		}
		
	}
	System.out.print("max: "+max);
	
	float min=al.get(0);
	for (int i=0; i<al.size(); i++){
		if(al.get(i)<min){
			min=al.get(i);
		}
		
	}
	System.out.print("min: "+min);
	
	float mean=0;
	for (int i=0; i<al.size(); i++){
		mean= mean+ al.get(i);
	}
	mean=mean/al.size();
	System.out.println("mean: "+mean);
}
	
	
	public static void main(String[] args){
	ARExample are=new ARExample(100);
	are.fill(100);
	System.out.println("vProd "+are.vProd());
	System.out.println("rOrtho "+are.vOrtho());
	ARExample.statistics(are.a);
	ARExample.statistics(are.b);
	}

}
