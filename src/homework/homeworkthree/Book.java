package homework.homeworkthree;

import java.util.Objects;
import java.util.Random;

public class Book {

    Random randomizer = new Random();

    boolean electron;
    int page;
    String name;
    String authorName;

    public Book (){    }

    public Book (boolean electron, int page, String name, String authorName) {
        this.electron = electron;
        this.page = page;
        this.name = name;
        this.authorName = authorName;

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        //if(this.name == book.name) return  true;
        return  Objects.equals(name, book.name) && Objects.equals(authorName, book.authorName);

    }

    @Override
    public int hashCode() {
        return Objects.hash(name, authorName);
    }

}
