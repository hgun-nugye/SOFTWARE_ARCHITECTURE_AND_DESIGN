package ThucHanh.A5;

public class MainBook {
    public static void main(String[] args) {
        Book book = new BookBuilder()
                .setTitle("Design Patterns")
                .setAuthor("Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides")
                .setPage(395)
                .addChapter("Chapter 1: Introduction")
                .addChapter("Chapter 2: Structural Patterns")
                .addChapter("Chapter 3: Behavioral Patterns")
                .build();

        System.out.println(book);
    }
}
