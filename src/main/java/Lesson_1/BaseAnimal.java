package Lesson_1;

public class BaseAnimal {
    String Name, FurColor, Height;
    Integer Age;

    protected BaseAnimal(String name, String fur, String height, Integer age){
        this.Name = name;
        this.FurColor = fur;
        this.Height = height;
        this.Age = age;
    }
    protected String Voice(){
        return "my voice is : ";
    }

}
