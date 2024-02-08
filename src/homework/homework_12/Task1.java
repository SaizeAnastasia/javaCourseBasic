package homework.homework_12;

//У вас есть текст. Требуется:
//убрать все специальные символы, такие "(", ")", "@"
//(методом replaceAll не пользоваться)

public class Task1 {
    public static void main(String[] args) {
        String text = "Вот (мой@ текст((";

        String noCharactersText = removeSpecialCharacters(text);

        System.out.println(" Мой текст: " + text);
        System.out.println(" Текст без специальных символов :" + noCharactersText);

    }

    private static String removeSpecialCharacters(String text) {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);

            if ((currentChar >= 'А' && currentChar <= 'Я') ||
                    (currentChar >= 'а' && currentChar <= 'я') ||
                    (currentChar >= '0' && currentChar <= '9') ||
                    currentChar == ' ') {
                result.append(currentChar);

            }
        }

        return result.toString();


    }
}

