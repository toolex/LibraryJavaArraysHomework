import java.util.ArrayList;

public class Library {
    private ArrayList<Books> library;

    public Library(){
        this.library = new ArrayList<Books>();
    }

    public int countBooks() {
        return library.size();
    }

    public void addOneBooks(Books book) {
        Integer capacity = 3;
        if (this.countBooks() < capacity) {
            this.library.add(book);
        }
    }
}
