import java.util.ArrayList;
import java.util.List;

public class Chapter {
    public String name;
    public List<SubChapter> subchapters = new ArrayList<SubChapter>();

    public Chapter(String name) {
        this.name = name;
    }

    public int createSubChapter(String s) {
        SubChapter sc = new SubChapter(s);
        this.subchapters.add(sc);
        return subchapters.indexOf(sc);
    }

    public SubChapter getSubChapter(int indexSubChapterOneOne) {
        SubChapter sc = subchapters.get(indexSubChapterOneOne);
        return sc;
    }

    @Override
    public String toString() {
        return "Chapter: " + name + " - " +
                " Subchapters: " + subchapters + '\n';
    }
}
