import java.util.ArrayList;
public class GenericStack<T> {

    private ArrayList<T> stack;
    private int size;

   public GenericStack(){
       stack = new ArrayList<>();
       size = 0;
   }

    public int size(){
        return stack.size();
    }

    public void push(T item){

        this.stack.add(item);
        size++;
    }

    public T pop(){
        T elements = stack.remove(stack.size()-1);
        size--;
        return elements;
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }

    public T peek(){
        return stack.get(stack.size()-1);
    }

}
