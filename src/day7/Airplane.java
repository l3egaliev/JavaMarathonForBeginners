package day7;

/**
*Для этого задания скопируйте класс Самолет из предыдущего дня в пакет текущего
дня.
В классе Самолет создать статический метод compareAirplanes, который в
качестве аргументов принимает два объекта класса Airplane (два самолета) и выводит
сообщение в консоль о том, какой из самолетов длиннее.
*
 **/

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

    public void info(){
        System.out.println("Изготовитель: "+producer+", год выпуска: "+year+", длина: "+length+", вес: "+weight+"" +
                ", количество топлива в баке: "+fuel);
    }

    public void fillUp(int f){
        this.fuel += f;
    }

    public static void compareAirplanes(Airplane airplane1, Airplane airplane2){
        String r="";
        if (airplane1.getLength()>airplane2.getLength())
            r = airplane1.getProducer()+" длиннее";
        else if (airplane1.getLength()< airplane2.getLength())
            r= airplane2.getProducer()+" длиннее";
        else
            r = "самолеты равны";
        System.out.println(r);
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


    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Arabian", 2023, 40, 40);
        Airplane airplane2 = new Airplane("Turkey", 2020, 50, 50);
        Airplane.compareAirplanes(airplane1, airplane2);
    }
}
