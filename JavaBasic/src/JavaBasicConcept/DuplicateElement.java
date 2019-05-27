package JavaBasicConcept;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElement {

	public static void main(String[] args) {
		
		String[] names= {"java","javascript","c","c++","c","java"};
		Set<String> store= new HashSet<String>();
		
		for(String s1 :names) {
			if(store.add(s1)==false)
			{
				System.out.println("duplicate element "+s1);
			}
		}
		
		

	}

}
