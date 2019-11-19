import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Books book1;
    private Books book2;
    private Books book3;
    private Books book4;
    private Library library;

    @Before
    public void before(){
        this.library = new Library();
        book1 = new Books("Harry Potter", "J.K.", "Magic");
        book2 = new Books("Cats", "Bob C", "Nature");
        book3 = new Books("Dogs", "Lois M", "Nature");
        book4 = new Books("Harry Potter2", "J.K.", "Magic");

    }

    @Test
    public void shouldStartEmpty(){
        assertEquals(0, library.countBooks());
    }

    @Test
    public void canAddOneBook(){
        library.addOneBooks(book1);
        assertEquals(1, library.countBooks());
    }

    @Test
    public void canAddMultipleBooks(){
        library.addOneBooks(book1);
        library.addOneBooks(book2);
        library.addOneBooks(book3);
        assertEquals(3, library.countBooks());
    }

    @Test
    public void booksStockFull(){
        library.addOneBooks(book1);
        library.addOneBooks(book2);
        library.addOneBooks(book3);
        library.addOneBooks(book4);
        assertEquals(3, library.countBooks());
    }
}
