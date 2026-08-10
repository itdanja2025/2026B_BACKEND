package day09;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Practice11 {
    public static void main(String[] args) {

        // [1] ArrayList< 요소타입 > 변수명 = new ArrayList<>();
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("유재석" ); nameList.add("강호동"); nameList.add("신동엽");
        System.out.println( nameList );
        // [2] 
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("사과"); fruits.add("바나나"); fruits.add("딸기");
        for( int index = 0 ; index <= fruits.size()-1 ; index++ ){
            System.out.println( index +" : " + fruits.get(index) );
        }
        // [3] 
        for( String fruit : fruits ){ System.out.println( fruit); }
        // [4]
        ArrayList<String> list1 = new ArrayList<>();
        list1.add( "A"); list1.add( "B");  list1.add( "C");  list1.add( "D");  list1.add( "E"); 
        list1.remove( 2 );
        System.out.println( list1 );
        // [5]
        ArrayList< String > list2 = new ArrayList<>();
        list2.add("자바");  list2.add("파이썬");  list2.add("C++");
        list2.add(1, "자바스크립트"); // 중간삽입
        System.out.println( list2 );
        // [6] 내가만든 클래스/타입 으로 <제네릭타입> 가능!
        ArrayList< Book > bookList = new ArrayList<>(); 
        bookList.add( new Book("책이름1", "저자1") );
        bookList.add( new Book("책이름2", "저자2") );
        bookList.add( new Book("책이름3", "저자3") );
        for( Book book : bookList ){  System.out.println( book.getTitle() + " : " + book.getAuthor() ); }
    } // main end 
} // class end 
class Book{ 
    private String title;
    private String author;
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
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
    @Override
    public String toString() {
        return "Book [title=" + title + ", author=" + author + "]";
    }
}


/*[문제 7] Scanner를 사용하여 사용자로부터 문자열을 계속해서 입력받습니다.
1. 입력받은 문자열은 ArrayList에 순서대로 저장합니다.
2. 만약 사용자가 "종료" 라는 단어를 입력하면, 입력을 멈추고 그때까지 리스트에 저장된 모든 내용을 출력한 뒤 프로그램을 종료하세요.*/

/*[문제 8] "국어", "수학", "사회", "과학"을 요소로 가지는 ArrayList를 생성하세요.
1. .set(인덱스, 요소) 메소드를 사용하여 1번 인덱스의 "수학"을 "영어"로 수정하세요.
2. 수정 후의 리스트 전체를 출력하여 결과가 올바른지 확인하세요.*/
