package Level2;

import java.util.LinkedList;
import java.util.Queue;

public class Level2_Set2_04 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // 큐에 A -> B -> C 순서대로 저장 (FIFO 구조)
        queue.offer("A");
        queue.offer("B");
        queue.offer("C");

        // [peek()]: 맨 앞 데이터("A")를 확인만 함 (삭제 X)
        // 출력: (B): A, 남은 개수: 3
        System.out.println("(B): " + queue.peek() + ", 남은 개수: " + queue.size());

        // [poll()]: 맨 앞 데이터("A")를 꺼내고 큐에서 제거함 (삭제 O)
        // 출력: (C): A, 남은 개수: 2
        System.out.println("(C): " + queue.poll() + ", 남은 개수: " + queue.size());
    }
}