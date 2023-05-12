package dekoracja;

/**
 * Main class
 *
 * @author Mateusz Pysera
 * @version 1.0
 * @since JDK 19
 * @see <a href=
 *      "https://pl.wikipedia.org/wiki/Decorator_(wzorzec_projektowy)">Decorator</a>
 */
public class Main {

    /**
     * Main method
     * 
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        Book b = new Book("J. K. Rowling", "Harry Potter and the Philosopher's Stone", 223);
        NormalCoverBook bu = new NormalCoverBook(b);
        System.out.println("Book " + b);
        System.out.println("Book with normal cover " + bu);
        b.setPages(100);
        NormalCoverBook double_cover = new NormalCoverBook(bu);
        System.out.println("Double cover " + double_cover);
        SolidCoverBook solid_cover = new SolidCoverBook(bu);
        System.out.println("Solid cover " + solid_cover);
        DecorativeCoverBook decorative_cover = new DecorativeCoverBook(bu);
        System.out.println("Decorative cover " + decorative_cover);
    }
}