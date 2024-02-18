package homework_projects.homework_projects_version1;

public class ArraySortDemo {
    public static void main(String[] args) {
        int[] arr = ArrayService.createArrayFromUserInput();
        arr = ArrayService.fillArrayFromUserInput(arr);
        ArrayService.sort(arr);
        ArrayService.printArray(arr);

    }
}
