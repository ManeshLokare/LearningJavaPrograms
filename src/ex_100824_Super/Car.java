package ex_100824_Super;

public class Car extends Vehicle {

    public int max_speed = 280;

    //   this --> used to call current class members
    //   this () OR this.variable name
    //   super --> used to call parent/super class members,variable.method,constructor
    //   super() OR super (" ") OR super.variable OR super.method

    void display ()
    {
        System.out.println("Car Speed is "+ this.max_speed);
        System.out.println("Vehicle Speed is "+ super.max_speed);
    }


}
