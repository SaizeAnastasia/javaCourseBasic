package homework_40;

import java.util.List;

public class BookTask10 {
        private String title;
        private String author;
        private List<String> tags;

    public BookTask10(String title, String author, List<String> tags) {
        this.title = title;
        this.author = author;
        this.tags = tags;
    }

    public List<String> getTags() {
            return tags;
        }
    }

