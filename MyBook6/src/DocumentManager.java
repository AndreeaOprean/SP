public class DocumentManager {
    private DocumentManager(){}
    private Book book;

    private static class SingletonHolder{
        private static final DocumentManager INSTANCE = new DocumentManager();
    }

    public static DocumentManager getInstance(){
        return SingletonHolder.INSTANCE;
    }

    public Book getBook() {
        return this.book;
    }

    public void setBook(Book myBook) {
        this.book = myBook;
    }
}
