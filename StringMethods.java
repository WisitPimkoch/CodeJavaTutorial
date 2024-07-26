public class StringMethods {
    public static void main(String[] args) {
        String massage = "Java is Great Fun";
        //เมดธอดพืื้นฐาน
        // 1.toUpperCase() ปรับค่าข้อความให้เป็นตัวพิมพ์ใหญ่
        // 2.toLowerCase() ปรับค่าข้อความให้เป็นตัวพิมพ์เล็ก
        // 3.length() เก็บข้อความของสติง
        // 4.charAt() บอกให้เก็บตัวอักษรตามจำนวนพารามิเตอร์

        String upper = massage.toUpperCase();
        System.out.println(upper);

        String lower = massage.toLowerCase();
        System.out.println(lower);

        int length = massage.length();
        System.out.println(length);

        char charAt = massage.charAt(2);
        System.out.println(charAt);

        
    }
}
