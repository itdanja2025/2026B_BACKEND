package day13;

import java.util.Scanner;

public class Practice14 {
        public static void main(String[] args) {

        // [1] CSV형식
        // 차량2대( \n 기준 ) 3,211가6231,202608190930   //      8,452하1234,202608171227
        // 차량의 속성 3개( , 기준 )   3 // 211가6231 // 202608190930  // 8 // 452하1234 // 202608171227
        String carParkingList = "3,211가6231,202608190930\n8,452하1234,202608171227\n";
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("1.위치찾기 2.입차 3.출차 선택:");
            int ch = scan.nextInt();
            String[] carAry = carParkingList.split( "\n" );   // 차량별 추출( 여러개 배열/리스트 ) 
            if( ch == 1 ){ 
                String findCar = scan.next();
                // 배열또는 리스트 순회
                for( String car : carAry ) {
                    String[] info = car.split(","); // 차량별로 속성 추출 
                    if( info[1].equals(findCar) ){ // 2번째인덱스( 차량번호 )
                        System.out.println( info[0] ); // 1번째 인덱스( 위치 ) 반환 
                        break;
                    }
                }
                // // [2] 입력받은 차량번호가 문자열내 존재하면 인덱스 반환 
                // int findIndex = carParkingList.indexOf( findCar );
                // // [3] 찾은 인덱스의 문자열 반환
                // System.out.println( carParkingList.charAt( findIndex-2 ) ); 
            } // 위치찾기 구현 
            if( ch == 2 ){ 
                String inLocation = scan.next();
                String inCarNumber = scan.next();
                String inDateTime = scan.next();
                // 입력받은 값들을 위에 형식처럼 연결하기 /n , 
                String saveCar = inLocation + "," + inCarNumber + "," + inDateTime + "\n";
                // 저장하기
                carParkingList += saveCar;
            } // 입차 구현 
            if( ch == 3 ){ 

            } // 출차 구현
        }
    }
}
/* 
[ Practice14 ] 타워 주차 관리 시스템 데이터 처리
1. 문제 개요
주차장 관제 시스템에서 관리 중인 차량 데이터(carParkingList)는 단일 String으로 관리되고 있습니다. 
이 데이터를 기반으로 입차, 출차, 내 차량 위치 찾기 기능을 구현하세요.
단) 새로운 클래스 만들지 않습니다.

2. 데이터 규격
데이터 구분자:
행(객체/차량) 구분: 줄바꿈 문자 (\n)
열(속성) 구분: 쉼표 (,)
컬럼 순서: 위치번호,차량번호,날짜시간(YYYYMMDDhhmm)

초기 데이터 예시:
String carParkingList = "3,211가6231,202608190930\n8,452하1234,202608171227";

3. 구현 요구사항
다음 세 기능 구현하세요.
① 차량 위치 찾기 (findCarLocation)
기능: 차량 번호를 입력받아 현재 주차된 위치 번호를 반환합니다.
입력: carNumber (찾을 차량번호)
출력/반환:
차량이 존재할 경우: 주차 위치 번호 (예: "3")
차량이 없을 경우: "미등록 차량" 또는 -1 반환

② 입차 처리
기능: 새로운 차량의 주차 정보를 기존 데이터에 추가합니다.
조건:
이미 주차되어 있는 위치 번호에는 중복 주차할 수 없습니다
입력: location (위치번호), carNumber (차량번호), dateTime (입차일시)
출력/반환:
차량이 입차한 경우 : 주차 위치 번호 (예: "3")
차량이 입차가 없을 경우: 위치 번호에는 중복 주차할 수 없습니다. (위치 중복 시 입차 불가 메시지 출력)

③ 출차 처리
기능: 출차할 차량 번호를 입력받아 해당 차량의 행을 carParkingList에서 삭제합니다.
입력: carNumber (출차할 차량번호)
반환: 해당 차량이 제거되고 줄바꿈이 올바르게 정리된 갱신된 carParkingList 문자열
기본 정책: 최초 30분 무료추가 요금: 30분 초과 시, 10분당 1,000원 (10분 단위 절상/올림 계산)
예: 31분 ~ 40분 주차 -> 1,000원	
예: 41분 ~ 50분 주차 -> 2,000원
일일 최대 요금: 24시간(1일)당 최대 20,000원여러 날에 걸쳐 주차한 경우, 
각 일자 단위로 계산 후 합산하거나 총 일수×20,000원 + 잔여시간 요금(최대 20,000원)을 적용합니다.

*/
