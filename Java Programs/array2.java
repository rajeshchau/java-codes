import java.util.Arrays;
import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {

        System.out.print("input a list of student heights :");
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] heightStrings = input.split(",");
        int[] heights = new int[heightStrings.length];

        for (int index = 0; index < heightStrings.length; index++) {
            heights[index] = Integer.parseInt(heightStrings[index]);
        }
        int totalheight = 0;

        for (int height : heights) {

            totalheight += height;
        }
        System.out.println(totalheight);
    }
}
