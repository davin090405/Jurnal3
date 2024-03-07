import java.util.NoSuchElementException;

public class SingleLinkList<E> {
    private Node<E> firstNode;
    private Node<E> lastNode;
    private String name;

    public SingleLinkList(){
        this("Linked list");
    }

    public SingleLinkList(String listName){
        name = listName;
        firstNode = lastNode = null;
    }
    public void insertAtFront(E insertItem){
        Node<E> newNode = new Node<E>(insertItem);
        if(isEmpty()){
            firstNode = lastNode = new Node<E>(insertItem);
        }
        else{
            newNode.next = firstNode;
            firstNode = newNode;
        }
    }
    public E removeFromBack() throws NoSuchElementException{
        if(isEmpty()){
            throw new NoSuchElementException(name+" Kosong");
        }
        E removedItem = lastNode.data;

        if(firstNode == lastNode){
            firstNode = lastNode = null;
        }
        else{
            Node<E> current = firstNode;
            while(current.next != lastNode){
                current = current.next;
            }
            lastNode = current;
            current.next = null;
        }
        return removedItem;
    }
    private boolean isEmpty(){
        return firstNode == null;
    }
    public void print(){
        if(isEmpty()){
            System.out.printf("The %s is %n", name);
            return;
        }
        System.out.printf("The %s is %n", name);
        Node<E> current = firstNode;
        while(current!=null){
            System.out.printf("%s",current.data);
            current = current.next;
        }
        System.out.println();
    }
}