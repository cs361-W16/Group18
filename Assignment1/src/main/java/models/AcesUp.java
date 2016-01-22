package models;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by michaelhilton on 1/14/16.
 */
public class ToDoList implements Serializable {
    public java.util.List<String> todoItems;
    public String item;
    public String action;


    public ToDoList(){
        todoItems = new ArrayList<String>();
    }

    public void addTodoItem(String item) {
        todoItems.add(item);
    }

    public int numberOfItems() {
        return todoItems.size();
    }

    public String lastItemAdded() {
        return todoItems.get(todoItems.size()-1);
    }

}
