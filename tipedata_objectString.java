import java.util.Scanner;
public class tipedata_objectString {
	public static void main(String[] args) {
		//Deklarasi Variabel
		String nama, fakultas, prodi, nim, alamat, ttl, gender, agama, wn;
		
		Scanner keyboard = new Scanner (System.in);
		System.out.println("----.----.----.----.----.----.----.----");
		System.out.println("---------------------------------------");
		System.out.print ("Nama Lengkap      : ");
			nama = keyboard.next ();
		System.out.print ("Fakultas          : ");
			fakultas = keyboard.next () ;
		System.out.print ("Prodi             : ");
			prodi = keyboard.next ();
		System.out.print ("NIM               : ");
			nim = keyboard.next ();
		System.out.print ("Alamat            : ");
			alamat = keyboard.next () ;
		System.out.print ("Tempat/Tgl Lahir  : ");
			ttl = keyboard.next ();
		System.out.print ("Jenis Kelamin     : ");
			gender = keyboard.next ();
		System.out.print ("Agama             : ");
			agama = keyboard.next () ;
		System.out.print ("Kewarganegaraan   : ");
			wn = keyboard.next ();
		
	System.out.println("-------------------------------------");
	System.out.println("-------------------------------------");
	System.out.println("Nama Mahasiswa       : " + nama);
	System.out.println("Fakultas             : " + fakultas);
	System.out.println("Prodi                : " + prodi);
	System.out.println("NIM                  : " + nim);
	System.out.println("Alamat               : " + alamat);
	System.out.println("Tempat/Tgl Lahir     : " + ttl);
	System.out.println("Jenis Kelamin        : " + gender);
	System.out.println("Agama                : " + agama);
	System.out.println("Kewarganaegaraan     : " + wn);
	System.out.println("---------------------------------------");
	System.out.println("----.----.----.----.----.----.----.----");
	
	}
}
