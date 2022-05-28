package Rifqi;

public class BookTest{
	public static void main(String args[]){


		Author[] authors = new Author[2];
		authors[0] = new Author("Andi S", "andi@gmail.com", 'L');
		authors[1] = new Author("Pierce V", "piercev@gmail.com", 'L');

		System.out.println(authors[0]);
    	System.out.println(authors[1]);

		Book java = new Book("Java Programming", authors, 50000, 100);
		System.out.println(java);

		java.setPrice(35000);
		java.setQty(50);

		Book html = new Book("HTML for beginners", authors, 30000);
		System.out.println(html.getAuthorNames());
		System.out.println(html);
		
	}
}