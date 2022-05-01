import java.util.Scanner;

class Intervalo{
	
	public static void main(String[] args){
		
		float numero; 
		System.out.printf("\n\t Escribe un numero decimal: ");
		Scanner sc = new Scanner(System.in);
		numero = sc.nextFloat();
		
		if((numero >= 1 && numero <5) || (numero>10 && numero <=15)){
			System.out.printf("\n\t El numero esta en el intervalo!");
		}else{
			System.out.printf("\n\t El numero no esta en el intervalo!");
		}
			
		
		sc.close();
	}



}