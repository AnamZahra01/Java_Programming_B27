package office_hours_practice.constructor_intro.employee_database;

//name & id
public class Employee {

    String name;
    int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String  toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
/*
Employee Database
list keeps data of all employees - add employee method
delete employee using id
'method to get all employees
get employee having same id from database

Test if it is working or not
 */