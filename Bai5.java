import java.util.Scanner;

public class Bai5 {
	public static void main(String[] args) {
		System.out.println("Moi nhap so : ");
		try (Scanner scanner = new Scanner(System.in)) {
			int so = scanner.nextInt();
			int hangChuc, hangDonvi;
			hangChuc = so/10;
			hangDonvi = so%10;
			System.out.println("Tong 2 ki so la : ");
			System.out.print(hangChuc + hangDonvi);
		}
	}
}
