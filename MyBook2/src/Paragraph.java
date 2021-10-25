public class Paragraph {
    public String name;

    public Paragraph(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Paragraph: " + this.name;
    }
}
