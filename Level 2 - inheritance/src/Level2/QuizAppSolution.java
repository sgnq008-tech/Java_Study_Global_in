package Level2;

//==========================================
//[문제 1] 몬스터 공격 (super와 오버라이딩)
//==========================================
class Monster {
 void attack() {
     System.out.println("몬스터의 일반 공격!");
 }
}

class Slime extends Monster {
 @Override
 void attack() {
     super.attack(); // 부모(Monster) 클래스의 attack() 메서드를 먼저 실행
     System.out.println("슬라임의 점액 뿜기!");
 }
}

//==========================================
//[문제 2] 전기차 시스템 (추상 클래스와 생성자)
//==========================================
abstract class Car {
 String brand;

 Car(String brand) {
     this.brand = brand;
     System.out.println("1. " + brand + " 자동차 기본 프레임 생성");
 }

 abstract void speedUp();
}

class ElectricCar extends Car {
 ElectricCar(String brand) {
     super(brand); // 부모(Car) 생성자 호출 -> 1번 문장 출력
     System.out.println("2. 배터리 탑재 완료"); // 2번 문장 출력
 }

 @Override
 void speedUp() {
     System.out.println("3. 소음 없이 빠르게 부스터 가속!");
 }
}

//==========================================
//[문제 3] 스마트 조명 (인터페이스와 참조 변수 범위)
//==========================================
interface Switchable {
 void turnOn();
}

interface Dimmable {
 void setBrightness(int level);
}

class SmartLight implements Switchable, Dimmable {
 @Override
 public void turnOn() {
     System.out.println("조명이 켜졌습니다.");
 }

 @Override
 public void setBrightness(int level) {
     System.out.println("밝기가 " + level + "%로 설정되었습니다.");
 }
}

//==========================================
//실행 메인 클래스 (파일명: QuizAppSolution.java)
//==========================================
public class QuizAppSolution {
 public static void main(String[] args) {
     
     System.out.println("=== [문제 1 정답] ===");
     Monster m = new Slime();
     m.attack();
     /*
      * [출력 결과]
      * 몬스터의 일반 공격!
      * 슬라임의 점액 뿜기!
      */

     System.out.println("\n=== [문제 2 정답] ===");
     Car myCar = new ElectricCar("테슬라");
     myCar.speedUp();
     /*
      * [출력 결과 (순서: 1 -> 2 -> 3)]
      * 1. 테슬라 자동차 기본 프레임 생성
      * 2. 배터리 탑재 완료
      * 3. 소음 없이 빠르게 부스터 가속!
      */

     System.out.println("\n=== [문제 3 정답] ===");
     Switchable s = new SmartLight();
     s.turnOn();
     
     // Dimmable 인터페이스로 다운캐스팅하여 정상 실행
     ((Dimmable) s).setBrightness(80);
     /*
      * [출력 결과]
      * 조명이 켜졌습니다.
      * 밝기가 80%로 설정되었습니다.
      */
 }
}