package book.mvc.model.dao;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Properties;

import book.mvc.model.vo.Book;

//public int insertBook(Connection conn, Book b) : 새로운 레코드 정보를
//전달받아 쿼리문에 적용, 테이블에 추가함		
//public int updateBook(Connection conn, Book b) : 수정할 정보를
//전달받아 테이블의 내용 변경함
//public int deleteBook(Connection conn, int bid) : 삭제할 책아이디을 전달받아
//테이블의 정보 삭제함
//public ArrayList<Book> selectList(Connection conn) 
//: 테이블의 모든 정보를 조회해서 리스트에 담아 리턴함
//public ArrayList<Book> searchBookTitle(Connection conn, String bookTitle) 
//: 책제목을 넘겨받아, 해당 도서조회해서 리스트에 담아 리턴
//public Book selectOne(Connection conn, int bookId)
//: 책 아이디를 전달받아 해당 도서 조회해서 객체에 담아 리턴
//
//=> book.mvc.controller.BookController.java
//: 메뉴에서 전달된 정보를 dao로 넘기고, 결과 받아서 뷰 실행 처리
//
//default 생성자
//
//public void insertBook(Book b)   => service의 insertBook(b) 호출 => dao의 insertBook(conn, b) 호출
//public void updateBook(Book b)  => service의 updateBook(b) 호출 => dao의 updateBook(conn, b) 호출
//public void deleteBook(int bookId) => service의 deleteBook(bid) 호출 => dao의 deleteBook(conn, bid) 호출
//public Book selectOne(int bookId) => service의 selectOne(bid) 호출 => dao의 selectOne(conn, bid) 호출
//public ArrayList<Book> searchBookTitle(String bookTitle) => service의 searchBookTitle(bookTitle) 호출
//		=> dao의 searchBookTitle(conn, bookTitle) 호출
//public ArrayList<Book> selectList() => service의 selectList() 호출  => dao의 selectList(conn) 호출


public class BookDao {
    private Properties prop = new Properties();

    public BookDao() {
        try{
            prop.getProperty("settings/query.properties");
        } catch(Exception e) {

        }
    }
    public int insertBook(Connection conn, Book book) {
        int result = 0;
        String query = prop.getProperty("insert");

        return result;
    }

    public int updateBook(Connection conn, Book book) {
        return 0;
    }

    public int deleteEmployee(Connection conn, int bookId) {
        return 0;
    }

    public Book selectList(Connection conn, int bookId) {
        return null;
    }

    public Book searchBookTitle(Connection conn, String bookTitle) {
        return null;
    }

    public ArrayList<Book> selectAll(Connection conn) {
        return null;
    }

}
