public class BookStatistics implements Visitor{
    public int books = 0;
    public int sections = 0;
    public int paragraphs = 0;
    public int images = 0;
    public int tables = 0;

    @Override
    public void visit(Book b) {
        this.books += 1;
    }

    @Override
    public void visit(Section s) {
        this.sections += 1;
    }

    @Override
    public void visit(TableOfContents toc) {

    }

    @Override
    public void visit(Paragraph p) {
        this.paragraphs += 1;
    }

    public void visit(Image i) {
        this.images+=1;
    }

    @Override
    public void visit(ImageProxy i) {
        this.images+=1;
    }

    @Override
    public void visit(Table t) {
        this.tables+=1;
    }

    public void printStatistics() {
        System.out.println("Number of images: "+this.images);
        System.out.println("Number of tables: " +this.tables);
        System.out.println("Number of paragraphs: "+this.paragraphs);
    }
}
