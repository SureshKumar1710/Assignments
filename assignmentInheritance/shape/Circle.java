package assignmentInheritance;

class Circle extends Shape // qn 1
{
    public Circle(double radius) 
    {
        this.setDimension1(radius);
    }

    double area() 
    {
        return Math.PI * this.getDimension1() * this.getDimension1();
    }

    double perimeter() 
    {
        return 2 * Math.PI * this.getDimension1();
    }
}

