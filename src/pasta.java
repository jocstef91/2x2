import java.util.Scanner;

public class pasta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		String [] sastojak = {"Makarone","Spagete","Bolognese","Curetina",
							"Govedja prsuta","Slanina","Piletina","4 sira",
							"Dimljeni sir","Parmezan","Pavlaka","Pesto sos",
							"Napolitana","Povrce mix","Pecurke","Kutija"};
		
		int [] cena = {50,60,120,120,140,100,100,100,80,50,80,80,80,50,50,20};
		
		String [] kupci = {"063111111","063222222","063333333","063444444","063555555"};
		
		
		System.out.println("Izvolite");
		
		
		double suma = 0;
		
		String start = "Kutija";
		
		while(!poruci(start)) {
			start = s.next();
			if (poruci(start)) {
				System.out.println("Zavrsili ste porudzbinu");
			}else {
				int broj= cena(start, sastojak);
				if(broj==-1) {
					System.out.println("Navedeni sastojak nemamo na stanju");
					
				}else {
					suma = suma + cena[broj];
					System.out.println("Trenutna vrednost porudzbine je: " + suma);
					System.out.println();
					System.out.println("Unesite novi sastojak ili zavrsite porudzbinu");
				}	
			}
			
		}
		
		System.out.println("Unesite vas broj telefona");
		String tel = s.next();
		
		if (stalniKupac(tel, kupci)) {
			suma = suma - suma * 0.1;
			System.out.println("Iznos vase porudzbine je: " + suma);
		}else {
			System.out.println("Iznos vase porudzbine je: " + suma);
		}
		
	}
	
	public static boolean poruci(String poruci) {
		if (!poruci.equals("Poruci")) {
			return false;
		}else {
			return true;
		}
		
	}

	public static int cena(String poruci, String [] sastojak) {
		int index=-1;
		for (int i = 0; i < sastojak.length; i++) {
			if (sastojak[i].equals(poruci)) {
				return index=i;
			}
		}
		return index;
		
	}
	
	public static boolean stalniKupac(String tel, String [] kupci) {
		for (int i = 0; i < kupci.length; i++) {
			if (kupci[i].equals(tel)) {
				return true;
			}
				
			}
		return false;
	}
}

