package mentorJava;

public class exception {
    //exception methods : getMessage(), toString(), printStackTrace(), etc.
    public static void main(String[] args){
        try{
            System.out.println("external try");
            try{
                System.out.println("internal try");
                Exception e = new Exception();
                throw e;
            }
            catch (Exception e){
                System.out.println("(internal try-catch) exception:"+e);
                System.out.println("throw exception again");
                throw e;
            }
            finally {
                System.out.println("print finally sentence");
            }
        }
        catch (Exception e){
            System.out.println("(external try-catch) Catch exception:"+e);
        }
        System.out.println("terminate");
    }
}
