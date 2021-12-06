import java.util.concurrent.TimeUnit;

public class Image implements Element, Visitee{
    public String url;

    public Image(String url) {
        this.url = url;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void print()
    {

    }

    public void accept(Visitor v) {
        v.visit(this);
    }
}
