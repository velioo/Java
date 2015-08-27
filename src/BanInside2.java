import java.util.Scanner;
public class BanInside2 {
	int petolevki = 10;
	int dvadesetolevki = 10;
	int petdesetolevki = 5;
	Scanner velioo = new Scanner(System.in);
	int array[][] = new int[50][50];
	int triarray[][][] = new int[50][50][50];
	int memory[] = new int[100];
	int brizbank[] = new int[20];
	int brizbank20[] = new int[20];
	int brizbank5[] = new int[20];
	int nachini = 0;
	int pari = 500;
	int broiizban50 = 0, broiizban20 = 0, broiizban5 = 0;
	int save = 0;
	
	
	
	public int Only50(int banknota){
		int counter = 0,broi = 0;
		if(banknota < 50 || banknota > 250)
				return 0;
		else{
		save = petdesetolevki;
		while(petdesetolevki > 0){
			broi++;
			counter+=50;
			if(banknota == counter){
				nachini++;
				memory[nachini] = 50;
				brizbank[nachini] = broi;
				System.out.println(nachini + " :Samo 50: " + broi +" x 50\n");
				petdesetolevki = save;
				return 1;
			}
			else
			petdesetolevki--;
		}
		petdesetolevki = save;
		}
		return 0;
		
	}
	public int Only20 (int banknota){
		int counter = 0,broi = 0;
		if(banknota < 20 || banknota > 200)
				return 0;
		else{
		save = dvadesetolevki;
		while(dvadesetolevki > 0){
			broi++;
			counter+=20;
			if(banknota == counter){
				nachini++;
				memory[nachini] = 20;
				brizbank[nachini] = broi;
				System.out.println(nachini + " :Samo 20: " + broi +" x 20\n");
				dvadesetolevki = save;
				return 1;
			}
			else
				dvadesetolevki--;
		}	
		dvadesetolevki = save;
		}	
		return 0;
	}
	public int Only5 (int banknota){
		int counter = 0,broi = 0;
		if(banknota < 5 || banknota > 50)
				return 0;
		else{
			save = petolevki;
		while(petolevki > 0){
			broi++;
			counter+=5;
			if(banknota == counter){
				nachini++;
				memory[nachini] = 5;
				brizbank[nachini] = broi;
				System.out.println(nachini + " :Samo 5: " + broi +" x 5\n");
				petolevki = save;
				return 1;
			}
			else
				petolevki--;
		}
		petolevki = save;
		}
		return 0;
		
	}
	public int With50and20 (int banknota){
		int broi50 = 0,broi20 = 0,n = 0;
		if(banknota < 70 || banknota > 450)
			return 0;
		else{
			for(broi50 = 1; broi50 <= petdesetolevki; broi50++)
				for(broi20 = 1; broi20 <= dvadesetolevki; broi20++){
					if(broi50*50 + broi20*20 == banknota){
						nachini++;
						memory[nachini] = 5020;
						brizbank[nachini] = broi50;
						brizbank20[nachini] = broi20;
						array[broi50][broi20] = 1;
						System.out.println(nachini + " :50 & 20: " + broi50 + " x 50 + " + broi20 + " x 20");
						n++;
					}
					
				}
			
			
			for(broi20 = 1; broi20 <= dvadesetolevki; broi20++)
				for(broi50 = 1; broi50 <= petdesetolevki; broi50++){
					if(broi50*50 + broi20*20 == banknota){
						if(array[broi50][broi20] != 1){
							nachini++;
							memory[nachini] = 5020;
							brizbank[nachini] = broi50;
							brizbank20[nachini] = broi20;
							System.out.println(nachini + " :50 & 20: " + broi50 + " x 50 + " + broi20 + " x 20");
							n++;
						}
					}
					
				}
			
		return n;
	}
	}
	public int With50and5 (int banknota){
		int broi50 = 0, broi5 = 0,n = 0;
		if(banknota < 55 || banknota > 300)
			return 0;
		else{
			for(broi50 = 1; broi50 <= petdesetolevki; broi50++)
				for(broi5 = 1; broi5 <= petolevki; broi5++){
					if(broi50*50 + broi5*5 == banknota){
						nachini++;
						memory[nachini] = 505;
						brizbank[nachini] = broi50;
						brizbank5[nachini] = broi5;
						array[broi50][broi5] = 1;
						System.out.println(nachini + " :50 & 5: " + broi50 + " x 50 + " + broi5 +" x 5");
						n++;
					}
				}
			
			for(broi5 = 1; broi5 <= petolevki; broi5++)
				for(broi50 = 1; broi50 <= petdesetolevki; broi50++){
					if(broi50*50 + broi5*5 == banknota){
						if(array[broi50][broi5] != 1){
							nachini++;
							memory[nachini] = 505;
							brizbank[nachini] = broi50;
							brizbank5[nachini] = broi5;
							System.out.println(nachini + " :50 & 5: " + broi50 + " x 50 + " + broi5 +" x 5");
							n++;
						}
					}
					
				}
			
			System.out.println();
		return n;
		}
	}
	public int With20and5 (int banknota){
		int broi20 = 0,broi5 = 0,n = 0;
		if(banknota < 25 || banknota > 250)
			return 0;
		else{
			for(broi20 = 1; broi20 <= dvadesetolevki; broi20++)
				for(broi5 = 1; broi5 <= petolevki; broi5++){
					if(broi20*20 + broi5*5 == banknota){
						nachini++;
						memory[nachini] = 205;
						brizbank20[nachini] = broi20;
						brizbank5[nachini] = broi5;
						array[broi20][broi5] = 1;
						System.out.println(nachini + " :20 & 5: " + broi20 + " x 20 + " + broi5 +" x 5");
						n++;
					}
				}
			
			for(broi5 = 1; broi5 <= petolevki; broi5++)
				for(broi20 = 1; broi20 <= dvadesetolevki; broi20++){
					if(broi20*20 + broi5*5 == banknota)
						if(array[broi20][broi5] != 1){
							nachini++;
							memory[nachini] = 205;
							brizbank20[nachini] = broi20;
							brizbank5[nachini] = broi5;
							System.out.println(nachini + " :20 & 5: " + broi20 + " x 20 + " + broi5 +" x 5");
							n++;
					}
				}
			
			System.out.println();
		return n;
		}
	}

