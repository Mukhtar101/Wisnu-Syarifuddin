import java.util.Scanner;
public class tipedata_arrayinteger {
	public static void main(String[] args) {
		// Deklarasi Variabel
		int[] a = new int[6];
		// Inisialisasi Value
		a[0] = 2;
		a[1] = 3;
		// Penggunaannya dalam operasi
		a[2] = a[0]+a[1];
		
		// Menampilkan nilainya
		System.out.println(a[2]);
		
		// Input dari keyboard
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Angka o : ");
		a[3] = sc.nextInt();
		System.out.print("Input Angka k : ");
		a[4] = sc.nextInt();
		a[5] = a[3] * a[4];
		System.out.print(a[5]);
	}

}
