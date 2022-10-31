package Object_Oriented_Programming;
interface Bicycle{
    int a = 45; // In interface the variable we declare is by default final;
    void applyBreak(int decrease);//The method that we declare in interface in abstract And we have to
    //use the method in a class where we implement the interface;
    void Speed(int increase);
    default void wheel(){
        System.out.println("Four wheels");
    }
}
interface Horn{
    void hornSound();
}
//implements keyword is used to  implement interface and we can also implement multiple interface in one class;
//but we can't extends multiple class in a class;
class HeroCycle implements Bicycle,Horn{
    //    int a = 5;//we can override variable of interface in class But it is not necessary to do the same;
    //when we override interface method we have to make them public otherwise it will show error

    public void applyBreak(int decrease){
        System.out.println("Speed decrease");
    }
   public void Speed(int increase){
        System.out.println("Speed increase");
    }
    public void hornSound(){
        System.out.println("pee poo pee pee poo poo");
    }
}
public class interFace {
    public static void main(String[] args) {
        HeroCycle obj = new HeroCycle();
        obj.hornSound();
        obj.applyBreak(1);
        obj.Speed(1);
        obj.wheel();
        System.out.println(obj.a);

    }
}
