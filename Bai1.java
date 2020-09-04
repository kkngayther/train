import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		System.out.println("Moi nhap so ngay lam : ");
		try (Scanner scanner = new Scanner(System.in)) {
			int soNgay = scanner.nextInt();
			System.out.println("Tien luong la : ");
			System.out.print(100000*soNgay);
		}
	}
}
//Le Anh Trieu
