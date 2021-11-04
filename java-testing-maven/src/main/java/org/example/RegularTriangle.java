package org.example;
import lombok.Getter;
import lombok.Setter;

class TriangleException extends Exception {
    public TriangleException(String message) {
        super(message);
    }
}

public class RegularTriangle {
    @Getter
    @Setter

    private Double side = null;

    public RegularTriangle(){};
    public RegularTriangle(Double side) {
        this.side = side;
    }

    public Double getPerimeter() throws TriangleException{
        //check if side is null
        if(this.side == null){
            //if null throw error
            throw new TriangleException("There is no side length for this triangle");
        } else if(this.side <= 0) {
            throw new TriangleException("Sides must be positive");
        }
        //else return perim
        return this.side * 3;
    }
}
