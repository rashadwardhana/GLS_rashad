package Karakter;
import Interface.IChef;
import Interface.IDriver;

public class Billy extends BaseCharacter implements IChef, 
IDriver {

	public Billy(String nama, String keterangan) {
		super(nama, keterangan);
	}
	
	@Override 
	public void Cook() {
		System.out.println(nama+" memasak");
	}
	
	@Override
	public void Drive() {
		System.out.println(nama+" menyetir");
	}
}
