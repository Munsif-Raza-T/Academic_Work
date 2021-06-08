public class Employee {
    private int salary;
    private int hours;

    public void getInfo(int salary, int noOfHours){
        this.salary = salary;
        this.hours = noOfHours;
    }

    public void addSal(){
        if(salary<500)
            salary+=10;
    }

    public void addWork(){
        if(hours>6)
            salary+=5;
    }

    public void showData(){
        System.out.println("Employee Salary is: "+salary+"\nAnd Working hours are: "+hours);
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.getInfo(300,8);
        emp1.showData();
        emp1.addSal();
        emp1.showData();
        emp1.addWork();
        emp1.showData();
    }

}
