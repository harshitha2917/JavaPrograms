package keywords;
//Continue Keyword
public class Continue_Keyword {
public static void main(String[] args) 
{
	for(int i=1;i<=10;i++) 
	{
		if(i==9) 
		{
			continue;
		}
		System.out.println(i);
	}
}
}
//output: it'll print 1-10 but only number9 will skip