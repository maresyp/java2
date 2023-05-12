package wydawnictwo;

import dekoracja.Book;

abstract class WydawnictwoFactory {
    public static WydawnictwoFactory getWydawnictwoFactory(String type) {
        return switch (type) {
            case "Adam Mickiewicz" -> new WydawnictwoPowiesciHistorycznych(type);
            case "Stephen King" -> new WydawnictwoThrillerow(type);
            case "Juliusz Slowacki" -> new WydawnictwoPoematow(type);
            default -> null;
        };
    }

    protected String author;

    public WydawnictwoFactory(String author) {
        this.author = author;
    }
    public abstract Book createBook(String title, int pages);
}

class WydawnictwoPowiesciHistorycznych extends WydawnictwoFactory {
    public WydawnictwoPowiesciHistorycznych(String author) {
        super(author);
    }

    public Book createBook(String title, int pages) {
        return new Book(this.author, title, pages);
    }
}

class WydawnictwoThrillerow extends WydawnictwoFactory {
    public WydawnictwoThrillerow(String author) {
        super(author);
    }

    public Book createBook(String title, int pages) {
        return new Book(this.author, title, pages);
    }
}

class WydawnictwoPoematow extends WydawnictwoFactory {
    public WydawnictwoPoematow(String author) {
        super(author);
    }

    public Book createBook(String title, int pages) {
        return new Book(this.author, title, pages);
    }
}