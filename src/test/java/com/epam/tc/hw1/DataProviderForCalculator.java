package com.epam.tc.hw1;

import org.testng.annotations.DataProvider;

public class DataProviderForCalculator {

    @DataProvider
    public static Object[][] getTestDataForAdditionPositive(){
        return new Object[][]{
                {-35,-6,-41},
                {0,4.0,4.0},
                {3424.324,543.14,3967.464},
                {-342,342,0}
        };
    }

    @DataProvider
    public static Object[][] getTestDataForAdditionNegative(){
        return new Object[][]{
                {23137.23, 123.12, 5},
                {1.7976931348623158e+308 + 1, 1.7976931348623158e+308 + 1, 1.7976931348623158e+308*2 + 2}
        };
    }

    @DataProvider
    public static Object[][] getTestDataForDivisionPositive(){
        return new Object[][]{
                {144,12,12},
                {-15,-5,3},
                {1459.36,2,729.68}
        };
    }

    @DataProvider
    public static Object[][] getTestDataForDivisionByZero(){
        return new Object[][]{
                //{,,},
                //{,,},
                {4566,0}
        };
    }

    @DataProvider
    public static Object[][] getTestDataForMultiplicationPositive(){
        return new Object[][]{
                //{,,},
                //{,,},
                //{,,}
        };
    }


    @DataProvider
    public static Object[][] getTestDataForSubtractionPositive(){
        return new Object[][]{
                //{,,},
                //{,,},
                //{,,}
        };
    }

}
