public static double calculateAverage(int[] numbers) {
    int sum = 0;
    for (int number : numbers) {
        sum += number;
    }
    return (double) sum / numbers.length;
}

public static double findMax(int[] numbers) {
    double max = numbers[0];
    for (int i = 1; i < numbers.length; i++) {
        if (max < numbers[i]) {
            max = numbers[i];
        }
    }
    return max;
}

public static double findMin(int[] numbers) {
    double min = numbers[0];
    for (int i = 1; i < numbers.length; i++) {
        if (min > numbers[i]) {
            min = numbers[i];
        }
    }
    return min;
}

public static double countAboveAverage(int[] numbers) {
    double average = calculateAverage(numbers);
    int count = 0;
    for (int number : numbers) {
        if (number > average) {
            count++;
        }
    }
    return count;
}

public static void printAllStats(int[] numbers) {
    IO.println("Statistics:");
    IO.println("The average is: " + calculateAverage(numbers));
    IO.println("The max is: " + findMax(numbers));
    IO.println("The min is: " + findMin(numbers));
    IO.println("People Above Average " + countAboveAverage(numbers));
}

void main() {
    int[] numbers = {45, 67, 23, 89, 34, 56, 78};
    printAllStats(numbers);
}
