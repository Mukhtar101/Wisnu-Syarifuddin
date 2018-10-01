import java.util.Scanner;
public class tipedata_arraybyte {
	public static void main(String[] args) {
		// Deklarasi Variabel
		byte [] a = new byte[6];
		// Inisialisasi Value
		a[0] = 8;
		a[1] = 2;
		// Penggunaannya dalam operasi
		int n = a[0] - a[1];
		
		// Menampilkan nilainya
		System.out.println("8 - 2 = "+n);
		
		// Input dari keyboard
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Angka : ");
		a[3] = sc.nextByte();
		System.out.print("Input Angka : ");
		a[4] = sc.nextByte();
		int x = a[3] - a[4];
		System.out.print(x);
	}
}
