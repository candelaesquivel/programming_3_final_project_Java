package api;

public interface DisjointSetTDA {
	
	
	/**
	* @Tarea_Nombre: InicializarDisjointSet.
	* @Tarea_Descripción: Se crea una estrucutra vacía lista para ser utilizada.
	* @Parámetros: Recibe la cantidad de elementos del DisjointSet.
	* @Devuelve: No retorna ya que es de tipo void.
	* @Precondiciones: No tiene precondición.
	* @Postcondiciones: No tiene postcondiciones.
	* @Excepción: No tiene excepciones.
	*/
	public void inicializarDisjointSet(int x); //COSTO: constante O(1)
	
	/**
	* @Tarea_Nombre: Agregar
	* @Tarea_Descripción: Agrega un nuevo elemento a la estructura y se crea un nuevo conjunto unitario que contiene el nuevo elemento.
	* @Parámetros: Recibe un tipo de dato int que es el elemento.
	* @Devuelve: No retorna ya que es de tipo void.
	* @Precondiciones: Disjointset inicializado y el nuevo elemento no es parte del conjunto.
	* @Postcondiciones: El identicador del nuevo elemento es el elemento mismo.
	* @Excepción: No tiene excepción.
	*/
    public void agregar(int x) ; //COSTO: constante O(1)

    
    /**
	* @Tarea_Nombre: Id
	* @Tarea_Descripción: Recibe como parámetro un elemento ingresado a la estructura y devuelva el identicador correspondiente.
	* @Parámetros: Recibe un tipo de dato int.
	* @Devuelve: Retorna un tipo de dato int.
	* @Precondiciones: Disjointset inicializado y el elemento x debe existir en el conjunto.
	* @Postcondiciones: No tiene postcondiciones .
	* @Excepción: No tiene excepción.
	*/
    public int id(int x) ; //COSTO: función inversa de Ackermann , tiempo amortizado casi constante O( α(n) )

	
	/**
	* @Tarea_Nombre: Fusionar
	* @Tarea_Descripción: Recibe como parámetro dos elementos de la estructura y fusiona los respectivos conjuntos a los que pertenecen.
	* @Parámetros: Recibe un tipo de dato int.
	* @Devuelve: No retorna ya que es de tipo void.
	* @Precondiciones: Disjointset inicializado y los elementos x e y deben existir en el conjunto.
	* @Postcondiciones: Ambos elementos quedan con el mismo identificador.
	* @Excepción: No tiene excepción.
	*/
	public void fusionar(int x,int y) ; //COSTO: función inversa de Ackermann , tiempo amortizado casi constante O( α(n) )
	
	public int [] parentArray();
	public int[] rankArray();

}
