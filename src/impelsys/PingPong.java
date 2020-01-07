package impelsys;

public class PingPong {

    public static void main(String args[]){

        for(int i=1; i<=100 ;i++){
            if(i%15 == 0 ){
                System.out.println("ping pong");
            } else  if(i%3 == 0 ){
                System.out.println("ping");
            }  else  if(i%5 == 0 ){
                System.out.println("pong");
            } else {
                System.out.println(i);
            }

        }
    }
}
