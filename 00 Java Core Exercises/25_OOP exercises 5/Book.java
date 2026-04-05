import java.util.ArrayList;

public class Book{
		private String title;
		private String author;
		private int isbn;
		private static ArrayList<Book> BookArr = new ArrayList<Book>();
		
		public Book(String title, String author, int isbn){
			this.title = title;
			this.author = author;
			this.isbn = isbn;
		}
		
		public static void addBook(Book book){
			BookArr.add(book);
		}
		
		public String getTitle(){
			return title;
		}
		public String getAuthor(){
			return author;
		}
		public int getIsbn(){
			return isbn;
		}
		
		public static ArrayList<Book> SendBookArr(){
			return BookArr;
		}
		
		
		
}