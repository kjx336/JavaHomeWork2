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
    public change(float f){
            System.out.println("强制转化为整型后为：" + (int)f);
    }
    public static void main(String[] args) {
        try{
            BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(System.in));
            System.out.println("请输入：1为将一个浮点数强制转化成整型后再输出，2为求一个三位数的个、十、百位数字之和，3为计算sin(x)");
            String str = bufferedReader.readLine();
            int c = Integer.parseInt(str);
            if(c==1){
                System.out.println("请输入一个浮点数：");
                String str1 = bufferedReader.readLine();
                float f = Float.parseFloat(str1);           
                change BeginChange = new change(f);
            }else if(c==2){
                System.out.println("请输入一个三位数：");
                String str2 = bufferedReader.readLine();
                int i = Integer.parseInt(str2);
                summation StartSummation = new summation(i);
                StartSummation.count();
            }else if(c==3){
                System.out.println("请输入一个整数：");
                String str3 = bufferedReader.readLine();
                int t = Integer.parseInt(str3);
                Taylor NewTaylor = new Taylor(t);
                NewTaylor.finish();
            }else{
                System.out.println("数字指令输入有误，程序结束");
            }

        }catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
