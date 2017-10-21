public class Mahasiswa {
	public static void main (String[] args ){ 
	System.out.println("ini adalah method utama ");

	Mahasiswa Devi = new Mahasiswa();
	Devi.printNama();
	System.out.println (Devi.calculateumur());
}

public void printlnNama(){
	System.out.println("Devi");
 }

public int calculateumur(){
	int tahun_lahir = 1996;
	int tahun_sekarang = 2017;

	int umur;
	umur = tahun_sekarang - tahun_lahir;

	return umur;
}
}
