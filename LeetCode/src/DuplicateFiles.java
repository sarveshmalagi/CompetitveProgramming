import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ssm
 *
 */
//https://leetcode.com/problems/find-duplicate-file-in-system/
//try shorter solutions
//equals and hashcode
public class DuplicateFiles {
	public List<List<String>> findDuplicate(String[] paths) {
	        HashMap<Files,ArrayList<String>> map = new HashMap<Files,ArrayList<String>>();
	        
	        for(String s : paths){
	            String[] temp = s.split(" ");
	            String path = temp[0];
	            for(int i=1;i<temp.length;i++){
	                int index = temp[i].indexOf("(");
	                String fileName = temp[i].substring(0,index);
	                
	                int contentStart = temp[i].indexOf("(");
	                String fileContent = temp[i].substring(contentStart);
	                Files newFile = new Files(path+"/"+fileName,fileContent);
	                if(map.containsKey(newFile)){
	                    ArrayList<String> list = map.get(newFile);
	                    list.add(newFile.path);
	                    map.put(newFile,list);
	                }
	                else{
	                    ArrayList<String> list = new ArrayList<String>();
	                    list.add(newFile.path);
	                    map.put(newFile,list);
	                }
	            }
	        }
	        
	        List<List<String>> result = new ArrayList<List<String>>();
	        for(Map.Entry<Files,ArrayList<String>> entry : map.entrySet()){
	            ArrayList<String> values = entry.getValue();
	            if(values.size() > 1)
	                result.add(entry.getValue());
	        }
	        //System.out.println(map);
	        return result;
	    }
}

class Files{
	    String path,content;
	    
	    public Files(String path,String content){
	        this.path = path;
	        this.content = content;
	    }
	    
	    public String toString(){
	        return path+" "+content;
	    }
	    
	    @Override
	    public boolean equals(Object o) {
	 
	        // If the object is compared with itself then return true  
	        if (o == this) {
	            return true;
	        }
	 
	        /* Check if o is an instance of Complex or not
	          "null instanceof [type]" also returns false */
	        if (!(o instanceof Files)) {
	            return false;
	        }
	         
	        // typecast o to Complex so that we can compare data members 
	        Files c = (Files) o;
	         
	        // Compare the data members and return accordingly 
	        return (c.content).equals(this.content);
	    }
	    
	    public int hashCode() {
	        final int prime = 31;
	        int result = 1;
	        result = prime * result
	                + ((content == null) ? 0 : content.hashCode());
	        result = prime * result + 1;
	        result = prime * result
	                + ((content == null) ? 0 : content.hashCode());
	        return result;
	    }
	}
