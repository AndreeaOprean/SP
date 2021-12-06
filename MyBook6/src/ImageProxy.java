public class ImageProxy implements Element, Visitee{
    public String url;
    public Image realImage;

    public Image loadImage()
    {
        if(realImage == null)
        {
            realImage = new Image(url);
        }
        return realImage;
    }

    public ImageProxy(String url) {
        this.url = url;
        realImage = null;
    }

    public void accept(Visitor v) {
        v.visit(this);
    }
}
