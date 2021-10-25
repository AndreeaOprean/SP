public class Image {
    public String name;

    public Image(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Image: " + this.name;
    }
}
