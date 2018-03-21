package xin.gojay.nmid.test;

/**
 * @author Gojay
 * @date 2018/3/8
 */
public class StringTest {
    public static void main(String[] args) {
        StringBuilder names = new StringBuilder();
        System.out.println(names.length());
        if (names.length() != 0) {
            names.append(",");
        }
        names.append("test");
        if (names.length() != 0) {
            names.append(",");
        }
        names.append("test");
        System.out.println(names);
        System.out.println(names.length());
        System.out.println(names.toString());

        System.out.println(Math.random());
    }
}
