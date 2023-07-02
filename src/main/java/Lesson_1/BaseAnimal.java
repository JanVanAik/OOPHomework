package Lesson_1;

public class BaseAnimal {
    private String Name, Height;
    private Integer Age;

    protected BaseAnimal(String name, String height, Integer age){
        this.Name = name;
        this.Height = height;
        this.Age = age;
    }
    protected String Voice(){
        return "my voice is : ";
    }
    public void GetInfo(){

    }

}
