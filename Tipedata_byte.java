import java.util.Scanner;
public class Tipedata_byte {
	public static void main(String[] args) {
		// Deklarasi Variabel
		byte a, b, o, k;
		// Inisialisasi Value
		a=4;
		b=5;
		
		// Penggunaannya dalam operasi
		int c=a+b;
		
		// Menampilkan nilainya
		System.out.println("4 + 5 = "+c);
		
		// Input dari keyboard
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Angka o : ");
		o = sc.nextByte();
		System.out.print("Input Angka k : ");
		k = sc.nextByte();
		int e = o + k;
		System.out.print("Hasil o tambah k   : "+e);
		
	}
}
