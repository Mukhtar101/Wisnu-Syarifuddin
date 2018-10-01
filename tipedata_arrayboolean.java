import java.util.Scanner;
public class tipedata_arrayboolean {
	public static void main(String[] args) {
		// Deklarasi Variabel
				boolean [] a = new boolean[6];
				// Inisialisasi Value
				a[0] = true;
				a[1] = false;
				// Penggunaannya dalam operasi
				a[2]= a[1];
				
				// Menampilkan nilainya
				System.out.println(a[0]);
				System.out.println(a[1]);
				System.out.println(a[2]);
				
				// Input dari keyboard
				Scanner sc = new Scanner(System.in);
				System.out.println("jawab TRUE jika iyya");
				System.out.println("jawab FALSE jika tidak");
				System.out.println("Apakah kamu Lapar ? ");
				a[3] = sc.nextBoolean();
				if (a[3] == true) {
				System.out.println("Jawaban = Ya, Kamu memang lapar!!!" );
				}
				else {
				System.out.println("Jawaban = Tidak? Saya rasa kamu udah makan!!!" );
				
				}
				

	}
}
