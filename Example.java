public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}

public class Book extends Citation {
	protected String publisher;

	Book(String authors, String title, int year, String publisher) {
		super(authors, title, year);
		this.publisher = publisher;
	}

    public void print_type(String input) {
        switch (input) {
            case "a":
            System.out.println("type is 'a'");
            case "b":
            System.out.println("type is 'b'");
            case "c":
            System.out.println("type is 'c'");
        }
    }
}

public class ExceptionHandling {
    public void example() { // exception handling example
        try {
            // ...some suspicious code...
            throw new Exception("exception name"); // throw an exception
        } catch (Exception e) { // handle the exception
            System.out.println("some error" + e + "was thrown");
        }
    }
}
