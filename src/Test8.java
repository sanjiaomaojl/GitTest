import java.util.Comparator;

public class Test8 implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        int len1 = o1.length();
        int len2 = o2.length();
        return len1-len2;
    }

    public static void main(String[] args) {
        String o1 = "zhang";
        String o2 = "jing";
        Test8 t8 = new Test8();
        System.out.println(t8.compare(o1,o2));
    }
}
