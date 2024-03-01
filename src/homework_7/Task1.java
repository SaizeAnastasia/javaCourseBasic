package homework_7;
//Задание №1
//1 Создайте строку через new - I study Basic Java!
//2 Напишите метод, который принимает в качестве параметра строку, передайте в этот метод строку, которую создали в п.1
//3 Распечатать последний символ строки. Используем метод String.charAt().
//4 Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
//5 Заменить все символы “а” на “о”.
//6 Преобразуйте строку к верхнему регистру.
//7 Преобразуйте строку к нижнему регистру.
//8 Вырезать строку Java c помощью метода String.substring().
public class Task1 {
    public static void main(String[] args) {
        String string = new String(" I study Basic Java");
        System.out.println(string);

        printLastCharacter(string);
        checkContainsJava(string);
        replaceCharacters(string);
        toUpperCase(string);
        toLowerCase(string);
        cutSubstring(string);
    }
    public  static void printLastCharacter(String string){
        char lastChar = string.charAt(string.length() - 1);
        System.out.println(" Последний символ строки " + lastChar);
    }

    public static void checkContainsJava(String string){
        boolean containsJava = string.contains("Java");
        System.out.println(" Строка содержит подстроку Java " + containsJava);
    }

    public static void replaceCharacters(String string) {
        String replacedString = string.replace('a', 'o');
        System.out.println(" Строка после замены символов " + replacedString);
    }

    public static void toUpperCase(String string){
        String upperCaseString = string.toUpperCase();
        System.out.println("Строка в верхнем регистре " + upperCaseString);
    }

    public static void toLowerCase(String string){
        String lowerCaseString = string.toLowerCase();
        System.out.println(" Строка в нижнем регистре " + lowerCaseString);

    }

    public static void cutSubstring(String string) {
        String cutString = string.substring(string.indexOf("Java"), string.indexOf("Java") + 4);
        System.out.println(" Вырезанная подстрока Java " + cutString);
    }
}
