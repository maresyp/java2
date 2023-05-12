package wydawnictwo;

import dekoracja.Book;

public class Main {
    public static void main(String[] args) {
        WydawnictwoFactory wydawnictwo = WydawnictwoFactory.getWydawnictwoFactory("Adam Mickiewicz");
        Book k = wydawnictwo.createBook("Dziady", 130);
        System.out.println(k);
    }
}
