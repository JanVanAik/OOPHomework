package Lesson_1;

public class Dog extends BaseAnimal{
    String Voice, FurColor;

    public Dog(String name, String fur, String height, Integer age, String voice){
        super(name, height, age);
        this.FurColor = fur;
        this.Voice = voice;


    }
    public String Voice(){
        return super.Voice() + Voice;
    }
    public String Eat(Integer amt){
        return "The dog ate " + amt + " food! Doggo ez happeh";
    }
}
