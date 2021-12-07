import java.util.stream.*;
public class FindDivisor {

  public long numberOfDivisors(int n) {
    // TODO please write your code below this comment
    return IntStream.rangeClosed(1, n).filter(x -> n % x == 0).count();

  }

}