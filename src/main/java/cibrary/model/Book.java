package cibrary.model;

public class Book {
	
    private Integer id;
    private String title;
    private String author;
    private String isbnCode;
    private Integer year;
    private Double price;
	
	public Book() {
    }
 
    public Book(String title, String author, String isbnCode, Integer year, Double price) {
        this.title = title;
        this.author = author;
        this.isbnCode = isbnCode;
        this.year = year;
        this.price = price;
    }
 
    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getIsbnCode() {
		return isbnCode;
	}

	public void setIsbnCode(String isbnCode) {
		this.isbnCode = isbnCode;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbnCode='" + isbnCode + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }

}
