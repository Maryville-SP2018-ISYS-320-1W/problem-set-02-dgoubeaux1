import java.util.Scanner;

/*
	ISYS 320
	Name(s):
	Date: 
*/

public class P5_StairMaster {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int height;
		int width;
		
		height = input.nextInt();
		
		width = input.nextInt();
		
		drawStairs(height, width);
	}

	public static void drawStairs(int height, int width){
		
		for (int i = 0; i < (width +2); i++){
		
			System.out.print("*");
		
		}
		
		System.out.println();
	
		for (int i = 0; i < (height - 1); i++) {
			
						for (int k = 0; k < 2; k++) {
							System.out.print("**");
			
							for (int l = 0; l < (width + (l * width)); l++) {
								System.out.print(" ");
							}
							for (int l = 0; l < (width); l++) {
								System.out.print("*");
							}
							System.out.println();	
		
	}
}
