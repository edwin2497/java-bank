/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;



import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;


/**
 *
 * @author edwin
 */
public class ReadFile {

    public ReadFile() {
    }
    
    
    
    public ArrayList<String[]> Read(String rute) {
        File dataFile = null;
        FileReader fr = null;
        BufferedReader br = null;
        ArrayList<String[]> returnList = new ArrayList<>() ;

        try {
            
            dataFile = new File(rute);
            fr = new FileReader (dataFile);
            br = new BufferedReader(fr);

            String line;
            
            while((line = br.readLine())!=null){
                System.out.println(line);
                returnList.add(line.split(";"));
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try{
                if (null != dataFile) {
                    fr.close();
                }
            }catch (Exception e2){
                e2.printStackTrace();
            }
        }
        return returnList;
    }
    
}
