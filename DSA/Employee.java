 /*Create a Arraylist storing Employee details including Emp_id, Emp_Name, 
Emp_gender, Year_of_Joining (you can also add more attributes including these). 
Then sort the employees according to their joining year using Comparator and 
Comparable interfaces.

Step#01:

package vectorexample;
public class Employee implements Comparable<Employee> {
    int empId;
    String empName;
    String gender;
    int yearOfJoining;

    public Employee(int empId, String empName, String gender, int yearOfJoining) {
        this.empId = empId;
        this.empName = empName;
        this.gender = gender;
        this.yearOfJoining = yearOfJoining;
    }

    @Override
    public int compareTo(Employee other) {
        return Integer.compare(this.yearOfJoining, other.yearOfJoining);
    }

    @Override
    public String toString() {
        return empId + " - " + empName + " - " + gender + " - " + yearOfJoining;
    }
}*/