	public int With50and20and5 (int banknota){
		int broi50 = 0, broi20 = 0, broi5 = 0,n = 0;
		if(banknota < 75 && banknota > 500)
			return 0;
		else{
			
		for(broi50 = 1; broi50 <= petdesetolevki; broi50++)
			for(broi20 = 1; broi20 <= dvadesetolevki; broi20++){
				for(broi5 = 1; broi5 <= petolevki; broi5++){
					if(broi50*50 + broi20*20 + broi5*5 == banknota){
						nachini++;
						memory[nachini] = 50205;
						brizbank[nachini] = broi50;
						brizbank20[nachini] = broi20;
						brizbank5[nachini] = broi5;
						triarray[broi50][broi20][broi5] = 1;
						System.out.println(nachini + " :50 & 20 & 5: " + broi50 + " x 50 + " + broi20 +" x 20 + " + broi5 +" x 5");
						n++;
					}
				}
			}
		
		
		for(broi50 = 1; broi50 <= petdesetolevki; broi50++)
			for(broi5 = 1; broi5 <= petolevki; broi5++){
				for(broi20 = 1; broi20 <= dvadesetolevki; broi20++){
					if(broi50*50 + broi20*20 + broi5*5 == banknota)
						if(triarray[broi50][broi20][broi5] != 1){
							nachini++;
							memory[nachini] = 50205;
							brizbank[nachini] = broi50;
							brizbank20[nachini] = broi20;
							brizbank5[nachini] = broi5;
							triarray[broi50][broi20][broi5] = 1;
							System.out.println(nachini + " :50 & 20 & 5: " + broi50 + " x 50 + " + broi20 +" x 20 + " + broi5 +" x 5");
							n++;
					}
				}
			}
		
		
		for(broi20 = 1; broi20 <= dvadesetolevki; broi20++)
			for(broi50 = 1; broi50 <= petdesetolevki; broi50++){
				for(broi5 = 1; broi5 <= petolevki; broi5++){
					if(broi50*50 + broi20*20 + broi5*5 == banknota)
						if(triarray[broi50][broi20][broi5] != 1){
							nachini++;
							memory[nachini] = 50205;
							brizbank[nachini] = broi50;
							brizbank20[nachini] = broi20;
							brizbank5[nachini] = broi5;
							triarray[broi50][broi20][broi5] = 1;
							System.out.println(nachini + " :50 & 20 & 5: " + broi50 + " x 50 + " + broi20 +" x 20 + " + broi5 +" x 5");
							n++;
					}
				}
			}
		

		for(broi20 = 1; broi20 <= dvadesetolevki; broi20++)
			for(broi5 = 1; broi5 <= petolevki; broi5++){
				for(broi50 = 1; broi50 <= petdesetolevki; broi50++){
					if(broi50*50 + broi20*20 + broi5*5 == banknota)
						if(triarray[broi50][broi20][broi5] != 1){
							nachini++;
							memory[nachini] = 50205;
							brizbank[nachini] = broi50;
							brizbank20[nachini] = broi20;
							brizbank5[nachini] = broi5;
							triarray[broi50][broi20][broi5] = 1;
							System.out.println(nachini + " :50 & 20 & 5: " + broi50 + " x 50 + " + broi20 +" x 20 + " + broi5 +" x 5");
							n++;
					}
				}
			}
		
		
		for(broi5 = 1; broi5 <= petolevki; broi5++)
			for(broi50 = 1; broi50 <= petdesetolevki; broi50++){
				for(broi20 = 1; broi20 <= dvadesetolevki; broi20++){
					if(broi50*50 + broi20*20 + broi5*5 == banknota)
						if(triarray[broi50][broi20][broi5] != 1){
							nachini++;
							memory[nachini] = 50205;
							brizbank[nachini] = broi50;
							brizbank20[nachini] = broi20;
							brizbank5[nachini] = broi5;
							triarray[broi50][broi20][broi5] = 1;
							System.out.println(nachini + " :50 & 20 & 5: " + broi50 + " x 50 + " + broi20 +" x 20 + " + broi5 +" x 5");
							n++;
					}
				}
			}
		
		
		for(broi5 = 1; broi5 <= petolevki; broi5++)
			for(broi20 = 1; broi20 <= dvadesetolevki; broi20++){
				for(broi50 = 1; broi50 <= petdesetolevki; broi50++){
					if(broi50*50 + broi20*20 + broi5*5 == banknota)
						if(triarray[broi50][broi20][broi5] != 1){
							nachini++;
							memory[nachini] = 50205;
							brizbank[nachini] = broi50;
							brizbank20[nachini] = broi20;
							brizbank5[nachini] = broi5;
							System.out.println(nachini + " :50 & 20 & 5: " + broi50 + " x 50 + " + broi20 +" x 20 + " + broi5 +" x 5");
							n++;
					}
				}
			}
		
		
		System.out.println();
		}
		return n;
	}
	
