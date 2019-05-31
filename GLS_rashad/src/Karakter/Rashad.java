package Karakter;

import Interface.IArtist;
import Interface.IChef;
import Interface.IDriver;
import Interface.IWorker;

public class Rashad extends BaseCharacter implements IWorker, IChef, 
IArtist, IDriver{
	
	public Rashad (String nama, String keterangan) {
		super(nama, keterangan);
	}
	
	@Override
	public void Work() {
		System.out.println(nama+" bekerja");
	}
	@Override
	public void Cook() {
		System.out.println(nama+" memasak");
	}
	@Override
	public void Paint() {
		System.out.println(nama+" melukis");
	}
	@Override
	public void Drive() {
		System.out.println(nama+" menyetir");
	}
}
