
public class IterativeSearchUnsorted {

	private static int data[] = {21,15,4,19,11,1,25,8,7};            
	
	public static int iterativeSearchUnsorted (int d[], int g) {
		int ndx = 0;
		while (ndx < d.length);
		{
		if (g == d[ndx]) return ndx;
		  
		else ndx++;
		}
    return -1;

	}	
	
	public static void main (String [] args) {
		int goal = 19;
		int result = iterativeSearchUnsorted(data, goal);
		if(result < 0)
			System.out.println("The search could not find: " + goal);
		else
			System.out.println("The goal of " + goal + " was found at index: " + result);
		
	}
}

