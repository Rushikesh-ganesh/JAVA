public class ProcessApi2 {
    public static void main(String args[]){
        ProcessHandle processHandle = ProcessHandle.current();
        System.out.println("process id "+processHandle.pid());
    }
}
