package Lesson_3;

public class Box extends Container{
    private int weight
            ;
    public Box(int weight){
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Weight=" + weight;
    }

    public int getBoxWeight() {
        return weight;
    }


}