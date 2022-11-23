package api;

import implementation.ColaPrioridad.Par;

public interface ColaPrioridadTDA {
	/**
	* @Tarea_Nombre: InicializarCola.
	* @Tarea_Descripción: Se crea una estructura vacía lista para ser utilizada.
	* @Parámetros: Recibe la cantidad de elementos de la cola con prioridad.
	* @Devuelve: No retorna ya que es de tipo void.
	* @Precondiciones: La cantidad de elementos que se recibe es igual o mayor a la cantidad de aristas del grafo.
	* @Postcondiciones: No tiene postcondiciones.
	* @Excepción: No tiene excepciones.
	*/
	public void inicializarCola(int capacidad);//constante O(1)
	
	/**
	* @Tarea_Nombre: AcolarPrioridad.
	* @Tarea_Descripción: Se acola segun el peso de la arista del par de nodos.
	* @Parámetros: Recibe nodo origen , nodo destino y peso de la arista que une esos nodos.
	* @Devuelve: No retorna ya que es de tipo void.
	* @Precondiciones: No tiene precondición.
	* @Postcondiciones: La cola con prioridad mantiene su order al haber insertado el nuevo elemento.
	* @Excepción: No tiene excepciones.
	*/
	public void acolarPrioridad(int nodoOrigen, int nodoDestino, int pesoArista);//logaritmico O(log(n))
	
	/**
	* @Tarea_Nombre: Desacolar.
	* @Tarea_Descripción: Se elimina el primer elmento de la cola .
	* @Parámetros: No recibe parametros.
	* @Devuelve: No retorna ya que es de tipo void.
	* @Precondiciones: La cola no debe estar vacia.
	* @Postcondiciones:  La cola con prioridad mantiene su order al haber eliminado el elemento.
	* @Excepción: No tiene excepciones.
	*/
	public void desacolar();//logaritmico O(log(n))
	
	/**
	* @Tarea_Nombre: ColaVacia.
	* @Tarea_Descripción:Verifica si la cola esta vacia.
	* @Parámetros: No recibe parametros.
	* @Devuelve: Retorna un booleano , false si tiene elementos y true si no tiene elementos.
	* @Precondiciones: No tiene precondición.
	* @Postcondiciones: No tiene postcondiciones.
	* @Excepción: No tiene excepciones.
	*/
	public boolean colaVacia();//constante O(1)
	
	
	/**
	* @Tarea_Nombre: Primero.
	* @Tarea_Descripción: Retorna el primero elemento de la cola.
	* @Parámetros: No recibe parametros.
	* @Devuelve: Retorna una clase Par que tiene la informacion de un par de nodos.
	* @Precondiciones: La cola no debe estar vacia.
	* @Postcondiciones: No tiene postcondiciones.
	* @Excepción: No tiene excepciones.
	*/
	public Par primero();//constante O(1)
	
	/**
	* @Tarea_Nombre: Prioridad.
	* @Tarea_Descripción: Devuelve la prioridad del primero elemento de la cola.
	* @Parámetros: No recibe parametros.
	* @Devuelve: Retorna un tipo de dato int.
	* @Precondiciones: La cola no debe estar vacia.
	* @Postcondiciones: No tiene postcondiciones.
	* @Excepción: No tiene excepciones.
	*/
	public int prioridad();//constante O(1)

}
