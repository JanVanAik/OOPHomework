package Lesson_1;

public class Kid extends BaseAnimal{
    String Voice;
    private Integer IphoneCounter = 0;

    public Kid(String name, String height, Integer age, String voice){
        super(name, height, age);
        this.Voice = voice;

    }
    public String Voice(){
        return super.Voice() + Voice;
    }

    public String getIphoneCounter() {
        return " This child has " + IphoneCounter.toString() + " Ihpones";
    }

    public void DemandIphone(){
        IphoneCounter +=1;
    }
}

