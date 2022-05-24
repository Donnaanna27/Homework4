public class test2 {
    public static String equalOrnot(int num1, int num2) {
        String result;
        if (num1 == num2) {
            result = "equal";
        } else {
            result = "False";
        }
        return result;
    }

    public static void main(String[] arg) {

        //1
        String tx = "Hello World";
        for (int i = 0; i <= 3; i++) {

            System.out.println(tx);
        }

        //2
        System.out.println(equalOrnot(5, 3));
        System.out.println(equalOrnot(2, 2));
        System.out.println(equalOrnot(14, 41));


    }
}