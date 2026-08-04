package day05;

public class Practice7 {
    public static void main(String[] args) {
        // [1] 1.객체 생성, new 생성자명();  또는  타입 변수명 = new 생성자명();
        Book b1 = new Book();   
        // 2.객체 멤버변수 수정
        b1.title="이것이 자바다";   b1.author="신용권"; b1.price=30000;
        Book b2 = new Book();
        b2.title="자바의 정석";     b2.author="남궁성"; b2.price=28000;
        // 3.객체 멤버변수 출력
        System.out.printf( "%s, %s, %d \n", b1.title, b1.author, b1.price );
        System.out.printf( "%s, %s, %d \n", b2.title, b2.author, b2.price );

        // [2] 
        Pet p1 = new Pet(); p1.name="초코"; p1.species="푸들"; p1.age=3;
        Pet p2 = new Pet(); p2.name="나비"; p2.species="코리안숏헤어"; p2.age=5;
        System.out.printf( "%s, %s, %d \n", p1.name, p1.species, p1.age );
        System.out.printf( "%s, %s, %d \n", p2.name, p2.species, p2.age );

        // [3] 객체는 초기값이 없으면 기본값 자동할당
        // * 정수:0 , 실수:0.0 , 논리:false , 객체:null
        Rectangle r1 = new Rectangle();
        System.out.println( r1.width ); // 0 들어있는 이유는 기본값 할당
        r1.width = 10; r1.height = 5;
        System.out.println( r1.width * r1.height );

        // [4] 
        BankAccount bank1 = new BankAccount();
        bank1.accountNumber = "111-222-3333";
        bank1.ownerName = "유재석";
        bank1.balance = 10000;
        bank1.balance += 5000; System.out.println( bank1.balance );  // 입금 후 출력 
        bank1.balance -= 3000; System.out.println( bank1.balance );  // 출금 후 출력 

        // [5]
        Product prod1 = new Product();  prod1.name="새우깡";    prod1.price=1500;
        Product prod2 = new Product();  prod2.name="콜라";      prod2.price=2000;
        if( prod1.price > prod2.price ){ System.out.println( prod1.name );}
        else{ System.out.println( prod2.name); }
        
    }
}


// [1] 객체 정의 
// 1. 클래스선언 : 기존 class{ } 밖에 새로운 클래스선언{ }
// 2. 멤버변수선언: { } 안에 멤버변수 선언
class Book{ 
    String title;
    String author;
    int price;
}

// [2]
class Pet{
    String name;
    String species;
    int age;
}
// [3]
class Rectangle{
    int width;
    int height;
}
// [4]
class BankAccount{
    String accountNumber;
    String ownerName;
    int balance;
}
// [5]
class Product{
    String name;
    int price;
}


/*[문제 6] Member 클래스를 만드세요. id(문자열)와 isLogin(boolean) 멤버 변수를 가집니다.
1. main 함수에서 Member 객체를 하나 생성하고, 아이디는 "admin", isLogin은 false로 초기화하세요.
2. "로그인 전 상태: [isLogin 값]"을 출력하세요.
3. 객체의 isLogin 값을 true로 변경하여 로그인 상황을 구현하세요.
4. "로그인 후 상태: [isLogin 값]"을 출력하세요.*/

/*[문제 7] Television 클래스를 만드세요. channel(정수)과 volume(정수) 멤버 변수를 가집니다.
1. main 함수에서 Television 객체를 생성하고, channel은 7, volume은 20으로 초기화하세요.
2. 객체의 channel 값을 11로 변경하고, volume 값은 2 감소시킨 뒤, 변경된 채널과 볼륨을 출력하세요.*/

/*[문제 8] Player 클래스를 만드세요. name(문자열), power(정수), speed(정수) 멤버 변수를 가집니다.
1. main 함수에서 Player 객체 2개를 생성하세요.
2. 첫 번째 객체에는 "손흥민", 90, 95를, 두 번째 객체에는 "이강인", 85, 92를 각각 저장하세요.
3. 두 객체의 power와 speed의 합을 각각 계산하고, 합이 더 높은 선수의 이름을 출력하세요.*/

/*[문제 9] MenuItem 클래스를 만드세요. name(문자열), price(정수), isSignature(boolean, 대표메뉴 여부) 멤버 변수를 가집니다.
1. main 함수에서 MenuItem 객체 3개를 생성하고, 첫 번째는 "김치찌개", 8000, true, 두 번째는 "된장찌개", 8000, false, 세 번째는 "계란찜", 3000, false로 저장하세요.
2. if문을 사용하여 isSignature가 true인 메뉴 객체를 찾아, "[대표메뉴] [메뉴이름] : [가격]원" 형식으로 출력하세요.*/

/*[문제 10] UserProfile 클래스를 만드세요. name(문자열), age(정수), mbti(문자열) 멤버 변수를 가집니다.
1. main 함수에서 UserProfile 객체를 하나 생성하세요.
2. Scanner를 사용하여 사용자로부터 이름, 나이, MBTI를 순서대로 입력받으세요.
3. 입력받은 값들을 생성된 객체의 각 멤버 변수에 저장하세요.
3. 모든 정보가 저장된 객체의 멤버 변수들을 가져와 "--- 프로필 ---", "이름: [이름]", "나이: [나이]", "MBTI: [MBTI]" 형식으로 출력하세요.*/

