import java.util.ArrayList;
import java.util.List;

public class Section implements Element, Visitee{
    public String title;
    public List<Element> elements = new ArrayList<Element>();

    public Section(String title) {
        this.title = title;
    }

    public void add(Element e){
        elements.add(e);
    }

    public void remove(Element e){
        elements.remove(e);
    }

    public void accept(Visitor v) {
        v.visit(this);
        for (Element e : elements) {
            e.accept(v);
        }
    }
}
