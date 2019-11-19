import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BooksTest {
    private Books book1;
    private Books book2;
    private Books book3;

    @Before
    public void before(){
        book1 = new Books("Harry Potter", "J.K.", "Magic");
        book2 = new Books("Cats", "Bob C", "Nature");
        book3 = new Books("Dogs", "Lois M", "Nature");
    }

    @Test
    public void shouldHaveNameAuthorAndGenre(){
        assertEquals("Harry Potter", book1.getName());
        assertEquals("Bob C", book2.getAuthor());
        assertEquals("Nature", book3.getGenre());
    }
}
