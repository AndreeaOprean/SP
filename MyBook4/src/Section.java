import java.util.ArrayList;
import java.util.List;

public class Section implements Element{
    public String title;
    public List<Element> elements = new ArrayList<Element>();

    public Section(String title) {
        this.title = title;
    }

    public void addElement(Element e){
        elements.add(e);
    }

    public void removeElement(Element e){
        elements.remove(e);
    }

    @Override
    public void print() {
        System.out.println(title);
        for (Element e : elements) {
            e.print();
        }
    }
}
