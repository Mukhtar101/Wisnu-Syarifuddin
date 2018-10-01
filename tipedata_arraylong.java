import java.util.Scanner;
public class tipedata_arraylong {
	public static void main(String[] args) {
		// Deklarasi Variabel
		long[] a = new long[6];
		// Inisialisasi Value
		a[0] = 5;
		a[1] = 2;
		// Penggunaannya dalam operasi
		a[2] = a[0]+a[1];
		
		// Menampilkan nilainya
		System.out.println(a[2]);
		
		// Input dari keyboard
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Angka : ");
		a[3] = sc.nextLong();
		System.out.print("Input Angka : ");
		a[4] = sc.nextLong();
		a[5] = a[3] + a[4];
		System.out.print(a[5]);
	}
}
