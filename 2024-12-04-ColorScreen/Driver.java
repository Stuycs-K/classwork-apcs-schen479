import java.util.Random;

public class Driver{

    public static void main(String[] args){
        System.out.print(Text.CLEAR_SCREEN);
        System.out.print(Text.HIDE_CURSOR);

        for (int i = 1; i <= 80; i++) {
            Text.go(1, i);
            Text.color(Text.BLUE, Text.background(Text.CYAN));
            System.out.print("A");
            Text.go(30, i);
            Text.color(Text.BLUE, Text.background(Text.CYAN));
            System.out.print("A");
        }
        for (int i = 1; i <= 30; i++) {
            Text.go(i, 1);
            Text.color(Text.BLUE, Text.background(Text.CYAN));
            System.out.print("A");
            Text.go(i, 80);
            Text.color(Text.BLUE, Text.background(Text.CYAN));
            System.out.print("A");
        }

        Random rand = new Random();
        int[] nums = new int[3];
        for (int i = 0; i < 3; i++) {
            nums[i] = rand.nextInt(10);
        }

        System.out.print(Text.RESET);

        for (int i = 0; i < nums.length; i++) {
            Text.go(2, 80 / 4 * (i + 1));
            if (nums[i] < 25) {
                Text.color(Text.BRIGHT, Text.RED);
            } else if (nums[i] > 75) {
                Text.color(Text.BRIGHT, Text.GREEN);
            } else {
                Text.color(Text.BRIGHT, Text.WHITE);
            }
            System.out.print(nums[i]);
        }

        Text.go(3, 2);
        for (int i = 2; i < 80; i++) {
            Text.color(Text.BLUE, Text.background(Text.CYAN));
            System.out.print("-");
        }

        Text.go(30 / 2, 80 / 2 - 7);
        Text.color(Text.BRIGHT, Text.BLUE);
        System.out.print("WELCOME!");

        Text.go(32, 1);
        System.out.print(Text.RESET);
    }

}
