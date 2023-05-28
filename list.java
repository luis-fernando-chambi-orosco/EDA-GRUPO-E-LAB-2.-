public class list<T> {
    private Node<T> root; //referencia sobre el nodo inicial 
    private int size;// tamaña  de la lista 

    public list() {
        root = null;
        size = 0;
    }

    private static class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }
}