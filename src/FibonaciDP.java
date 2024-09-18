import java.util.ArrayList;
import java.util.List;


public class FibonaciDP implements FibonaciInterface {

    //Time:O(N),memory:0(N)
    @Override
    public int getFibonaciNumber(int number) {
        List<Integer> fibonaci = new ArrayList<>();
        fibonaci.add(0);
        fibonaci.add(1);
        fibonaci.add(1);

        for (int i = 3; i <= number; i++) {
            fibonaci.add(fibonaci.get(i - 1) + fibonaci.get(i - 2));
        }

        return fibonaci.get(number);
    }
}
