package day02;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        // 1. 
        byte a = 10;    int b = 200;    long result1 = a + b ; // byte + int => int , int -> long 
        System.out.println( result1 );

        // 2. (변환할자료명)자료/변수명
        double z = 3.141592;    int result2 = ( int )z; // 3.141592 -> 3 
        System.out.println( result2 ); 

        // 3. 입력준비: 1)입력객체 2)입력함수
        Scanner scan = new Scanner( System.in );
        System.out.print("키를 입력하세요: "); double 키 = scan.nextDouble();
        System.out.println( "당신의 키는 약 " + (int)키 + "cm 이군요.");

        // 4. int+int+int/double => double , 
        System.out.print("1] 정수: "); int 정수1 = scan.nextInt(); // 입력객체는 클래스내 1개만 존재해도 입력함수 사용가능!
        System.out.print("2] 정수: "); int 정수2 = scan.nextInt();
        System.out.print("3] 정수: "); int 정수3 = scan.nextInt();
        double result4 = ( 정수1 + 정수2 + 정수3 ) / 3.0; // 3 으로 나누면 소수점 사라진다. 3.0 으로 하여금 자동 double 타입변환 
        System.out.println( result4 );

    } // main end 
} // class end 

/*문제 4: Scanner를 이용해 서로 다른 3개의 정수를 입력받아, 이 값들의 합을 3으로 나눈 평균을 구하시오. 단, 결과는 소수점이 포함되도록 출력되어야 한다.
출력 예시:
평균 결과: 17.666666666666668 */