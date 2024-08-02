public class LinkedList {
    private Node first;
    private int count;

    public LinkedList() {
        this.first = null;
        this.count = 0;
    }

    public int getSize() {
        return this.count;
    }

    public Node getFirst() {
        return this.first;
    }

    public void addFirst(String item) {
        Node newN = new Node(item, first);
        first = newN;
        count++;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public void enumerate() {
        Node curr = first;
        while (curr != null) {
            System.out.print(curr.getData() + "-->");
            curr = curr.getNext();
        }
        System.out.println();
    }

    public String getData(int position) {
        Node curr = first;

        if (position < 0 || position >= count) {
            return null;
        } else {
            for (int i = 0; i < position; i++)
                curr = curr.getNext();
        }
        return curr.getData();
    }


    public void insertAt(String  item, int index){
        if (index<0||index>count){
            System.out.println("Error. Index out of bounds");
            return;
        }
        else{
            if (index==0){
                addFirst(item);
                return;
            }
            Node prev=first;
            for(int i=0; i<index-1; i++)
                prev=prev.getNext();
            Node newN = new Node(item, prev.getNext());
            prev.setNext(newN);
            count++;
        }
    }

    //method8 - SEARCH METHOD: return the index of the first occurrence of a given item
    //if item is not found, return -1
    public int indexOf(String item){
        Node curr = first;
        for(int i=0; i<count; i++){
            if (item.equals(curr.getData()))
                return i; //item found; break out of the loop
            curr = curr.getNext();
        }
        return -1;
    }

    //method9 - remove an item at a given index
    public String removeAt(int index){
        String  result = null;
        if (index<0||index>=count){
            System.out.println("Can't remove. Index out of bounds");
            return null;
        }
        if (index==0) //first node has to be removed
        {
            result = first.getData();
            first = first.getNext();
        }
        else //not the first node
        {
            Node prev = first;
            for (int i=0; i<index-1; i++)
                prev = prev.getNext();
            result = prev.getNext().getData();
            prev.setNext(prev.getNext().getNext());
        }
        count--;
        return result;
    }
}






