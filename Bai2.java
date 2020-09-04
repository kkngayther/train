import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		double number, sum = 0;
		System.out.println("Moi nhap vao 5 so : ");
		try (Scanner scan = new Scanner(System.in)) {
			for (int i = 0; i < 5; i++)
			{
				number = scan.nextDouble();
				sum += number;
			}
		}
		System.out.println("Trung binh cong la : ");
		System.out.print(sum / 5);
	}
}
