package day04;

import java.util.Arrays;

public class Practice6 {
    public static void main(String[] args) {
        
        // 1. 타입[] 변수명 = { 값1 , 값2 , 값3 } , 배열변수[인덱스]
        int[ ] numbers1 = { 10, 20, 30, 40, 50 }; System.out.println( numbers1[2] );
        // 2. 타입[] 변수명 = new 타입[ 총개수 ];
        String[ ] season = new String[ 3 ];
        season[0] = "봄";   season[1] = "여름";     season[2] = "가을";
        System.out.println( Arrays.toString(season) );
        // 3. for vs 향상된for문 
        String[ ] fruits = {"사과", "바나나", "포도", "딸기"};
        for( int index = 0 ; index <= fruits.length - 1 ; index++ ){ System.out.println( fruits[index] ); } 
        // vs
        for( String str : fruits ){ System.out.println( str ); }
        // 4. 배열변수명.length : 배열내 요소총길이 , 자동타입변환 : 연산시 두 항의 자료타입중 더 큰 타입으로 결과
        int[ ] scores1 = {85, 92, 78, 65, 95};
        int 합계4 = 0;
        for( int score : scores1 ){ // :콜론 기준으로 오른쪽에 배열 , 왼쪽에는 타입 반복변수명 
            합계4 += score;
        }
        System.out.printf( "합계: %d , 평균: %f \n" , 합계4 , 합계4 / (double)scores1.length ); // 5 -> 5.0
        
        // 5. 
        int[ ] scores2 = {77, 82, 100, 54, 96};
        for( int score : scores2 ){
            if( score == 100 ) { System.out.println("만점자!"); break;}
        }
        // 6.
        String[ ] bloodTypes = {"A", "B", "O", "AB", "A", "B", "A"};
        int count = 0;
        for( String str : bloodTypes ){
            if( str.equals("A") ){ count++; } // 만약에 "A" 이면 count 1 증가 
        }
        System.out.println( count );

        // 7. 
        int[ ] numbers2 = {23, 5, 67, 12, 88, 34};
        int max = numbers2[0]; // 첫번째 값을 max 정하고 , 만약에 max 보다 i번째 요소값이 더 크면 max에 대입  
        for( int number : numbers2 ){ if( max < number ) max = number; }
        System.out.println( max );

    } // main end 
} // class end 

/*[문제 8] products(상품 목록)와 stock(재고 수량) 배열이 있습니다. (*상품명과 재고수량 인덱스가 같다는 가정 )
Scanner를 이용해 사용자로부터 구매할 상품명과 수량을 입력받아, 재고가 충분하면 "구매 완료!"를 출력하고 재고를 차감하세요.
재고가 부족하면 "재고가 부족합니다."를, 없는 상품이면 "없는 제품명입니다."를 출력합니다.
선언 코드:
String[] products = {"볼펜", "노트", "지우개"};
int[] stock = {10, 5, 20};*/

/*[문제 9] 주어진 영화 이름과 평점 배열을 이용하여, 각 영화의 평점을 별(★, ☆)로 시각화하여 출력하는 프로그램을 작성하시오.(* 영화명과 평점 인덱스가 같다는 가정 )
요구 조건: 각 영화의 평점(10점 만점)만큼 꽉 찬 별(★)을, 나머지 점수만큼 빈 별(☆)을 출력합니다.
예시: 평점이 8점이면 ★★★★★★★★☆☆ (총 10개의 별)
선언 코드:
String[] movieNames = {"히든페이스", "위키드", "글래디에이터2", "청설"};
int[] movieRatings = {8, 4, 7, 6};
출력 예시:
히든페이스 ★★★★★★★★☆☆
위키드 ★★★★☆☆☆☆☆☆
글래디에이터2 ★★★★★★★☆☆☆
청설 ★★★★★★☆☆☆☆*/

/*[문제 10] 차량별 주차 시간 데이터가 주어졌을 때, 아래의 요금 규정에 따라 각 차량이 지불해야 할 최종 주차 요금을 계산하여 출력하시오.(* 차량번호 와 이용시간 인덱스가 같다는 가정 )
요금 규정:
기본 요금: 최초 30분까지 1,000원
추가 요금: 30분 초과 시, 매 10분마다 500원씩 추가
일일 최대 요금: 20,000원 (아무리 오래 주차해도 20,000원을 초과할 수 없음)
선언 코드:
String[] carNumbers = {"210어7125", "142가7415", "888호8888", "931나8234"};
int[] usageMinutes = {65, 30, 140, 420};
출력 예시:
210어7125: 65분 주차, 최종 요금: 2500원
142가7415: 30분 주차, 최종 요금: 1000원
888호8888: 140분 주차, 최종 요금: 6500원
931나8234: 420분 주차, 최종 요금: 20000원*/