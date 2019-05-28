package JavaBasicConcept;

public class DeleteDuplicateElement {

	public static void main(String[] args) {
		
		int a[]= {7,2,9,4,8};
		int lar1=7;
		int lar2=2;
		for(int i=3;i<a.length;i++)
		{
			if(lar1<a[i])
				lar1=a[i];
			if(lar2<a[i] && lar2<lar1)
			{
				//lar1=lar2;
				lar2=a[i];
			}
				if(lar1<lar2)
				{
				lar1=lar2;
				lar2=a[i];
				}
			}
		System.out.println("lar1==="+lar1+" larg2==="+lar2);
		
		
		
		

	}

}
