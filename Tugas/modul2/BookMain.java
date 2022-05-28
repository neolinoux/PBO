package Tugas.modul2;

public class BookMain {
    public static void main(String[] args) {
        Author[] authors = {
            new Author("Budi", "budi@gmail.com", 'M'),
            new Author("Yono", "yono@gmail.com", 'M'),
            new Author("Siti", "siti@gmail.com", 'F')
        };
        Book book = new Book("Java", authors, 10000, 10);
        System.out.println(book);
        book.setPrice(20000);
        System.out.println(book);
        book.getAuthorNames();
    }
}
