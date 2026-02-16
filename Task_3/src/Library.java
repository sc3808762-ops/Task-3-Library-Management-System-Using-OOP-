import java.util.ArrayList;
import java.util.Scanner;

public class Library {
        ArrayList<Book> BookDetails = new ArrayList<>();
        ArrayList<User> UserDetails = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        public void addBook(){
            System.out.print("Enter The Book Id :- ");
            int id = sc.nextInt();

            sc.nextLine();
            System.out.print("Enter The Book Title :- ");
            String title = sc.nextLine();

            System.out.print("Enter The Author :- ");
            String author = sc.next();

            Book b1 = new Book(id, title, author);
            BookDetails.add(b1);
        }

        public void addUser(){
            System.out.print("Enter The User Id :- ");
            int id = sc.nextInt();

            sc.nextLine();
            System.out.print("Enter The User Name :- ");
            String name = sc.nextLine();


            User u1 = new User(id, name);
            UserDetails.add(u1);
        }

        public void showBook(){

            for(int i=0;i<BookDetails.size();i++){
                 
                Book ba = BookDetails.get(i);
                System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");                
                System.out.println("Book :- "+(i+1));
                System.out.println("Book Id :- "+ba.bookId);
                System.out.println("Book Title :- "+ba.title);
                System.out.println("Book Author :- "+ba.author);
                System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
            }
        }

        public void showUser(){
              for(int i=0;i<UserDetails.size();i++){
                 
                User ua = UserDetails.get(i);
                System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");                
                System.out.println("User :- "+(i+1));
                System.out.println("User Id :- "+ua.userId);
                System.out.println("User Name :- "+ua.name);
                System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
            }
        }


        public void bookIssue(int id){

            boolean found = false;

            for(int i=0;i<BookDetails.size();i++){

                Book b = BookDetails.get(i);
                if(b.bookId == id){

                    found = true;
                    if(!(b.isIssued)){
                        b.isIssued = true;
                        System.out.println("Book Issued Successfully.....!");
                    }else{
                        System.out.println("Book Already Issued....!");
                    }

                  break;
                }
               
            }

             if(!found){
                    System.out.println("Book Not Found.....!");
                }

        }

        public  void returnBook(int id){
            
            boolean found = false;
            for(int i=0;i<BookDetails.size();i++){
                Book b = BookDetails.get(i);

                if(b.bookId == id){
                    found = true;
                    if(b.isIssued){
                        b.isIssued = false;
                        System.out.println("Book Return Sucessfully....!");
                    }else{
                        System.out.println("Book was not issued");
                    }
                    break;
                }
            
            }

            if(!found){
                    System.out.println("Book Not Found");
                }
        }


    
    public static void main(String[] args) throws Exception {

       Library l1 = new Library();


       while (true) { 
           
            System.out.println("1. Add Book");
            System.out.println("2. View Book");
            System.out.println("3. Add User");
            System.out.println("4. View User");
            System.out.println("5. Issued Book");
            System.out.println("6. Return Book");
            System.out.println("7. Exit");
        System.out.print("Enter The Choice here on basis your requirement :- ");

        int choice = l1.sc.nextInt();

        switch(choice){

            case 1:{
                l1.addBook();
                break;
            }
            case 2:{
                l1.showBook();
                break;
            }
            case 3:{
                l1.addUser();
                break;
            }
            case 4:{
                l1.showUser();
                break;
            }
            case 5:{
                System.out.print("Enter The Book-Id For Issued :- ");
                int issuedId = l1.sc.nextInt(); 
               l1.bookIssue(issuedId);
               break;

            }
            case 6:{
                System.out.print("Enter The Book-Id For Return :- ");
                int returnId = l1.sc.nextInt();
                l1.returnBook(returnId);
            }
            case 7:{
                System.out.println("Thank You For your support.....!");
                return;
            }
            default:{
                System.out.println("Enter The Invalied Input  ----- >>>> ");
                break;
            }
        }



       }


    }
}
