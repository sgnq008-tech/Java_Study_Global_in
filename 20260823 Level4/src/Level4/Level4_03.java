package Level4;

import java.util.*;

// 부모 클래스
class Animal {
    public void sound() {
        System.out.println("동물 소리");
    }
}

// 자식 클래스 1
class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}

// 자식 클래스 2
class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("야옹");
    }
}

public class Level4_03 {
    // [정답 (가)] List<? extends Animal> list:
    // "Animal 클래스이거나 Animal을 상속받은 자식 타입(Dog, Cat 등)으로 이루어진 리스트는 모두 매개변수로 받겠다"는 의미
    // (List<Animal>로만 적으면 List<Dog>, List<Cat>은 다형성이 적용되지 않아 전달할 수 없음)
    public static void makeAllSounds(List<? extends Animal> list) {
        for (Animal a : list) {
            // 동적 바인딩에 의해 각 자식 객체(Dog, Cat)가 재정의한 sound() 메서드가 실행됨
            a.sound();
        }
    }

    public static void main(String[] args) {
        // Dog 리스트 생성 및 초기화
        List<Dog> dogs = Arrays.asList(new Dog(), new Dog());
        // Cat 리스트 생성 및 초기화
        List<Cat> cats = Arrays.asList(new Cat());

        // ? extends Animal 덕분에 List<Dog>와 List<Cat> 모두 오류 없이 전달 가능
        makeAllSounds(dogs); // 출력: 멍멍 \n 멍멍
        makeAllSounds(cats); // 출력: 야옹
    }
}