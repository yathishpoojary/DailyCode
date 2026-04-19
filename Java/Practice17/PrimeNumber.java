package Practice17;

import java.util.List;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeNumber {

    static boolean isPrime(int i) {
        return true;
    }
    public static  void main(String []args) {
     int N = 20;
     List<Integer> prime = IntStream.range(1,N).filter(PrimeNumber::isPrime) .boxed().toList();
        OptionalLong count = OptionalLong.of(IntStream.range(1,N).filter(PrimeNumber::isPrime).count());

        System.out.println("Prime "+prime);
    }
}
