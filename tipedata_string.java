import java.util.Scanner;
public class tipedata_string {
	public static void main(String[] args) {
		// Deklarasi Variabel
		String text1, text2, text3, text4, text5;
		
		// Inisialisasi Value
		text1="pecundang orang ";
		text2="yang bernama Dewa";
		// menampilkan
		System.out.println(text1.concat(text2));
		// Input dari keyboard
		Scanner sc = new Scanner(System.in);
		System.out.print("Input text " );
		text3 = sc.nextLine();
		System.out.print("Input text "+ " " );
		text4 = sc.nextLine();
		text5 = (text3.concat (text4));
		System.out.print(text5);
	}

}
