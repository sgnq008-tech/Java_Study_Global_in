package Level1;

// 추상 클래스는 단독으로 new를 통해 객체를 만들 수 없습니다.
abstract class Shapes {
    public abstract void draw();

    public static void main(String[] args) {
        // Shape s = new Shape(); // ❌ 컴파일 에러 발생!
    }
}