package implementation;


import api.DisjointSetTDA;

public  class DisjointSet implements DisjointSetTDA{
	
	private int[] rank; // altura del árbol que representa el conjunto
	private int[] parent; //padre del conjunto
	
 
    public void inicializarDisjointSet(int x) {   	
    	rank = new int[x];      //constante O(1)+
    	parent = new int[x]; //constante O(1)=
   	                          //constante O(1)  	
    }

    public void agregar(int n) {
        parent[n]=n;             //constante O(1)+
        rank[n]=0;              //constante O(1)=
                                //constante O(1)
       
    }


    public int id(int x) { 
    
        if (parent[x] != x) {           
            parent[x] = id(parent[x]); 
        } 
                                       
        return parent[x]; 
        
                                //O( α(n) )
    } 
  

    public void fusionar(int x, int y)
    {
    	int xRoot = id(x), yRoot = id(y);
    
        if (xRoot == yRoot)
            return;
 
        
        if (rank[xRoot] > rank[yRoot]) {
        
            parent[yRoot] = xRoot;
        }
        
        else { 
            parent[xRoot] = yRoot;
            if(rank[xRoot] == rank[yRoot])
            	rank[yRoot] = rank[yRoot] + 1;
           
        }
        //O( α(n) )
    }
    
   

	public int [] parentArray() {
		return parent;
	}
	
	public int[] rankArray(){
		return rank;
	}
	
}



	 

