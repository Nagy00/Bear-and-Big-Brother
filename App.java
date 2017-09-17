import java.util.Scanner;


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int counter = 0;		
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
				
		
		while(a <= b){
			a *= 3;
			b *= 2;
			counter++;
		}
		System.out.println(counter);
		
	}

}
