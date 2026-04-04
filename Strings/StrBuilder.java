public class StrBuilder {
    public static void main(String[] args) {

        // use capacity when you know the length of String else you can use 'string' as well
        StringBuilder series = new StringBuilder(30);
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);

            // for appending 'n' char time complexity : O(n)
            series.append(ch);
        }

        System.out.println(series);
       

    }
}
