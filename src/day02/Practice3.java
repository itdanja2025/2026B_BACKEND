package day02;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        //  !== === 강력비교 제외한 JAVA 와 JS 연산자 동일
        Scanner scan = new Scanner(System.in ); // 입력객체는 클래스에 1개 존재!

        // 1. 김승연
        System.out.print("국어 점수:"); int 국어 = scan.nextInt(); // nextXXX()
        System.out.print("영어 점수:"); int 영어 = scan.nextInt();  // nextInt() -> int변수에 저장
        System.out.print("수학 점수:"); int 수학 = scan.nextInt();
        System.out.println("총점:" +(국어+영어+수학));
        System.out.println("평균:" +(국어+영어+수학)/3.0);          // /3 소수점x , /3.0 소수점o

        // 2. 구현승 : 1) 입력/저장 -> 2)처리 -> 3)출력
        System.out.print( "반지름을  입력하세요: " ); double 반지름 = scan.nextDouble();
        double 넓이 = ( 반지름 * 반지름 * 3.14 ); 
        System.out.println( 넓이 );
        
        // 3. 안현준
        System.out.print("첫 번째 실수"); double num1 = scan.nextDouble();
        System.out.print("두 번째 실수"); double num2 = scan.nextDouble();
        double result3 = ( num1 / num2 )*100;
        System.out.println("비율:"+ result3 +"%" ); 
        
        // 4. 서현욱 : 값 % 2 == 1 , 나머지가 0 이면 짝수 / 1 이면 홀수
        System.out.print("숫자를 입력하세요 : ");
        int number = scan.nextInt();
        System.out.println( number % 2 == 1  ); // >= <= > < == != 비교연산자의 결과는 항상 true/false 

        // 5. 주석암 : 값 % 수 == 0 , 나머지가 0 이면 값은 그 수의 배수
        System.out.print("정수를 입력하세요 : ");   int i = scan.nextInt();
        System.out.println( i % 7 == 0 );

        // 6. 조현우 : JS/PY ==문자열비교가능, JAVA/C ==문자열비교불가능
        System.out.print("아이디: ");   String id = scan.next();    // .next() 문자열 -> String 변수
        System.out.print("비밀번호: "); String pw = scan.next();
        // * 문자열A.equals(문자열B) // && 이면서
        System.out.println( id.equals( "admin" ) && pw.equals("1234" ) ); 

        // 7. ( 조건A && 조건B ) , if/삼항 사용이유 : true/false 자료 다른 자료로 표현/흐름 변경
        System.out.print("문제7] 정수: "); int 정수7 = scan.nextInt();
        System.out.println( 정수7 % 2 == 1 && 정수7 % 7 == 0 );
        
        // 8. if/삼항 : true / false 대신에 '합격' / '불합격'
        System.out.print("문제8] 정수: "); int 정수8 = scan.nextInt();
        System.out.print("문제8] 정수: "); int 정수9 = scan.nextInt();
        System.out.println( 정수8 + 정수9 >= 150 ? "합격" : "불합격" );

        // 9. +연결연산자 : 더하기 할 값에 문자열이 포함되면 더하기 아닌 연결이 된다.
        System.out.print("문제9] 이름: "); String 이름 = scan.next();
        // 변수선언: 타입명 변수 = 값  ,  변수값수정 : 변수명 = 새로운값    ,  변수는 *하나*의 자료/값 저장
        이름 += 이름.equals("유재석") ? "(방장)" : "";  
        System.out.println( 이름 );

        // 10. 김지환
        System.out.print("밑변: "); double base = scan.nextDouble();
        System.out.print("높이: "); double height = scan.nextDouble();
        System.out.println( (base * height / 2.0 ));
        // 11. 조현우
        System.out.println("섭씨온도: ");   double 온도 = scan.nextDouble();
        double 화씨 = ( 온도 *9.0/5.0)+32;
        System.out.println( 화씨 );
        // 12. 김두현
        System.out.print("태어난 년도: ");  int bornYear = scan.nextInt();
        System.out.println("2025년 기준 나이: " + (2025-bornYear) + "세");
        
        // 13. 임준희
        System.out.print("키(cm) 입력: ");         double height2 = scan.nextDouble(); height2 /= 100.0;
        System.out.print("몸무게(kg) 입력: ");      double weight = scan.nextDouble();
        double result13 = weight / (height2 * height2);
        System.out.printf("BMI 지수: %.2f", result13);

        // 14. 정형진: == vs .equals( )
        System.out.print("아이디: ");   String 아이디 = scan.next();
        System.out.print("이메일: ");   String 이메일 = scan.next();
        boolean result4 = 아이디.equals("admin") || 이메일.equals("admin@test.com");
        System.out.println( result4 ? "관리자" : "일반 사용지" );

        // 15. 신승민 : 삼항연산자 중첩 , 조건?참: 조건?참: 조건?참:거짓
        System.out.println("점수를 입력하세요:");   int score3 = scan.nextInt();
        System.out.println( score3>=90 && score3 <= 100 ? 'A' : score3 >= 80 ? 'B' : 'C');

        // 16. 허유현
        System.out.println("나이를 입력하세요:");   int age = scan.nextInt();
        System.out.println( age >= 20 && age <= 29 ? "이벤트 대상입니다." : "이벤트 대상이 아닙니다.");

    } // main end 
} // class end 