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
		String start = s.next();
		
		
		while(poruci(start)) {
			
		}
	}
	
	public static boolean poruci(String poruci) {
		if (!poruci.equals("Poruci")) {
			return false;
		}else {
			return true;
		}
		
	}

}
