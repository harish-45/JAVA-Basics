public class StrBuilder {
    public static void main(String[] args) {
        StringBuilder series = new StringBuilder(" Hello ");
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);

            // for appending 'n' char time complexity : O(n)
            series.append(ch);
        }

        System.out.println(series);
       

    }
}
