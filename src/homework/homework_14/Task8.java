package homework.homework_14;
//№8 **
//Дана строка.
//   Написать метод, который определяет, является ли данная строка палиндромом
//   (читается одинаково в обоих направлениях)
public class Task8 {
    public static void main(String[] args) {
        String str1 = "казак" ;
        String str2 = "привет";

        System.out.println( str1 + " палиндром " + isPalindrome(str1));
        System.out.println( str2 + " палиндром " + isPalindrome(str2));
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
