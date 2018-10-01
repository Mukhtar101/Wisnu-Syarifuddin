import java.util.Scanner;
public class tipedata_boolean {
	public static void main(String[] args) {
		// Deklarasi Variabel
		boolean a, b, c, o, k, e;
		// Inisialisasi Value
		a=true;
		b=false;
		
		// Penggunaannya dalam operasi
		c=b;
		
		// Menampilkan nilainya
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		// Input dari keyboard
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Apakah kamu Lapar ? (true/false)");
		o = sc.nextBoolean();
		if (o == true) {
		System.out.println("Jawaban = Ya, Lewa' Tamba'immu!!!" );
		}
		else {
		System.out.println("Jawaban = Tidak, Bassumo'oo!!!" );
		
		}
		
}

}
