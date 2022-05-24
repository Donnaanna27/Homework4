public class classwork2 {

        public static String trueorfalse(int x, int y) {
            String result;
            if (x == y) {
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
            System.out.println(trueorfalse(5, 3));
            System.out.println(trueorfalse(2, 2));
            System.out.println(trueorfalse(14, 41));


        }


}
