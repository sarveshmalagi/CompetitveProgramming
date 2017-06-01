import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ssm
 *
 */
public class MinJumps {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			String[] temp = br.readLine().split(" ");
			int[] arr = new int[n];
			for (int j = 0; j < n; j++) {
				arr[j] = Integer.parseInt(temp[j]);
			}
			
			int maxReach = arr[0],steps = arr[0],jumps = 1;
			for(int j=1;j<n;j++){
				if(j+arr[j] > maxReach){
					maxReach = j+arr[j];
				}
				steps--;
				if(steps == 0){
					jumps++;
					steps = maxReach-j;
				}
			}
			
			if(!canJump(arr)){
				System.out.println("-1");
			}
			else{
				System.out.println(jumps);
			}
		}
	}
	
	public static boolean canJump(int[] A) {
        if (A.length <= 1)
            return true;
        int maxReach = 0;
        int step = 1;
        for (int i = 0; i < A.length; i++) {
            step--;
            if (i + A[i] > maxReach) {
                maxReach = i + A[i];
                step = A[i];
            }
            if (step == 0 && i < A.length - 1)
                return false;
        }
        return true;
    }
}
	/* The variable maxReach stores at all time the maximal reachable position in the array. jump stores the amount of jumps necessary to reach that position. step stores the amount of steps we can still take (and is initialized with the amount of steps at the first array position)

	During the iteration, the above values are updated as follows:

	First we test whether we have reached the end of the array, in which case we just need to return the jump variable.

	Next we update the maximal reachable position. This is equal to the maximum of maxReach and i+A[i] (the number of steps we can take from the current position).

	We used up a step to get to the current index, so steps has to be decreased.

	If no more steps are remaining (i.e. steps=0, then we must have used a jump. Therefore increase jump. Since we know that it is possible somehow to reach maxReach, we initialize the steps to the amount of steps to reach maxReach from position i.

	public class Solution {
	    public int jump(int[] A) {
	        if (A.length <= 1)
	            return 0;
	        int maxReach = A[0];
	        int step = A[0];
	        int jump = 1;
	        for (int i = 1; i < A.length; i++) {
	           if (i == A.length - 1)
	                return jump;
	            if (i + A[i] > maxReach)
	                maxReach = i + A[i];
	            step--;
	            if (step == 0) {
	                jump++;
	                step = maxReach - i;
	            } 
	        }
	        return jump;
	    }
	}

	Example:

	int A[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9}
	int maxReach = A[0];     // A[0]=1, so the maximum index we can reach at the moment is 1.
	int step = A[0];         // A[0] = 1, the amount of steps we can still take is also 1.
	int jump = 1;            // we will always need to take at least one jump.

	*//*************************************
	 * First iteration (i=1)
	 ************************************//*
	if (i + A[i] > maxReach) // 1+3 > 1, we can reach further now!
	    maxReach = 1 + A[i]  // maxReach = 4, we now know that index 4 is the largest index we can reach.

	step--                   // we used a step to get to this index position, so we decrease it
	if (step == 0) {
	    ++jump;              // we ran out of steps, this means that we have made a jump
	                         // this is indeed the case, we ran out of the 1 step we started from. jump is now equal to 2.
	                         // but we can continue with the 3 steps received at array position 2.
	    steps = maxReach-i   // we know that by some combination of 2 jumps, we can reach  position 4.
	                         // therefore in the current situation, we can minimaly take 3
	                         // more steps to reach position 4 => step = 3
	}

	*//*************************************
	 * Second iteration (i=2)
	 ************************************//*
	if (i + A[i] > maxReach) // 2+5 > 4, we can reach further now!
	    maxReach = 1 + A[i]  // maxReach = 7, we now know that index 7 is the largest index we can reach.

	step--                   // we used a step so now step = 2
	if (step==0){
	   // step 
	}

	*//*************************************
	 * Second iteration (i=3)
	 ************************************//*
	if (i + A[i] > maxReach) // 3+8 > 7, we can reach further now!
	    maxReach = 1 + A[i]  // maxReach = 11, we now know that index 11 is the largest index we can reach.

	step--                   // we used a step so now step = 1
	if (step==0){
	   // step 
	}

	/**//*************************************
	 * Third iteration (i=4)
	 ************************************//*
	if (i + A[i] > maxReach) // 4+9 > 11, we can reach further now!
	    maxReach = 1 + A[i]  // maxReach = 13, we now know that index 13 is the largest index we can reach.

	step--                   // we used a step so now step = 0
	if (step == 0) {
	    ++jump;              // we ran out of steps, this means that we have made a jump.
	                         // jump is now equal to 3.
	    steps = maxReach-i   // there exists a combination of jumps to reach index 13, so
	                         // we still have a budget of 9 steps
	}


	//************************************
	 * remaining iterations
	 ***********************************
	// nothing much changes now untill we reach the end of the array.

	My suboptimal algorithm which works in O(nk) time with n the number of elements in the array and k the largest element in the array and uses an internal loop over array[i]. This loop is avoided by the below algorithm.

	Code

	public static int minimum_steps(int[] array) {
	    int[] min_to_end = new int[array.length];
	    for (int i = array.length - 2; i >= 0; --i) {
	        if (array[i] <= 0)
	            min_to_end[i] = Integer.MAX_VALUE;
	        else {
	            int minimum = Integer.MAX_VALUE;
	            for (int k = 1; k <= array[i]; ++k) {
	                if (i + k < array.length)
	                    minimum = Math.min(min_to_end[i+k], minimum);
	                else
	                    break;
	            }
	            min_to_end[i] = minimum + 1;
	        }
	    }
	    return min_to_end[0];
	} 
}*/
