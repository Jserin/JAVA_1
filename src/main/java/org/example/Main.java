package org.example;

public class Main {
    public static void main(String[] args) {
        /* System.out.println("ㅎㅇㅎㅇ\nㅎㅇㅎㅇ\nㅎㅇㅎㅇ\nㅎㅇㅎㅇ\nㅎㅇㅎㅇ\nㅎㅇㅎㅇ"); */
        /* int a = 5;
    int b = 10;
    int c;

    c = a;
    a = b;
    b = c;

    System.out.println(a);
    System.out.println(b); */
        /* int x = 10;
        System.out.println(x);
        System.out.println("x");
        System.out.println("x" + 10);
        System.out.println(x +10);

        System.out.println("x: " + (x + 2));
        System.out.println("x: " + (x - 2));
        System.out.println("x: " + (x * 2));
        System.out.println("x: " + (x / 2));
        System.out.println("x: " + (x % 2)); */

        /* int age = 35;
        System.out.println("당신의 나이 : " + age); */

        /* if (age >= 20) {
            System.out.println("성인입니다.");
        } else {
            System.out.println(("미성년자입니다."));
        } */

        /*  // 청년 검사
        if (age >= 20 && age <= 34) {
            System.out.println("청년입니다.");
        } else {
            System.out.println("청년이 아닙니다.");
        } */

        /* 참,거짓 분류
        if (true) {
            System.out.println("참");
        }

        if (false) {
            System.out.println("거짓");
        }

        int a = 10;

        // `==` => 같다.
        if (a == 10) {
            System.out.println("참");
        }

        // `!=` => 같지 않다.
        if (a != 10) {
            System.out.println("거짓");
        }

        if (a > 10) {
            System.out.println("거짓");
        }

        if (a >= 10) {
            System.out.println("참");
        }

        int b = 10;

        if (a == b) {
            System.out.println("참");
        }

        // boolean c => c 에는 오직 true/false 만 담을 수 있다.
        boolean c = a != b; // c = false

        if (c) {
            System.out.println("거짓");
        }

        if (c == false) {
            System.out.println("참");
        }

        // `!` => 반전
        if (!c) {
            System.out.println("참");
        }

        // `!` => 반전
        if (!(!c)) {
            System.out.println("거짓");
        }

        boolean d = true;

        if (c != d) {
            System.out.println("참");
        }

        if (20 > 2 && 10 > 3 && true != false && 10 != 10) {
            System.out.println("거짓");
        }

        if (10 != 10 || 10 < 2) {
            System.out.println("거짓");
        } */

        /* if 문제
// 문제 : 할인 대상인지 아닌지 출력해주세요.
// 조건 : 나이가 19세 이하이거나 60세 이상이면 할인 대상입니다.
// 조건 : 출력예시 처럼 출력되어야 합니다.
// 조건 : `구현시작` 부분만 수정 할 수 있습니다.
// 조건 : 4가지 이상의 방법으로 풀어야 합니다.
// 조건 : 그 중 2가지 방법은 `&&, ||`없이 풀어야 합니다.

        int age = 30; // 이 값을 바꿔가면서 실행해보세요.

        System.out.println("당신의 나이는 " + age + "살 입니다.");
        // 구현시작
        // if 만 사용
        if (age < 60) {
            if (age <= 19) {
                System.out.println("할인대상 입니다.");
            }
            if (age > 19) {
                System.out.println("할인대상이 아닙니다.");
            }
        }
        if (age >= 60) {
            System.out.println("할인대상 입니다.");
        }

        // if else
        if (age <= 19) {
            System.out.println("할인대상 입니다.");
        } else if (age >= 60) {
            System.out.println("할인대상 입니다.");
        } else {
            System.out.println("할인대상이 아닙니다.");
        }

        // &&
        if (age > 19 && age < 60) {
            System.out.println("할인대상이 아닙니다.");
        } else {
            System.out.println("할인대상 입니다.");
        }

        // ||
        if (age <= 19 || age >= 60) {
            System.out.println("할인대상 입니다.");
        } else {
            System.out.println("할인대상이 아닙니다.");
        }
        // 출력 => 할인대상입니다. 또는 할인 대상이 아닙니다.
*/

        /* // 구구단 반복문x
        System.out.println("8 * 1 = 8");
        System.out.println("8 * 2 = 16");
        System.out.println("8 * 3 = 24");
        System.out.println("8 * 4 = 32");
        System.out.println("8 * 5 = 40");
        System.out.println("8 * 6 = 48");
        System.out.println("8 * 7 = 56");
        System.out.println("8 * 8 = 64");
        System.out.println("8 * 9 = 72");


        // 구구단 변수 사용
        int dan = 8;

        System.out.println(dan + " * 1 = 8");
        System.out.println(dan + " * 2 = 16");
        System.out.println(dan + " * 3 = 24");
        System.out.println(dan + " * 4 = 32");
        System.out.println(dan + " * 5 = 40");
        System.out.println(dan + " * 6 = 48");
        System.out.println(dan + " * 7 = 56");
        System.out.println(dan + " * 8 = 64");
        System.out.println(dan + " * 9 = 72");


        // 구구단 변수, 반복문 사용
        for (var i = 1; i <= 9; i++) {
            System.out.println(dan + " * " + i + " = " + dan * i);
        }
        */

        /*
        // while 사용
        while (i <= 1000) {
            System.out.println(dan + " * " + i + " = " + dan * i);
            i++;
        }*/
        /*int dan = 8;
        for (int i = 0; i <= 1000; i++) {
            System.out.println(dan + " * " + i + " = " + dan * i);
        }*/

        /* int i = -100;
        while (i <= 25) {
            System.out.println(i);
            i++;
        }
        System.out.println("----------------------------------------");
        int a = 100;
        while (a > 0) {
            System.out.println(a);
            a--;
        }

        System.out.println("----------------------------------------");
        for (int b = 100; b > 0; b--) {
            System.out.println(b);
        }*/

        // 0310
        /* int a = 50;
        int answer = 0 ;

        int[] arr1 = {1,2,3};
        for (int i = 0; i < arr1.length; i++) {
            answer = answer + arr1[i];
        }
        System.out.println(answer / arr1.length); */

        /* int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 11;
        arr[2] = 111;

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]); */

        //class
        // 설계도 a설계도 = new 설계도();
        /* car car1 = new car();
        car car2 = new car();

        car1.speed = 100;
        car2.speed = 200;

        System.out.println(car1.b);
        System.out.println(car2.a);
        System.out.println(car1.speed);
        System.out.println(car2.speed);

        // class 함수 선언 & 실행
        car1.run();
        car2.run(); */

        //캐릭터 클래스 선언 & 실행

        /* chr chr1 = new chr();
        chr1.name = "전세린";
        chr1.age = 26;
        chr1.height = 160;

        chr1.sayhi();

        chr chr2 = new chr();
        chr2.name = "홍길동";
        chr2.age = 20;
        chr2.height = 180;

        chr2.sayhi(); */

        /* car car3 = new car();
        car3.speed = 200;
        car3.carname = "bongbong";
        car3.carnum = 1234;

        car3.run(); */

        //static 활용
        /* Person p1 = new Person();
        p1.age = 100;
        p1.personage = 100;
        Person p2 = new Person();
        p2.age = 200;
        p2.personage += 200;
        Person p3 = new Person();
        p3.age = 300;
        p3.personage += 300;

        Person.personage(); */


        //0313

        //계산기
        /* 계산기 ex1 = new 계산기();

        System.out.println(ex1.plus(1,2));
        System.out.println(ex1.minus(4,3)); */

        //계산기2
        /* 계산기2 ex2 = new 계산기2();
        System.out.println(ex2.aplus(3));

        // a부터 b까지 합
        System.out.println(ex2.bplus(4,6)); */

        //고양이 상속
        /* blackcat acat = new blackcat();
        acat.숨쉬다();
        whitecat bcat = new whitecat();
        bcat.숨쉬다();
        graycat ccat = new graycat();
        ccat.숨쉬다(); */

        //연습문제 오리
        // 출력 : 오리가 날개로 날아갑니다.
        System.out.println("== 청둥오리 ==");
        청둥오리 a청둥오리 = new 청둥오리();
        a청둥오리.날다();
        a청둥오리.수영하다();

        System.out.println("== 흰오리 ==");
        흰오리 a흰오리 = new 흰오리();
        a흰오리.날다();
        a흰오리.수영하다();

        System.out.println("== 고무오리 ==");
        고무오리 a고무오리 = new 고무오리();
        a고무오리.날다();
        a고무오리.수영하다();

        System.out.println("== 고무2오리 ==");
        고무2오리 a고무2오리 = new 고무2오리();
        a고무2오리.날다();
        a고무2오리.수영하다();

        System.out.println("== 로봇오리 ==");
        로봇오리 a로봇오리 = new 로봇오리();
        a로봇오리.날다(); // 오리가 날개로 날아갑니다.
        a로봇오리.수영하다(); // 오리가 물에 둥둥 떠다닙니다.

        System.out.println("0313 연습");

    }
}

