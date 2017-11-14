
public class person {
	String name;
	String gender;
	int age;
	
	person(){
		name="";
		gender="";
		age=0;
		
	}
	public person (String n,String g, int a){
		name=n;
		gender=g;
		age=a;
	}
	public String toString(){
		return " name: "+name+ " age: "+age+" gender: "+gender;
	}

}
