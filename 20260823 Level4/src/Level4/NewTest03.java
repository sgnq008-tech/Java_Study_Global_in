package Level4;

import java.util.*;

public class NewTest03 {

    // [정답] 괄호 짝 맞추기 유효성 검사 메서드
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        // 문자열을 한 글자씩 순회
        for (char c : s.toCharArray()) {
            // 1. 여는 괄호는 스택에 쌓음 (push)
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } 
            // 2. 닫는 괄호가 나왔을 때의 처리
            else if (c == ')' || c == '}' || c == ']') {
                // 여는 괄호가 없는데 닫는 괄호가 먼저 나오면 무조건 불일치(false)
                if (stack.isEmpty()) {
                    return false;
                }

                // 스택의 맨 위에서 가장 최근에 들어온 여는 괄호를 꺼냄 (pop)
                char top = stack.pop();

                // 짝이 맞지 않는 경우 즉시 false 반환
                if (c == ')' && top != '(') return false;
                if (c == '}' && top != '{') return false;
                if (c == ']' && top != '[') return false;
            }
        }

        // 모든 문자를 처리한 뒤 스택에 닫히지 않고 남은 여는 괄호가 없어야 정상(true)
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String test1 = "{[()]}";
        String test2 = "{[(])}";
        String test3 = "((())";

        System.out.println(test1 + " -> " + isValid(test1)); // true
        System.out.println(test2 + " -> " + isValid(test2)); // false (순서 불일치)
        System.out.println(test3 + " -> " + isValid(test3)); // false (덜 닫힘)
    }
}