public class Table implements Element{
    public String title;

    public Table(String title) {
        this.title = title;
    }

    @Override
    public void print(){
        System.out.println("Table: "+this.title);
    }
}
