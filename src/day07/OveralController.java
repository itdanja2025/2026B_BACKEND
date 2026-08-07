package day07;
/*
    OveralController : 입력Scanner/출력Print 담당 하는 클래스 용도 (MVC패턴-VIEW) / HTML, JS
    OveralRepository : 자료들의 저장소 및 관리 (MVC패턴-MODEL) / 데이터베이스 
    Post : 자료들의 모델/타입/형식
*/
import java.util.Scanner;

public class OveralController {
    public static void main(String[] args) {
        // [4] 반복문 
        OveralRepository repository = new OveralRepository(); // 다른클래스내 메소드 호출하는 방법
        for( ; ; ){
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
                Post post = new Post(내용, 작성자);
                repository.save( post );
                System.out.println("글쓰기 성공 / 실패 ");
            }else if( ch == 2 ){ // Read :  무엇(배열내 저장된 게시물 ) 을 출력 
                Post[] posts = repository.findAll();
                for( Post 기존게시물 : posts ){
                    if( 기존게시물 != null ){ // null 자료는 .(도트) 사용할 수 없다.
                        System.out.println( 기존게시물.content + 기존게시물.writer );
                    }
                }
            }
        }
    }
}

class OveralRepository{
     Post[] posts = new Post[100]; // DB 대신에 배열 이용한 여러개 자료 저장 용도
    boolean save( Post post ){ // 1.저장
        for( int index = 0 ; index <= posts.length-1 ; index++ ){
            if( posts[index] == null ){ // 특정한 index번째의 값이 null(비어) 이면
                posts[index] = post; // 입력받은 값 저장한다.
                return true; // 저장 성공했으면 '성공' 의미 갖는 true 반환한다.
            }
        }
        return false;
    }
    Post[ ] findAll(){ // 2.전체출력
        return posts; // 모든 배열 그자체를 그대로 반환;
    }
}

class Post{
    // 멤버변수 
    String content;
    String writer;
    // 생성자 -> 클래스내 오른쪽 클릭 -> 소스작업
    Post() { }
    Post(String content, String writer) {
        this.content = content;
        this.writer = writer;
    }
}