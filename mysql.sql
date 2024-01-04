-- SQL(구조화 질의 언어)
-- MySQL DBMS(RDBMS:관계형데이터베이스)-> TABLE(관리)
create database bigdata;

create table student(
     num int not null primary key auto_increment,
     name varchar(50),
     tel varchar(50),
     age int,
     email varchar(50)
);
-- CRUD
insert into student(name,tel,age,email) 
values('홍길동','01011111111',20,'aaaaa@naver.com');

select * from student; 

insert into student(name,tel,age,email) 
values('김상원','01027022952',24,'siosa5623@naver.com');
-- num가 2인 학생의 나이를 99로 수정하세요?
update student set age=99 where num=2;
update student 
set tel='010-2222-4444', email='2952@naver.com'
where num=2;


-- 2번 학생을 삭제하세요
delete from student
where num=2;

-- 테이블 삭제(drop)