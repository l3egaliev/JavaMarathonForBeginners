package day11;

public class Courier implements Worker{
    private long salary;



    public long getSalary(){
        return this.salary;
    }

    @Override
    public void doWork(Warehouse warehouse) {
        this.salary += 100;
        int b = warehouse.getBalance()+1000;
        warehouse.setBalance(b);
    }

    @Override
    public void bonus(Warehouse warehouse) {
        if(warehouse.getBalance() >= 1000.000) {
            this.salary *= 2;
        }
    }

    @Override
    public String toString() {
        return "ЗП курьера: " +  salary;
    }
}

