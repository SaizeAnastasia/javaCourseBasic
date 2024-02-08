package homework.homework_14;

//№6
//Дан массив слов.
//Создать два массива:
//- один из слов в котором нечетное количество букв
//- второй в котором четное
public class Task6 {
    public static void main(String[] args) {
        String[] words = {"стол" , "книга" , "кровать" , "лампа"};

        int evenCount = 0;
        int oddCount = 0;
        for (String word : words) {
            if (word.length() % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }

        }

        String[] evenLengthWords = new String[evenCount];
        String[] oddLengthWords = new String[oddCount];


        int evenIndex = 0;
        int oddIndex = 0;
        for (String word : words) {
            if (word.length() % 2 == 0) {
                evenLengthWords[evenIndex] = word;
                evenIndex++;

            }else {
                oddLengthWords[oddIndex] = word;
                oddIndex++;
            }

        }

        System.out.println(" Слова с четным количеством букв:  ");
        for (int i = 0; i < evenLengthWords.length; i++) {
            if (evenLengthWords[i] != null){
                System.out.println(evenLengthWords[i]);
            }

        }
        System.out.println();

        System.out.println(" Слова с нечетным количеством букв: ");
        for (int i = 0; i < oddLengthWords.length; i++) {
            if (oddLengthWords[i] != null) {
                System.out.println(oddLengthWords[i]);
            }
        }
        System.out.println();
    }
}
