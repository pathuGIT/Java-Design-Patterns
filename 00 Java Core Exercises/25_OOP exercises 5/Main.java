import java.util.ArrayList;

public class Main{
	public static void main(String[] args){
		Book book1 = new Book("AAA","zz",123);
		Book book2 = new Book("ZZZ","aa",1234);
		
		Book.addBook(book1);
		Book.addBook(book2);
		
		ArrayList<Book> GetBookArr = Book.SendBookArr();
		
			for(Book i: GetBookArr){
				System.out.println(i.getTitle()+","+i.getAuthor()+","+i.getIsbn());
			}
		
		
	}
}