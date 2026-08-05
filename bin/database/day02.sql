drop database if exists mydb0805; # [1] 데이터베이스 삭제 # ctrl+엔터
create database mydb0805;   # [2] 데이터베이스 생성 
show databases; # [3] 데이터베이스 목록 
use mydb0805; # [4] 사용할 데이터베이스 선택
# ----------------------------------------------------------------- # 
# DDL : 데이터베이스/테이블 생성/삭제/수정 질의어 ( ** 트랜잭션 불가능 / 오토커밋 ** )
# 1) 테이블 생성 : 1. 테이블생성할 데이터베이스 활성화   2)  create table 테이블명( 속성명 타입, 속성명 타입 );
create table test1( 필드명1 int , 필드명2 double , 필드명3 text );
# 2) 테이블 목록 조회 
show tables;
# 3) 특정 테이블의 속성 확인 
describe test1;
# 4) 특정 테이블 삭제
drop table test1;
# 5) 테이블 수정 
# 1) 필드/속성 추가 
alter table test1 add 필드명4 float;
# 2) 필드/속성의 타입 수정 
alter table test1 modify 필드명3 longtext;
# 3) 필드/속성명 , 타입 수정
alter table test1 change 필드명1 필드명5 bigint;

# 6) 테이블 이름 변경 
rename table test1 to new_test1;

# 7) 테이블내 모든 레코드(행/데이터) 삭제 
truncate table new_test1;
# ----------------------------------------------------------------- # 
# 테이블의 속성/필드 타입 *DBMS 회사마다 차이*
use mydb0805;
-- create table test2( 필드명 타입 , 필드명 타입 , 필드명 타입 );
create table test2( 
    정수필드1 tinyint , 정수필드2 smallint , 정수필드3 mediumint , 
    정수필드4 int     , 정수필드5 bigint   , 정수필드6 int unsigned , 
    -- unsigned 부호없다. tinyint(1바이트 -128 ~ 127 ) --> 0 ~ 225
    실수필드1 float   , 실수필드2 double   , 실수필드3 decimal , 
    -- decimal 문자타입 이면서 소수점 오차 없음 
    날짜필드 date     , 시간필드 time      , 날짜시간필드 datetime , 
    문자필드1 char(3) , 문자필드2 varchar(3) , 문자필드3 text , 문자필드4 longtext , 
    -- char( 문자 고정길이 ~255 )  vs  varchar( 문자 가변길이 ~255 )
    -- 예] "수박" --> char( [수][박][x] ) vs varchar( [수][박] )
    -- 사진이 포함된 게시물내용 저장시 : 4GB 까지 가능한 longtext 권장
    논리필드 boolean -- boolean(1비트) --> tinyint(1), 마지막 필드타입 뒤로 , 넣지 마세요!
);
describe test2; -- 테이블 속성 확인
