package org.example;

import org.junit.Assert;
import org.junit.Test;

public class RegularTriangleTest {

    @Test
    public void testVoidConstructor() {
        RegularTriangle tri = new RegularTriangle();
        Assert.assertEquals(null, tri.getSide());
    }

    @Test
    public void testSideConstructor(){
        RegularTriangle tri = new RegularTriangle(100D);
        Assert.assertEquals((Double)100D, tri.getSide() );
    }

    @Test
    public void testGetPerimWithValidSide(){
        RegularTriangle tri = new RegularTriangle(150D);
        Double perim = null;
        try{
            perim = tri.getPerimeter();
        } catch(TriangleException error) {
            Assert.fail("TriangleException thrown with valid side Double");
        }
        Assert.assertEquals((Double)450D, perim);
    }

    @Test
    public void testGetPerimAfterVoidConstructor(){
        RegularTriangle tri = new RegularTriangle();
        tri.setSide(150D);
        Double perim = null;
        try{
            perim = tri.getPerimeter();
        } catch(TriangleException error) {
            Assert.fail("TriangleException thrown with valid side Double");
        }
        Assert.assertEquals((Double)450D, perim);
    }

    @Test(expected = TriangleException.class)
    public void testGetPerimToThrowErrorWithNullSide() throws TriangleException{
        RegularTriangle tri = new RegularTriangle();
       tri.getPerimeter();
    }

    @Test(expected = TriangleException.class)
    public void testGetPerimToThrowErrorWithZeroSide() throws TriangleException{
        RegularTriangle tri = new RegularTriangle(0D);
        tri.getPerimeter();
    }

    @Test(expected = TriangleException.class)
    public void testGetPerimToThrowErrorWithNegativeSide() throws TriangleException{
        RegularTriangle tri = new RegularTriangle(-2D);
        tri.getPerimeter();
    }
}
