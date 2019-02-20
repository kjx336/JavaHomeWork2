/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author kjx33
 */
public class change {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            BufferedReader bufferedReader = new BufferedReader(
                        new InputStreamReader(System.in));
            System.out.println("请输入一个浮点数：");
            String str = bufferedReader.readLine();
            float f = Float.parseFloat(str);           
            System.out.println("强制转化为整型后为：" + (int)f);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
