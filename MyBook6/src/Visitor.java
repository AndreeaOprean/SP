public interface Visitor {
    public void visit(Book b);
    public void visit(Section s);
    public void visit(TableOfContents toc);
    public void visit(Paragraph p);
    public void visit(ImageProxy i);
    public void visit(Image i);
    public void visit(Table t);
}
