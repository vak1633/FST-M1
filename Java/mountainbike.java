package Java;

public class mountainbike extends Bicycle {
	
	public int seatHeight;
	
	public mountainbike(int gears, int currentSpeed, int startHeight) {
		super(gears, currentSpeed);
		seatHeight = startHeight;
	}
	
	public void setHeight(int newValue) {
        seatHeight = newValue;
    }
	
	public String bicycleDesc() {
        return (super.bicycleDesc()+ "\nSeat height is " + seatHeight);
    } 

}