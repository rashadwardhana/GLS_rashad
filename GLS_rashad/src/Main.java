import java.util.*;

import java.util.Scanner;

import Karakter.BaseCharacter;
import Karakter.Billy;
import Karakter.Bobby;
import Karakter.Brian;
import Karakter.Karen;
import Karakter.Siti;
import Karakter.Rashad;
import Interface.IArtist; 
import Interface.IChef;
import Interface.IDriver;
import Interface.IWorker;

public class Main {

	Scanner scan = new Scanner(System.in);
	
	public Main() {
		
		String aksi = "";
		String karakter = "";
		String input = "";
		
		ArrayList<BaseCharacter> kar = new ArrayList<>();
		
		kar.add(new Bobby("Bobby", "bisa bekerja"));
		kar.add(new Brian("Brian", "bisa menyetir"));
		kar.add(new Karen("Karen", "tidak bisa apa-apa"));
		kar.add(new Siti("Siti", "bisa memasak dan melukis"));
		kar.add(new Rashad("Rashad", "bisa bekerja, memasak, menyetir, "
				+ "dan melukis"));
		kar.add(new Billy("Billy", "bisa memasak dan menyetir"));
		
		boolean exit = false;
		
		do {
			System.out.println("Simulasi Kelompok Kemampuan");
			System.out.println("0:Bobby");
			System.out.println("1:Brian");
			System.out.println("2:Karen");
			System.out.println("3:Ryan");
			System.out.println("4:Rashad");
			System.out.println("5:Billy");
			
			do {
				System.out.println("Cara input: *nama aksi* [Info|Work|Drive"
						+ "|Paint|Cook] *kode karakter* [0-4]");
				System.out.print("Input: ");
				input = scan.nextLine(); 
				

					
			}while(!input.contains("Info") && !input.contains("Cook") 
					&& !input.contains("Drive") && !input.contains("Work")
					&& !input.contains("Paint"));

			aksi = input.substring(0, input.indexOf(" "));
			karakter = input.substring(input.indexOf(" ")+1);
			
			if(exit == false) {
				for(int i = 0; i<karakter.length()+1; i = i+2){
					Integer index  = Integer.parseInt(karakter.substring(i, i+1));
					
					switch(aksi) {
					case "Info":
						kar.get(index).getInfo();
						break;
					case "Cook":
						if(kar.get(index) instanceof IChef) {
							((IChef)kar.get(index)).Cook();
						}else {
							System.out.println("Karakter tidak bisa melakukan"
									+ " aksi tersebut");
						}
						break;
					case "Work":
						if(kar.get(index) instanceof IWorker) {
							((IWorker)kar.get(index)).Work();
						}else {
							System.out.println("Karakter tidak bisa melakukan"
									+ " aksi tersebut");
						}
						break;
					case "Drive":
						if(kar.get(index) instanceof IDriver) {
							((IDriver)kar.get(index)).Drive();
						}else {
							System.out.println("Karakter tidak bisa melakukan"
									+ " aksi tersebut");
						}
						break;
					case "Paint":
						if(kar.get(index) instanceof IArtist) {
							((IArtist)kar.get(index)).Paint();
						}else {
							System.out.println("Karakter tidak bisa melakukan"
									+ " aksi tersebut");
						}
						break;
					}
				}
				System.out.println("Continue Y/N");
				String lanjut = scan.nextLine();
				if(lanjut.contains("N")) {
					break;
				}
			}
		}while(exit == false);
		System.out.println("Terima Kasih");
	}

	public static void main(String[] args) {
		new Main();
	}

}
