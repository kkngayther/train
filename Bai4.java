import java.util.Scanner;

public class Bai4 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Moi nhap chieu dai : ");
			float chieuDai = scanner.nextFloat();
			System.out.println("Moi nhap chieu rong : ");
			float chieuRong = scanner.nextFloat();
			System.out.println("Dien tich la : ");
			System.out.println(chieuDai * chieuRong);
			System.out.println("Chu vi la : ");
			System.out.println(2 * (chieuDai + chieuRong));
		}
	}
}
