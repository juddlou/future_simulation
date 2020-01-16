package future;

public class Main {
    public static void main(String[] args) {
        FutureClient futureClient=new FutureClient();
        Data data=futureClient.request("request parameter");
        System.out.println("request sent");
        System.out.println("doing something else");
        String result=data.getRequest();
        System.out.println(result);
    }
}
