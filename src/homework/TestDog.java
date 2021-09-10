package homework;

import java.lang.*;
public class TestDog {
    public static void main(String[] args){
        Dog d1 = new Dog("Фрося",3);
        Dog d2 = new Dog("Жучка", 8);
        Dog d3 = new Dog("Оскар");
        d3.setAge(5);

        System.out.println(d1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
    }
}
