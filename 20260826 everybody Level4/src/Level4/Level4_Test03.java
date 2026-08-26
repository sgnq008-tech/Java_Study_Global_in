package Level4;

import java.util.*;

public class Level4_Test03 {
    public static void main(String[] args) {
        Map<String, Integer> salesMap = new HashMap<>();

        String[] items = { "노트북", "마우스", "노트북", "키보드", "마우스" };
        int[] prices = { 100, 2, 120, 5, 3 };

        for (int i = 0; i < items.length; i++) {
            
            // Map.merge(Key, Value, RemappingFunction):
            // 1. Map에 해당 Key가 없으면 -> Value(prices[i])를 그대로 등록
            // 2. Map에 해당 Key가 이미 존재하면 -> (기존 값, 새로운 값)을 람다식으로 연산하여 결과를 덮어씀
            salesMap.merge(items[i], prices[i], Integer::sum);
        }

   
        // (노트북: 100+120=220, 마우스: 2+3=5, 키보드: 5)
        System.out.println(salesMap);
    }
}