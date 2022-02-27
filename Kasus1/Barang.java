package Kasus1;

public class Barang {
	String kode_barang;
	String nama_barang;
	private int stok;
	int tambahStok;
	
	//Enkapsulasi
	public void setStok(int tambahStok) {  //Setter
		stok += tambahStok; //Set stok agar hanya bisa dilakukan operasi pertambahan
	}
	public int getStok() {		//Getter
		return this.stok;
	}
	
	//Contructor
	public Barang(String kode, String nama, int stk) {
		kode_barang = kode;
		nama_barang = nama;
		stok = stk;
	}
}
