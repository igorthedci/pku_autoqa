/**
Описать класс Phone. Реализуйте метод который будет возвращать стоимость и производителя телефона.  
**/

public class Phone {
    private String _brand;
    private float _price;

    public Phone(String brand, float price) {
        this._brand = brand;
        this._price = price;
    }

    public String brand() {
        return this._brand;
    }
    public float price() {
        return this._price;
    }
}
