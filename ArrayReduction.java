//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Casey Martinez 

import java.util.Queue;
import java.util.PriorityQueue;
import java.util.LinkedList;

public class ArrayReduction
{
	public static int min_cost( int[] r )
	{
	    //MUST USE A PRIORITY QUEUE

	    PriorityQueue <Integer> pq = new PriorityQueue <Integer>();// Initialize the PriorityQueue

	     // adds the elements from the Array into the PriorityQueue
	    for (int num : r)
	    {
	        pq.add(num); // adds num into the PriorityQueue
	    }
	    
	    int totalCost = 0; // Initializes a variable for the totalCost
	    
	    // While there is more than one element left in Queue it gets the two smallest elements
	    while(pq.size() > 1) 
	    {
	        int one = pq.poll(); // element 1
	        
	        int two = pq.poll(); // element 2
	        
	        int sum = 0;
	        
	        sum = one + two; // adds the elements togther 
	        
	        pq.add(sum); // adds the sum to PriorityQueue
	        totalCost += sum; // Adds sum to totalCost
	    }
	    
	    return totalCost; // Returns the totalCost
	}
	
	public static void main( String[] args )
	{
		int[] s0 = {212};
		System.out.println( ArrayReduction.min_cost(s0));
		
		int[] s1 = {25,10,20};
		System.out.println( ArrayReduction.min_cost(s1));		
			
		int[] s2 = {1,2,3};
		System.out.println( ArrayReduction.min_cost(s2));	
			
		int[] s3 = {1,2,3,4,7,22,33,54,-66,3,4,5,76,7,999};
		System.out.println( ArrayReduction.min_cost(s3));	
			
		int[] s4 = {1,1,1,1,1};
		System.out.println( ArrayReduction.min_cost(s4));	
			
		int[] s5 = {1,1};
		System.out.println( ArrayReduction.min_cost(s5));												
	}
}


/* EXPECTED OUTPUT
 0
85
9
947
12
2
*/
