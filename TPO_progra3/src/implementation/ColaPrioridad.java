package implementation;

import api.ColaPrioridadTDA;


public class ColaPrioridad implements ColaPrioridadTDA {
	 public class Par {
		public int V_origen;
		public int V_destino;
		}

	int [] prioridad;
	Par[] valor;	
	int size;	
	Par vertices;
	
	
	public void inicializarCola(int capacidad) {		
		prioridad= new int [capacidad+1];   //constante O(1)+
		valor= new Par [capacidad+1];       //constante O(1)+
		size=0;		                        //constante O(1)=
	}										//constante O(1)
	
	
	   private void swap(int i, int j) { // el valor y prioridad se modifican juntos 
			int tmp = prioridad[i];         //constante O(1)+
			Par tmp2 = valor[i];		    //constante O(1)+

			prioridad[i] = prioridad[j];	//constante O(1)+
			valor[i] = valor[j];	        //constante O(1)+

			prioridad[j] = tmp;			    //constante O(1)+
			valor[j] = tmp2;			   //constante O(1)=
	        
	    }									//constante O(1)

	   private void heapifyUp(int k) {
	        while (prioridad[k] < prioridad[k/2] && (k/2)!=0 ) { 	//log n*(
	            swap(k , k/2);										//constante O(1)+
	            k = k/2;											//constante O(1))=
	        }
	    }															//logarítmico O(log(n))

	

	public void acolarPrioridad(int nodoOrigen, int nodoDestino, int pesoArista) {		
		prioridad[++size]=pesoArista;            //constante O(1)+
		Par vertices = new Par ();
		vertices.V_destino=nodoDestino;          //constante O(1)+
		vertices.V_origen=nodoOrigen;            //constante O(1)+
		
		valor[size]=vertices;                    //constante O(1)+
		
						
		heapifyUp(size);						//logaritmico O(log(n))=
	}											//logaritmico O(log(n))
		
	 private void heapifyDown(int k) {
		 
        int posMenor = k; 							//constante O(1) +
        int posIzquierdo = 2*k;						//constante O(1) +
        int posDerecho = 2*k + 1;					//constante O(1) +

        if (posIzquierdo <= size && prioridad[posIzquierdo] < prioridad[posMenor] ){ 	// constante O(1) +
            posMenor = posIzquierdo; 													//constante O(1) +
        }

        if (posDerecho <= size && prioridad[posDerecho] < prioridad[posMenor] ) { 		//constante O(1) +
        	posMenor = posDerecho; 														//constante O(1) +
        }

        if (posMenor != k ) {														//constante O(1) +
            swap(k, posMenor);														//constante O(1) +
            heapifyDown(posMenor); 													//logaritmico O(log(n))=
        }
		 
	  }																				//logaritmico O(log(n))

	
	
	public void desacolar() {
		 if(colaVacia()) {												//constante O(1) +		
		   	throw new RuntimeException("La cola esta vacia");			//constante O(1) +
		 }
		
       prioridad[1] = prioridad[size];									//constante O(1) +
       valor[1]=valor[size];									        //constante O(1) +
      
       size--;															//constante O(1) +
   
       heapifyDown(1);													//logaritmico O(log(n))=

	}																	//logaritmico O(log(n))
	
	public boolean colaVacia() {
		return size==0 ;				//constante O(1)
	}

	public Par primero() {
		if(colaVacia()) {
			throw new RuntimeException("La cola esta vacia");		//constante O(1)=
		}else {
			return valor[1];							
		}															//constante O(1)
		
		}

	public int prioridad() {
		
		if(colaVacia()) {												//constante O(1) +
			throw new RuntimeException("La cola esta vacia");			//constante O(1)=
		}else {
			return prioridad[1];									
		}																
	}																	//constante O(1)



}
