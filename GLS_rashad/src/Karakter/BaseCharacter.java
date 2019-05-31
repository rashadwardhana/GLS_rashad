package Karakter;

public class BaseCharacter {
	
	public String nama;
	public String keterangan;
	
	public BaseCharacter(String nama, String keterangan) {
		this.nama = nama;
		this.keterangan = keterangan;
	}
	
	public void getInfo() {
		System.out.println(nama+" "+keterangan);
	}

}
