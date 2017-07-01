
/**
 * @author ssm
 *
 */
//https://leetcode.com/problems/student-attendance-record-i/
public class StudentAttendanceRecords {
	public boolean checkRecord(String s) {
	        int absentCount = 0;
	        
	        for(int i=0;i<s.length();i++){
	            if(s.charAt(i) == 'A')
	                absentCount++;
	        }
	        
	        if(absentCount > 1)
	            return false;
	            
	        int j=0;
	        while(j < s.length()-1){
	            if(s.charAt(j) == 'L'){
	                int lateCount = 1;
	                while(j < s.length()-1 && s.charAt(j) == 'L' && s.charAt(j+1) == 'L'){
	                    lateCount++;
	                    j++;
	                }
	                if(lateCount > 2)
	                    return false;
	            }
	                j++;
	        }
	        return true;
	    }
}
