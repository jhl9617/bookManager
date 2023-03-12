CREATE TABLE books (
  book_id   NUMBER PRIMARY KEY,
  title     VARCHAR2(50) NOT NULL,
  author    VARCHAR2(20) NOT NULL,
  publisher VARCHAR2(20) NOT NULL,
  publish_date DATE NOT NULL,
  price     NUMBER NOT NULL
);

CREATE SEQUENCE seq_bid
START WITH 1
INCREMENT BY 1
NOCACHE;

COMMENT ON COLUMN books.book_id IS '일련번호 (시퀀스 seq_bid로 자동 생성)';
COMMENT ON COLUMN books.title IS '책 제목';
COMMENT ON COLUMN books.author IS '저자명';
COMMENT ON COLUMN books.publisher IS '출판사';
COMMENT ON COLUMN books.publish_date IS '출판일자';
COMMENT ON COLUMN books.price IS '가격';