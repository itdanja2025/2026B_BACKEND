package day09.종합예제.model.dao;

import java.util.ArrayList;
import day09.종합예제.model.dto.BoardDto;

public class BoardDao {
    private BoardDao(){}
    private static final BoardDao instance = new BoardDao();
    public static BoardDao getInstance(){ return instance; }
    // * 데이터베이스 대신에 ArrayList 사용하여 데이터베이스 표/데이터 역할 * 
    // * 추후에 MYSQL 서버와 연동 *
    private ArrayList< BoardDto > boardList = new ArrayList<>(); 
}
