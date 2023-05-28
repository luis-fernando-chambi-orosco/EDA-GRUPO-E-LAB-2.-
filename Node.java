public class Node<T> {
	//propiedades 
	T data; // informacion almacenada en el nodo
	Node<T> nextNode;// referencia al siguiente nodo

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

