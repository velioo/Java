import java.util.Scanner;
import javax.swing.JOptionPane;
class Bankomat {

	public static void main(String[] args) {
		int count = 0, izbor = 20,ost;
		int suma;
		Scanner velioo = new Scanner(System.in);
		BanInside Opciq1 = new BanInside();//
		BanInside2 Opciq = new BanInside2();
		
		// System.out.println("Въведете сума за теглене: "); 
		String number = JOptionPane.showInputDialog("Въведете сума за теглене ");
		suma = Integer.parseInt(number);
		while(suma > 500 || suma <= 0 || suma % 5 > 0){
			JOptionPane.showMessageDialog(null, "Няма толкова пари в банкомата, въвели сте отрицателна сума или сума, която не се дели на 5 !!! ", "No money !", JOptionPane.PLAIN_MESSAGE);
			number = JOptionPane.showInputDialog("\nВъведете нова сума ");
			suma = Integer.parseInt(number);
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
						System.out.println("1 начин");
						break;
					case 2:
						System.out.println("2 начина");
						break;
					case 3:
						System.out.println("3 начина");
						break;
					case 4:
						System.out.println("4 начина");
						break;
					case 5:
						System.out.println("5 начина");
						break;
					case 6:
						System.out.println("6 начина");
						break;
					case 7:
						System.out.println("7 начина");
						break;
					case 8:
						System.out.println("8 начина");
						break;
					case 9:
						System.out.println("9 начина");
						break;
					case 10:
						System.out.println("10 начина");
						break;
					case 11:
						System.out.println("11 начина");
						break;
					case 12:
						System.out.println("12 начина");
						break;
					case 13:
						System.out.println("13 начина");
						break;
					case 14:
						System.out.println("14 начина");
						break;
					case 15:
						System.out.println("15 начина");
						break;
					case 16:
						System.out.println("16 начина");
						break;
					case 17:
						System.out.println("17 начина");
						break;
					case 18:
						System.out.println("18 начина");
						break;
					case 19:
						System.out.println("19 начина");
						break;
					case 20:
						System.out.println("20 начина");
						break;
					default :
						break;
				}
				
				JOptionPane.showMessageDialog(null, "Изберете начин на плащане ", "Начин", JOptionPane.PLAIN_MESSAGE);
				izbor = velioo.nextInt();
				Opciq.Choice(izbor, suma);
				
				ost = Opciq.Ostatuk(suma);
				number = JOptionPane.showInputDialog("Въведете нова сума или 0 за изход ");
				suma = Integer.parseInt(number);
				Opciq.Izchistvane();
				
				while(suma > ost || suma < 0 || suma % 5 > 0){
					JOptionPane.showMessageDialog(null, "Няма толкова пари в банкомата, въвели сте отрицателна сума или сума, която не се дели на 5 !!! ", "No money !", JOptionPane.PLAIN_MESSAGE);
					number = JOptionPane.showInputDialog("Въведете нова сума или 0 за изход ");
					suma = Integer.parseInt(number);
				}
				
				count = 0;
					
		}
		JOptionPane.showMessageDialog(null, "Приятен ден !!! ", "Приятен ден", JOptionPane.PLAIN_MESSAGE);
	}
		
}
