import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ssm
 *
 */
public class ClockAngle {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++){
			String[] ip = br.readLine().split(" ");
			double h = Double.parseDouble(ip[0]);
			double m = Double.parseDouble(ip[1]);
			if(m == 60)
				m = 0;
			double hAngle = 0.5*(60*h+m);
			double mAngle = 6*m;
            int angle = (int)Math.min((Math.abs(hAngle-mAngle)),360-(Math.abs(hAngle-mAngle)));
			System.out.println(angle);
		}
	}
}
