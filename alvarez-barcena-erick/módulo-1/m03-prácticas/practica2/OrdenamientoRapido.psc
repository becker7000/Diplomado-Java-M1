//Este subproceso intercambia de posici�n dos valores de una lista.
//Se reciben tres par�metros: la lista, posici�n de un elemento 
// y posici�n de otro elemento. No devuelve nada.
SubProceso  Intercambiar (lista_entrada, i, j) 
    Definir  temporal Como Entero; //Esta variable es auxiliar
	//Ayuda a salvar uno de los valores para poder hacer el intercambio.
    temporal <- lista_entrada[i];
	//Una vez guardado en temporal el valor de lista_entrada[i] se modifica
	//lista_entrada[i] asignandole el valor de lista_entrada[j]
    lista_entrada[i] <- lista_entrada[j];
	//Se asigna a lista_entrada[j] el valor antiguo de lista_entrada[i]
	//que est� a salvo en temporal.
    lista_entrada[j] <- temporal;
FinSubProceso

//Esta funci�n se encarga de devolver un indice entre l y r que ser�
//el 
SUBPROCESO indice_menor <- Particion (lista_entrada, l, r) 
    
	//Se define la variable pivote que ser� encargada de guardar un
	//valor de la lista, al inicio el pivote puede ser cualquier elemento.
    Definir  pivote Como Entero;
    
	//En este caso el pivote se toma como el �ltimo elemento.
	//para as� buscar los elemento que sean menores y luego los mayores a �l.
	//La partici�n de la lista se hace en funci�n al valor del pivote.
    pivote <- lista_entrada[r];
    
	//Se imprime la forma en la que se va a partionar.
	// l es la primera posici�n y r la �ltima, pivote 
	// es el valor que est� en la ultima posici�n
    //IMPRIMIR "Particion (" l " " pivote " " r ")";
    
	//La variabe k ser� una variable de control para recorre la lista.
    Definir k Como Entero;
    
	//Se crea la variable indice_menor que ser� el indice de la lista
	//que devuelva el primer elemento de la lista.
    Definir indice_menor Como Entero;
    
    indice_menor <- l - 1;
    
	//Este ciclo incia en k que a su vez guarda el indice inicial 
	//se recorre toda la lista desde l hasta r-1.
    PARA k <- l HASTA r - 1 CON PASO 1 HACER
        SI lista_entrada[k] < pivote ENTONCES //si el elemento en la posici�n k
			//es menor al pivote significa que est�n desordenados y se intercambian de posici�n.
            //Estas dos lineas de c�digo s�lo tendr�n efecto si k e indice_menor se vuelven disparejos.
			indice_menor <- indice_menor + 1; 
            Intercambiar(lista_entrada, indice_menor, k);
        FIN SI
    FIN PARA
    
	//Estas dos lineas de c�digo est�n para hacer el intercambio final 
	//en dado caso de que k e indice_menor sean diferentes pero k ya haya superado el 
	//valor de r-1.
    indice_menor <- indice_menor + 1;
    Intercambiar(lista_entrada, indice_menor, r);
    
FIN SUBPROCESO

//Este subproceso recibe tres par�metros: la lista de entrada
// luego el inidice inicial y el indice final de la misma.
SubProceso  Ordenar (lista_entrada, l, r)
    
    si l < r Entonces //Caso basede la func��n recursiva.
        
		//Se muestra en pantalla de donde a donde se va a ordenar.
        //Imprimir "ORDENAR (" l " " r ")"; 
        
		//Se crea una variable para guardar el indice del pivote.
		//que es el indice apartir del cual se particionar�.
        Definir indice_particion Como Entero;
		
		//Lista antes de la Particion de l a r.
		Imprimir "Lista antes de la partici�n de l a r: ";
		Definir i Como Entero;
		Para i <- 0 Hasta  r-1 Con Paso  1 Hacer 
			Imprimir "Valor en la posici�n ",i,": ",lista_entrada[i]; //Se formatea la salida para mejor vizualizaci�n.
		FinPara
        
		//Tal indice lo decide otro subproceso llamado Partici�n.
        indice_particion <- Particion(lista_entrada, l, r);
		Imprimir "El indice de partici�n es: ",indice_particion;
        
		//Se muestra en pantalla que se har� una partici�n 
		//donde la variable indice_particion ser� un valor num�rico entre l y r.
        //Imprimir l " " indice_particion " " r; 
		Imprimir  "l: ",l,", r: ",r;
				
		Imprimir "Lista antes del ordenamiento de l a indice_partici�n-1: ";
		Para i <- 0 Hasta  r-1 Con Paso  1 Hacer 
			Imprimir "Valor en la posici�n ",i,": ",lista_entrada[i]; //Se formatea la salida para mejor vizualizaci�n.
		FinPara
		
		//Luego de obtener el indice de partici�n se 
		//envian dos lista a ordener en diferentes llamadas al subpreceso Ordenar.
		//Primero la lista que hay desde 0 hasta un elemento antes del indice del pivote.
        Ordenar(lista_entrada, l, indice_particion - 1);
		//Despu�s la lista que hay desde un elemento despu�s
		//al pivote hasta el �ltimo elemento.
        Ordenar(lista_entrada, indice_particion + 1, r);
        //Estas dos ultimas llamadas son llamadas recursivas.
		
		Imprimir "Lista despu�s del ordenamiento de l a indice_partici�n+1: ";
		Para i <- 0 Hasta  r-1 Con Paso  1 Hacer 
			Imprimir "Valor en la posici�n ",i,": ",lista_entrada[i]; //Se formatea la salida para mejor vizualizaci�n.
		FinPara
		
		
    FinSi
    
FinSubProceso

//Proceso general
Proceso OrdenamientoRapido
	
Definir  N Como Entero;; //Definimos una variable para el tama�o de la lista a ordenar.

Imprimir  "Dame el tama�o de la lista a ordenar: "; //Se muestra una instrucci�n en pantalla. 
Leer N; //Se registra el valor de N a trav�s del teclado.

Definir  lista Como Entero; //Se crea una variable del tipo de datos que guardaremos en la lista.
Dimension  lista[N]; //Se crea la lista de tama�o N.

Definir i Como Entero; //Variable de control para recorrer la lista desde 0 hasta N-1.

Para i <- 0 Hasta  N - 1 Con Paso  1 Hacer //Se crea una estructura de control para recorrer la lista.
    Imprimir  "Dame el valor de la lista en la posici�n ",i,": "; //Se muestra el elemento a registrar.
    Leer  lista[i]; //Se registra el valor del elemento i-�simo de la lista.
FinPara //Al finalizar este ciclo tenemos la lista llena de elementos.

Ordenar(lista, 0, N - 1); //Se ordena la lista con la funci�n predefinida Ordenar.
// Esta funci�n recibe 3 par�metros: la lista a ordenar, 
// la primera pocisi�n de la lista y la �ltima posici�n.

//Se vuevle a imprimir en pantalla la lista para mostrar que ya est� ordenada en forma creciente.
Para i <- 0 Hasta  N - 1 Con Paso  1 Hacer 
    Imprimir "Valor en la posici�n ",i,": ",lista[i]; //Se formatea la salida para mejor vizualizaci�n.
FinPara

FinProceso