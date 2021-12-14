import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CoinTossTest {
    CoinToss coinToss = new CoinToss();
    @Test
    public void checkIfHeadProbabilityIsEqualToTailProbabilityInCoinToss(){
        double actualCoin = coinToss.probability(1,2);
        double expectedCoin = 0.5;
        assertEquals(expectedCoin, actualCoin);
    }

    @Test
    public void checkIfProbabilityOfTwoEventsOccurringTogetherInCoinToss(){
        double actualCoin = coinToss.twoEventsOccurringTogether(1,1);
        double expectedCoin = 0.25;
        assertEquals(expectedCoin, actualCoin);
    }

    @Test
    public void checkIfProbabilityOfFirstEventOccurringInCoinToss(){
        double actualCoin = coinToss.twoEventsNotOccurringTogether(1,0);
        double expectedCoin = 0.5;
        assertEquals(expectedCoin, actualCoin);
    }
    @Test
    public void checkIfProbabilityOfSecondEventsOccurringInCoinToss(){
        double actualCoin = coinToss.twoEventsNotOccurringTogether(0,1);
        double expectedCoin = 0.5;
        assertEquals(expectedCoin, actualCoin);
    }

    @Test
    public void checkIfProbabilityOfEitherEventsOccurringInCoinToss(){
        double actualCoin = coinToss.eitherEventsOccurring(1,1);
        double expectedCoin = 0.75;
        assertEquals(expectedCoin, actualCoin);
    }

    @Test
    public void checkIfFavorableOutcomeIsZero(){
        assertThrows(IllegalArgumentException.class, () -> {
            coinToss.probability(0,2);
        });
    }
}