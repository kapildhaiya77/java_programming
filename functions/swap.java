public class swap{
    public static void swap(int a,int b){
        int temp =a;
        a=b;
        b=temp;
        System.out.println("a="+a );
        System.out.println("b="+ b);
    }
    public static void main(String arg[]){
        int a =9;
        int b=7;
swap(a,b);
//if we print a and b  it will print call by value i.e original value
//System.out.println("a="+a );
//System.out.println("b="+ b);
    }
}