import java.util.Scanner;
public class tipedata_arraychar {
	public static void main(String[] args) {
		// Deklarasi Variabel
				char [] a = new char[7];
				// Inisialisasi Value
				a[0] = 'j';
				a[1] = 'a';
				a[2] = 'r';
				a[3] = 'k';
						
				// Menampilkan nilainya
				System.out.println(""+a[0]+a[1]+a[2]+a[1]+a[3]);
				
				// Input dari keyboard
				Scanner sc = new Scanner(System.in);
				System.out.print("Input 1 huruf ");
				a[4]= sc.next().charAt(0);
				System.out.print("Input 1 huruf ");
				a[5]= sc.next().charAt(0);
				System.out.print("Input 1 huruf ");
				a[6]= sc.next().charAt(0);
				System.out.print(" "+a[4]+a[5]+a[6]);
			
				
	}
}
