package Tutorial6;
 public class DatabaseConnection {
     public boolean status =false;
     public boolean connectToDatabase() {
         status= true;
         return true;
     }
     public String readDData(String data){
     if(status){
         return "Data: "+data;
     }
     return null;
     }
     public boolean disconnectConnection() {
    	 status =false;
    	 return status;
     }
 }