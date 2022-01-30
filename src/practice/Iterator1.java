package practice;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;


public class Iterator1 {

	public static void main(String[] args)  {
			ArrayList<String> cars=new ArrayList<String>();
			cars.add("BENZ");
			cars.add("BMW");
			cars.add("HONDA");
			cars.add("RR");
			
			
			
			Iterator<String>it=cars.iterator();
			String b=it.next();
			String bm=it.next();
			String h=it.next();
			String r=it.next();
			//System.out.println(it.next());
			//System.out.println(it.next());
			//System.out.println(it.next());
			System.out.println(b);
			System.out.println(h);
			System.out.println(r);
	}
	
	
	
	
	
	
	

}
