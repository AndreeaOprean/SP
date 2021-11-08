public class Image implements Element{
    public String url;

    public Image(String url) {
        this.url = url;
    }

    @Override
    public void print(){
        System.out.println("Image with name: "+this.url);
    }
}
