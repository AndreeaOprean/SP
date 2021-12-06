public class Paragraph implements Element, Visitee {
    public String text;

    public Paragraph(String text) {
        this.text = text;
    }

    public void setAlignStrategy(AlignStrategy align) {
        align.render(this);
    }

    public void accept(Visitor v) {
        v.visit(this);
    }
}
