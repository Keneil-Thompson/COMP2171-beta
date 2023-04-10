package Business;

import java.util.HashMap;
import java.io.*;


public class IDandPasswords{
    private HashMap<String,String> logininfo = new HashMap<String,String>();

    private String path = "Database/Users.csv";
    
    private String line = "";

    IDandPasswords(){ 

        try{
            BufferedReader br = new BufferedReader(new FileReader(path));
    
            while((line = br.readLine()) != null){
                String[] users = line.split(",");
                logininfo.put(users[0],users[1]);
                
            }
            br.close();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }

    }
    
    protected HashMap<String,String> getLoginInfo(){
        return logininfo;
    }
    
}


