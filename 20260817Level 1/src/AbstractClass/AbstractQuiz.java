package AbstractClass;

//부모 추상 클래스
abstract class AnimalAbstract {
 // 일반 메서드
 void eat() {
     System.out.println("음식을 먹습니다.");
 }

 // 추상 메서드 (몸체 {}가 없고 ;으로 끝남 -> 자식이 반드시 오버라이딩해야 함)
 abstract void move();
}

//자식 클래스
class LionAbstract extends AnimalAbstract {
 @Override
 void move() {
     System.out.println("사자가 네 발로 껑충껑충 달립니다.");
 }
}

class AbstractQuiz {
 public static void main(String[] args) {
     
     // ❓ [Q1] 아래 주석을 풀고 실행하면 어떻게 될까요?
     // AnimalAbstract a = new AnimalAbstract();

     // 추상 클래스 타입으로 자식 객체 가리키기 (업캐스팅)
     AnimalAbstract lion = new LionAbstract();
     lion.eat();
     
     // ❓ [Q2] 아래 코드를 실행했을 때 출력되는 문장은 무엇일까요?
     lion.move();
 }
}