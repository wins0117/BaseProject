package com.fish;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class fishTest {
    @Test
    public void getType() throws Exception {


            // Arrange
            fish triangle = new fish(5, 10, 5);

            // Act
            String result = triangle.getType();

            // Assert
        Assert.assertEquals("不是三角形", result);

    }




}
