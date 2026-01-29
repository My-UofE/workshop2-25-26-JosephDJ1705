// VariablesTest application
public class VariablesTest {
    public static void main(String[] args) {
        int x = '4';
        System.out.println("x: " + x);
        long s_per_min = 60;
        System.out.println("s_per_min: " + s_per_min);
        byte s_per_day = (byte) (s_per_min * 60 * 24);
        System.out.println("s_per_day: " + s_per_day);
        float area = 20.3F;
        System.out.println("area: " + area);
        char a = '\u5468', b = '\\';
        System.out.println("a and b: " + a + b);
        int nHours = 022;
        System.out.println("nHours: " + nHours);
        double ratio = 7/5;
        System.out.println("ratio: " + ratio)
    
    }
}