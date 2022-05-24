public class classwork4 {
    public static void main(String[] args) {
        int k ;
        public void addition ( int x, int y, int z){
            x = 100;
            y = 5;
            z = x/100 * y;
            k = x-z;
            System.out.println("New Price:" + k);
        }
        public class My_Calculation extends classwork4 {
            public void newPrice(int a, int b) {
                a = 200;
                b = 10;
                System.out.println("New mMarket Price:" + z);
            }


            public static void main(String args[]) {
                int a = 5, b = 100;
                My_Calculation demo = new My_Calculation();
                demo.addition(a, b);
            }
        }

    }

}
