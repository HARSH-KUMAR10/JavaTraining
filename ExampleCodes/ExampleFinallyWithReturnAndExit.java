package Date14022023.ExampleCodes;

public class ExampleFinallyWithReturnAndExit {

//    public static void main(String[] args) {
//        try{
//            System.out.println("Enter");
//            return;
//        }finally {
//            System.out.println("Over");
//        }
//    }

    public static void main(String[] args) {
        try{
            System.out.println("Enter");
            System.exit(0);
        }finally {
            System.out.println("Over");
        }
    }
}
