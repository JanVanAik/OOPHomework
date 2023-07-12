package Lesson_4;
import java.util.ArrayList;
import java.util.List;

public class task_1 {
    public static void main(String[] args) {
//        Box<String> stringBox = new Box<>(); // не должно компилироваться

        Box<Orange> orangeBox = new Box<>();
        orangeBox.add(new Orange(1));
        orangeBox.add(new Orange(2));
//        orangeBox.add(new Apple(2));       // не должно компилироваться
//        orangeBox.add(new GoldenApple(2)); // не должно компилироваться

        System.out.println(orangeBox.getWeight()); // 3

        Box<Apple> appleBox = new Box<>();
        appleBox.add(new Apple(1));
        appleBox.add(new GoldenApple(2)); // допустимый вариант
        System.out.println(appleBox.getWeight()); // 3

        Box<GoldenApple> goldenAppleBox = new Box<>();
        goldenAppleBox.add(new GoldenApple(5)); // допустимый вариант
//        goldenAppleBox.add(new Apple(5));       // не должно компилироваться
        System.out.println(goldenAppleBox.getWeight()); // 5

        goldenAppleBox.moveTo(appleBox); // допустимый вариант
//        appleBox.moveTo(goldenAppleBox); // не должно компилироваться
//        orangeBox.moveTo(appleBox);      // не должно компилироваться

        Box<Orange> orangeBox2 = new Box<>();
        orangeBox.moveTo(orangeBox2);
        System.out.println(orangeBox.getWeight()); // 0
        System.out.println(orangeBox2.getWeight()); // 3
    }

    static class Box <E extends Fruit> {

        List <E> FruitBox;
        public Box(){
            this.FruitBox = new ArrayList<>();

        }
        public void add(E fruit){
            FruitBox.add(fruit);
        }

        public Integer getWeight(){
            Integer result = 0;
            for (Fruit fruit: this.FruitBox) {
                result += fruit.getWeight();
            }
            return result;
        }
        public void moveTo(Box<? super E> box ){
            box.FruitBox.addAll(this.FruitBox);
            this.FruitBox.clear();
        }

    }

    static class Fruit {
        private final int weight;

        public Fruit(int weight) {
            this.weight = weight;
        }

        public int getWeight() {
            return weight;
        }
    }

    static class Orange extends Fruit {
        public Orange(int weight) {
            super(weight);
        }
    }

    static class Apple extends Fruit {
        public Apple(int weight) {
            super(weight);
        }
    }

    static class GoldenApple extends Apple {
        public GoldenApple(int weight) {
            super(weight);
        }
    }

}

