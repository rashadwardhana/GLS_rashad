package Karakter;

import Interface.IArtist;
import Interface.IChef;

public class Siti extends BaseCharacter implements IChef, IArtist{
	public Siti(String nama, String keterangan) {
		super(nama, keterangan);
	}
	
	@Override
	public void Cook() {
		System.out.println(nama+" memasak");
	}
	@Override
	public void Paint() {
		System.out.println(nama+" melukis");
	}
}
