import java.util.Scanner;
public class TestProgram {
    public static void main(String[] args) {
        //Vince Ted Matthew D. Chua
        //May 14th, 2024
        //Software Engineering II
        //Professor Jeremias Esperanza

        //Create a Reference Storage
        ReferenceArchive referenceArchive = new ReferenceArchive();

        //Lending Service
        LendingService lendingService = new LendingService(referenceArchive);

        //Instantiates Scanner
        Scanner scanner = new Scanner(System.in);

        //Displays Menu Options
        System.out.println("Menu:");
        System.out.println("1. Lend a Book");
        System.out.println("2. Lend a Journal");
        System.out.println("3. Print Programmer's Name");
        System.out.println("4. End Program");

        int options;


            System.out.println("Welcome to NEU Library: Please choose the following Modality: ");
            options = scanner.nextInt(); //will ensure to switch case

            switch (options) {
                case 1:
                    //Lend a Book
                    lendingService.lendBook("bookTitle");
                    break;
                case 2:
                    //Lend a journal
                    lendingService.lendJournal("journalTitle");
                    break;
                case 3:
                    System.out.println("3BSCS2- Software Engineering II");
                    System.out.println("Programmer - Vince Ted Chua");
                    break;
                case 4:
                    System.out.println("Program Terminated!");
                    System.out.println("Programmer - Vince Ted Chua");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
