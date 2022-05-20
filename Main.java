import java.util.ArrayList;
import java.util.HashMap;
public class Main{
	public static void main(String[] args) {
		System.out.println("Emparejamientos Grafo1");
    	grafo1();
    	System.out.println();
    	System.out.println("----------------------------------------------------------------------");
    	System.out.println();
    	System.out.println("Emparejamientos Grafo2");
    	grafo2();
    	System.out.println();
    	System.out.println("----------------------------------------------------------------------");
    	System.out.println();
    	System.out.println("Emparejamientos Grafo3");
    	grafo3();
    }

    static void grafo1() {
    	Grafo g = new Grafo(false);
    	int[] verts = {0,1,2,3};
    	for(Integer v : verts){
    		g.insertarVertice(v);
    	}

    	g.insertarArista(0, 1);
    	g.insertarArista(0, 3);
    	g.insertarArista(1, 2);
    	g.insertarArista(1, 3);
    	g.insertarArista(3, 2);

    	ArrayList<ArrayList<Arista>> res = g.emparejamientos();

    	for(ArrayList<Arista> p : res) {
    		System.out.println(p);
    	}
    }

     static void grafo2() {
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

     static void grafo3() {
     	Grafo g = new Grafo(true);
    	int[] verts = {0,1,2,3, 4, 5, 6};
    	for(Integer v : verts){
    		g.insertarVertice(v);
    	}

    	g.insertarArista(0, 1);
    	g.insertarArista(0, 2);
    	g.insertarArista(0, 3);
    	g.insertarArista(0, 4);
    	g.insertarArista(1, 2);
    	g.insertarArista(1, 5);
    	g.insertarArista(1, 3);
    	g.insertarArista(2, 3);
    	g.insertarArista(3, 5);
    	g.insertarArista(3, 6);
    	g.insertarArista(4, 6);

    	ArrayList<ArrayList<Arista>> res = g.emparejamientos();

    	for(ArrayList<Arista> p : res) {
    		System.out.println(p);
    	}
     }
}