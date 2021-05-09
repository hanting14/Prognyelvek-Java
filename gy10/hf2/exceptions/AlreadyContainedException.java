package exceptions;

public class AlreadyContainedException  extends Exception 
{ 
    public AlreadyContainedException (String errorMessage) 
	{
        super(errorMessage);
    }
	public AlreadyContainedException () 
	{
		
    }
}