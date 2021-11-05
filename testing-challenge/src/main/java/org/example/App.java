package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Person p1 = new Person("Harry", "Powell");
        p1.setSalary(200000D);
        p1.setSuperRate(.25);
        System.out.println(p1.getSalaryAfterTax());
        System.out.println(p1.getSuperAmount());
        System.out.println(p1.getSalaryPackageAmount());
    }
}
