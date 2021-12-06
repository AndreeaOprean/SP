public class Table implements Element, Visitee{
    public String title;

    public Table(String title) {
        this.title = title;
    }

    public void accept(Visitor v) {
        v.visit(this);
    }
}
