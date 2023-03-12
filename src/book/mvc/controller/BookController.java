package book.mvc.controller;

import java.util.ArrayList;

import book.mvc.model.service.BookService;
import book.mvc.model.vo.Book;

public class BookController {

    private BookService bservice;

    public BookController() {
        try{
            bservice = new BookService();
        }catch (Exception e) {
            e.getStackTrace();
        }
    }

    public void insertBook(Book book) {
        try {
			if(bservice.insertBook(book) > 0) {
				System.out.println("\n새 책 등록 성공!");
			}else {
				System.out.println("\n새 책 등록 실패!");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
    }

    public void updateBook(Book book) {
        try {
			if(bservice.updateBook(book) > 0) {
				System.out.println("\n책 정보 수정 성공!");
			}else {
				System.out.println("\n책 정보 수정 실패!");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
    }

    public void deleteBook(int bookid) {
        try {
            if(bservice.deleteBook(bookid) > 0) {
            }else {
				System.out.println("\n직원 삭제 실패!");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
        
    }

    public Book selectList(int bookid) {
        Book book = null;
		try {
			book = bservice.selectList(bookid);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return book;
    }

    public Book searchBookTitle(String bookName) {
        Book book = null;
		try {
			book = bservice.searchBookTitle(bookName);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return book;
    }

    public ArrayList<Book> selectAll() {
        ArrayList<Book> list = null;
        try {
			list = bservice.selectAll();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return list;

    }
    
}
