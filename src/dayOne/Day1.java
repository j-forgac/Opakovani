package dayOne;

import java.util.List;

public class Day1 {
    public static void main(String[] args) {
        List<String> input = FileUtil.loadFile("res/numbers.txt");
        int totalFuel = 0;
        for (String weight : input) {
            int fuel = (Integer.parseInt(weight) / 3) - 2;
            totalFuel += fuel;
        }
        System.out.println(totalFuel);
    }
}
