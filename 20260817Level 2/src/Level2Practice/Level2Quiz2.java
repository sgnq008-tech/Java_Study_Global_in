package Level2Practice;

abstract class GameCharacter {
    String nickname;

    // 추상 클래스의 생성자
    GameCharacter(String nickname) {
        this.nickname = nickname;
        System.out.println("1. [시스템] " + nickname + " 캐릭터 기본 정보 생성");
    }

    abstract void attack();
}

class Warrior extends GameCharacter {
    Warrior(String nickname) {
        super(nickname); // 부모 생성자 호출
        System.out.println("2. [시스템] 전사(Warrior) 직업 생성 완료");
    }

    @Override
    void attack() {
        System.out.println("3. [스킬] 검을 휘둘러 강력한 공격!");
    }
}

class Level2Quiz2 {
    public static void main(String[] args) {
        // ❓ [Q2] 아래 코드가 실행될 때 1, 2, 3 번 문장은 어떤 순서대로 출력될까요?
        GameCharacter hero = new Warrior("타이탄");
        hero.attack();
    }
}