public class FibonaciIterative implements FibonaciInterface {

    //Time:O(N),memory:0(1)

    @Override
    public int getFibonaciNumber(int number) {
        if (number <= 1)  return number;

        int prev1 = 1, prev2 = 1;

        for (int i = 3; i <= number; i++) {
            int current = prev1 + prev2;
            prev1 = prev2;
            prev2 = current;
        }
        return prev2;
    }
}
