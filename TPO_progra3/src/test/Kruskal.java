package test;
import api.DisjointSetTDA;
import implementation.DisjointSet;
import api.ColaPrioridadTDA;
import implementation.ColaPrioridad;
import implementation.ColaPrioridad.Par;


public class Kruskal {
	
	public static ColaPrioridadTDA AristasG_ColaPrioridad(int[][] G , ColaPrioridadTDA Q ) {

		for(int i = 1; i <  G.length; i++) //n.(
		{
			
			for(int y = 1; y < G.length; y++) //n.(
			{
				if(G[i][y]!=0) {
					int peso =  G[i][y]; // O(1)+
					Q.acolarPrioridad(i, y, peso);//+ O(log(n))
				}
				
			}
			// ) = O( n^2 . log n )
		}
		
		return Q;
	}

	
	public static void KruskalCode(int[][] G , int x , int x2) {
	
		DisjointSetTDA T = new DisjointSet(); // O(1)+
		T.inicializarDisjointSet(x);// O(1)+
		
		ColaPrioridadTDA Q = new ColaPrioridad();// O(1)+
		Q.inicializarCola(x2);// O(1)+
		
		for(int i = 1; i < G.length ; i++) // n.(
		{
			T.agregar(i);//arboles de un solo elemento , O(1)
		}// )= O(n)
						
		
		//pesos de las aristas y nodos agregados a la cola con prioridad
		
		Q = AristasG_ColaPrioridad( G ,  Q ); // O( n^2 . log n )+

		int n =G.length-1;// O(1)+
		
		for(int i = 1; i < n ; i++) //n(
		{
			  Par par = Q.primero();// O(1)+
			 
			  int v = par.V_origen;// O(1)+
			  int u = par.V_destino;// O(1)+
			  
			  int uset= T.id(u);// O( α(n) )+
			  int vset= T.id(v);// O( α(n) )+
			 
			  
			  if(uset != vset) {// O(1)+
				  T.fusionar(uset, vset);// O( α(n) )+
				  System.out.println("Nodos unidos :"+ v + "-" +u + " | Peso de Arista : " + Q.prioridad()); //  O(1)+
			  }else {
				  n++; // no perdemos la iteracion de los casos que rechazamos una arista ,  O(1)+
			  }
			  Q.desacolar(); // O(log n) ) 
		}
		//= O( n . log n )
		
		
		return ;
		
		// costo : O( n^2 . log n )
	}
	 
	public static void main(String[] args) {
		
		int [][] Grafo1 = new int [8][8] ;
		
		//agregamos las aristas
		Grafo1 [1][2]= 4;
		Grafo1 [1][3]= 7;
		Grafo1 [1][6]= 5;
		Grafo1 [1][7]= 1;
		Grafo1 [2][3]= 3;
		Grafo1 [3][7]= 3;
		Grafo1 [3][4]= 5;
		Grafo1 [4][5]= 7;
		Grafo1 [4][7]= 9;
		Grafo1 [5][7]= 4;
		Grafo1 [5][6]= 8;
		Grafo1 [6][7]= 2;
		
		
		int elementosDisjunt = 9;// numero del elemento mas grande que se ingresara mas 1  en el DisjontSet
		int cantidadAristas = 12; // cantidad de aristas en el grafo
				
		KruskalCode(Grafo1 , elementosDisjunt , cantidadAristas);//imprime por pantala que aristas son las seleccionadas y que nodos une

		
	}

}
