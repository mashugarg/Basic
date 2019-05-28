package JavaBasicConcept;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
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
		
		
//using hashmap
		Map<String,Integer> storemap = new HashMap<String,Integer>();
		for(String s1 :names) {
			String s="aabaacdaad";
			Map<Character,Integer>storemap1 = new HashMap<Character,Integer>();
			for(int i=0;i<s.length();i++) {
				char c =s.charAt(i);
				if(storemap.containsKey(c)) {
					int count =storemap.get(c);
					storemap.put(c, ++count);
				}
				else {
					storemap.put(c,1);
				}
			}
		}
	}

}
