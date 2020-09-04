import java.util.Scanner;

public class StudyCase {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double chieuDaiSan, banKinh, khongGian, khongGianBiChiem = 0;
		int soluongCay = 0;
		System.out.println("Nhap chieu dai san: ");
		chieuDaiSan = Double.parseDouble(scan.nextLine());
		System.out.println("Nhap ban kinh cua cay khi phat trien day du: ");
		banKinh = Double.parseDouble(scan.nextLine());
		System.out.println("Nhap khong gian can thiet giua cac cay phat trien day du: ");
		khongGian = Double.parseDouble(scan.nextLine());
		
		soluongCay = (int)(chieuDaiSan/(banKinh * 2 + khongGian));
		
		soluongCay = ( (chieuDaiSan - (banKinh * 2 + khongGian)*soluongCay) >= banKinh * 2 ) ? soluongCay + 1 : soluongCay;
		
		khongGianBiChiem = 3.14 * soluongCay * banKinh * banKinh;
		
		System.out.println("So cay trong duoc la: " + soluongCay);
		System.out.println("Không gian bị chiếm là: " + khongGianBiChiem);
	}

}
