import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

/**
 * @author ssm
 *
 */
public class VotersList {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] temp = br.readLine().split(" ");
		int n1 = Integer.parseInt(temp[0]);
		int n2 = Integer.parseInt(temp[1]);
		int n3 = Integer.parseInt(temp[2]);
		
		HashSet<Integer> list1 = new HashSet<>();
		HashSet<Integer> list2 = new HashSet<>();
		HashSet<Integer> list3 = new HashSet<>();
		
		for(int i=0;i<n1;i++){
			list1.add(Integer.parseInt(br.readLine().trim()));
		}
		for(int i=0;i<n2;i++){
			list2.add(Integer.parseInt(br.readLine().trim()));
		}
		for(int i=0;i<n3;i++){
			list3.add(Integer.parseInt(br.readLine().trim()));
		}
		
		HashSet<Integer> res = new HashSet<>();
		for(int x : list1){
			if(list2.contains(x) || list3.contains(x)){
				res.add(x);
			}
		}
		for(int x : list2){
			if(list1.contains(x) || list3.contains(x)){
				res.add(x);
			}
		}
		for(int x : list3){
			if(list1.contains(x) || list2.contains(x)){
				res.add(x);
			}
		}
		ArrayList<Integer> res_list = new ArrayList<>();
		for(int x : res){
			res_list.add(x);
		}
		Collections.sort(res_list);
		System.out.println(res.size());
		for(int x : res_list){
			System.out.println(x);
		}
	}
}
