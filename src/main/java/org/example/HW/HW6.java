package HW;

import java.util.Objects;

public class HW6 {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Stas", "Ivanov", 33, "Home");
        Employee emp2 = new Employee("Aleksey", "Skameikyn", 33, 1000.0, "Market");
        Employee emp3 = new Employee("Ivan", "Grozniy", 55, 1000.0, "MainOffice");
        System.out.println(emp1.getFullName());
        emp1.upgrade(emp3.salary);
        System.out.println(emp1.salary);
        System.out.println(emp3.olderThan(emp1));
        System.out.println(emp2.hashCode());
        System.out.println(emp2.equals(emp3));
        System.out.println(emp1.toString());
    }
    public static class Employee {
        private String name;
        private String surname;
        private int age;
        private String officePlace;
        private double salary;
        public Employee(String name, String surname, int age, double salary, String officePlace) {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.officePlace = officePlace;
            this.salary = salary;
        }
        public Employee(String name, String surname, int age, String officePlace) {
            this(name, surname, age, 50.0, officePlace);
        }
        @Override
        public int hashCode() {
            int result = 17;
            result = 31 * result + name.hashCode();
            result = 31 * result + surname.hashCode();
            result = 31 * result + age;
            result = 31 * result + (officePlace != null ? officePlace.hashCode() : 0);
            result = 31 * result + Double.hashCode(salary);
            return result;
        }
        @Override
        public String toString() {
            return "Employee{" +
                    "age= " + age +
                    ", name= '" + name + '\'' +
                    ", surname= '" + surname + '\'' +
                    ", salary= " + salary +
                    ", jobTitle= '" + officePlace + '\'' +
                    '}';
        }
        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Employee person = (Employee) obj;
            if (age != person.age) {
                return false;
            }
            if (!Objects.equals(name, person.name)) {
                return false;
            }
            if (!Objects.equals(surname, person.surname)) {
                return false;
            }
            if (!Objects.equals(officePlace, person.officePlace)) {
                return false;
            }
            return Double.compare(salary, person.salary) == 0;
        }
        void upgrade(double salary) {
            this.salary += salary;
        }
        public boolean olderThan(Employee e) {
            return this.age > e.age;
        }
        public String getFullName(){
            return this.name + " " + this.surname;
        }
    }
}