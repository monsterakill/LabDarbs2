/**
 * Created by Admin on 10.05.2016.
 */
public class Lab {
    private Node HeadElement;
    public int Variant(int i){
        int get = i % 2;
        return get;
    }
    public void add(Integer data){
        if(HeadElement == null) {
            HeadElement = new Node(data);
            return;
        }
        tail().next = new Node(data);
    }

    private Node tail() {
        Node tail = HeadElement;
        while(tail.next != null){
            tail = tail.next;
        }
        return tail;
    }

    public int get(int index) {
        Node current = HeadElement;
        int count = 0;
        while(current != null){
            if(count == index) return current.data;
            count++;
            current = current.next;
        }
        assert(false);
        return 0;
    }



    private static class Node {
        private Node next;
        private Integer data;

        public Node(Integer data) {
            this.data = data;
        }
    }
}
