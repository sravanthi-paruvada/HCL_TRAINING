package sess2.q2;

public class Book {
	
	private  String title ;
    private String author;
    private String  ISBN;
    private int  noOfCopies;
    
  Book(String title, String author, String iSBN,int noOfCopies) {
		
		this.title = title;
		this.author = author;
		this.ISBN = iSBN;
		this.noOfCopies=noOfCopies;
	}
    
	public int getNoOfCopies() {
	return noOfCopies;
}

	public void setNoOfCopies(int noOfCopies) {
	this.noOfCopies = noOfCopies;
}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getISBN() {
		return ISBN;
	}


	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}


	 public void printBookDetails() {
	          System.out.println("Book Title: "+title+" Author  "+ author+" ISBN: "+ ISBN+"  no of copies:  "+noOfCopies);
	      }

}
