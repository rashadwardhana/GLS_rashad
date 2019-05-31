package Karakter;

import Interface.IWorker;

public class Bobby extends BaseCharacter implements IWorker{

	public Bobby(String nama, String keterangan) {
		super(nama, keterangan);
	}
	
	@Override
	public void Work() {
		System.out.println(nama+" bekerja");
	}

}
