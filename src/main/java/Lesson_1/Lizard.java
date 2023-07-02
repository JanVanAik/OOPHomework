package Lesson_1;
import java.util.Random;

public class Lizard extends BaseAnimal{
    String Voice;
    String[] LizardReaction = new String[]{"PSSSSS", "SHHHHHH", "....", ""};


    public Lizard(String name, String fur, String height, Integer age, String voice){
        super(name, fur, height, age);
        this.Voice = voice;

    }
    public String Voice(){
        return super.Voice() + Voice;
    }
    public String TouchLizard(){
        return " PSSSSSS";
    }
}
