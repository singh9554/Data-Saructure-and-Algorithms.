package Object_Oriented_Programming;
interface sampleInterface{
    void meth1();
    void meth2();
}
//we can Extend interface in Interface , but we cannot Extend class in interface;
interface chileSampleInterface extends sampleInterface{
    void meth3();
    void meth4();
}
class MySample implements chileSampleInterface{
   public void meth1(){
        System.out.println("meth1");
    }
    public void meth2(){
        System.out.println("meth2");
    }
    public void meth3(){
        System.out.println("meth3");
    }
    public void meth4(){
        System.out.println("meth4");
    }
}

public class inheritance_interfaces {
    public static void main(String[] args) {
        MySample obj = new MySample();
        obj.meth1();
        obj.meth2();
        obj.meth3();
        obj.meth4();
    }
}
