import java.util.*;

public class Gravitacija {
	public static void main(String[] args) {
	System.out.println("OIS je zakon!");
	Scanner sc = new Scanner(System.in);
	double v = sc.nextDouble();		
	double c=6.674*Math.pow(10,-11);
    	double m=5.972*Math.pow(10,24);
    	double r=6.371*Math.pow(10,6);
   	double a=(c*m)/(Math.pow(r+v,2));
	System.out.printf("%.2f\n", r);
	System.out.printf("%.2f\n", a);
	
	}
}