/*
class car {
    int a = 1;
    int b = 2;
    int speed;
    String carname;
    int carnum;

    //함수 선언 void 사용
    void run() {
        System.out.println(this.carnum + "번의 " + this.carname + "은 " + this.speed + "km로 달린다");
    }

}

class chr {
    int age;
    int height;
    String name;

    void sayhi() {
        System.out.println("안녕하세요. 저는 " + this.name + "입니다.");
        System.out.println("나이 : " + this.age + ", 키 : " + this.height);
    }

}

// static 이해
class Person {
    int age;
    static int personage;

    void introduce() {
        System.out.println("제 나이는 " + this.age + "살 입니다.");
    }

    static void personage() {
        System.out.println("인류평균나이는 " + personage / 3 + "살 입니다.");
    }
}

class 계산기 {
    // 자료유형에 맞는 함수 선언 void(return 값 없음), int...
    int plus(int a, int b) {
        return a + b;
    }

    int minus(int a, int b) {
        return a - b;
    }
}

class 계산기2 {
    int answer;
    int i;

    int aplus(int a) {
        for (int i = 1; i <= a; i++) {
            answer = answer + i;
        }
        return answer;
    }


    int bplus(int a, int b) {
        int answer = 0;
        for (int i = a; i <= b; i++) {
            answer += i;
        }
        return answer;
    }
}

// 상속 extends
class cat {
    void 숨쉬다() {
        System.out.println("숨쉬다");
    }

    void 달리다() {
        System.out.println("달리다");
    }

    void 뛰어넘다() {
        System.out.println("뛰어넘다");
    }

    void 간택하다() {
        System.out.println("간택하다");
    }
}

class blackcat extends cat {
    void 미래예지() {
        System.out.println("미래를 예지하다");
    }
}

class whitecat extends cat {
    void 체력증진() {
        System.out.println("체력을 올려주다");
    }
}

class graycat extends cat {
    void 속도증가() {
        System.out.println("속도가 올라가다");
    }

    //오버라이드, 자식의 정의가 먼저
    void 숨쉬다() {
        System.out.println("회색고양이 숨쉬다");
    }
}

 */

class 오리 {
    void 날다() {
        System.out.println("오리가 날개로 날아갑니다.");
    }
    void 수영하다() {
        System.out.println("오리가 물갈퀴로 수영합니다.");
    }
}

class 청둥오리 extends 오리 {}

class 흰오리 extends 오리 {}

class 고무오리 extends 오리 {
    void 날다() {
        System.out.println("저는 날 수 없어요. ㅜㅠ");
    }
    void 수영하다() {
        System.out.println("오리가 물에 둥둥 떠다닙니다.");
    }
}

class 고무2오리 extends 고무오리 {}

class 로봇오리 extends 오리 {}