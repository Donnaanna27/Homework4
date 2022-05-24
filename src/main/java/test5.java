public class test5 {
    public static void newPrice(int x, int y) {

        int sale = x * y % 100;
        System.out.println(sale);

    }
}


class Baby extends test5 {

    public static void main(String[] arg) {
        newPrice(100, 5);
        newPrice(200, 10);
    }


}


