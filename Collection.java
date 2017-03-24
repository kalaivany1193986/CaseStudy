package kalai;


import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Vector;
public class Collection {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
	 
		LinkedHashMap<Integer,String> m=new LinkedHashMap<Integer,String>();
		m.put(1,"Ravi");
		m.put(2,"Ram");
		 System.out.println("LinkedHashMap:");
		for(Map.Entry i:m.entrySet())
		{
			System.out.println(i.getKey()+" "+i.getValue());
		}
		
		
		HashMap<Integer,String> m1=new HashMap<Integer,String>();
		m1.put(3,"Raj");
		m1.put(4,"Ragu");
		 System.out.println("HashMap:");

		for(Map.Entry<Integer,String> i:m1.entrySet())
		{
			System.out.println(i.getKey()+" "+i.getValue());
		}
		
		
		 Vector<String> v=new Vector<String>(); 
		 v.add("Humman"); 
		 v.addElement("Wild");  
		 v.addElement("Ghost");  
		 
		 System.out.println("Vector:");

		 Enumeration e=v.elements();  
		 while(e.hasMoreElements()){  
		 System.out.println(e.nextElement());  
		  }
	}
	

}
