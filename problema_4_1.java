public class problema_4_1 <T>{
	private Node<T> first;// primera de la lista 
	private int size;// tamañano de la lista
	// metodos 
	// costructor de la lista
	problema_4_1(){
		first=null;
		size=0;
	}
	public int size(){// tamaño de la lista 
		return size;
	}
	public boolean isEmpty(){// saber si mi lista esta vacio 
		return(size==0);
	}
	public void add(T v){// agregar un elemento a la lista
		Node<T> nuevo = new Node<T>(v, null);
		if (isEmpty()){
			first=nuevo;
		}else {
			Node<T> aux = first;
			while(aux.getNext()!=null){
				aux=aux.getNext();
			}
			aux.setnext(nuevo);
		}
		size++;
	}
	public T get(){// mostrar un elemento de la lista 
		if(isEmpty()){
			return null;
		}
		Node<T> aux =first;
		while(aux.getNext()!=null){
			aux=aux.getNext();
		}
		return aux.getValue();
	}
	public void remove(){// elimina el elemento de una lista
		if(isEmpty()){
			return;
		}
		if(size==1){
			first=null;
		}else{
			Node<T> aux=first;
			for (int i=0;i<size-2;i++){
				aux=aux.getNext();
				aux.setnext(null);
			}
		}
		size--;
	}




public class Node<T> {
	T data; 
	Node<T> nextNode;
	Node(T v,Node<T> n){
		data=v;
		nextNode=n;
	}
	// getters y setters
	public T getValue (){
		return data;
	}
	 public Node<T> getNext(){
		return nextNode;
	 }
	 public void setvalue ( T v){
		data=v;
	 }
	 public void setnext(Node<T> n){
		nextNode=n;
	 }


}
}