/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework1;

/**
 *
 * @author kjx33
 */
public class Taylor {
    int x;
    double y;
    public Taylor(int x){
        this.x = x;
    }
    
    public int jiecheng(int m){
        if (m == 1)
            return 1;
        else
            return jiecheng(m-1) * m;
    }
    
    public void finish(){
        y=x;
        for(int a = 1;a<6;a++){
            y=y+Math.pow(-1,a+1)*Math.pow(y, 2*a-1)/jiecheng(2*a-1);
        }
        System.out.println("计算结果为:" + y);
    }
}
