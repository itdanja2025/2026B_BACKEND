package day12;

public class Exam1 {
    public static void main(String[] args) {
        // 예외란? 에러발생 시 고치는게 아니라 흐름 제어 vs if
        // 예외처리: try{ 예외발생코드 }catch( 예외클래스명 변수명 ){ 처리할코드 }

        // [1] 일반예외: 실행(컴파일)하기 전 예외가 발생할 수 있는 코드에 대해 *미리 예외*
        // 1. ClassNotFoundException: 클래스 찾을 수 없다
        try{
            Class.forName("java.lang.String"); // Class.forNamce("찾을클래스") 동적으로 존재하는 클래스 로드(읽어오기)
        }catch( ClassNotFoundException e ){
            System.out.println("존재하지 않은 클래스 입니다." + e );
        }
        // 2. InterruptedException: 스레드에 문제가 발생 하면
        try{ 
            Thread.sleep( 1000 ); // Thread.sleep( 밀리초 ); 밀리초만큼 일시정지, 스레드란? 컴파일(번역)된 코드들을 읽어드리는 흐름
        }catch( InterruptedException e ){ // 예외발생시 처리되는 코드 , e: 변수이면서 예외정보 담는 객체
            System.out.println("인터럽트 문제 발생 "+e );
        }

        // [2] 실행예외: 실행( 컴파일 ) 후 예외 발생 *경험 중요* 예측 하거나 유지보수( 로그 )
        // 3. NullPointerException: 참조가 없는데 참조하는 경우
        try{
            String str1 = null; // null 이란? 참조값이 없다 즉] 객체(인스턴스) 가 없다.
            System.out.println( str1.length() );  // .(도트/접근)연산자는 참조할 대상의 멤버들 접근 
        }catch( NullPointerException 변수 ){
            System.out.println( 변수 );
        }
        // 4. NumberFormatException: 숫자타입으로 변환이 불가능한 경우
        try{
            String str2 = "100";    Integer.parseInt( str2 ); // Integer.parseInt( 문자 ); 문자 -> 정수 변환 함수
            String str3 = "100a";   Integer.parseInt( str3 ); // "100" -> 100 [가능] , "100a" -> [불가능]
        }catch( NumberFormatException e ){ System.out.println( e ); }
        // 5. ArrayIndexOutOfBoundsException: 배열내 인덱스 범위가 넘는 경우 
        try{ 
            int[] 배열 = { 10 , 25 }; // 2개 저장하는 배열
            System.out.println( 배열[0] );
            System.out.println( 배열[5] ); // 없는 인덱스 호출/사용 
        }catch( ArrayIndexOutOfBoundsException e  ){ System.out.println( e ); }
        // * 여러 타입들의 예외들을 하나의 타입으로 Exception (상위) 클래스 사용 가능하다.


    } // main end 
} // class end 
