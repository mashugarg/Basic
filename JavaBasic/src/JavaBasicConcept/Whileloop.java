package JavaBasicConcept;



/* problem:value 123
 * output should be 1+2+3
 */
public class Whileloop {
		int a=123,sum=0;
	public static void main(String[] args) {

		while(a%10>0) {
			sum = sum+a%10;
		}
		

	}

}
