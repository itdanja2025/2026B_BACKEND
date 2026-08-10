package day08;


public class Practice10 {
    public static void main(String[] args) {
        // [1]
        Member member = new Member();
        member.setId( "admin"); 
        System.out.println( member.getId() );
        // [2]
        Score score = new Score();
        score.setScore( 85 );
        score.setScore( 120 );
    }
}

// [1]
class Member{
    private String id; // 외부 클래스에서 접근 불가능한 멤버변수
    // 오른쪽 -> 소스작업 -> setter and getter 
    public String getId() { return id;  } // 멤버변수에 값 대입하는 메소드 
    public void setId(String id) {  this.id = id;  } // 멤버변수에 값 호출하는 메소드
}

// [2]
class Score{
    private int score;
    public void setScore( int score ){
        if( score >=0 && score <= 100 ){ this.score = score;}
        System.out.println("유효하지 않은 점수");
    }
}