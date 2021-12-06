import java.util.ArrayList;
import java.util.List;

public class TableOfContents implements Element, Visitee{
    public List<String> contents = new ArrayList<String>();

    public TableOfContents(List<String> contents) {
        this.contents = contents;
    }

    public void accept(Visitor v) {
        v.visit(this);
    }
}
