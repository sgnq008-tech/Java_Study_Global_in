package Array;

public class Cars {
    String model;

    // 매개변수(String modelName)를 받는 생성자
    public Cars(String modelName) {
        model = modelName; // 입력받은 값을 model 변수에 대입
        // System.out.println(...);
        System.out.println(model + " 차가 출고되었습니다!");
    }

    public void drive() {
        System.out.println(model + "가 출발합니다!");
    }
}