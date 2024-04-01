package homework_34;

import java.util.ArrayList;
import java.util.Objects;

public class MyCollection {
    private ArrayList<Object> list;

    public MyCollection(){
        list = new ArrayList<>();
    }


    public void add(Object element){
        list.add(element);
    }

    public void add( int index, Object element){
        list.add(element);
    }

    public void remove(int index) {
        list.remove(index);

    }

    public int size() {
        return list.size();
    }
}
