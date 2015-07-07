import java.util.Scanner;
class Bankomat {

	public static void main(String[] args) {
		int count = 0, izbor = 20,ost;
		int suma;
		Scanner velioo = new Scanner(System.in);
		BanInside Opciq1 = new BanInside();//
		BanInside2 Opciq = new BanInside2();
		
		System.out.println("Molq vavedete suma za teglene: ");
		suma = velioo.nextInt();
		while(suma > 500 || suma <= 0 || suma % 5 > 0){
			System.out.println("Nqma tolkova pari v bankomata ili ste vaveli otricatelna suma !!!");
			System.out.println("Vavedete druga suma: ");
			suma = velioo.nextInt();
		}
		while(suma != 0){
			
				count = count + Opciq.Only50(suma); 
				count = count + Opciq.Only20(suma);
				count = count + Opciq.Only5(suma);
				count = count + Opciq.With50and20(suma);
				count = count + Opciq.With50and5(suma);
				count = count + Opciq.With20and5(suma);
				count = count + Opciq.With50and20and5(suma);
				
				System.out.println("--------------------------------------------");
				switch(count){
					case 1:
						System.out.println("1 nachin");
						break;
					case 2:
						System.out.println("2 nachina");
						break;
					case 3:
						System.out.println("3 nachina");
						break;
					case 4:
						System.out.println("4 nachina");
						break;
					case 5:
						System.out.println("5 nachina");
						break;
					case 6:
						System.out.println("6 nachina");
						break;
					case 7:
						System.out.println("7 nachina");
						break;
					case 8:
						System.out.println("8 nachina");
						break;
					case 9:
						System.out.println("9 nachina");
						break;
					case 10:
						System.out.println("10 nachina");
						break;
					case 11:
						System.out.println("11 nachina");
						break;
					case 12:
						System.out.println("12 nachina");
						break;
					case 13:
						System.out.println("13 nachina");
						break;
					case 14:
						System.out.println("14 nachina");
						break;
					case 15:
						System.out.println("15 nachina");
						break;
					case 16:
						System.out.println("16 nachina");
						break;
					case 17:
						System.out.println("17 nachina");
						break;
					case 18:
						System.out.println("18 nachina");
						break;
					case 19:
						System.out.println("19 nachina");
						break;
					case 20:
						System.out.println("20 nachina");
						break;
					default :
						break;
				}
				
				System.out.println("Izberete nqkoi ot dadenite nachini: ");
				izbor = velioo.nextInt();
				Opciq.Choice(izbor, suma);
				
				ost = Opciq.Ostatuk(suma);
				System.out.println("Vavedete nova suma ili vavadete 0 za izhod:" );
				Opciq.Izchistvane();
				suma = velioo.nextInt();
				
				while(suma > ost || suma < 0 || suma % 5 > 0){
					System.out.println("Nqma tolkova pari v bankomata, vaveli ste otricatelna suma ili suma koqto ne se deli na 5 !!!");
					System.out.println("Vavedete druga suma: ");
					suma = velioo.nextInt();
				}
				
				count = 0;
					
		}
		System.out.println("Priqten den !!!");
	}
		
}
