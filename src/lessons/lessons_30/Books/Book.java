package lessons.lessons_30.Books;

import java.util.Objects;

class Book implements Comparable<Book> {
    private int id;
    private String name;

    public Book(int id, String name) {
        this.id = id;
        this.name = name;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    @Override
    public int compareTo(Book o) {
        if (this.id == o.id) {
            return this.name.compareTo(o.name);
        }
        return this.id - o.id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Book))
            return false;
        Book other = (Book) obj;
        return this.id == other.id && this.name.equals(other.name);
    }

    public int hashCode() {
        return Objects.hash(id, name);

    }

}
