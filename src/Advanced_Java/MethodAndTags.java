package Advanced_Java;

public class MethodAndTags {
    /**
     * @param args This are the arguments supplied to the command line
     */
    public static void main(String[] args) {
        System.out.println("I m a main method");
    }

    /**
     * <i>This is Method to add Two number</i>
     * @param i This is The first number to add
     * @param j This is the second Number to add;
     * @return Sum of two numbers in an integer;
     * @throws  Exception if i = 0;
     * @deprecated This method is deprecated please use + Operator
     */
    public int add(int i , int j) throws Exception{
        if( i == 0){
            throw new Exception();
        }
        int c = i + j;
        return c;
    }
}
/*
Note : /*  It is a normal comment*/
//and : -/** This comment is for Java Docs*/