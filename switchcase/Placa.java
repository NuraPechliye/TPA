import java.util.Scanner;
public class Placa {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int np;
		System.out.println("Digite o �ltimo n�mero da sua placa: ");
		np = ler.nextInt();
		
		switch(np) {
			
		case 1:
		case 2:
			System.out.println("Segunda-feira");
		break;
			
		case 3:
		case 4:
			System.out.println("Ter�a-feira");
		break;
			
		case 5:
		case 6:
			System.out.println("Quarta-feira");
		break;
			
		case 7:
		case 8:
			System.out.println("Quinta-feira");
		break;
		
		case 9:
		case 0:
			System.out.println("Sexta feira");
		break;
		
		default:
			System.out.println("N�mero inv�lido");
			
			
		}
	}
}
