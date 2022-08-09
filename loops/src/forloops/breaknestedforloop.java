package forloops;

public class breaknestedforloop {

	public static void main(String[] args) {
		for(int i=1; i<=3; i++)  //1, 2, 3
		{
			for(int j=1; j<=3; j++)  //1, 2 
			{
				if(i==2&&j==2) {
					break; //forcefully termination on inner for loop 
				}
				System.out.println(i+" "+j);  //11, 12, 13
				}                            //21,
			}                               //31, 32, 33
		}

	}


