package JavaBasicConcept;

public class SecondHighest {

	public static void main(String[] args) {
	int i,arr[]= {9999,381,13,2000,277,8844,80,78,678};
	
	int maxvalue=arr[0];
	int secondmaxvalue=arr[0];
	for(i=1;i<9;i++)
	{
		if(arr[i]>maxvalue)
		{
			secondmaxvalue=maxvalue;
			maxvalue=arr[i];
		}
		else
		{
			if(arr[i]>secondmaxvalue)
			secondmaxvalue=arr[i];
		}
	}

	System.out.println("Second Max value is "+secondmaxvalue);
	}

}

