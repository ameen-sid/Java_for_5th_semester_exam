package Tutorials;
import java.util.Vector;

public class VectorClass {

    public void mainFunction() {

        Vector<String> list = new Vector<>();

        // capacity
        int capacity = list.capacity();
        System.out.println("Capacity: " + capacity);

        // add
        list.add("Suraj");
        list.add("Ram");
        System.out.println("Vector after add: " + list);

        // add at index
        list.add(1, "Adnan");
        System.out.println("Vector after add at index 1: " + list);

        // get
        String element = list.get(1);
        System.out.println("Element at index 1: " + element);

        // set
        list.set(2, "Sita");
        System.out.println("Vector after set at index 2: " + list);

        // remove from element
        list.remove("Sita");
        System.out.println("Vector after remove Sita: " + list);

        // remove from index
        list.remove(1);
        System.out.println("Vector after remove from index 1: " + list);

        // size
        int size = list.size();
        System.out.println("Size of vector: " + size);

        // isEmpty
        boolean isEmpty = list.isEmpty();
        if(isEmpty) System.out.println("List is empty");
        else System.out.println("List isn't empty");

        // contains
        boolean isContains = list.contains("Suraj");
        System.out.println(isContains);

        // clear
        list.clear();
        if(list.isEmpty()) System.out.println("List is clear");


        // addElement
        list.addElement("Ram");
        list.addElement("Sham");
        list.addElement("Sita");
        list.addElement("Geeta");
        System.out.println("Vector Elements are: " + list);

        // insertElementAt
        list.insertElementAt("Adnan", 1);
        System.out.println("Vector Elements after insert element: " + list);

        // removeElement
        list.removeElement("Sham");
        System.out.println("Vector Elements after remove Sham: " + list);

        // removeElementAt
        list.removeElementAt(3);
        System.out.println("Vector Elements after remove index 3: " + list);

        // removeAllElements
        list.removeAllElements();
        System.out.println("Vector after remove all elements: " + list);
    }
}