	public int Choice(int izbor, int banknota){
		int counter;
		for(counter = 1; counter <= 20; counter++){
			if(izbor == counter){
				switch(memory[izbor]){
				case 50:
					System.out.printf("Banknoti: %d x 50\n", brizbank[izbor]);
					broiizban50 = brizbank[izbor];
					break;
				case 20:
					System.out.printf("Banknoti: %d x 20\n", brizbank[izbor]);
					broiizban20 = brizbank[izbor];
					break;
				case 5:
					System.out.printf("Banknoti: %d x 5\n", brizbank[izbor]);
					broiizban5 = brizbank[izbor];
					break;
				case 5020:
					System.out.printf("Banknoti: %d x 50 + %d x 20\n", brizbank[izbor], brizbank20[izbor]);
					broiizban50 = brizbank[izbor];
					broiizban20 = brizbank20[izbor];
					break;
				case 505:
					System.out.printf("Banknoti: %d x 50 + %d x 5\n", brizbank[izbor], brizbank5[izbor]);
					broiizban50 = brizbank[izbor];
					broiizban5 = brizbank5[izbor];
					break;
				case 205:	
					System.out.printf("Banknoti: %d x 20 + %d x 5\n", brizbank20[izbor], brizbank5[izbor]);
					broiizban20 = brizbank20[izbor];
					broiizban5 = brizbank5[izbor];
					break;
				case 50205:
					System.out.printf("Banknoti: %d x 50 + %d x 20 + %d x 5\n", brizbank[izbor], brizbank20[izbor],brizbank5[izbor]);
					broiizban50 = brizbank[izbor];
					broiizban20 = brizbank20[izbor];
					broiizban5 = brizbank5[izbor];
					break;
				default:
					break;
				}
			}
			else{
					if(izbor > nachini || izbor <= 0){
						while(izbor > nachini || izbor <= 0){
							System.out.printf("Molq vavedete drug nachin: ");
							izbor = velioo.nextInt();
						}
					}
				}
		}
		return 0;
	}
	
	public int Ostatuk(int banknota){

		pari = pari - banknota;
		System.out.println("Ostavashti pari v bankomata: " + pari);
		return pari;
	}
	
	public void Izchistvane(){
		nachini = 0;
		for(int counter = 0; counter <= 19;counter++){
			memory[counter] = 0;
			brizbank[counter] = 0;
			brizbank20[counter] = 0;
			brizbank5[counter] = 0;
		}
			
		for(int broi50 = 1; broi50 <= 5; broi50++)
			for(int broi20 = 1; broi20 <= 10; broi20++)
				for(int broi5 = 1; broi5 <= 10; broi5++){
					triarray[broi50][broi20][broi5] = 0;
					array[broi20][broi5] = 0;
					
				}
		petdesetolevki-=broiizban50;
		dvadesetolevki-=broiizban20;
		petolevki-=broiizban5;
		
		broiizban50 = 0;
		broiizban20 = 0;
		broiizban5 = 0;
		}
		
		

}

