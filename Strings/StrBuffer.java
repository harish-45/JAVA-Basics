public class StrBuffer {
    public static void main(String[] args) {

        // StringBuffer and StringBuilder both works similar as 'Dynamic char Array' 
        StringBuffer series = new StringBuffer();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            series.append(ch);
        }
        System.out.println(series);
    }
}
