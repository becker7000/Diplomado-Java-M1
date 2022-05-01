//Algoritmo de ordenamiento de la burbuja: toma una lista de n�meros y los ordena de forma ascendente.
//Aunque tambi�n podemos modificar el algoritmo para que los ordene de forma descendente.
Proceso OrdenamientoPorBurbuja
	
	//Datos de entrada:
	Definir N como entero; //La constante N guardar� el tama�o de la lista de numeros. 
	Imprimir "Dame el tama�o de la lista: "; //Se muestra un mensaje en pantalla con instrucciones.
	leer N; //Se registra el valor de N con el teclado.
	Definir lista como entero; //Se define el tipo de dato de lista como entero.
	Dimension lista[N]; //Se crea una lista con tama�o N de elementos.
	
	//Procedemos a leer cada uno de los valores:
	Definir i como entero; // La variable i ser� una variable de control que nos ayuda a iterar el ciclo �para�.
	para i<-0 hasta (N-1) con paso 1 Hacer // Se crea el ciclo para con un recorrido desde 0 hasta N-1.
		Imprimir "Valor del elemento ",(i+1),": "; //Se muestra en pantalla el elemento a registrar valor.
		Leer lista[i];	//Se registra con el teclado un valor de la lista. 
	FinPara 
	
	//Inicia el ordenamiento con el algoritmo de la burbuja, definimos una variable que guardar� un valor de la lista,
	Definir actual Como Entero;//este valor se va a comparar con el valor del elemento �siguiente� en la lista.
	Definir siguiente Como Entero; //Definimos otra variable que guardar� el valor a la derecha de �actual� en la lista.
	
	//La variable de control i ser� usada para cada pasada desde 0 hasta N-1.
	Definir j Como Entero; //Variable de control ser� usada para comparar cada pareja consecutiva de la lista.
	
	//Iniciamos el recorrido de la lista, con cada pasada llevamos el valor m�s grande al final de la lista.
	//De ah� el nombre Burubuja haciendo referencia a las burbujas de un refresco que s�lo las m�s grandes suben hasta el final.
	para i <- 0 hasta N-1 Con Paso 1  Hacer //Bucle para hacer cada una de las pasadas a la lista.
		//Bucle para hacer cada comparaci�n posible, entre m�s pasadas menos comparaciones ser�n necesarias.			
		para j<- 0 hasta N-2 Con Paso 1 Hacer 
			actual <- lista[j]; //Aseguramos en una variable los valores actual y siguiente.
			siguiente <- lista [j+1];
			si actual>siguiente Entonces  //En caso de estar desordenados, se ordenan.
           //si usamos la condici�n actual>siguiente los ordenar� de forma creciente.
		   //si usamos la condici�n actual<siguiente los ordenar� de forma descreciente.
				lista[j]=siguiente;  //Se asigna el valor menor a la posici�n a la izquierda de la posici�n j+1.
				lista[j+1]=actual; //Se asigna el valor mayor a la posici�n a la derecha de la posic�n j.
			FinSi
		FinPara //Al finalizar este ciclo un elemento de la lista se ordenar�. 
	FinPara //Al finalizar este ciclo todos los elementos ya estar�n ordenados.
	
	//Mostramos en pantalla como qued� la lista luego de ordenarla.
	para i <- 0 Hasta N-1 con paso 1 Hacer //Al momento de imprimir sumamos 1 a i para mostrar una enumeraci�n 
		Imprimir "Elemento ",(i+1),": ",lista[i]; //de los elementos m�s amigable. Ejemplo: Elemento 1: 45
	FinPara 
FinProceso