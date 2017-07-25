import java.util.Scanner;
public class Workspace {

	/*public double a; 
	public double b; 
	public double c;
	public double d;
	public double x1;
	public double x2;*/
	
	public double mas[]=new double[6];
	
	public double[] vvod(){ //vvodim znachenie
		Scanner sc = new Scanner(System.in);
		mas[0]=sc.nextDouble();
		mas[1]=sc.nextDouble();
		mas[2]=sc.nextDouble();
		sc.close();
		return mas;
		
	
	}
	
	public double[] discriminant(double m[]){ // Diskriminant 4erez return
		
		m[3] = Math.pow(m[1], 2) - 4*m[0]*m[2];
		return m;		
		}
 public String x(){
	 String str;
	return str="x1= "+ "x2= ";
 }

public double[] x1(double m[]){
	m[4]=m[5]=-m[1]/(2*m[0]);
	return m;
}
public double[] x2(double m[]){
	m[4]=(-m[1]+Math.sqrt(m[3]))/(2*m[0]);
	m[5]=(-m[1]-Math.sqrt(m[3]))/(2*m[0]);
	return m;
}
public double[] x3(double m[]){
	m[4]=m[5]=-m[2]/m[1];
	return m;
}
}
