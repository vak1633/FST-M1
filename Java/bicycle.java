package Java;

public class bicycle implements bicycleParts, bicycleOperations
{

	public int gears;
	public int currentSpeed;
	
	public bicycle(int gears, int currentSpeed) 
	{
		this.gears=gears;
		this.currentSpeed=currentSpeed;
	}

	@Override
	public void applyBrake(int decrement)
	{
		currentSpeed -= decrement;
		System.out.println(currentSpeed);
	}

	@Override
	public void speedUp(int increment) 
	{
		currentSpeed+=increment;
		System.out.println(currentSpeed);		
	}
	
	public String bicycleDesc() 
	{
		return("No of gears are "+ gears + "\nSpeed of bicycle is " + maxSpeed);
	}
	
}
