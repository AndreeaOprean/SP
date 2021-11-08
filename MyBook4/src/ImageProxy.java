public class ImageProxy implements Element{
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

    @Override
    public void print() {
        loadImage();
        realImage.print();
    }
}
