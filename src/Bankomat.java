import java.util.Scanner;
import javax.swing.JOptionPane;
class Bankomat {

	public static void main(String[] args) {
		int count = 0, izbor = 20,ost;
		int suma;
		Scanner velioo = new Scanner(System.in);
		BanInside Opciq1 = new BanInside();//
		BanInside2 Opciq = new BanInside2();
		
		// System.out.println("�������� ���� �� �������: "); 
		String number = JOptionPane.showInputDialog("�������� ���� �� ������� ");
		suma = Integer.parseInt(number);
		while(suma > 500 || suma <= 0 || suma % 5 > 0){
			JOptionPane.showMessageDialog(null, "���� ������� ���� � ���������, ������ ��� ����������� ���� ��� ����, ����� �� �� ���� �� 5 !!! ", "No money !", JOptionPane.PLAIN_MESSAGE);
			number = JOptionPane.showInputDialog("\n�������� ���� ���� ");
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
						System.out.println("1 �����");
						break;
					case 2:
						System.out.println("2 ������");
						break;
					case 3:
						System.out.println("3 ������");
						break;
					case 4:
						System.out.println("4 ������");
						break;
					case 5:
						System.out.println("5 ������");
						break;
					case 6:
						System.out.println("6 ������");
						break;
					case 7:
						System.out.println("7 ������");
						break;
					case 8:
						System.out.println("8 ������");
						break;
					case 9:
						System.out.println("9 ������");
						break;
					case 10:
						System.out.println("10 ������");
						break;
					case 11:
						System.out.println("11 ������");
						break;
					case 12:
						System.out.println("12 ������");
						break;
					case 13:
						System.out.println("13 ������");
						break;
					case 14:
						System.out.println("14 ������");
						break;
					case 15:
						System.out.println("15 ������");
						break;
					case 16:
						System.out.println("16 ������");
						break;
					case 17:
						System.out.println("17 ������");
						break;
					case 18:
						System.out.println("18 ������");
						break;
					case 19:
						System.out.println("19 ������");
						break;
					case 20:
						System.out.println("20 ������");
						break;
					default :
						break;
				}
				
				JOptionPane.showMessageDialog(null, "�������� ����� �� ������� ", "�����", JOptionPane.PLAIN_MESSAGE);
				izbor = velioo.nextInt();
				Opciq.Choice(izbor, suma);
				
				ost = Opciq.Ostatuk(suma);
				number = JOptionPane.showInputDialog("�������� ���� ���� ��� 0 �� ����� ");
				suma = Integer.parseInt(number);
				Opciq.Izchistvane();
				
				while(suma > ost || suma < 0 || suma % 5 > 0){
					JOptionPane.showMessageDialog(null, "���� ������� ���� � ���������, ������ ��� ����������� ���� ��� ����, ����� �� �� ���� �� 5 !!! ", "No money !", JOptionPane.PLAIN_MESSAGE);
					number = JOptionPane.showInputDialog("�������� ���� ���� ��� 0 �� ����� ");
					suma = Integer.parseInt(number);
				}
				
				count = 0;
					
		}
		JOptionPane.showMessageDialog(null, "������� ��� !!! ", "������� ���", JOptionPane.PLAIN_MESSAGE);
	}
		
}
