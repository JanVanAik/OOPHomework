package Lesson_1;
import javax.swing.plaf.nimbus.State;
import java.util.Random;

public class Lizard extends BaseAnimal{
    private String Voice;
    private Integer InvokeCounter = 0;
    private String[] LizardReaction = new String[]{"PSSSSS", "SHHHHHH", "....", "........",
            "ANCIENT GODS ARE WATCHING YOU", "psss", " PssssHSSHHH", "Meow?","...", "Lizard is not reacting"};


    public Lizard(String name, String height, Integer age, String voice){
        super(name, height, age);
        this.Voice = voice;

    }
    public String Voice(){
        return super.Voice() + Voice;
    }
    public void TouchLizard(){
        System.out.println(LizardReaction[(int)Math.floor(Math.random() * LizardReaction.length)]);
    }

    public void InvokeMightyChtulhu(){
        if(InvokeCounter == 7){
            System.out.println("the deep sees are open..... " +
                    "The lord of all worlds is coming...." +
                    "This day shall be cursed by the mortals...." +
                    "BECAUSE THE GREAT CHTULHU IS AWAKEN!  ");
            InvokeCounter = -7;
        } else {
            System.out.println("...");
            InvokeCounter +=1;
        }

    }
}
