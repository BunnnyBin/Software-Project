import java.util.Scanner;

public class Lab2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.next();
		System.out.print(name + " ");
		
		int num = scanner.nextInt();
		System.out.print(num + " ");
		
		boolean sign = scanner.nextBoolean();
		System.out.println(sign);
		
		scanner.nextLine();
		
		String a = scanner.next();
		System.out.print(a + " ");
		
		double b = scanner.nextDouble();
		System.out.print(b);
		
		scanner.close();
		
 	}

}
