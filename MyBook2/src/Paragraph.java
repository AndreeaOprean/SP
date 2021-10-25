public class Paragraph {
    public String text;

    public Paragraph(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Paragraph: " + this.text;
    }
}
