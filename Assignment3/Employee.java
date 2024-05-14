package Assignment3;
class Employee {
    String name;
    double basicSalary;
    double bonus;

    Employee(String name, double basicSalary, double bonus) {
        name = name;
        basicSalary = basicSalary;
        bonus = bonus;
    }

    double calculateFinalSalary(double hoursPerDay, int daysWorked) {
        double dailyWage = basicSalary / 30;
        double dailyBonus = bonus / 30;
        double totalSalary = (dailyWage * hoursPerDay * daysWorked) + (dailyBonus * daysWorked);
        return totalSalary;
    }

    void getInfo(double salary, double hoursPerDay, int daysWorked) {
        basicSalary = salary;
        double finalSalary = calculateFinalSalary(hoursPerDay, daysWorked);
        System.out.printf("Final salary of %s: Rs: %.2f\n", name, finalSalary);
    }

    void addSal() {
        if (basicSalary < 500) {
            basicSalary += 10;
        }
    }

    void addWork(double hoursPerDay) {
        if (hoursPerDay > 6) {
            basicSalary += 50;
        }
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("Himal", 490, 5000);
        employee1.addSal();
        employee1.addWork(8);
        employee1.getInfo(500, 8, 22);
    }
}


