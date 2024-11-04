package assignmentInheritance;

class Rectangle extends Shape // qn 1
{

    public Rectangle(double length, double width) 
    {
        this.setDimension1(length);
        this.setDimension2(width);
    }

    double area() 
    {
        return this.getDimension1() * this.getDimension2();
    }

    double perimeter() 
    {
        return 2 * (this.getDimension1() + this.getDimension2());
    }
}

