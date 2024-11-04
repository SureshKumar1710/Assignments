package assignmentInheritance.libraryManagement;

class Staff extends User {
    private String dept;

    public Staff(String name, int id, String dept) {
        super(name, id);
        this.dept = dept;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}

