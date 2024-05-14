public class LendingService {
    private ReferenceArchive referenceArchive;

    //The lending service of library will lend the
    // reference archive linking books and journal
    public LendingService(ReferenceArchive referenceArchive) {
        this.referenceArchive = referenceArchive;
    }

    public void lendAudioBook(String title){
        Referencer book = referenceArchive.lendBook("Python 101");
        book.utilize(); //book utilize from Referencer Interface(s).

        //To use the book
        if (book != null) {
            book.utilize();
            System.out.println("The Audio-Book entitled: Python 101 is now lent");
            System.out.println("This book has 30 day return policy, thank you!");
        } else {
            System.out.println("Book is not found!");
        }
    }
    public void lendEJournal(String title){
        Referencer journal = referenceArchive.lendJournal("Journalism Programming 2024");
       if (journal != null) {
        journal.utilize();
        System.out.println("The E-Journal entitled: Journalism Programming 2024 is now lent");
        System.out.println("This book has 30 day return policy, thank you!");
        } else {
           System.out.println("Journal is not found!");
       }
    }
}
