public class Image {
    public String imangeName;

    public Image(String name) {
        this.imangeName = name;
    }

    @Override
    public String toString() {
        return "Image: " + this.imangeName;
    }
}
