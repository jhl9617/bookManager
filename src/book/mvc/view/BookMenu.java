package book.mvc.view;

import java.util.ArrayList;
import java.util.Scanner;

import book.mvc.controller.BookController;
import book.mvc.model.vo.Book;

//: 메뉴 방식으로 실행되게 함. 
//각 메소드가 사용할 데이터는 별도의 입력용 메소드를 작성하고,
//리턴된 객체나 값을 argument 로 사용할 것
//
//public void displayMenu() : 메뉴 반복 출력 처리함
//
//*** 도서 관리 프로그램 ***
//
//1. 도서 추가	=> BookController 의 insertBook(Book객체) 호출
//2. 도서 정보 수정	=> BookController 의 updateBook(Book객체) 호출
//3. 도서 삭제	=> BookController 의 deleteBook(책아이디) 호출
//4. 도서 아이디로 조회 => BookController 의 selectOne(아이디) 호출 > Book 출력
//5. 도서 제목으로 조회 => BookController 의 searchBookTitle(제목) 호출 > 리스트 출력
//6. 도서 목록 전체 조회 => BookController 의 selectList() 호출 > 리스트 출력
//9. 끝내기
//번호 선택 : 
//
//public Book inputBook()	=> 새 도서정보 키보드 입력용
//public Book modifyBook()  => 수정도서정보 키보드 입력용
//	(모두 입력받음. 제목,저자,출판사,출판일,가격 수정, 도서번호가 조건임)
//public int inputBookId()	=> 검색/삭제할 도서 아이디 입력용
//public String inputBookTitle() => 도서제목 키보드 입력용
//public void displayBooks(List<Book> list) => 도서목록 출력용
//public void displayBook(Book b)	=> 도서 출력용




public class BookMenu {

	public static BookController bc = new BookController();
	public static Scanner scanner = new Scanner(System.in);
	public void displayMenu() {

		
		
		while(true) {
			System.out.print("	1. 도서 추가	=> BookController 의 insertBook(Book객체) 호출\r\n"
					+ "	2. 도서 정보 수정	=> BookController 의 updateBook(Book객체) 호출\r\n"
					+ "	3. 도서 삭제	=> BookController 의 deleteBook(책아이디) 호출\r\n"
					+ "	4. 도서 아이디로 조회 => BookController 의 selectOne(아이디) 호출 > Book 출력\r\n"
					+ "	5. 도서 제목으로 조회 => BookController 의 searchBookTitle(제목) 호출 > 리스트 출력\r\n"
					+ "	6. 도서 목록 전체 조회 => BookController 의 selectList() 호출 > 리스트 출력\r\n"
					+ "	9. 끝내기\r\n"
					+ "	번호 선택 :");
			int input = scanner.nextInt();

			switch(input){
				case 1: bc.insertBook(inputBook()); break;
				case 2: bc.updateBook(modifyBook()); break;
				case 3: bc.deleteBook(selectBook()); break;		//아이디 입력해서 책 삭제
				case 4: printBook(bc.selectList(selectBook())); break;		//아이디 입력해서 책 조회
				case 5: printBook(bc.searchBookTitle(selTitle())); break;	//타이틀 입력해서 책 조회
				case 6: printAll(bc.selectAll()); break;
				case 7: return;



			}
		}
	}
	private String selTitle() {
		System.out.print("선택할 책 제목 : ");
		return scanner.next();
	}
	private int selectBook() {
		System.out.print("선택할 책 번호 : ");
		return scanner.nextInt();
	}
	private Book modifyBook() {
		Book book = new Book();
		
		System.out.print("수정할 책 번호 : ");
		book.setBookId(scanner.nextInt());
		System.out.print("수정할 책 제목 : ");
		book.setTitle(scanner.next());
		System.out.print("수정할 책 가격 : ");
		book.setPrice(scanner.nextInt());

		return book;
	}
	private Book inputBook() {
		Book book = new Book();

		System.out.print("책 제목 : ");
		book.setTitle(scanner.next());
		System.out.print("책 저자 : ");
		book.setAuthor(scanner.next());
		System.out.print("책 번호 : ");
		book.setBookId(scanner.nextInt());
		System.out.print("책 가격 : ");
		book.setPrice(scanner.nextInt());
		System.out.print("책 출판사 : ");
		book.setPublisher(scanner.next());
		
		return book;
	}

	public static void printBook(Book book) {
		System.out.println(book);
	}

	public static void printAll(ArrayList<Book> list) {
		for(Book book : list) {
			System.out.println(book);
		}
	}
		
}
