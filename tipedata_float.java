import java.util.Scanner;
public class tipedata_float {
	public static void main(String[] args) {
		// Deklarasi Variabel
				float a, b, c, o, k, e;
				// Inisialisasi Value
				a=2;
				b=8;
				// Penggunaannya dalam operasi
				c=b/a;
				
				// Menampilkan nilainya
				System.out.println("8 / 2 = "+ c);
				
				// Input dari keyboard
				Scanner sc = new Scanner(System.in);
				System.out.print("Input Angka o : ");
				o = sc.nextFloat();
				System.out.print("Input Angka k : ");
				k = sc.nextFloat();
				e = o / k;
				System.out.print("Hasil o bagi k   : "+e);
	}

}
