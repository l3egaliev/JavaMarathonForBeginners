package day11;

public class Picker implements Worker{
    private long salary;


    public long getSalary(){
        return this.salary;
    }

    @Override
    public void doWork(Warehouse warehouse) {
        this.salary += 80;
        int c = warehouse.getCountOrder()+1;
        warehouse.setCountOrder(c);
    }

    @Override
    public void bonus(Warehouse warehouse) {
        if(warehouse.getCountOrder() >= 1500){
            this.salary *= 3;
        }
    }

    @Override
    public String toString() {
        return "ЗП сборщика: " + salary;
    }
}
