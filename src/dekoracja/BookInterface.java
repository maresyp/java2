package dekoracja;

public interface BookInterface {
    public String getAuthor();

    public String getTitle();

    public int getPages();

    public void setAuthor(String author);

    public void setTitle(String title);

    public void setPages(int pages);

    @Override
    public String toString();
}
