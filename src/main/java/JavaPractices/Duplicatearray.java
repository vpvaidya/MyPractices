package JavaPractices;

import java.util.HashSet;
import java.util.Set;

public class Duplicatearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findduplicateArray();
	}
	
	public static void findduplicateArray()
	{
		String [] str= {"Java", "Javascript","ruby","Java"};
		System.out.println("String values=>:"+ str);
		Set<String> iset= new HashSet<String>();
		
		 for(String dupl:str)
		 {
			 if(iset.add(dupl)==false)
			 {
				 System.out.println("Duplicate=>:"+ dupl);
			 }
		 }
	}

}
