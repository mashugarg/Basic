package JavaBasicConcept;

public class occurenceofcharinstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}

	
	public static boolean freqcount(String str) {
		str= str.replace(" ", "");
		while(str.length()>0) {
			char ch=str.charAt(0);
			System.out.println(freqcount(str));
			
		}
		return false; 
	}
	
}
