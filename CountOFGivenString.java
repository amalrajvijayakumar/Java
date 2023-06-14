package self;

public class CountOFGivenString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountOFGivenString cs = new CountOFGivenString();
//		cs.check_count_string1();
		cs.check_count_string2();
		
		}


	private void check_count_string2() { //counting only one time
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("Second Method");
		System.out.println();
		String n = "amal raj";
		int[] cc = new int[n.length()];
		
		
		for (int j=0; j<=n.length()-1; j++)
			{
			int count = 1;
			char ch = n.charAt(j);
				for(int i=j+1; i<n.length(); i++)
				{
					if (ch == n.charAt(i))
					{
						cc[i] = -1;
						count++;
					}
				}
				if(cc[j]!= -1)
				{
				cc[j] =count;}
				if(cc[j]>0)
				{
				System.out.println(ch + " appers for " + cc[j] + " times");				
			}
	}
}
	private void check_count_string1() { //counting all individuals
		// TODO Auto-generated method stub
		String n = "amal raj";
		for(int j=0; j<n.length(); j++)
		{	
		int count =1;
		char ch = n.charAt(j);		
		for(int i = j+1; i<n.length(); i++)
		{
			if(ch == n.charAt(i))
			{
				count++;
			}
		}
		System.out.println(ch + " appers for "+ count + " times");
	}
   }
}
