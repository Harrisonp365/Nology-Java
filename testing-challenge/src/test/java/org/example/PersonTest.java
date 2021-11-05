package org.example;

import org.junit.Assert;
import org.junit.Test;

public class PersonTest {

    @Test
    public void testVoidConstructor(){
        Person p1 = new Person();
        Assert.assertEquals(null, p1.getFirstName());
        Assert.assertEquals(null, p1.getLastName());
        Assert.assertEquals(null, p1.getSalary());
        Assert.assertEquals(null, p1.getSuperRate());
    }

    @Test
    public void testNameConstructor(){
        Person p1 = new Person("Harry", "test");
        Assert.assertEquals("Harry", p1.getFirstName());
        Assert.assertEquals("test", p1.getLastName());
        Assert.assertEquals(null, p1.getSalary());
        Assert.assertEquals(null, p1.getSuperRate());
    }

    @Test
    public void testFullConstructor(){
        Person p1 = new Person("Harry", "test", 50D, 1000D );
        Assert.assertEquals("Harry", p1.getFirstName());
        Assert.assertEquals("test", p1.getLastName());
        Assert.assertEquals((Double)50D, p1.getSuperRate());
        Assert.assertEquals((Double) 1000D, p1.getSalary());
    }

    @Test(expected = PersonException.class)
    public void testSalaryAfterTaxWithNoSalary() throws PersonException{
        Person p1 = new Person();
        Assert.assertEquals((Double) 1000D, p1.getSalaryAfterTax());
    }

    @Test
    public void testSalaryAfterTaxWithDoubleValue(){
        Person p1 = new Person("Harry", "test");
        p1.setSalary(10000D);
        Assert.assertEquals((Double) 1000D, p1.getSalaryAfterTax());
    }

    @Test(expected = PersonException.class)
    public void testGetSuperAmountWithNull() throws PersonException{
        Person p1 = new Person();
        p1.getSuperAmount();
    }

    @Test
    public void testGetSuperAmountWithDouble(){
        Person p1 = new Person("Harry", "test", 20D, 10000D);
        p1.getSuperAmount();
    }

    @Test(expected = PersonException.class)
    public void testGetSalaryPackageWithNull() throws PersonException{
        Person p1 = new Person();
        p1.getSalaryPackageAmount();
    }

    @Test
    public void testGetSalaryPackageWithDouble(){
        Person p1 = new Person("Harry", "test", 20D, 10000D);
        p1.getSalaryPackageAmount();
    }
}

