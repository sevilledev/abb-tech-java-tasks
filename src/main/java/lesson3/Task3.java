package lesson3;

public class Task3 {
    public static void main(String[] args) {
        int[][][] cube = {
                {
                        {1, 2}, {13, 4}
                },
                {
                        {25, 6}, {7, 8}
                }
        };

        System.out.print("Elements greater than 6: ");

        boolean flag = true;

        for (int[][] cubei : cube) {
            for (int[] cubej : cubei) {
                for (int cubek : cubej) {
                    if (cubek > 6) {
                        System.out.print(((!flag) ? ", " : "") + cubek);
                        flag = false;
                    }
                }
            }
        }
    }
}
