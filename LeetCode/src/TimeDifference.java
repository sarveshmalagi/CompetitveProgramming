import java.util.Arrays;
import java.util.List;

/**
 * @author ssm
 *
 */
//https://leetcode.com/problems/minimum-time-difference/#/description
public class TimeDifference {
	public int findMinDifference(List<String> timePoints) {
        int[] minutes = new int[timePoints.size()];
        int count = 0;
        for(String time : timePoints){
            String[] temp = time.split(":");
            int hrs = Integer.parseInt(temp[0]);
            int min = Integer.parseInt(temp[1]);
            hrs = hrs == 0 && min == 0?24:hrs;
            minutes[count++] = hrs*60+min;
        }
        Arrays.sort(minutes);
        int minDiff = minutes[1]-minutes[0];
        for(int i=1;i<timePoints.size()-1;i++){
            if(minDiff > minutes[i+1]-minutes[i]){
                minDiff = minutes[i+1]-minutes[i];
            }
        }
        int corner = minutes[0] + (1440-minutes[minutes.length-1]);	//check difference between 1st and last elements(circular)
        return Integer.min(minDiff,corner);
    }
}
