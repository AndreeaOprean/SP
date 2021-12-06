public class RenderContentVisitor implements Visitor{
    public void visit(Book b)
    {
        System.out.println("Book: " + b.title);
        System.out.println("Authors: ");
        for (Author a: b.authors) {
            System.out.println("Author: " + a);
        }
    }

    public void visit(Section s)
    {
        System.out.println("Section: " + s.title);
    }

    public void visit(TableOfContents toc)
    {
        for (String s: toc.contents)
            System.out.println(s);
    }

    public void visit(Paragraph p)
    {
        System.out.println("Paragraph: " + p.text);
    }

    public void visit(ImageProxy i)
    {
        i.loadImage();
        System.out.println(i.realImage.url);
    }

    @Override
    public void visit(Image i) {
        System.out.println("Image with name: "+i.url);
    }

    public void visit(Table t)
    {
        System.out.println("Table: "+t.title);
    }
}
