package JavaPractices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayandArraylist {

	public static void main(String[] args) 
	{
		//Method1_AddArraytoarraylist();
		Method2_UsingCollection_AddArraytoarraylist();

     }
	public static void Method1_AddArraytoarraylist()
	{
	String[] strArray = {"1","2","3"};
	
	List<String> list = new ArrayList<String>();
	
         list= Arrays.asList(strArray);
         System.out.println("=======>"+list);
         
         //Simple using for loop 
        /* 
         for(int i=0; i<list.size();i++)
         {
        	 String str= list.get(i);
        	 System.out.println("This is =======>"+str);
         }*/
         
         //Using Advance for loop
         
         for(String strA: list)
         {
        	 System.out.println("This is =======>"+strA);
         }
         
}
	
	public static void Method2_UsingCollection_AddArraytoarraylist()
	{
	String[] strArray = {"1","2","3"};
	
	List<String> list = new ArrayList<String>();
	Collections.addAll(list, strArray);
	System.out.println("This is before =======>"+list);
	list.add("4"); // this is possible only when we use collections above 1 method can't add add like 
	System.out.println("This is after =======>"+list);
}
}

