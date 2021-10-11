import java.util.ArrayList;
import java.util.List;

public class Book {
    public String title;
    public List<Author> authors = new ArrayList<Author>();
    public List<Chapter> chapters = new ArrayList<Chapter>();

    public Book(String title) {
        this.title = title;
    }

    public void addAuthor(Author rpGheo) {
        this.authors.add(rpGheo);
    }

    public int createChapter(String s) {
        Chapter c = new Chapter(s);
        this.chapters.add(c);
        return chapters.indexOf(c);
    }

    public Chapter getChapter(int indexChapterOne) {
        Chapter c = chapters.get(indexChapterOne);
        return c;
    }

    @Override
    public String toString() {
        return "Book: " + title + '\n' +
                "Authors: " + authors + '\n' +
                "Chapters: " + chapters + '\n';
    }
}
