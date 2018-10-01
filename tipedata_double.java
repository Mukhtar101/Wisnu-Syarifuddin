import java.util.Scanner;
public class tipedata_double {
	public static void main(String[] args) {
		// Deklarasi Variabel
		double a, b, c, o, k, e;
		// Inisialisasi Value
		a=7;
		b=7;
		// Penggunaannya dalam operasi
		c=b*a;
		
		// Menampilkan nilainya
		System.out.println("7 X 7 = "+c);
		
		// Input dari keyboard
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Angka o : ");
		o = sc.nextDouble();
		System.out.print("Input Angka k : ");
		k = sc.nextDouble();
		e = o * k;
		System.out.print("Hasil o kali k   : "+e);
	}

}
