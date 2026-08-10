package day09.종합예제.controller;

import day09.종합예제.model.dao.BoardDao;

public class BoardController {
    private BoardController(){}
    private static final BoardController instance = new BoardController();
    public static BoardController getInstance(){ return instance; }
    private BoardDao bd = BoardDao.getInstance(); // * controller 에서 dao 싱글톤 호출 
}
