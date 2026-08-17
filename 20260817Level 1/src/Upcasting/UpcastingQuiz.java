package Upcasting;

//부모 클래스
class Phone {
 void call() {
     System.out.println("전화를 겁니다.");
 }
}

//자식 클래스
class SmartPhone extends Phone {
 // 자식 고유 기능 (부모에게는 없음)
 void playApp() {
     System.out.println("앱을 실행합니다.");
 }
}

class UpcastingQuiz {
 public static void main(String[] args) {
     
     // 1. 업캐스팅 발생 (자식 SmartPhone 객체를 부모 Phone 변수에 대입)
     Phone myPhone = new SmartPhone();

     // ❓ [질문 1] 아래 메서드 호출은 정상 실행될까요, 아니면 컴파일 에러가 날까요?
     myPhone.call();

     // ❓ [질문 2] 아래 코드의 주석을 풀고 실행하면 어떻게 될까요?
     // myPhone.playApp();
 }
}