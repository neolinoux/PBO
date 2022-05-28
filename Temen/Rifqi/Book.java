package Rifqi;



public class Book{
	private String name;
	private Author[] authors;
	private double price;
	private int qty;
	
	public Book(String name, Author[] authors, double price){
		this.name = name;
		this.authors= authors;
		this.price = price;
		this.qty=0;
	}

	public Book(String name, Author[] author, double price, int qty){
		this.name = name;
		this.authors= author;
		this.price = price;
		this.qty = qty;
	}
	
	public String getName(){
		return name;
	}

	public Author[] getAuthor(){
		return authors;
	}

	public double getPrice(){
		return price;
	}

	public void setPrice(double price){
		this.price=price;
	}

	public int getQty(){
		return qty;
	}

	public void setQty(int qty){
		this.qty = qty;
	}

	public String toString(){
		return "Book ["+name+",authors={Author"+getAuthorNames()+"},price= " + price +",qty= "+qty;
	}

	public String getAuthorNames(){
		for(int i=0; i<authors.length;i++){
            System.out.print("[name="+authors[i].getName()+", ");
            System.out.print("email="+authors[i].getEmail()+", ");
            System.out.print("gender="+authors[i].getGender()+"]");
         }
         return "[name="+authors[0].getName()+", "+"email="+authors[0].getEmail()+", "+"gender="+authors[0].getGender(); 
}
	

}
