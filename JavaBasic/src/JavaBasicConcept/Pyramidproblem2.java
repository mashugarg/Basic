package JavaBasicConcept;

//output should be 
/*1 3 5 7 9
1 3 5 7
1 3 5 
1 3
1*/
public class Pyramidproblem2 {

	public static void main(String[] args) {
		
		int i,j;
		for(i=9;i>=1;i-=2) {
			for(j=1;j<=i;j+=2) {
				
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
