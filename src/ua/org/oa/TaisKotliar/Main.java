package ua.org.oa.TaisKotliar;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //1
        System.out.println(Test.calculateMax(new int[]{1, 2, 4, 5, 6, 3}));
        //2
        System.out.println(Test.calculateAverage(new int[]{4, 1, 5, 1, 2}));
        //3
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("coffee");
        arrayList.add("home");
        arrayList.add("chocolate");
        System.out.println(Test.makeCapitalLetters(arrayList));
        //4
        System.out.println(Test.calculateEven());
        //5
        System.out.println(Test.longestSequence("Some example first here you can see.", "Can example first be here?"));
        //6
        Loop.multi(2);
        //7
        Animal animal = new Animal();
        animal.walk();
        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();
        //8
        MyBook myBook = new MyBook();
        myBook.setTitle("The Hobbit");
        System.out.println(myBook.getTitle());
        //9
        MyCalculator calculator = new MyCalculator();
        try {
            calculator.power(-1, -2);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
