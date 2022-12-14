public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;

    Car (String brand, String model,double engineVolume, String color, int year, String country){
        this.brand=brand;
        this.model=model;
        this.engineVolume=engineVolume;
        this.color=color;
        this.country=country;
    }

    @Override
    public String toString() {
        return "Марка: " +brand+ " Модель: " +model+ " Объем двигателя: "+engineVolume+"л Цвет: "+color+" Страна производитель: "+country;
    }
}
