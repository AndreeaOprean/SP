public class Table {
    public String title;

    public Table(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Table: " + this.title;
    }
}
