public class test4 {
    public static void main(String[] args) {
    int[] myArray = {0, 7, 7, 2, 7, 3, 5};
    int number = myArray[0];
            for (int i = 0; i < myArray.length; i++) {
        if (number == myArray[0]) {
            number = myArray[i];
        }
    }
            System.out.println(number);
}
}
