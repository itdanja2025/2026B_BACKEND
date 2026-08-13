package day12.종합예제.view;

import java.util.InputMismatchException;
import java.util.Scanner;

import day12.종합예제.controller.BoardController;
import day12.종합예제.model.dto.BoardDto;

public class BoardView {
    private BoardView(){} // 1.
    private static final BoardView instance = new BoardView(); // 2.
    public static BoardView getInstance( ){ return instance; } // 3. 
    // [*] MVC패턴 흐름의 controller 싱글톤 호출
    private BoardController bc = BoardController.getInstance();
    // [*] 입력객체
    private Scanner scan = new Scanner(System.in);
    // [*] 최초 루프/화면
    public void run( ){
        while( true ){
            try{ // 예외처리 
                System.out.print("1.등록 2.전체조회 3.개별수정 4.개별삭제 선택:");
                int ch = scan.nextInt();
                if( ch == 1 ){ save(); }
                else if( ch == 2 ){ }
                else if( ch == 3 ){ }
                else if( ch == 4 ){ }
            }catch( InputMismatchException e ){
                // 입력(성공) 했지만 타입반환에서 예외 이므로 입력객체 초기화
                scan = new Scanner( System.in );
                System.out.println("[다시입력]" + e);
            }
        } 
    } // run end 

    // [1] 등록 VIEW
    public void save( ){
        System.out.print("내용: ");     String 내용 = scan.next();  // 1.1 저장할 자료 입력받기 
        System.out.print("작성자: ");   String 작성자 = scan.next();
        BoardDto boardDto = new BoardDto(0, 내용, 작성자); // 1.2 자료 객체화하기 , no(아무거나/사용X)
        boolean result = bc.save( boardDto ); // 1.3 컨트롤러 에게 전달(dto) 하여 응답(boolean) 받기 
        if( result ){ System.out.println(">등록성공");} // 1.4 응답받은 결과로 출력
        else{ System.out.println(">등록실패"); }
    }

} // class end 
