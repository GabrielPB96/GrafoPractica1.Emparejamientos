import java.util.ArrayList;
import java.util.HashMap;
public class Grafo{
    private HashMap<Integer, ArrayList<Integer>> grafo;
    private boolean dirigido;
    private int cantVertices, cantAristas, cantLazos;

    public Grafo(boolean dirigido) {
        cantVertices = 0;
        cantAristas = 0;
        cantLazos = 0;
        this.dirigido = dirigido;
        grafo = new HashMap<>();
    }

    public void insertarVertice(int v) {
        grafo.put(v, new ArrayList<>());
        cantVertices++;
    }

    public void insertarArista(int origen, int destino) {
        ArrayList<Integer> ady = grafo.get(origen);
        ady.add(destino);
        if (!dirigido) {
            ArrayList<Integer> ady2 = grafo.get(destino);
            ady2.add(origen);
        }
        if (origen == destino) cantLazos++;
        cantAristas++;
    }

    public ArrayList<ArrayList<Arista>> emparejamientos() {
    	ArrayList<ArrayList<Arista>> res = new ArrayList<ArrayList<Arista>>();
    	ArrayList<Arista> arr = new ArrayList<Arista>();
    	boolean[] vis = new boolean[cantVertices];
    	for(Integer v : grafo.keySet()) {
    	   emparejar(v, arr, res, vis);
    	}
    	return res;
    }

    private void emparejar(int v, ArrayList<Arista> arr, ArrayList<ArrayList<Arista>> res, boolean[] visitados) {
    	for(Integer u : grafo.get(v)) {
			if(!visitados[u]) {
				visitados[v] = true;
				visitados[u] = true;
				arr.add(new Arista(v, u));
				for(int i=0;i<cantVertices;i++){
					if(!visitados[i]) {
						emparejar(i, arr, res, visitados);
					}
				}
				if(!sePuede(visitados) && !contains(arr, res)) res.add((ArrayList<Arista>)arr.clone());
				visitados[v] = false;
				visitados[u] = false;
				arr.remove(arr.size() - 1);
			}
		}
    }

    private boolean sePuede(boolean[] visitados) {
        for(int i = 0; i<visitados.length; i++) {
            if(!visitados[i]) {
                for(Integer e : grafo.get(i)) {
                    if(!visitados[e]) return true;
                }
            }
        }
        return false;
    }

    private boolean contains(ArrayList<Arista> arr, ArrayList<ArrayList<Arista>> res) {
    	for(ArrayList<Arista> c : res) {
    		if(arr.size() == c.size()) {
    			ArrayList<Arista> aux = (ArrayList<Arista>)arr.clone();
    			for(Arista p : c) {
    				if(aux.contains(p)) {
    					aux.remove(p);
    				}
    			}
    			if(aux.isEmpty()) return true;
    		}
    	}
    	return false;
    }
    
}