package Lesson_3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        Box bo1 = new Box(3);
        Box bo2 = new Box(2);
        Box bo3 = new Box(99);
        Box bo4 = new Box(11);
        Box bo5 = new Box(18);
        Box bo6 = new Box(13);
        Box bo7 = new Box(12);
        Container cont1 = new Container(new ArrayList(Arrays.asList(bo1, bo2, bo3, bo4, bo5)));
        Container cont2 = new Container(new ArrayList(Arrays.asList(bo6, bo7)));

//        Comparable
        System.out.println(cont1.compareTo(cont2));

//        Counter
        ContainerCountComparator containerComp = new ContainerCountComparator();
        System.out.println(containerComp.compare(cont1, cont2));

//        Iterator
        iterator(cont1);
    }

    public static class ContainerCountComparator implements Comparator<Container> {
        @Override
        public int compare(Container cont1, Container cont2) {
            return Integer.compare(cont1.getSize(), cont2.getSize());
        }
    }

    static void iterator (Container cont) {
        for (Box box : cont) {
            System.out.print(box +"\n");
        }
    }
}
