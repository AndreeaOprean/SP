import java.util.ArrayList;
import java.util.List;

public class GenerateToC implements Visitor{
    public List<String> contents = new ArrayList<String>();

    @Override
    public void visit(Book b) {
        contents.add(b.title);
    }

    @Override
    public void visit(Section s) {
        contents.add(s.title);
    }

    @Override
    public void visit(TableOfContents toc) {

    }

    @Override
    public void visit(Paragraph p) {
        contents.add(p.text);
    }

    @Override
    public void visit(ImageProxy i) {
        contents.add(i.realImage.url);
    }

    @Override
    public void visit(Image i) {
        contents.add(i.url);
    }

    @Override
    public void visit(Table t) {
        contents.add(t.title);
    }

    public List<String> getToC() {
        return contents;
    }
}
