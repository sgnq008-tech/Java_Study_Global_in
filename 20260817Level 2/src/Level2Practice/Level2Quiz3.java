package Level2Practice;

interface Printable {
    void printBody(); // 추상 메서드 (반드시 구현)

    // 디폴트 메서드 (기본 구현 제공)
    default void printHeader() {
        System.out.println("--- [기본 문서 헤더] ---");
    }
}

class CustomReport implements Printable {
    @Override
    public void printBody() {
        System.out.println("보고서 본문 내용을 출력합니다.");
    }

    // 디폴트 메서드 재정의(오버라이딩)
    @Override
    public void printHeader() {
        System.out.println("=== [특수 커스텀 헤더] ===");
    }
}

class Level2Quiz3 {
    public static void main(String[] args) {
        Printable p = new CustomReport();

        // ❓ [Q3] p.printHeader(); 실행 시 "--- [기본 문서 헤더] ---"와 "=== [특수 커스텀 헤더] ===" 중 무엇이 출력될까요?
        p.printHeader();
        p.printBody();
    }
}