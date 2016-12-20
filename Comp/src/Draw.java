import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
Brie’s Drawing teacher asks her class to open their -page book to page number . Brie can either start turning pages from the front of the book (i.e., page number ) or from the back of the book (i.e., page number ), and she always turns pages one-by-one (as opposed to skipping through multiple pages at once). When she opens the book, page is always on the right side:

image

Each page in the book has two sides, front and back, except for the last page which may only have a front side depending on the total number of pages of the book (see the Explanation sections below for additional diagrams).

Given and , find and print the minimum number of pages Brie must turn in order to arrive at page .

Input Format

The first line contains an integer, , denoting the number of pages in the book.
The second line contains an integer, , denoting the page that Brie's teacher wants her to turn to.
 */

/**
 * @author sarvesh
 *
 */
public class Draw {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int p = Integer.parseInt(br.readLine());
		System.out.println(n%2==0?min(Math.floor(p*1.0/2),Math.ceil((n-p)*1.0/2)):min(Math.floor(p*1.0/2),Math.floor((n-p)*1.0/2)));
	}
	
	static int min(double a,double b){
		return a<b?(int)a:(int)b;
	}
}
