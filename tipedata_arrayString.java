import java.util.Scanner;
public class tipedata_arrayString {
	public static void main(String[] args) {
		// Deklarasi Variabel
				String [] a = new String[6];
				// Inisialisasi Value
				a[0] = "kamu ";
				a[1] = "baik";
				// Penggunaannya dalam operasi
				a[2]= a[0] + a[1];
				
				// Menampilkan nilainya
				System.out.println(a[2]);
				System.out.println("apa yang kamu pikirkan?");
				System.out.println(" ");
				// Input dari keyboard
				Scanner sc = new Scanner(System.in);
				System.out.print("kata pertama : ");
				a[3] = sc.nextLine();
				System.out.print("kata kedua   : ");
				a[4] = sc.nextLine();
				a[5]= a[3] + a[4];
			
				System.out.print(a[5]);
	}
}
