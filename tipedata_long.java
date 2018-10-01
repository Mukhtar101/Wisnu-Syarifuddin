import java.util.Scanner;
public class tipedata_long {
	public static void main(String[] args) {
		
		// Deklarasi Variabel
		long a, b, c, o, k, e;
		// Inisialisasi Value
		a=2;
		b=3;
		// Penggunaannya dalam operasi
		c=b-a;
		
		// Menampilkan nilainya
		System.out.println("3 - 2 = "+c);
		
		// Input dari keyboard
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Angka o : ");
		o = sc.nextLong();
		System.out.print("Input Angka k : ");
		k = sc.nextLong();
		e = o - k;
		System.out.print("Hasil o kurang k   : "+e);
		
		
}}
