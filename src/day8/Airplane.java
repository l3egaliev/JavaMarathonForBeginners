package day8;

public class Airplane {
    private String producer;
    private int year;
    private int length;
    private double weight;
    private int fuel;

    public Airplane(String producer, int year, int length, double weight){
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

//    public void info(){
//        System.out.println("Изготовитель: "+producer+", год выпуска: "+year+", длина: "+length+", вес: "+weight+"" +
//                ", количество топлива в баке: "+fuel);
//    }

    public void fillUp(int f){
        this.fuel += f;
    }


    public void setFuel(int f){
        this.fuel = f;
    }
    public int getFuel(){
        return this.fuel;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Изготовитель: "+producer+", год выпуска: "+year+", длина: "+length+", вес: "+weight+"" +
                ", количество топлива в баке: "+fuel;
    }

    public static void main(String[] args) {
        Airplane airplane = new Airplane("Arabian", 2023, 50, 40);
        System.out.println(airplane);
    }
}
