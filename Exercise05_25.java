
public class Exercise05_25{

	public static void main(String[] args){
		double i = 0;
		double pi = 0;
		double a = 0;
		double t = 0;
		double j = 0;
		
		while (j<100000) {
			j=j+10000;
			while(i<j) {
				i++;
				t = Math.pow(-1,(i+1));
				a = 4*t/(2*i-1);
				pi = pi+a;
			}
			System.out.println(pi);
		//System.out.println(i);
		//System.out.println(j);
		
		}



		
		
	}

}
