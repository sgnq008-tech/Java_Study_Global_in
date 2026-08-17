package Level2Practice;

interface ButtonClickListener {
    void onClick();
}

class Button {
    void click(ButtonClickListener listener) {
        listener.onClick();
    }
}

class Level2Quiz4 {
    public static void main(String[] args) {
        Button btn = new Button();

        // 익명 클래스로 ButtonClickListener 인터페이스를 1회용 즉석 구현
        btn.click(new ButtonClickListener() {
            @Override
            public void onClick() {
                System.out.println("버튼이 클릭되었습니다! 팝업창을 엽니다.");
            }
        });

        // ❓ [Q4] 익명 클래스는 일회성 객체입니다. 그렇다면 익명 클래스로 만든 객체는 다른 곳에서 이름(클래스명)을 불러서 재사용할 수 있을까요? ( O / X )
    }
}