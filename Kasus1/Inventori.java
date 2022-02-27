package Kasus1;

public class Inventori {
	Barang[] barangs;
	
	//Mengisi array barangs dengan kode barang, nama barang dan stok nya
	void initBarang() {
		barangs = new Barang[2];
		barangs[0] = new Barang("001", "Baju", 10);
		barangs[1] = new Barang("002", "Celana", 20);
	}
	
	//Menampilkan nama barang dan stok yang sudah dienkapsulasi
	void showBarang() {
		System.out.println(barangs[0].nama_barang + "(" + barangs[0].getStok() + ")");
		System.out.println(barangs[1].nama_barang + "(" + barangs[1].getStok() + ")");
	}
	
	//Me-set stok barang
	void pengadaan() {
		initBarang();  //Mengambil data barang
		barangs[0].setStok(10); //Set stok barang indeks ke-0 (pertama)
		barangs[1].setStok(15); //Set stok barang indeks ke-1 (kedua)
		showBarang();  //Memanggil modul yang menampilkan barang
	}
	
	public static void main(String[] args) {
		Inventori beli = new Inventori();
		beli.pengadaan(); 
	}

}
