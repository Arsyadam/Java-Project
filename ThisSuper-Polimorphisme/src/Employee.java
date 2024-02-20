public class Employee extends Person {

    float salary = 3000;
    String name = "Dika Bos";
    int age = 15;



    public  void showinfosuper(){
        System.out.println("Nama : " + super.name);
        System.out.println("Umur : " + super.age);
        System.out.println("Gaji : $" + salary);

    }

    public void showinfothis(){
        System.out.println("Nama : " + this.name);
        System.out.println("Umur : " + this.age);
        System.out.println("Gaji : $" + salary);
    }

}