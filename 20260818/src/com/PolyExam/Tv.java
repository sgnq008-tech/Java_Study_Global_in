package com.PolyExam;

 // TV, COMPUTER, AUDIO, BUYER
public class Tv extends Product {
    
    public Tv() 
    {
        super(100); // 부모 클래스의 생성자 Product(100) 호출
    }

    @Override
    public String toString() {
        return "Tv";
    }
}