import java.util.ArrayList;
import java.util.HashMap;
public class Main{
	public static void main(String[] args) {
    	Grafo g = new Grafo(false);
    	int[] verts = {0,1,2,3, 4, 5, 6, 7};
    	for(Integer v : verts){
    		g.insertarVertice(v);
    	}

    	g.insertarArista(0, 1);
    	g.insertarArista(0, 2);
    	g.insertarArista(0, 3);
    	g.insertarArista(1, 2);
    	g.insertarArista(1, 4);
    	g.insertarArista(2, 5);
    	g.insertarArista(3, 2);
    	g.insertarArista(3, 5);
    	g.insertarArista(3, 6);
    	g.insertarArista(3, 7);
    	g.insertarArista(5, 6);
    	g.insertarArista(6, 7);
    	g.insertarArista(4, 7);

    	ArrayList<ArrayList<Arista>> res = g.emparejamientos();

    	for(ArrayList<Arista> p : res) {
    		System.out.println(p);
    	}
    }
}