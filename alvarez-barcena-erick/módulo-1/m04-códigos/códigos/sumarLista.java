
import java.io.*;

class sumarlista{

	public static void main(String[] args) {
		int i;
		int lista[];
		int suma;
		lista = new int[5];
		lista[0] = 2;
		lista[1] = 6;
		lista[2] = 5;
		lista[3] = 3;
		lista[4] = 1;
		suma = 0;
		for (i=0;i<=4;i+=1){
			suma = suma+lista[i];
		}
		System.out.printf("\n\t La suma es: %d",suma);
	}
}

