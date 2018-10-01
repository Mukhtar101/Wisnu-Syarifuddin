import java.util.Scanner;
public class tipedata_arrayshort {
	public static void main(String[] args) {
		// Deklarasi Variabel
				short [] a = new short[6];
				// Inisialisasi Value
				a[0] = 4;
				a[1] = 2;
				// Penggunaannya dalam operasi
				int n = a[0] * a[1];
				
				// Menampilkan nilainya
				System.out.println(n);
				
				// Input dari keyboard
				Scanner sc = new Scanner(System.in);
				System.out.print("Input Angka : ");
				a[3] = sc.nextShort();
				System.out.print("Input Angka : ");
				a[4] = sc.nextShort();
				int x = a[3] * a[4];
				System.out.print(x);
	}

}
