import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
		System.out.println("Moi nhap so tien $ : ");
		try (Scanner scanner = new Scanner(System.in)) {
			float soTien = scanner.nextFloat();
			System.out.println("So tien quy doi ra VND la : ");
			System.out.print(23500*soTien);
		}
	}
}
