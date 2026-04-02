public class Performance {
    public static void main(String[] args) {

        String series = "";

        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);

            // its create every time new String object and dereference past one . means for adding 'n' character in string time complexity is 'O(n^2)'. use StringBuilder class for mutable String .
            series += ch;
        }
      System.out.println(series);
    }
}
