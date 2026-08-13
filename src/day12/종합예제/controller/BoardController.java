package day12.종합예제.controller;

import day12.종합예제.model.dao.BoardDao;
import day12.종합예제.model.dto.BoardDto;

public class BoardController {
    private BoardController(){}
    private static final BoardController instance = new BoardController();
    public static BoardController getInstance(){ return instance; }
    //[*] MVC패턴 흐름의 dao 싱글톤 호출
    private BoardDao bd = BoardDao.getInstance();

    // [1] 등록 Controller
    public boolean save( BoardDto boardDto ){
        boolean result = bd.save( boardDto ); // view에게 전달받은 매개변수을 dao에게전달
        return result; // dao에게 받은 결과을 view 반환
    }
}