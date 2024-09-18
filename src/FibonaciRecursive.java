public class FibonaciRecursive implements FibonaciInterface {

    //Time:O(2^N),memory:0(N)
    @Override
    public int getFibonaciNumber(int number) {
        if (number <= 1) {
            return number;
        }
        return getFibonaciNumber(number - 1) + getFibonaciNumber(number - 2);
    }
}
