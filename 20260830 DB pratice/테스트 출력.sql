-- 1. 기본 테이블 조회 및 구조 확인
SELECT * FROM tab;
SELECT * FROM emp;
DESC emp;
SELECT * FROM dept;
DESC dept;

-- 2. 기본 SELECT 및 별칭(Alias), DISTINCT
SELECT deptno, dname FROM dept;
SELECT ename, sal, hiredate FROM emp;

-- 별칭 사용 예시 (공백/특수문자/대소문자 구분을 원할 땐 쌍따옴표 사용)
SELECT deptno AS DepartmentNo, dname AS DepartmentName FROM dept;
SELECT deptno "DepartmentNo", dname "DepartmentName" FROM dept;
SELECT deptno 부서번호, dname 부서이름 FROM dept;

-- 중복 제거
SELECT DISTINCT job FROM emp;
SELECT DISTINCT deptno FROM emp;

-- 3. WHERE 조건절 및 연산자
-- 비교 연산자
SELECT empno, ename, sal FROM emp WHERE sal >= 3000;
SELECT empno, ename, sal FROM emp WHERE sal < 3000;
SELECT * FROM emp WHERE deptno = 10;
SELECT empno, ename, sal FROM emp WHERE sal < 2000;

-- 문자/날짜 데이터 조회 (대소문자 구분 및 단일 따옴표 필수)
SELECT empno, ename, sal FROM emp WHERE ename = 'SCOTT';
SELECT empno, ename, sal FROM emp WHERE ename = 'MILLER';
SELECT ename, hiredate FROM emp WHERE hiredate >= '85/01/01';

-- 논리 연산자 (AND, OR, NOT)
SELECT ename, deptno, job FROM emp WHERE deptno = 10 AND job = 'MANAGER';
SELECT ename, sal FROM emp WHERE sal >= 1000 AND sal <= 3000;
SELECT ename, deptno, job FROM emp WHERE deptno = 10 OR job = 'MANAGER';
SELECT empno, ename, sal FROM emp WHERE empno = 7844 OR empno = 7654 OR empno = 7521;
SELECT * FROM emp WHERE NOT deptno = 10;
SELECT * FROM emp WHERE NOT job = 'MANAGER';

-- 범위(BETWEEN) 및 다중값(IN) 연산자
SELECT ename, sal FROM emp WHERE sal BETWEEN 1000 AND 3000;
SELECT empno, ename, sal FROM emp WHERE sal BETWEEN 1500 AND 2500;
SELECT empno, ename, sal FROM emp WHERE empno IN (7844, 7654, 7521);
SELECT ename, sal, comm FROM emp WHERE comm IN (300, 500, 1400);

-- LIKE 패턴 매칭 연산자
SELECT empno, ename FROM emp WHERE ename LIKE 'K%';
SELECT empno, ename FROM emp WHERE ename LIKE '%K%';
SELECT empno, ename FROM emp WHERE ename LIKE '_A%';
SELECT empno, ename FROM emp WHERE ename NOT LIKE '%A%';

-- NULL 처리 (IS NULL / IS NOT NULL)
SELECT ename, comm, job FROM emp WHERE comm IS NULL;
SELECT ename, comm, job FROM emp WHERE comm IS NOT NULL;
SELECT empno, ename, mgr, job FROM emp WHERE mgr IS NULL;

-- 4. 정렬 (ORDER BY)
SELECT empno, ename FROM emp ORDER BY empno ASC;
SELECT empno, ename FROM emp ORDER BY empno DESC;
SELECT empno, ename, sal FROM emp ORDER BY sal DESC;
SELECT empno, ename, hiredate FROM emp ORDER BY hiredate DESC;