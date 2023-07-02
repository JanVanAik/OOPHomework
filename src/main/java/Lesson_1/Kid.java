package Lesson_1;

public class Kid extends BaseAnimal{
    String Voice;

    public Kid(String name, String fur, String height, Integer age, String voice){
        super(name, fur, height, age);
        this.Voice = voice;

    }
    public String Voice(){
        return super.Voice() + Voice;
    }

    public
}

