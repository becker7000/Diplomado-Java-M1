
class SumaMultiplos{

	public static void main(String[] args){
	
		int n=3;
		int suma=0;

		while(suma<500){
			suma=suma+n;
			n=n+3;
		}		
		System.out.printf("\n\t Ultimo multiplo: %d",n);
		System.out.printf("\n\t La suma es: %d",suma);

	}

}

