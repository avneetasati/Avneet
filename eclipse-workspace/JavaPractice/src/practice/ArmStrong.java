package practice;

public class ArmStrong {

	
	public static void main(String [ ]args) {
		
		int r,c=0;
		int n=351;
		int temp = n;
				while(n>0)
				{
					r=n%10;
					n=n/10;
					c=c+(r*r*r);
				}
				if(temp==c) {
				
					System.out.println("No is armstrong no.");
				}
				
				else {
					System.out.println("Not a armstrong no.");
					
				}
		
	}
}
