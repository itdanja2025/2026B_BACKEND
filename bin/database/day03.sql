drop database if exists mydb0807;
create database mydb0807;
use mydb0807;       -- ctrl+shift+enter : 전체실행 , ctrl+enter : 한줄실행
create table test(  -- create table 테이블명( 속성명 타입 제약조건 , 속성명 타입 제약조건 ) 
    번호 int auto_increment , 
    constraint primary key( 번호 ) , 
    이름 varchar(30) not null unique , 
    개수 int default 2
);
-- DML : 조작어 , 1) insert 레코드삽입  2) select 레코드조회 3) update 레코드수정 4) delete 레코드삭제
-- 레코드란? 테이블내 행/가로 단위
# [1] insert : insert into 테이블명( 속성명1, 속성명2) values( 값1, 값2 )
insert into test( 번호 , 이름 , 개수 ) values( 1 , "유재석" , 10 );
insert into test( 이름 , 개수 ) values( "강호동", 20 ); -- 번호 값 제외한 삽입, auto_increment 자동번호
insert into test( 이름 ) values( "신동엽" ); -- 번호(auto) , 개수(defalut) 제외한 삽입
-- insert into test( 이름 ) values( "유재석" ); -- 이름(unique)는 중복 불가능 / 오류
insert into test values( 4 , "하하" , 30 ); -- 모든 속성값을 정의 순서대로 값 대입시 속성명 생략
insert into test( 이름 ) values( "박명수" ) , ( "수박" ) , ( "바나나" ); -- 3개의 레코드 삽입 

# [2] select : select [*전체/속성명] from 테이블명 where 조건
select * from test; -- 테이블내 모든 속성[*]의 레코드 조회
select 이름 from test; -- 테이블내 '이름' 속성명의 레코드 조회
select 이름, 개수 from test; -- '이름' '개수' 속성명의 레코드 조회
select * from test where 이름 = "유재석"; -- 이름 속성명의 값이 유재석 이면 조회
select * from test where 개수 >= 5; -- 개수 속성명의 값이 5 이상이면 조회

# [3] update : update 테이블명 set 속성명 = 새로운값 , 속성명 = 새로운값 where 조건
update test set 개수 = 10;  -- 조건이 없으므로 테이블내 '개수'속성들의 값 *모두* 10 으로 수정
update test set 개수 = 30 where 이름 = "유재석"; -- 이름 속성값이 유재석 이면 개수 속성값을 30 수정
-- 번호 속성값이 2 이면 개수속성값을 40,이름속성값을 강호동2 수정
update test set 개수 = 40 , 이름 = "강호동2" where 번호 = 2; 

# [4] delete : delete from 테이블명 where 조건 
-- delete from test; -- 조건이 없으므로 테이블내 모든 레코드 제거 
delete from test where 이름 = "유재석"; -- 이름 속성값이 유재석 이면 삭제 
delete from test where 번호 = 2; -- 번호 속성값이 2 이면 삭제
-- (DML)delete : 테이블내 레코드 삭제 [vs] (DDL)truncate table : 테이블내 레코드 삭제 [vs] drop table : 테이블 자체 삭제 
-- DDL 은 취소 불가능 , DML(I/U/D) 취소(ROLLACK) 가능
