package week1.assignments;

public class PrimeNumber {

	public static void main(String[] args) {
		int i=0;
		int num = 0;
		String pn = " ";
		for(i=1;i<100;i++)
		{
			int c =0;
			for(num=i;num>=1;num--)
			{
				if(i%num==0)
				{
					c=c+1;
					
				}
			}
			if(c==2)
			{
				pn=pn+i+" ";
				
			}
		}
           System.out.println("prime number from 1 to 100 are:"+pn);
	}

}
