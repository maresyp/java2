package dekoracja;

public class NormalCoverBook extends BookDecorator {

    public NormalCoverBook(BookInterface decorateBook) {
        super(decorateBook);
    }

    @Override
    public String getAuthor() {
        return decorateBook.getAuthor();
    }

    @Override
    public String getTitle() {
        return decorateBook.getTitle();
    }

    @Override
    public int getPages() {
        return decorateBook.getPages();
    }

    @Override
    public void setAuthor(String author) {
        decorateBook.setAuthor(author);
    }

    @Override
    public void setTitle(String title) {
        decorateBook.setTitle(title);
    }

    @Override
    public void setPages(int pages) {
        decorateBook.setPages(pages);
    }

    @Override
    public String toString() {
        return "(" + decorateBook.toString() + ")";
    }
}
