import java.security.AlgorithmConstraints;

class ExampleBooks3 {
    public static void main (String []args) {

        class Book {
            String title;
            String author;
            int numberOfPages;
            String ISBN;
                Book (String T, String A, int P, String I) {

                    title = T;
                    author = A;
                    numberOfPages = P;
                    ISBN = I;
                }
        }

        Book a = new Book("Thinking in Java", "Bruce Eckel", 1129, "None");
        System.out.println(a.title + " " + a.author + " " + a.numberOfPages + " " + a.ISBN);

        Book b = new Book("Thinking in Java", "Bruce Eckel", 1129, "0-13-027363-5");
        System.out.println(b.title + " " + b.author + " " + b.numberOfPages + " " + b.ISBN);

    }
}

