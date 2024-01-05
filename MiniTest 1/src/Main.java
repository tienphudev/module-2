public class Main {
    public static void main(String[] args) {
       ProgramingBook[] programingBooks= new ProgramingBook[5];
       programingBooks [0]= new ProgramingBook("P001", "Clean Code", 29.99, "Robert C. Martin", "Java", "Spring");
       programingBooks [1]= new ProgramingBook("P002", "Head First Design Patterns", 39.99, "Eric Freeman, Elisabeth Robson", "Java", "None");
       programingBooks [2]=new ProgramingBook("P003", "JavaScript: The Good Parts", 19.99, "Douglas Crockford", "JavaScript", "None");
       programingBooks [3]= new ProgramingBook("P004", "Python Crash Course", 24.99, "Eric Matthes", "Python", "Django");
       programingBooks [4]= new ProgramingBook("P005", "C# in Depth", 34.99, "Jon Skeet", "C#", ".NET");
        FictionBook[] fictionBooks = new FictionBook[5];
        fictionBooks[0] = new FictionBook("F001", "The Great Gatsby", 9.99, "F. Scott Fitzgerald", "Classic");
        fictionBooks[1] = new FictionBook("F002", "To Kill a Mockingbird", 8.99, "Harper Lee", "Classic");
        fictionBooks[2] = new FictionBook("F003", "1984", 7.99, "George Orwell", "Dystopian");
        fictionBooks[3] = new FictionBook("F004", "The Hobbit", 12.99, "J.R.R. Tolkien", "Fantasy");
        fictionBooks[4] = new FictionBook("F005", "Harry Potter and the Philosopher's Stone", 11.99, "J.K. Rowling", "Fantasy");
        double totalPrice=0;
        for(ProgramingBook book :programingBooks){
            totalPrice+=book.getPrice();
        }
        for(FictionBook book :fictionBooks){
            totalPrice+= book.getPrice();
        }
        System.out.println("Tổng số tiên 10 quyển sách :"+totalPrice);
        int FictionbookCount=0;
        for(FictionBook book:fictionBooks){
            if(book.getCategory().equals("Viễn tưởng 1")){
                FictionbookCount++;
            }
                }
        System.out.println("Số sách có thể loại Viễn tưởng 1: "+FictionbookCount);
        int languageJavacount=0;
        for(ProgramingBook book:programingBooks){
            if(book.getLanguage().equals("Java")){
                languageJavacount++;
            }
        }
        System.out.println("Số sách có ngôn ngũ Java :"+languageJavacount);
        int sachFictionPriceThapHon100=0;
        for(FictionBook book:fictionBooks){
            if(book.getPrice()<100){
                sachFictionPriceThapHon100++;
            }
        }
        System.out.println("Số sách Fiction có gia thấp hơn 100 :" + sachFictionPriceThapHon100);

}}
