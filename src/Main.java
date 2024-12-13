public class Main {
    public static void main(String[] args) {
        String str = null;
        try{
            System.out.println(str.length());
        }catch(Throwable e){
            System.out.println("NullPointerExceptionエラーが発生しました"+e.getMessage());
        }
    }

}