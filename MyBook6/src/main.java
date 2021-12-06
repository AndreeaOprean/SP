public class main {
    public static void main(String[] args) throws Exception {
        Section cap1 = new Section("Capitolul 1");
        Paragraph p1 = new Paragraph("Paragraph 1");
        cap1.add(p1);
        Paragraph p2 = new Paragraph("Paragraph 2");
        cap1.add(p2);
        Paragraph p3 = new Paragraph("Paragraph 3");
        cap1.add(p3);
        Paragraph p4 = new Paragraph("Paragraph 4");
        cap1.add(p4);
        cap1.add(new ImageProxy("ImageOne"));
        cap1.add(new Image("ImageTwo"));
        cap1.add(new Paragraph("Some text"));
        cap1.add(new Table("Table 1"));
        BookStatistics stats = new BookStatistics();
        GenerateToC toc = new GenerateToC();

        System.out.println();
        System.out.println("~~~ Printing using RenderContentVisitor ~~~");
        Book myBook = new Book("MyBook");
        Author a = new Author("Author");
        myBook.addAuthor(a);
        myBook.accept(new RenderContentVisitor());
        for (Element e:cap1.elements) {
            e.accept(new RenderContentVisitor());
        }

        System.out.println();
        System.out.println("~~~ Book Statistics ~~~");
        cap1.accept(stats);
        stats.printStatistics();

        System.out.println();
        System.out.println("~~~ Table Of Contents ~~~");
        cap1.accept(toc);
        TableOfContents TOC = new TableOfContents(toc.getToC());
        TOC.accept(new RenderContentVisitor());

    }
}
