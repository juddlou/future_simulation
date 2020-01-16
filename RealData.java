package future;

public class RealData implements Data {
    private String result;
    public RealData (String queryStr){
        System.out.println(queryStr+" is time consuming");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("all done");
        result="get result";
    }

    @Override
    public String getRequest() {
        return result;
    }
}
