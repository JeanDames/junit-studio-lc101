package test;

import main.BalancedBrackets;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    //Brackets incorrect order
    @Test
    public void falseIfInIncorrectOrder() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
    //Bracket incorrect order between characters
    @Test
    public void falseIfIncorrectOrderChar() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code[r"));
    }
    //Can handle empty string
    @Test
    public void emptyStringReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets(""));
    }
//    Brackets can contain other characters
    @Test
    public void otherCharactersAllowed() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }
    //Odd number of brackets
    @Test
    public void unpairedBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]"));
    }
    //No brackets
    @Test
    public void returnsFalseIfNoBracketsUsed() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("LaunchCode"));
    }
    //False if alternate brackets used
    @Test
    public void falseIfAlternateBracketsUsed() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("{}"));
    }
    //Can handle single brackets
    @Test
    public void falseIfSingleBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    //Can handle spaces
    @Test
    public void trueIfSpacesExist() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("A[ B  C ] D"));
    }
    //Can handle open base with no pair
    @Test
    public void falseIfBracketWithoutPair() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

}
