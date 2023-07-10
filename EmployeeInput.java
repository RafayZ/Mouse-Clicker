import java.util.*;

public class EmployeeInput { //Employee class with a bunch of conditions and methods
    public static void main(String[] args) { //main method
        Scanner scan = new Scanner(System.in);
        ArrayList<Employee> employeeList = new ArrayList<>();

        String[] data = new String[3];
        while(true){
            System.out.println("Please enter the name, role and the salary of the new Employee:");
            String input = scan.nextLine().trim();

            data = input.split("\\s+");

            if(input.equals("quit")){
                break;
            }

            if(data.length != 3){
                System.out.println("Invalid format, try again.");
                continue;
            }

            double salary;
            try {
                salary = Double.parseDouble(data[2]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid salary value, please try again.");
                continue;
            }


            Employee employee = new Employee(data[1], data[0], salary);
            employeeList.add(employee);
            System.out.println("Adding " + employee + " to the list of employees.");
        }
        Collections.sort(employeeList);
        System.out.println("Added the following Employees:");
        int counter = 1;
        for(Employee em : employeeList){
            System.out.print(counter+". ");
            System.out.println(em);
            counter++;
        }
        System.out.println("Good bye.");
    }
}
