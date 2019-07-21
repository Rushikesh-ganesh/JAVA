public class mypractice {
    public static void main(String args[]){
//        Scanner in=new Scanner("helloworld");
//         int sub=in.nextInt();
////        System.out.println(sub);
//        System.out.println(in.hasNext());


        Scanner scan = new Scanner(System.in);

        double d   = scan.nextDouble();
        int i     =  scan.nextInt();
        scan.nextLine();
        String  s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);


    }
}
