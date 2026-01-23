package Java;

public class activity8
{

	public static void main(String[] args)
	{
		
		try 
		{
			// Method call with correct input
            activity8.exceptionTest("Will print to console");
            // Method call with incorrect input
            activity8.exceptionTest(null);
            activity8.exceptionTest("Won't execute");
		}
		catch(CustomException mae) {
            System.out.println("Inside catch block: " + mae.getMessage());
        }         
		}

	static void exceptionTest(String string) throws CustomException
	{
		if(string == null)
		{
            throw new CustomException("String value is null");
        } else 
        {
            System.out.println(string);
        }		
	}

}
