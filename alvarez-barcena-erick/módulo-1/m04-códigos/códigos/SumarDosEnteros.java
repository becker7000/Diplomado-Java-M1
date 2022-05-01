import java.util.Scanner;

class SumarDosEnteros{

	public static void main(String[] args){
		
		int a;
		int b;
		int c;
		
		Scanner sc = new Scanner(System.in);

		System.out.printf("\n\t Escribe un valor entero: ");
		a = sc.nextInt();
		
		System.out.printf("\n\t Escribe otro valor entero: ");
		b = sc.nextInt();

		c=a+b;

		System.out.printf("\n\t La suma da: %d \n",c);

		sc.close();
	
	}
}