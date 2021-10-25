public class Table {
    public String name;

    public Table(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Table: " + this.name;
    }
}
