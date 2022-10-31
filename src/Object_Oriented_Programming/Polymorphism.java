package Object_Oriented_Programming;
interface Gps{
    void direction();
}
interface camera{
    void takePicture();
    void shootVideo();
}
interface music{
    void mp3();
    void video();
}
class SellPhone{
    void cellular(){
        System.out.println("we can take, we can do video chat");
    }
}
//This is polymorphism where one object MySmartPhone have many forms (interfaces) Gps,camera,music;
//One entity Many forms
class MySmartPhone extends SellPhone implements Gps,camera,music{
    public void direction(){
        System.out.println("North , South , East , West");
    }
    public void takePicture(){
        System.out.println("click to take a picture");
    }
    public void shootVideo(){
        System.out.println("Hold the button for the same");
    }
    public void mp3() {
        System.out.println("Listen Mp3 music");
    }
        public void video(){
            System.out.println("Listen video music");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        //Now if we want to use only camera So we will make the Reference of camera interface and object of
        //My SmartPhone Class;
       camera c = new MySmartPhone();
       c.takePicture();
       c.shootVideo();
       // The below action is not allowed because we created the reference of camera interface so only camera
        //interface method will be accessAble;
//       c.mp3();
//       c.cellular();
    }
}
