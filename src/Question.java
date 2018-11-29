
public abstract class Question
{
	int number;
	String text;
	
	public int getNumber()
	{
		return number;
	}
	
	public String getText()
	{
		return text;
	}
	
	public abstract String getSolution();
}
