package homework;

import java.lang.*;
public class Book {
    private int pages;
    private String color;

    public Book(int pages, String color) {
        this.pages = pages;
        this.color = color;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Book{" +
                "pages=" + pages +
                ", color='" + color + '\'' +
                '}';
    }

    public void examination (){
        System.out.println("Количество страниц равно " +pages);
        System.out.println("Цвет книги " +color);
    }
}
