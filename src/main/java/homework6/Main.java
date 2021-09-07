package homework6;

public class Main {

    public static void main(String[] args) {

        int[] arr = {2, 6, 3, 17, 102, 33};

        getSumOfEvenNumbers(arr);
        getSumOfIndexes(arr);

        String quote = "Время, как море, развязывает любые узлы";
        char[] quoteChar = quote.toCharArray();

        getFirstLetterIndex(quoteChar);
        getLastLetterIndex(quoteChar);
    }

    // 1. Найти суммы всех четных элементов массива.

    public static void getSumOfEvenNumbers(int[] arr) {
        int sumOfEvenNumbers = 0;
        for (int j : arr) {
            if (j % 2 == 0) {
                sumOfEvenNumbers += j;
            }
        }
        System.out.println("Сумма всех четных элементов массива: " + sumOfEvenNumbers);
    }

    // 2. Найти сумму индексов четных элементов массива.

    public static void getSumOfIndexes(int[] arr) {
        int sumOfIndexes = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sumOfIndexes += i;
            }
        }
        System.out.println("Сумма всех индексов четных элементов массива: " + sumOfIndexes);
    }

    // 1. выясните, под каким номером в строке стоит первая буква я.

    public static void getFirstLetterIndex(char[] arr) {
        int firstLetterIndex = 0;
        char firstLetter = ' ';
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'я') {
                firstLetterIndex = i;
                firstLetter = arr[i];
                break;
            }
        }
        if (firstLetterIndex == 0 && firstLetter != 'я') {
            System.out.println("В строке нет буквы 'я', или присутствует заглавная буква 'Я'");
        } else
            System.out.println("Первая буква 'я' находится под индексом: " + firstLetterIndex);
    }

    // 2. выясните, под каким номером в строке стоит последняя буква я.

    public static void getLastLetterIndex(char[] arr) {
        int lastLetterIndex = 0;
        char lastLetter = ' ';
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'я' && i >= lastLetterIndex) {
                lastLetterIndex = i;
                lastLetter = arr[i];
            }
        }
        if (lastLetterIndex == 0 && lastLetter != 'я') {
            System.out.println("В строке нет буквы 'я', или присутствует заглавная буква 'Я'");
        } else
            System.out.println("Последняя буква 'я' находится под индексом: " + lastLetterIndex);
    }
}
