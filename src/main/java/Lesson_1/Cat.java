package Lesson_1;

public class Cat extends BaseAnimal{
    String Voice, FurColor;

    public Cat(String name, String fur, String height, Integer age, String voice){
        super(name, height, age);
        this.FurColor = fur;
        this.Voice = voice;


    }
    public String Voice(){
        return super.Voice() + Voice;
    }

    public String Eat(Integer amt){
        return "The cat ate " + amt + " food! You probably will not be executed today";
    }

}
