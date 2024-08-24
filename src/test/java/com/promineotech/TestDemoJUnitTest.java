package com.promineotech;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;

import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;


public class TestDemoJUnitTest {

    private TestDemo testDemo;

    @BeforeEach
    public void setUp() {
        testDemo = new TestDemo();
    }

    @ParameterizedTest
    @MethodSource("com.promineotech.TestDemoJUnitTest#argumentsForAddPositive")
    void assertThatTwoPositiveNumbersAreAddedCorrectly(int a, int b, int expected, boolean expectException) {
        if (!expectException) {
            assertThat(testDemo.addPositive(a, b)).isEqualTo(expected);
        } else {
            assertThatThrownBy(() -> 
            testDemo.addPositive(a, b))
                .isInstanceOf(IllegalArgumentException.class);
        }
    }
    
    // Tests that the values in place are correct.
    
    static Stream<Arguments> argumentsForAddPositive() {
        return Stream.of(
            arguments(2, 4, 6, false),
            arguments(0, 5, 5, false),
            arguments(-1, 3, 5, true),
            arguments(5, 2, 7, false),
            arguments(5, 3, 8, false)
        );
    }
    
    // Tests that the two numbers are added together correctly.
    
    @Test
    void assertThatPairsOfPositiveNumbersAreAddedCorrectly() {
      assertThat(testDemo.addPositive(4, 36)).isEqualTo(40);
      assertThat(testDemo.addPositive(45, 55)).isEqualTo(100);
      assertThat(testDemo.addPositive(3, 50)).isEqualTo(53);
      
    }
    
    // Tests that the two numbers are divided correctly.
    
    @Test
    void assertThatPairsOfPositiveNumbersAreDividedCorrectly() {
    	assertThat(testDemo.dividePositive(100, 10)).isEqualTo(10);
    	assertThat(testDemo.dividePositive(50, 5)).isEqualTo(10);
    	assertThat(testDemo.dividePositive(10, 5)).isEqualTo(2);
    	assertThat(testDemo.dividePositive(48, 6)).isEqualTo(8);
    }
   
    // Tests that the numbers are squared correctly.
    
    @Test
    void assertThatNumberSquaredIsCorrect() {
      TestDemo mockDemo = spy(testDemo);
      doReturn(5).when(mockDemo).getRandomInt();
      int fiveSquared = mockDemo.randomNumberSquared();
      assertThat(fiveSquared).isEqualTo(25);
    }

    	
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}

