package com.github.kk070326;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestAbc {
    @Test
    public void getType() throws Exception {
        //Arrange
        abc abc = new abc(5, 10, 5);

        //Act
        String result = abc.getType();

        Assert.assertEquals("不是三角形",result);
    }

}
