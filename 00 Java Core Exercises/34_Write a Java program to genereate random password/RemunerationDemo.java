
class Remuneration {
    private double[] salary;
    private double[] bonus;

    public Remuneration(double[] salary, double[] bonus) {
        this.salary = salary;
        this.bonus = bonus;
    }

    public void calcSalary(){
        for(int i=0; i<salary.length; i++){
            salary[i] += salary[i] * (bonus[i]/100.0);
        }
    }

    public void printSalary(){
        for(int i=0; i<salary.length; i++){
            System.out.println("Employee "+(i+1)+" : "+salary[i]);
        }
    }
}

public class RemunerationDemo {
    public static void main(String[] args) {
        double[] salary = {10000.00, 20000.00, 10000.00, 15000.00, 25000.00};
        double[] bonus = {10.0,5.0,15.0,20.0,10.0};

        Remuneration remuneration = new Remuneration(salary,bonus);
        remuneration.calcSalary();;
        remuneration.printSalary();
    }
}
