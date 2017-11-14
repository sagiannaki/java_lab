
public class Artists extends person {
	String genre;
	String instrument;
	
	Artists(){
		super();
		genre="";
		instrument="";
	}
	Artists( String n,String g, int a, String ge, String i){
		super(n,g,a);
		genre=ge;
		instrument=i;
	
	}
	
	public String toString(){
		 String result=super.toString()+" genre: "+genre+" instrument: "+instrument;
	return result;
		
	
	}

}
