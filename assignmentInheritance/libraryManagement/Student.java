package assignmentInheritance.libraryManagement;

class Students extends User 
{
    private String className;

    public Students(String name, int id, String className) 
    {
        super(name, id);
        this.className = className;
    }

    public String getClassName() 
    {
        return className;
    }

    public void setClassName(String className) 
    {
        this.className = className;
    }
}
