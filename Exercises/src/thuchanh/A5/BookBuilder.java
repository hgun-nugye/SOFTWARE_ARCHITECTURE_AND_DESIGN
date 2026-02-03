package thuchanh.A5;

import java.util.ArrayList;
import java.util.List;

public class BookBuilder {
    private String title, author;
    private int page;
    private List<String> chapter;

    public BookBuilder(){
        this.chapter = new ArrayList<>();
    }

    public BookBuilder setTitle(String title) {
        this.title = title;
        return this;
    }

    public BookBuilder setAuthor(String author) {
        this.author = author;
        return this;
    }

    public BookBuilder setPage(int page) {
        this.page = page;
        return this;
    }

    public BookBuilder addChapter(String chapter) {
        this.chapter.add(chapter);
        return this;
    }

    public Book build() {
        return new Book(title, author, page, chapter);
    }
}
