import java.util.ArrayList;

/**
 * This class takes an arrayList and integer number
 *  and find if there is a sum in the array that matches the integer
 */

public class SharedData 
{
	private ArrayList<Integer> array;
	private boolean [] winArray;
	private boolean flag;
	private final int b;

	/**
	this constructor initialize an arrayList and an integer number
	 * @param array        arrayList with integers          
	 * @param b            integer that will represent the sum  
	 */
	public SharedData(ArrayList <Integer> array, int b) {
		
		this.array = array;
		this.b = b;
	}


	/**
	returns the winArray 
	 * @return
	 */
	public boolean[] getWinArray() 
	{
		return winArray;
	}


	/**
	sets the winArray
	 * @param winArray - represent if the sum is in the original array
	 */
	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}


	/**
	returns the arrayList 
	 * @return
	 */
	public ArrayList<Integer> getArray() 
	{
		return array;
	}


	/**
	 * 	 return the integer b 

	 * @return
	 */
	public int getB() 
	{
		return b;
	}


	/**
	 * 	 returns the flag true or false

	 * @return
	 */
	public boolean getFlag() 
	{
		return flag;
	}


	/**
	 * 	 sets flag to true or false

	 * @param flag - true or false
	 */
	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}