package assignments_java;

public class AreaCalculator {
    public int calculateArea(int length, int breadth) {
        return length * breadth;
    }

    public int calculateArea(int side) {
        return side * side;
    }

    public int calculatePerimeter(int length, int breadth) {
        return 2 * (length + breadth);
    }

    public int calculatePerimeter(int side) {
        return 4 * side;
    }
}


class Rectangle extends AreaCalculator {
	
}

class Square extends AreaCalculator {
	
}