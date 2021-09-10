package homework;

import java.lang.*;
public class TestBook {
    public static void main(String[] args){
        Book book1= new Book(24,"красный");
        Book book2= new Book(115, "синий");
        Book book3= new Book(35, "сиреневый");
        book3.setColor("фиолетовый");

        book1.examination();
        book2.examination();
        book3.examination();
    }
}
