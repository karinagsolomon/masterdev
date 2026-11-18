package interfaces;

public class Library extends Book{
    public static void main(String[] args) {
        Product book = new Book();
        book.setName("Martha Stewart");
        System.out.println(book.getName());
    }
}
