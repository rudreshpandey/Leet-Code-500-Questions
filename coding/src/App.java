
//import sun.net.www.http.HttpClient;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


public class App {



  public static void main(String[] args) {
      // Create a neat value object to hold the URL
      for(int i=0;i<500;i++){
         new Thread(new MyThread(i)).start();
      }
//    SpringApplication.run(DemoApplication.class, args);
   }



}
class MyThread implements Runnable{
int name;
MyThread(int name){
   this.name=name;



}
//public void run(){
// System.out.println("Running Thread: "+name);
// for(int i=0;i<5;i++){
//    System.out.println("Running Thread: "+name);
// }
//}
   public void run(){



  try{
      String GET_URL;
      if(name%3==0){
         GET_URL="https://api.qa-admin.hexaview.in/caseStudy?page=1&pageSize=10";
      }else if(name%3==1){
         GET_URL="https://api.qa-admin.hexaview.in/posts?page=1&pageSize=10";
      }else{
         GET_URL="https://api.qa-admin.hexaview.in/testimonial/testimonialTypeMapping?&page=1&pageSize=10";
      }



     URL obj = new URL(GET_URL);
      HttpURLConnection con = (HttpURLConnection) obj.openConnection();
      con.setRequestMethod("GET");
      //con.setRequestProperty("User-Agent", USER_AGENT);
      int responseCode = con.getResponseCode();
      System.out.println("GET Response Code :: " + responseCode);
      if (responseCode == HttpURLConnection.HTTP_OK) { // success
         BufferedReader in = new BufferedReader(new InputStreamReader(
               con.getInputStream()));
         String inputLine;
         StringBuffer response = new StringBuffer();
         while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
         }
         in.close();
         // print result
         System.out.println(response.toString());
      } else {
         System.out.println("GET request not worked");
      }



  }catch(IOException e){
      System.out.println(e);
   }
   }

}
