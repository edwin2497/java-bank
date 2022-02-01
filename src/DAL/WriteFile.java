/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author edwin
 */
public class WriteFile {
    
    

    public static void main(String[] args) {
        FileWriter dataFile = null;
        PrintWriter pw = null;

        try {
            //dataFile = new FileWriter("F:\\PRG2\\.CustomersData.csv");
          dataFile = new FileWriter("C:\\DatosProyecto\\.CustomersData.csv");
            pw = new PrintWriter(dataFile);

            for (int i = 0; i < 10; i++) {
                pw.println("Line " + i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try{
                if (null != dataFile) {
                    dataFile.close();
                }
            }catch (Exception e2){
                e2.printStackTrace();
            }
        }
    }

}
