package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity(){

        Continent Europe = new Continent("Europe");
        Europe.addCountry(new Country("Polnd", new BigDecimal("1")));
        Europe.addCountry(new Country("Germany", new BigDecimal("1")));
        Europe.addCountry(new Country("Czech", new BigDecimal("1")));
        Europe.addCountry(new Country("France", new BigDecimal("1")));


        Continent Asia = new Continent("Asia");
        Asia.addCountry(new Country("Russia", new BigDecimal("1")));
        Asia.addCountry(new Country("China", new BigDecimal("1")));
        Asia.addCountry(new Country("Japan", new BigDecimal("1")));
        Asia.addCountry(new Country("Izrael", new BigDecimal("1")));

        Continent SouthAmerica = new Continent("SouthAmerica");
        Asia.addCountry(new Country("Brasil", new BigDecimal("1")));
        Asia.addCountry(new Country("Argentina", new BigDecimal("1")));
        Asia.addCountry(new Country("Paraguay", new BigDecimal("1")));
        Asia.addCountry(new Country("Peru", new BigDecimal("1")));

        World world = new World();
        world.addContinent(Europe);
        world.addContinent(Asia);
        world.addContinent(SouthAmerica);


        BigDecimal actual = world.getPeopleQuantity();

        BigDecimal expectedQuantityPeople = new BigDecimal("12");
        Assert.assertEquals(expectedQuantityPeople, actual );



    }





}
