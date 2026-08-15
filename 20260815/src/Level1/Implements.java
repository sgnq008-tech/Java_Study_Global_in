package Level1;

interface Drivable { 
    void drive(); 
}

interface Flyable { 
    void fly(); 
}

// implements 키워드로 두 인터페이스를 동시 구현
class FlyingCar implements Drivable, Flyable {
    @Override
    public void drive() { 
        System.out.println("운전"); 
    }

    @Override
    public void fly() { 
        System.out.println("비행"); 
    }
}