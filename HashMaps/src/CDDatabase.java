import java.util.HashMap;
public class CDDatabase {
	
	HashMap<String,Artists> albums;
	
	 CDDatabase(){
		albums=new HashMap<String, Artists>();
	 }
	 

	
	
	public static void main(String[] args) {
		CDDatabase base =new CDDatabase();
		Artists a1=new Artists("MJ","male",50,"Pop","Vocals");
		Artists a2=new Artists("JB","male",20,"Pop","Vocals");
		base.albums.put("thriller",a1);
		base.albums.put("Bad",a1);
		base.albums.put("baby",a2);
		System.out.println("Contains Thriller? "+base.albums.containsKey("thriller"));
		System.out.println("Artist of Thriller? "+base.albums.get("thriller").toString());
		
	

	}

}
