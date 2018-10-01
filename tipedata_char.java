import java.util.Scanner;
public class tipedata_char {
	public static void main(String[] args) {
		// Deklarasi Variabel
		char a, b, c, o, k, e;
		// Inisialisasi Value
		a='j';
		b='a';
		c='v';
		
		// Penggunaannya dalam operasi
		String tulisanJava="Java";
		
		
		// Menampilkan nilainya
		System.out.println("char: "+a+b+c+b);
		System.out.println("String: "+tulisanJava);
		
		// Input dari keyboard
		Scanner sc = new Scanner(System.in);
		System.out.print("Input 1 huruf ");
		o = sc.next().charAt(0);
		System.out.print("Input 1 huruf ");
		k = sc.next().charAt(0);
		System.out.print("Input 1 huruf ");
		e = sc.next().charAt(0);
		System.out.print(" "+o+k+e);
	}
}
