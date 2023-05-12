package dekoracja;

public abstract class BookDecorator implements BookInterface {
    protected BookInterface decorateBook;

    public BookDecorator(BookInterface decorateBook) {
        this.decorateBook = decorateBook;
    }
}
