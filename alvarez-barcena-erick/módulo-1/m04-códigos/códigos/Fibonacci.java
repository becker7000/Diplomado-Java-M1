import java.util.Scanner;

class Fibonacci{
	
	public static void main(String[] args){
		
		int n;
		System.out.printf("\n\t Escribe un numero entero: ");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		int a,b,c;
		a=1;
		b=1;

		System.out.printf("\n\t %d",a);
		System.out.printf("\n\t %d",b);

		int i;

		for(i=0;i<n;i++){
			c=a+b;
			a=b;
			b=c;
			System.out.printf("\n\t %d",c);	
		}

		sc.close();

	}
}