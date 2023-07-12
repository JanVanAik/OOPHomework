package Lesson_3;

import java.util.*;


public class Container implements Iterable<Box>, Comparable<Container>{

    private int id;
    static int nextId=0;
    protected ArrayList<Box> BoxList;

    protected Container(List<Box> boxList, int id) {
        this.BoxList = new ArrayList<>(boxList);
        this.id = id;
    }
    protected Container(List<Box> ls) {
        this(ls, nextId++);
    }

    protected int getId() {
        return id;
    }

    public Container() {
        this.BoxList = new ArrayList<>();
    }

    @Override
    public Iterator<Box> iterator() {
        return BoxList.iterator();
    }

    @Override
    public int compareTo(Container cont) {
        return Integer.compare(this.getWeight(), cont.getWeight());
    }
    public int getWeight() {
            int total = 0;
            for (Box box: this.BoxList){
                total += box.getBoxWeight();
            }
        return total;
    }


    public int getSize() {
        return BoxList.size();
    }
}
