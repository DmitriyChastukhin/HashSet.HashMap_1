import java.util.HashMap;
import java.util.Map;


public class Main {
    static String loremIpsum = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
            "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua." +
            "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi" +
            "ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit" +
            "in voluptate velit esse cillum dolore eu fugiat nulla pariatur." +
            "Excepteur sint occaecat cupidatat non proident, sunt in culpa" +
            "qui officia deserunt mollit anim id est laborum.";

    public static void main(String[] args) {
        Map<Character, Integer> textСhars = new HashMap<>();
        for (int i = 0; i < loremIpsum.length(); i++) {
            char c = loremIpsum.toLowerCase().charAt(i);
            if (!textСhars.containsKey(c)) {
                textСhars.put(c, 1);
            } else {
                int val = textСhars.get(c);
                val++;
                textСhars.put(c, val);
            }
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        char cMin = ' ';
        char cMax = ' ';
        for (char key : textСhars.keySet()) {
            int value = textСhars.get(key);
            if (key != ' ' && key != '.' && key != ',') {
                if (value < min) {
                    min = value;
                    cMin = key;
                }
                if (value > max) {
                    max = value;
                    cMax = key;
                }
            }
        }
        System.out.println("В тексте чаще всего встречается буква : " + cMax + ", " + max + " раз(а).");
        System.out.println("В тексте реже всего встречается буква : " + cMin + ", " + min + " раз(а).");
    }
}
