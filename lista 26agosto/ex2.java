import java.util.Scanner;
public class ex2 {
	
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		int n, r;
		int i=1;
		
		System.out.println("Digite o n�mero: ");
		n = ler.nextInt();
		
		while (i<10) {
			
			r = i*n;
			System.out.println( r );
			i = i + 1;
			
		}
	}
}