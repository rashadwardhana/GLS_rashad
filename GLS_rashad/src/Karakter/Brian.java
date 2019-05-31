package Karakter;

import Interface.IDriver;

public class Brian extends BaseCharacter implements IDriver {
	
	public Brian(String nama, String keterangan) {
		super(nama, keterangan);
	}
	
	@Override
	public void Drive() {
		System.out.println(nama+" menyetir");
	}
	
}
