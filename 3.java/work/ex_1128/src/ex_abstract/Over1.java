package ex_abstract;

public class Over1 {
    public static void main(String[] args) {
           ovr a1 = new ovr1();      
           ovr a2 = new ovr2();      
           System.out.println(a1.sun(3, 2) + a2.sun(3, 2));
           //출력문을 통해 나오는 값을 계산하세요
           
       }
}

class ovr {
    int sun(int x, int y) {
    	
        return x + y;
    }
}

class ovr1 extends ovr {
    int sun(int x, int y) {
        return x + y;  // 그냥 덧셈 유지
    }
}

class ovr2 extends ovr1 {
    int sun(int x, int y) {
        return x - y + super.sun(x, y);  // → 3 - 2 + (3 + 2) = 1 + 5 = 6
    }
}
