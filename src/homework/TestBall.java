package homework;

import java.lang.*;
public class TestBall {
    public static void main(String[] args){
        Ball ball1= new Ball(1.8,"голубой");
        Ball ball2= new Ball(2.2,"красный");
        Ball ball3= new Ball(3.5,"зелёный");
        ball1.setColor("белый");

        ball1.examination();
        ball2.examination();
        ball3.examination();
    }
}
