public class Employee implements Comparable<Employee>{ //implementing comparable
    private String role;
    private String name;
    private double salary;

    public Employee(String role, String name, double salary) { //Constructor
        this.role = role;
        this.name = name;
        this.salary = salary;
    }

    public String getRole(){
        return role;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Employee other) { //sorting out the values of role, name and salary in that respective order using the compareTo method
        int roleCompare = this.role.compareTo(other.role);
        if(roleCompare != 0){
            return roleCompare;
        }

        int nameCompare = this.name.compareTo(other.name);
        if(nameCompare != 0){
            return nameCompare;
        }

        return Double.compare(this.salary, other.salary);
    }

    @Override
    public String toString(){ //creating a specific format
        return role + " " + name + " " + salary;
    }

}
