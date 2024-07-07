public class Subtringfunction{
    public static String substrings(String str,int si,int ei){
        String substr="";
        for(int i=si;i<ei;i++){
            substr+= str.charAt(i);
        }
        return substr;

    }
    public static void main(String args[]){
        String str ="HelloWorld";
        //you can easily use substring finction if you dont want to create function
       // str.substring(0,5);
        System.out.println(substrings(str,0,6));
    }
}