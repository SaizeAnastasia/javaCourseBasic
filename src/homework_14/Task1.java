package homework_14;
//№1.
//
//Дан массив размера  n-1, содержащий только различные целые числа в диапазоне от 1 до n . Найдите недостающий элемент.
//
//input:
//arr[] = {1,2,3,5}
//out: 4
//
//arr[] = {6,1,2,8,3,4,7,10,5}
//out: 9
public class Task1 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 5};
        int[] arr2 = {6, 1, 2, 8, 3, 4, 7, 10, 5};

        int missingElement1 = findMissingElement(arr1);
        int missingElement2 = findMissingElement(arr2);

        System.out.println(" Недостающий элемент в первом массиве: " + missingElement1);
        System.out.println(" Недостающий элемент во втором массиве: " + missingElement2);

    }

        public static int findMissingElement(int[] arr) {
            int n = arr.length + 1;
            int totalSum = (n * (n + 1)) / 2;
            int arrSum = 0;

            for (int num : arr) {
                arrSum += num;

            }

            int missingElement = totalSum - arrSum;
            return missingElement;
        }


    }

