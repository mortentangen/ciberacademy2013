package cibrary;

import cibrary.model.Book;


public interface BookRepository {
	Book saveOrUpdate(Book book);
}
