import java.util.Scanner;
public class tipedata_short {
	public static void main(String[] args) {
		// Deklarasi Variabel
		short  umur1, umur2, selisih, o, k, e;
		// Inisialisasi Value
	umur1=23;
	umur2=13;
	// Penggunaannya dalam operasi
	 selisih= (short) (umur1-umur2);
	 
	// Menampilkan nilainya
	 System.out.println("umur 23 thun & umur 13 thun");
	 System.out.println("berselisih umur = "+ selisih);
	 System.out.println("coba tes! selisih berapa tahunkah kamu dengan adikmu? ");
	 System.out.println(" ");
		
		
		// Input dari keyboard
		Scanner sc = new Scanner(System.in);
		System.out.print("Input umurmu         : ");
		o = sc.nextShort();
		System.out.print("Input umur adik kamu : ");
		k = sc.nextShort();
		e = (short) (o - k);
		System.out.print("selisih umur kamu dengan adikmu   : "+e);
	}
}
