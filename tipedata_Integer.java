import java.util.Scanner;

public class tipedata_Integer {
	
	public static void main(String[] args) {
		// Deklarasi Variabel
		int o, k, e;
		int a;
		int b;
		int c;
		
		// Inisialisasi Value
		a = 2;
		b = 4;
		
		// Penggunaannya dalam operasi
		c = a * b;
		
		// Menampilkan nilainya
		System.out.println (a);
		System.out.println (b);
		System.out.println (c);
		System.out.println("---coba input angka!---");
		
		// Input dari keyboard
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Angka o : ");
		o = sc.nextInt();
		System.out.print("Input Angka k : ");
		k = sc.nextInt();
		e = o * k;
		System.out.print("Hasil o x k   : "+e);
	}

}
