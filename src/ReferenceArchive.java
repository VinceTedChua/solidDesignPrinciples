public class ReferenceArchive {
    //this is like the librarian who will retrieve the book you need
    public Referencer lendBook(String bookName) {
        return new Book();
    }
    //this is like the librarian who will retrieve the journal you need
    public Referencer lendJournal(String journalName){
        return new Journal();
    }
}
