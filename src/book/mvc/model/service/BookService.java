package book.mvc.model.service;
import static common.JDBCTemp.*;

import java.sql.Connection;
import java.util.ArrayList;

import book.mvc.model.dao.BookDao;
import book.mvc.model.vo.Book;


public class BookService {

    private BookDao bdao;

    public BookService(){
        bdao = new BookDao();
    }

    public int insertBook(Book book) {
        Connection conn = getConnection();
        int result = bdao.insertBook(conn, book);
        if(result > 0) {
            commit(conn);
        }else{
            rollback(conn);
        }
        close(conn);
        return 0; 
    }

    public int updateBook(Book book) {
        Connection conn = getConnection();
        int result = bdao.updateBook(conn, book);
        if(result > 0)
			commit(conn);
		else
			rollback(conn);
		close(conn);
		return result;
    }

    public int deleteBook(int bookId ) {
        Connection conn = getConnection();
        int result = bdao.deleteEmployee(conn, bookId);

        if(result > 0)
			commit(conn);
		else
			rollback(conn);
		close(conn);
		return result;
    }
    
    public Book selectList(int bookId) {
        Connection conn = getConnection();
        Book book = bdao.selectList(conn, bookId);
        close(conn);
        return book;
    }


    public Book searchBookTitle(String bookTitle){
        Connection conn = getConnection();
        Book book = bdao.searchBookTitle(conn, bookTitle);
        close(conn);
        return book;
    }

    public ArrayList<Book> selectAll() {
        Connection conn = getConnection();
        ArrayList<Book> list = bdao.selectAll(conn);
        close(conn);
        return list;
    }

}
