//Algoritmo busqueda del menor, busca el menor elemento de una lista de n�meros.

Proceso BusquedaMenor //Se inicia el proceso del algoritmo.
	
	//Datos de entrada:
	Definir N como entero; //La constante N guardar� el tama�o de la lista de elementos. 
	Imprimir "Dame el tama�o de la lista: "; //Se muestra un mensaje en pantalla con instrucciones.
	leer N; //Se registra el valor de N con el teclado.
	Definir lista como entero; //Se define el tipo de dato de lista como entero.
	Dimension lista[N]; //Se crea una lista con tama�o N de elementos.
	
	//Procedemos a leer cada uno de los valores:
	Definir i como entero; // La variable i ser� una variable de control que nos ayuda a iterar el ciclo para.
	para i<-0 hasta (N-1) con paso 1 Hacer // Se crea el ciclo para con un recorrido desde 0 hasta N-1.
		Imprimir "Valor de elemento ",(i+1),": "; //Se muestra en pantalla el elemento a registrar valor.
		Leer lista[i];	//Se registra con el teclado un valor de la lista. 
	FinPara 
	
	//Procedemos a encontrar el valor menor. 
	Definir minimo como entero; //Se define una variable auxuiliar que terminar� guardando el elemento menor.
	minimo <- lista[0]; // Se supone el primer elemento de la lista como el menor aunque realmente no lo sea. 
	para i<-0 hasta (N-1) con paso 1 Hacer //Se vuelve a iniciar el ciclo �para� con el mismo recorrido desde 0 a N-1.
		si lista[i]<minimo Entonces //Se crea una estructura de control bajo la condicion de que �lista[i]� sea menor que �minimo�.
			minimo <- lista[i]; //En caso de cumplir la condici�n se reasigna el valor de �minimo�. 
		FinSi
	FinPara //De �sta forma el ciclo al terminar de recorrerce provocar� que la variable �minimo�guarde el menor elemento.
	
	//Datos de salida:
	Imprimir "El menor elemento es: ",minimo; //Se muestra en pantalla el valor de �minimo�.
	
FinProceso //Fin del algoritmo
