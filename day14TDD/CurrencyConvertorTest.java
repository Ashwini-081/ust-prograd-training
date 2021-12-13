import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CurrencyConvertorTest {
    CurrencyConvertor currencyConvertor = new CurrencyConvertor();
    @Nested
    class rupeesToDollarTest{
        @Test
        public void checkIfSeventyFourPointEightyFiveRupeesIsEqualToOneDollar(){
            double actualCurrency = currencyConvertor.currencyConvertor(74.85, "rs", "USD");
            double expectedCurrency = 1;
            assertEquals(expectedCurrency, actualCurrency);
        }

        @Test
        public void checkIfOneDollarIsEqualToSeventyFourPointEightyFiveRupees(){
            double actualCurrency = currencyConvertor.currencyConvertor(1, "USD", "rs");
            double expectedCurrency = 74.85;
            assertEquals(expectedCurrency, actualCurrency);
        }
    }

    @Nested
    class addingMoneyToWalletTest{
        @Test
        public void addingMoneyToWallet(){
            double actualCurrency = currencyConvertor.addingMoneyToWallet(100);
            double expectedCurrency = 100;
            assertEquals(expectedCurrency, actualCurrency);
        }
    }

    @Nested
    class additionOfRupeesAndDollar{

        @Test
        public void checkIfFiftyRupeesPlusOneDollarIsEqualsToOneHundredTwentyFourPointEightyFive(){
            double actualCurrency = 50 + currencyConvertor.currencyConvertor(1,"USD","rs");
            double expectedCurrency = 124.85;
            assertEquals(expectedCurrency, actualCurrency);
        }

        @Test
        public void checkIfSeventyFourPointEightyFivePlusOneDollarPlusOneHundredFourtyNinePointSevenIsEqualsToFourDollar(){
            double actualCurrency = currencyConvertor.currencyConvertor(74.85, "rs","USD") +currencyConvertor.currencyConvertor(149.7,"rs","USD") + currencyConvertor.currencyConvertor(74.85, "rs","USD");
            double expectedCurrency = 4;
            assertEquals(expectedCurrency, actualCurrency);
        }
    }

    @Nested
    class getAmount{
        @Test
        public void checkIfAmountIsThereOrNot(){
            double actualCurrency = currencyConvertor.getMoneyFromWallet(20);
            double expectedCurrency = 20;
            assertEquals(expectedCurrency, actualCurrency);
        }
    }
    @Test
    public void throwsExceptionWhenCurrencyIsLessThanOrEqualsToZero(){
        assertThrows(Exception.class, () -> {currencyConvertor.currencyConvertor(0,"rs","USD");});
    }
}