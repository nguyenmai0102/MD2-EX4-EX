package bai3;

public class Main2 {
    public static void main(String[] args) {
        // khoi tao hai doi tuong fan
        Fan fan1 = new Fan();
        fan1.setSpeed(Fan.FAST);
        fan1.setRadius(10);
        fan1.setColor("green");
        fan1.setOn(true);
        Fan fan2=new Fan();
        fan2.setSpeed(Fan.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);
        // su dung to String de in thong tin Fan
        System.out.println("infor fan1");
        System.out.println(fan1.toString());
        System.out.println("infor fan2");
        System.out.println(fan2.toString());
    }
}
