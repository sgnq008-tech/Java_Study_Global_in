package com.abstractex;
/* 추상 클래스의 상속 관계
 * - 추상 클래스들간에도 상속이 가능하다.
 * 	일반 클래스들간의 상속과 유사하지만, 추상클래스들간의 상속에서는
 * 	상속받은 추상메소들을 반드시 재정의할 필요는 없다.
 * 
 * 그냥 상속해 두었다가 언젠간 일반 클래스와 상속관계가 이루어지면
 * 그때 재정의하지 못한 상속받은 추상 메소드들을 모두 일반클래스 내에서
 * 재정의 해도 되기 때문이다.
 * 
 */

public class AbsEx1 {
	

    
    abstract static class AbsClass1 {
        int a = 100;
        final String str = "abstract test"; 

        public String getStr() {
            return str;
        }
        abstract public int getA();
    }

    abstract static class AbsEx2 extends AbsClass1 {
        @Override
        public int getA() {
            return a;
        }

        @Override
        public abstract String getStr(); // getStr()을 다시 추상 메서드로 재선언
    }


    static class AbsEx extends AbsEx2 {

        public static void main(String[] args) {
            AbsEx ae = new AbsEx();
            System.out.println("ae.getA(): " + ae.getA());
            System.out.println("ae.getStr(): " + ae.getStr());
        }
        @Override
        public String getStr() {//AbsEx2의 추상 메소드를 재정의 했음
            return str;// AbsEx1 클래스의 멤버변수 
        }
    }
}
