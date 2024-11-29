public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Shekels : " + lowerCase("This costs 15 Shekels"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "bad")); // false
        System.out.println(contains("resignation", "sign")); // true

        System.out.println(contains("baba yaga", "baba")); // true
        System.out.println(contains("baba yaga", "")); // false
        System.out.println(contains("baba yaga", "John Wick is the baba yaga")); // false
        System.out.println(contains("baba yaga", "Yaga")); // false
        System.out.println(contains("baba yaga", "babayaga")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        return str.toLowerCase();
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        if (str2.length() == 0) return true;

        int counter = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == str2.charAt(0)) {
                for (int j = i; j < str2.length() + i; j++) {
                    if (str1.charAt(j) == str2.charAt(j - i)) {
                        counter++;
                    } 
                } 
                break;
            }
        }
        return counter == str2.length() ? true : false;
    }
}
