package Lesson_1;

public class BaseAnimal {
    String Name, FurColor, Height;
    Integer Age;

    public BaseAnimal(String name, String fur, String height, Integer age){
        this.Name = name;
        this.FurColor = fur;
        this.Height = height;
        this.Age = age;
    }
    public String Voice(){
        return "0";
    }

}
