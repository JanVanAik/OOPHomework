package Lesson_1;

public class Cat extends BaseAnimal{
    String Voice;

    public Cat(String name, String fur, String height, Integer age, String voice){
        super(name, fur, height, age);
        this.Voice = voice;



    }
    public String Voice(){
        return super.Voice() + Voice;
    }

}
