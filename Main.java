public class Main{
    
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) {
        Arrays arr= new Arrays<>();

        for(int i=0;i<5;i++){
            arr.add(i+1);                       
        }
        for(int i=0;i<=4;i++){
            System.out.println(arr.get(i));
        }
        
    }
}