package self_introduction3;

class Main{
public static void main(String[] args){
Person person1 = new Person("鈴木", "太郎", 20, 1.7, 60);
person1.print();

Person person2 = new Person("山田", "花子", 22, 1.5, 40);
person2.print();

Person.printCount();


// Carクラスのインスタンス「car」の所有者を「person1」に、Bicycleクラスのインスタンス「bicycle」の所有者を「person2」に設定する。
Car car = new Car();
car.setOwner(person1.firstName + person1.lastName);

Bicycle bicycle = new Bicycle();
bicycle.setOwner(person2.firstName + person2.lastName);

System.out.println(car.getOwner());
System.out.println(bicycle.getOwner());

// buyメソッドを用いて、「person1」がcarを購入、「person2」がbicycleを購入するプログラムを作成する。
person1.buy(car);
person2.buy(bicycle);

}
}