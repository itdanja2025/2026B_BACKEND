package day02;

import java.util.Scanner;

public class Practice1 { // class s 
    // m+엔터 : main함수 
    public static void main(String[] args) { // main s 

        // 1. so+엔터 : println함수 
        System.out.println( 25 ); System.out.println("홍길동" );

        // 2. JAVA: 타입 변수명 = 10 [[VS]] JS: let 변수명 = 10
        int age = 40;   // vs let age = 40 
        System.out.println( age );

        // 3. 변수의 초기(처음) 화 : 변수 선언시 처음에 자료 대입
        String name = "유재석"; int age2 = 40; double height = 170.5; String motto = "~살자";

        // 4. + 더하기연산자 와 연결연산자 , "문자열"+변수명+"문자열"+변수명
        System.out.println( "제 이름은 "+name+", 나이는 "+age2+"세, 키는 "+height+"cm 입니다.");

        // 5. +연결연산자 복잡한 경우 형식문자 printf( "형식문자" , 자료 )
        System.out.printf( "제 이름은 %s, 나이는 %d세, 키는 %.1fcm 입니다.\n" , name , age2 , height );
        
        // 6. |: shift+\  , \n : 줄바꿈 , \" : "출력
        System.out.println("|\\_/| \n|q p|   /} \n( 0 )\"\"\"\\ \n|\"^\"`    | \n||_/=\\\\__|");

        // 7. printf() , %s문자열형식 , %d정수형식,  %- 왼쪽정렬 
        int num = 10;    // 정수 1 를 저장하고 있는 int 타입 'num' 변수 선언
        String writer = "유재석"; // 문자열 "유재석" 를 저장하고 있는 String타입 'writer' 변수 선언
        String content = "안녕하세요!"; // 문자열 "안녕하세요!"를 저장하고 있는 String타입 'content' 변수 선언
        System.out.println("============== 방문록 ==============");
        System.out.printf("%-3s %-5s %-10s \n" , "번호" , "작성자" , "방문록" );
        System.out.printf("%-5d %-5s %-10s \n" , num , writer , content );
        System.out.println("====================================");

        // 8. 입력방법 : 1) Scanner객체생성 2) nextXXX()함수
        Scanner scan = new Scanner( System.in );        // 1) 
        System.out.print("이름을 입력하세요: "); String 이름 = scan.next(); // 2) 적절한 nextXXX() 선택한다.
        System.out.print("나이를 입력하세요: "); int 나이 = scan.nextInt(); // 2) nextXXX() 반환되는 타입에 따라 변수의 타입 선정
        System.out.printf("%s님의 나이는 %d세 입니다.\n", 이름 , 나이 );

        // 9. 8번에 Scanner 만들었기 때문에 이어서 사용 , nextLine() 띄어쓰기포함입력 , 
        // nextLine() 주의할점 : 만약에 nextLine() 앞에 다른 nextXX() 존재 한 경우에는 사이에 의미없는 nextLine() 추가
        System.out.print("게시물 번호: "); int 번호 = scan.nextInt();
        scan.nextLine(); // nextInt() 3 입력후 엔터(\n) 치면 3 은 반환되고 엔터(\n) 유지(남는다) 된다. \n 초기화
        System.out.print("게시물 제목: "); String 제목 = scan.nextLine();
        System.out.print("게시물 내용: "); String 내용 = scan.nextLine();
        System.out.printf("[%d 게시물 ] \n" , 번호 );
        System.out.printf("제목 : %s \n" , 제목 );
        System.out.printf("제목 : %s \n" , 제목 );
    
        // 10. nextChar() 제공하지 않는다. next().charAt(인덱스) : 해당인덱스의 문자1개 추출함수 , *문자열은 배열이다.*
        System.out.print("성별을 입력하세요(남/여): "); char 성별 = scan.next().charAt(0);
        System.out.printf("입력하신 성별은 %s 입니다. \n" , 성별 );

        // 11. 직접 풀기 


    } // main e // ctrl+f5(코드실행) 
}// class e
/*
문제 10: Scanner를 이용해 성별을 한 글자('남' 또는 '여')로 입력받아 char 타입 변수에 저장하고, 입력된 성별을 출력하시오.
요구 조건: Scanner에는 nextChar() 함수가 없으므로 next().charAt(0)을 활용하시오.
입력 예시:
성별을 입력하세요(남/여): 남
출력 예시:
입력하신 성별은 '남' 입니다.
*/

/*
문제 11: Scanner를 사용하여 아래 4가지 정보를 순서대로 입력받아 출력하는 코드를 작성하시오.
이름 (String), 나이 (int), 키 (double), 프로그래머 여부 (boolean)
입력 예시:
이름: 김자바
나이: 25
키: 165.8
프로그래머입니까? (true/false): true
출력 예시:
--- 자기소개 ---
이름: 김자바
나이: 25
키: 165.8cm
프로그래머 여부: true
*/

