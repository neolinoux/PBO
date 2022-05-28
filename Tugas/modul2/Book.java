package Tugas.modul2;

import java.util.Arrays;

public class Book{
    private String name;
    private double price;
    private Author[] authors;
    private int qty;

    Book(String name, Author[] authors, double price){
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    Book(String name, Author[] authors, double price, int qty){
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public void getAuthors() {
        int i = 0;
        while (i <= authors.length - 1) {
            System.out.println("Author "+(i+1)+" : "+authors[i]+"");
            i++;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void getAuthorNames(){
        int i = 1;
        for (Author author : authors) {
            System.out.println("Authors "+ i + " : " + author.getName());
            i++;
        }
    }

    @Override
    public String toString() {
        return "Book [name=" + name + ", authors={Author" + Arrays.toString(authors) + ", price=" + price + ", qty=" + qty + "]";
    }
}
