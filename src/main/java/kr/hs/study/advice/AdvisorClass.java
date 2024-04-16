package kr.hs.study.advice;

// 삽입될 메서드들이 (advice)에 들어있는 클래스
public class AdvisorClass {
    public void beforeMethod() {
        System.out.println("beforMethod 먼저 실행");
    }

    public void afterMethod() {
        System.out.println("afterMethod 나중에 실행");
    }
}
