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
        } // w end 
        System.out.println( count );

        //10. 10/3 -> [java]3 [js]3.333    ,   3532100/100000 -> 353  -> 353/100 -> 3  
        int july1 = 3532100;    int july2 = 9123700;    int july3 = 5183400;    int july4 = 11738700;
        july1 /= 10000;         july2 /= 10000;         july3 /= 10000;         july4 /= 10000; 
        for( int i = 1 ; i <= july1/100 ; i++ ){  System.out.print( "■" );  } System.out.println( july1 +"만원");
        for( int i = 1 ; i <= july2/100 ; i++ ){  System.out.print( "■" );  } System.out.println( july2 +"만원");
        for( int i = 1 ; i <= july3/100 ; i++ ){  System.out.print( "■" );  } System.out.println( july3 +"만원");
        for( int i = 1 ; i <= july4/100 ; i++ ){  System.out.print( "■" );  } System.out.println( july4 +"만원");

    } // main end 
} // class end 


/*[문제 11] Scanner와 for(;;) 무한루프를 사용하여 간단한 ATM 기기를 만드시오.
요구 조건:
사용자에게 "1:입금 | 2:출금 | 3:잔고 | 4:종료" 메뉴를 보여줍니다.
Scanner로 메뉴 번호를 입력받습니다.
1번을 선택하면 "입금액:"을 물어보고, 입력받은 금액만큼 잔고(balance)를 증가시킵니다.
2번을 선택하면 "출금액:"을 물어보고, 입력받은 금액만큼 잔고를 감소시킵니다. (단, 잔고보다 큰 금액은 출금할 수 없다고 안내)
3번을 선택하면 현재 잔고를 출력합니다.
4번을 선택하면 "프로그램을 종료합니다." 메시지를 출력하고 break를 이용해 무한루프를 탈출합니다.
초기 잔고는 0으로 시작합니다.
실행 예시:
---------------------------------
1:입금 | 2:출금 | 3:잔고 | 4:종료
---------------------------------
선택> 1
입금액> 10000
---------------------------------
1:입금 | 2:출금 | 3:잔고 | 4:종료
---------------------------------
선택> 3
잔고> 10000
---------------------------------
1:입금 | 2:출금 | 3:잔고 | 4:종료
---------------------------------
선택> 4
프로그램을 종료합니다. */