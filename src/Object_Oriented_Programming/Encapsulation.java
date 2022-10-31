package Object_Oriented_Programming;
//This code is for Encapsulation Getter And Setter Method;
class one{
    private int id;
    private String name;
    public void SetName(String name){
        this.name = name;
    }
    public String GetName(){
        return name;
    }
    public void SetId(int id){
        this.id = id;
    }
    public int GetId(){
        return id;
    }
}
public class Encapsulation {
    public static void main(String[]args){
        one obj = new one();
//        (obj.id=45;) --> This is not allowed because we set the access modifiers of id as Private,
        //so here come the concepts of Encapsulation.
        //  Where we put The entire Information ,In a Getter and setter method(concept of capsule).
        //  And hence , this is known as encapsulation.
        obj.SetName("Pankaj");
        obj.SetId(45);
        System.out.println(obj.GetName());
        System.out.println(obj.GetId());
    }
}
