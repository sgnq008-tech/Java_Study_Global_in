package Level4;

import java.util.*;

class Book {
    String title; // 책 제목
    int price;    // 가격

    public Book(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() { return title; }
    public int getPrice() { return price; }

    @Override
    public String toString() {
        return title + "(" + price + "원)";
    }
}

public class Level4_Test01 {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Java 정석", 30000));
        books.add(new Book("Spring 실전", 35000));
        books.add(new Book("Algorithm 기초", 30000));

        // 1. Comparator.comparingInt(Book::getPrice): 가격 기준 1차 비교기 생성
        // 2. reversed(): 기본 오름차순 정렬을 역순(내림차순, 비싼 순서)으로 뒤집음
        // 3. thenComparing(): 1차 기준(가격)이 같을 때 적용할 2차 비교 기준(제목 사전순 오름차순)을 연결
        books.sort(
            Comparator.comparingInt(Book::getPrice).reversed()
                      .thenComparing(Comparator.comparing(Book::getTitle))
        );

        System.out.println(books);
    }
}