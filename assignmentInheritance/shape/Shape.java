package assignmentInheritance;

abstract class Shape // qn 1
{
	private double dimension1;
	private double dimension2;
    abstract double area();
    abstract double perimeter();
    
	public double getDimension1() 
	{
		return dimension1;
	}
	public void setDimension1(double dimension1) 
	{
		this.dimension1 = dimension1;
	}
	public double getDimension2() 
	{
		return dimension2;
	}
	public void setDimension2(double dimension2) 
	{
		this.dimension2 = dimension2;
	}
}
