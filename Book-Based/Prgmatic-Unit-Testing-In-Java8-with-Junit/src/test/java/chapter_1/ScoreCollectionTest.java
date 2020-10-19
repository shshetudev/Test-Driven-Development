package chapter_1;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;

public class ScoreCollectionTest {
    @Test
    public void test(){
        Assert.fail("Not yet implemented");
    }

    @Test
    public void answersArithmeticMeanOfTwoNumbers(){
        // Arrange
        ScoreCollection collection = new ScoreCollection();
        collection.add(() -> 5);
        collection.add(() -> 7);

        // Act
        int actualResult = collection.findArithmeticMean();
        // Assert
        Assert.assertThat(actualResult,equalTo(6));
    }
}
