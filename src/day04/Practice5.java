package day04;

import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args) {
        
        
        for( int i = 1 ; i <= 10 ; i++ ){ System.out.println( i ); } // 1. 
        // 2. while 연습1
        int 문제2 = 10;                     // 초기식  
        while( 문제2 >= 1 ){                // 조건식
            System.out.println( 문제2 );
            문제2--;                        // 증감식 
        }
        // 3. while 연습2
        int 합계3 = 0;
        int 문제3 = 1;  while( 문제3 <= 50 ){ 합계3+=문제3; 문제3++; }
        System.out.println( 합계3 );

        for( int i = 1 ; i <= 20 ; i++ ){ if( i % 2 == 0 ) System.out.println( i ); } // 4. 
        // 5. 
        for( int i = 1 ; i <= 30 ; i++ ){ 
            if( i % 3 == 0 )continue;
            System.out.println( i );
        }
        // 6.
        int 합계6 = 0; 
        for( int i = 1 ; true ; i++ ){
            합계6 += i;     
            if( 합계6 >= 100 ) break; 
        }
        System.out.println( 합계6 );

        /* 7.                   줄(단/행)변수      별(곱/열)변수
            *                   1               1                       줄은 1부터 5까지 1씩증가 , for( int 줄 = 1 ; 줄 <= 5 ; 줄++ )
            **                  2               1 2                     별은 1부터 ( 1 2 3 4 5  ) 현재줄수 까지 1씩증가, for( int 별 = 1 ; 별 <= 줄 ; 별++)
            ***                 3               1 2 3 
            ****                4               1 2 3 4 
            *****               5               1 2 3 4 5    
        */
        for( int 줄 = 1 ; 줄 <= 5 ; 줄++ ){
            for( int 별 = 1 ; 별 <= 줄 ; 별++ ){ System.out.print("*");} // print 하여금 줄바꿈 처리 안한다. // for end 
            System.out.println(); // 줄 반복이 끝날때 마다 줄바꿈
        } // for end 

        /* 8.                   줄                  별
            ******              1               1 2 3 4 5               줄은 1부터 5까지 1씩증가 , for( int 줄 = 1 ; 줄 <= 5 ; 줄++ )
            ****                2               1 2 3 4                 별은 1부터 ( 5 4 3 2 1 ) (마지막줄수-현재줄수)+1 까지 1씩증가
            ***                 3               1 2 3                   
            **                  4               1 2
            *                   5               1
        */
        for( int 줄 = 1 ; 줄 <= 5; 줄++ ){
            for( int 별 = 1 ; 별 <= 5-줄+1 ; 별++ ){ System.out.print( "*" ); }
            System.out.println();
        } // for end 

        // 9. 
        Scanner scan = new Scanner( System.in ); // [1] *입력객체( 클래스마다 1개만 존재! )*
        int count = 0;
        while (true) { // 무한 루프/반복 
            String str = scan.next( );              // [2] 입력함수 , 반환타입과 변수타입 일치 
            if( str.equals("end") ){  // 만약에 str(입력받은값)이 ==[x] 대신 .equals() 사용, end 이면 
                break;  // 가장 가까운 반복문 탈출! 
            }
            count++; // end 제외한 입력받은 수
        } // w end         System.out.println( count );

        //10. 10/3 -> [java]3 [js]3.333    ,   3532100/100000 -> 353  -> 353/100 -> 3  
        int july1 = 3532100;    int july2 = 9123700;    int july3 = 5183400;    int july4 = 11738700;
        july1 /= 10000;         july2 /= 10000;         july3 /= 10000;         july4 /= 10000; 
        for( int i = 1 ; i <= july1/100 ; i++ ){  System.out.print( "■" );  } System.out.println( july1 +"만원");
        for( int i = 1 ; i <= july2/100 ; i++ ){  System.out.print( "■" );  } System.out.println( july2 +"만원");
        for( int i = 1 ; i <= july3/100 ; i++ ){  System.out.print( "■" );  } System.out.println( july3 +"만원");
        for( int i = 1 ; i <= july4/100 ; i++ ){  System.out.print( "■" );  } System.out.println( july4 +"만원");

        // 11.
        int balance = 0; // 입금 잔고, 반복문 밖에 선언한 이유는 입금액 초기화 1번 하기 위해서!
        for( ; ; ){ // [무한루프]
            System.out.println("1:입금 | 2:출금 | 3:잔고 | 4:종료" );  // 1. 무한루프 이용하여 무한 *출력
            int ch = scan.nextInt(); // 2. 무한루프 이용하여 무한 *입력
            // 3. 분기( if , 조건에 따라 서로 다른 코드 흐름 제어 )
            if( ch == 1 ){ 
                System.out.print("입금액:"); 
                balance += scan.nextInt();  // 입력받은 값으로 잔고에 더한다.
            }
            else if( ch == 2 ){ 
                System.out.print("출금액:"); 
                int 출금액 = scan.nextInt(); // 입력받은 값
                if( balance < 출금액 ){ System.out.println("잔고부족"); }
                else{ balance -= 출금액; }
            }
            else if( ch == 3 ){ System.out.println("잔고: "+balance); }
            else if( ch == 4 ){ System.out.println("프로그램을 종료합니다."); break; }
        } // for end 
        
    } // main end 
} // class end 