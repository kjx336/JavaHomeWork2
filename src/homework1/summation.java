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
public class summation {
    int x,y;
    public summation(int x){
        this.x = x;
    }
    public void count(){
        int a = x/100;
        int b = (x - 100 * a)/10;
        int c = x - 100*a - 10*b;
        y = a+b+c;
        System.out.println("计算结果为:" + y);
    }
    /*
        try{
            BufferedReader bufferedReader = new BufferedReader(
                        new InputStreamReader(System.in));
            System.out.println("请输入一个三位整数：");
            String str = bufferedReader.readLine();
            int x = Integer.parseInt(str);         
            int a = x/100;//百位数
            int b = (x - 100 * a)/10;//十位数
            int c = x - 100*a - 10*b;
            int y = a+b+c;
            System.out.println("个十百位之和为：" + y);
        }catch (IOException e) {
            e.printStackTrace();
        }*/
}
