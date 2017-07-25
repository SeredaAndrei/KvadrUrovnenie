
public class Phancshional {

	public static void Vivod(double m0[]){
		for(int i=0;i<6;i++)
		System.out.print(m0[i]+ "\t");
		
	}
	
	public static void main(String[] args) {
		double mm[]=new double[6];
		
		Workspace Q = new Workspace();
		mm=Q.vvod();
		mm=Q.discriminant(mm);
		if (mm[0] == 0){
			mm=Q.x3(mm);
			Vivod(mm);}
		else {
			if (mm[3] < 0)
			System.out.println(Q.x());
			if (mm[3] == 0){
				mm=Q.x1(mm);
				Vivod(mm);
				}
			if (mm[3] > 0){
				mm=Q.x2(mm);
				Vivod(mm);}
		}

	}

}
