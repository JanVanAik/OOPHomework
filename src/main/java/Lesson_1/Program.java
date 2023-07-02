package Lesson_1;

import java.util.Random;

public class Program {
    public static void main(String[] args) {
        Lizard lizard1 = new Lizard("Onyxia", "2sm", 9999, "...");
        Lizard lizard2 = new Lizard("Deathwing", "2sm", 9999, "...");
        Lizard lizard3 = new Lizard("Malygos", "2sm", 9999, "...");
        Dog dog1 = new Dog("bobik", "2sm", "50sm", 9, "Woof Brother");
        Kid kid1 = new Kid("Pietro", "2sm", 9999, "...");
        Random random = new Random();
        Cat[] cats = new Cat[5];
        for (int i = 0; i < 5; i++) {
            cats[i] = new Cat("Johnny", "black", "133sm", 10, "meow");
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(cats[i].Eat(5));
        }
        lizard1.TouchLizard();
        for (int j = 0; j < 8; j++) {
            lizard2.InvokeMightyChtulhu();
        }
        System.out.println(lizard3.Voice());
        kid1.DemandIphone();
        kid1.DemandIphone();
        kid1.DemandIphone();
        kid1.DemandIphone();
        kid1.DemandIphone();
        System.out.println(kid1.getIphoneCounter());
        System.out.println(dog1.Voice());



    }
}
