package modelo;

import java.util.ArrayList;

public class Lista<T> {
	protected ArrayList<T> lista;
	
	public Lista () {
		lista = new ArrayList<>();
	}
	
	public int getSize () {
		return 0;
		//Código
	}
	
	public void add(T t) {
		//código
	}
	
	public void borrar (T t) {
		//código
	}
	public T getAt(int position) {
		return null;
		//código
	}
	public void clear() {
		//código
	}
	public boolean isEmpty() {
		return false;
		//código
	}
	public ArrayList<T> getArrayList(){
		ArrayList<T> arrlist = new ArrayList<>(lista);
		return arrlist;
	}
}
