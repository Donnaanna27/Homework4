public class Homework_2 {

        public static void main(String[] args) {
            exercise_1();
            exercise_2();
            exercise_3();
            exercise_4();
        }

        // 1. დაბეჭდეთ კენტი რიცხვები 0 დან 30 ის ჩათვლით
        public static void  exercise_1() {
            for (int i = 1; i<30; i = i + 2) {
                System.out.println(i);
            }
        }

        // 2. შექმენით დაბლის მასივი და დაითვალეთ მასივის საშუალო არითმეტიკული.
        public static void exercise_2() {
            double[] myIntArray = {4.43, 2.33, 9, 3};
            double sum = 0;
            int count = 0;
            double mean;
            for (int i = 0; i < myIntArray.length; i ++) {
                sum = sum + myIntArray [i];
                count ++;
            }
            mean = sum / count;
            System.out.println(mean);
        }

        // 3. დაწერეთ მასივში მინიმალური ელემენტი, არ გამოიყენოთ სორტირება
        public static void  exercise_3(){
            int[] array_nums = {20, 30, 40, 100, 1};
            int minValue = array_nums[0];
            for(int i=1; i<array_nums.length; i++){
                if(array_nums[i] < minValue){
                    minValue = array_nums[i];
                }
            }
            System.out.println(minValue);

            int[] array_nums_1 = {20, 30, 40, 100, 1};
            int min = 0;
            for (int i = 0; i < array_nums_1.length; i++){
                if (i == 0){
                    min = array_nums_1[i];
                }else {
                    min = Math.min(array_nums_1[i], min);
                }
            }
        }

        // 4. დაბეჭდეთ რენდომ რიცხვები 0 დან 100მდე, სავალდებულო არ არის რომ მთელი რიცხვები იყოს
        private static void exercise_4() {
            double random = Math.random();
            System.out.println(random * 100);
        }


}
