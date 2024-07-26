public class TestLogic {
    public static void main(String[] args) {
        /**
         * > มากกว่า
         * < น้อยกว่า
         * = เท่ากับ
         * >= มากว่าาหรือเท่ากับ
         * <= น้อยกว่าหรือเท่ากับ
         * ! = ไม่เท่ากับ
         * ตัวอย่าง
         * 6 > 7 false
         * 6 < 7 true
         * ตัวดำเนินการหาตรรกศาสตร์
         * true/false
         * 
         * && AND และ (8 > 7 && 10 == 10)
         * true && true = true
         * false && true = false
         * false && false = false
         * 
         * OR หรือ
         * NOT ไม่
         * 
         * || OR หรือ (8 > 7 || 10 > 10)
         * true || true = true
         * false || true = false
         * false || false = false
         */
        int x = 6, y = 9;
        System.out.println(x > y);
        System.out.println(x < y);
        System.out.println(x >= y);
        System.out.println(x == y);
        System.out.println(x != y);
        System.out.println((x < y) && (y > 3));
        System.out.println((x == 5) || (y > 2));
        System.out.println(!(y > x));


    }
}
