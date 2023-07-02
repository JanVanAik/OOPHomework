package Lesson_1;

public class Dog extends BaseAnimal{
    String Voice;

    public Dog(String name, String fur, String height, Integer age, String voice){
        super(name, fur, height, age);
        this.Voice = voice;


    }
    public String Voice(){
        return super.Voice() + Voice;
    }
    public String Eat(Integer amt){
        return "The dog ate " + amt + " food! Doggo ez happeh";
    }
}
