package spring;

public class Singleton {
	public static void main(String[] args) {
		
		Single s= Single.getInstance();
		Single s12=Single.getInstance();
	}
}
class Single
{
	static Single s1=new Single();
	private Single()
	{
	System.out.println("helloworld");
	System.out.println("helloworld");

	}
	public static Single getInstance()
	{ 
		return s1;
	}
} 

