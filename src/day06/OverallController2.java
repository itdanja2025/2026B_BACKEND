package day06;

import java.util.Arrays;
import java.util.Scanner;

public class OverallController2 { // class end // 자바 번역하는 최소의 단위
    public static void main(String[] args) { // main 함수는 프로그램 시작점!
        // [5] 배열 ( 하나의 표 저장하기 위한 )
        게시물[] 게시물목록 = new 게시물[100];; // 게시물 100개 저장하는 게시물 목록
        // *배열 입장* 에서는 게시물 저장하는거지 내용/작성자 저장하는게 아니라. 내용/작성자 는 게시물 저장
        
        // [4] 반복문 
        for( ; ; ){
            System.out.println( Arrays.toString( 게시물목록 ) );
            // [1] 출력함수 이용하여 화면 구성 
            System.out.println("============ My Community ============ ");
            System.out.println("1.게시물쓰기 2.게시물출력" );
            System.out.println("======================================");
            // [2] 입력함수 이용한 입력받기
            Scanner scan = new Scanner( System.in );
            System.out.print("선택>"); int ch = scan.nextInt();
            // [3] 분기: 서로다른 출력문 보여주기 위해
            if( ch == 1 ){ // Create : 입력받은값 -> 객체 생성 -> 배열 저장( push없다. )
                System.out.println("내용:");    String 내용 = scan.next();
                System.out.println("작성자:");  String 작성자 = scan.next();
                
                게시물 새로운게시물 = new 게시물( 내용 , 작성자 ); // js { } vs java new
                for( int index = 0 ; index <= 게시물목록.length - 1 ; index++ ){
                    if( 게시물목록[index] == null ){
                        게시물목록[index] = 새로운게시물; break;
                    }
                }
                System.out.println("글쓰기 성공 / 실패 ");
            }else if( ch == 2 ){ // Read :  무엇(배열내 저장된 게시물 ) 을 출력 
                for( 게시물 기존게시물 : 게시물목록 ){
                    if( 기존게시물 != null ){ // null 자료는 .(도트) 사용할 수 없다.
                        System.out.println( 기존게시물.내용 + 기존게시물.작성자 );
                    }
                }
            }
        }
    } // main end 
} // class end 

//create table 게시물목록( 내용 varchar(255) , 작성자 varchar(30) );
class 게시물{
    String 내용; 
    String 작성자;
    // 생성자 선택!
    public 게시물(String 내용, String 작성자) {
        this.내용 = 내용;
        this.작성자 = 작성자;
    }
}
// 1. 화면에 대한 스케치 ( 피그마 / 프로토타입 ) , 출력함수 설계한다.
// 2. 메모리/설계 , class 설계한다. 
// 3. 기능 설계