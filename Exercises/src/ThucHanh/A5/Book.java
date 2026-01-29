package ThucHanh.A5;

import java.util.List;

public class Book {
    private String title, author;
    private int page;
    private List<String> chapter;

    public Book(String title, String author, int page, List<String> chapter) {
        this.title = title;
        this.author = author;
        this.page = page;
        this.chapter = chapter;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\t\tBOOK INFORMATION\n");
        sb.append("Title:\t").append(title).append("\n");
        sb.append("Author:\t").append(author).append("\n");
        sb.append("Page:\t").append(page).append("\n");
        sb.append("Chapter:\n");
        for (int i = 0; i < chapter.size(); i++) {
            sb.append("\t").append(i + 1).append(". ").append(chapter.get(i)).append("\n");
        }
        return sb.toString();
    }
}
