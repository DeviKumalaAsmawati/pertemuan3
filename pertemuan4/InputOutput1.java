import java.util.Scanner;
	 public class InputOutput1 {

	public static void main (String[] agrs){

	Scanner input = new Scanner(System.in);
	String nama ;
	char jeniskelamin ;
	final int tinggibadan = 12 ;
	boolean menikah;

		System.out.println("Masukan Nama : ");
		nama = input.nextLine();
		
		System.out.println("Masukan Jenis Kelamin : ");
		jeniskelamin = input.next().charAt(0);
		
		System.out.println("Masukan Tinggi Badan : ");
		tinggibadan = input.nextInt();
		
		
		System.out.println("Masukan Status Menikah : ");
		menikah = input.nextBoolean();

	}
}
