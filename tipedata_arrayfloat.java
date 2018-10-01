import java.util.Scanner;
public class tipedata_arrayfloat {
	public static void main(String[] args) {
		// Deklarasi Variabel
				float [] a = new float[6];
				// Inisialisasi Value
				a[0] = 7;
				a[1] = 8;
				// Penggunaannya dalam operasi
				a[2]= a[0] * a[1];
				
				// Menampilkan nilainya
				System.out.println(a[2]);
				
				// Input dari keyboard
				Scanner sc = new Scanner(System.in);
				System.out.print("Input Angka : ");
				a[3] = sc.nextFloat();
				System.out.print("Input Angka : ");
				a[4] = sc.nextFloat();
				a[5]= a[3] * a[4];
				System.out.print(a[5]);
	}
}
