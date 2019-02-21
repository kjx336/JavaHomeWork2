 JavaHomeWork2
简单数据类型和流程控制
===============
任务与整体解决方案：
------
* 编写一个程序，要求将一个浮点数强制转化成整型后再输出。  
* 编写程序，求一个三位数的个、十、百位数字之和。  
* 使用泰勒公式计算sin(x)近似值 

#任务一.编写一个程序，要求将一个浮点数强制转化成整型后再输出。<br>
传入一个浮点数，强制转换即可<br>
#任务二.编写程序，求一个三位数的个、十、百位数字之和。<br>
传入一个整型，使用除法消去小数点后面部分，相加即可<br>
#任务三.使用泰勒公式计算sin(x)近似值<br>
略有复杂，需要定义阶乘。<br>

领悟：
------
1.Java输入时的方法是：<br>
先在主函数定义一个类
```Java
BufferedReader bufferedReader = new BufferedReader(
	new InputStreamReader(System.in));
```
之后每次调用只需要
```Java
String str = bufferedReader.readLine();
```
就可以了，输出是
```Java
System.out.println("计算结果为:" + y);
```
由此可知字符串的合并用的是“+”<br>
str转换成整型或者浮点型、浮点型转换成整型可以用
```Java
int i = Integer.parseInt(str);
float f = Float.parseFloat(str1); 
(int)f；
```
实现阶乘的方法为：
```Java
public int jiecheng(int m){
        if (m == 1)
            return 1;
        else
            return jiecheng(m-1) * m;
    }
```
实现乘方的方法是内置函数
```Java
Math.pow（a,b）
```
其中a为底b为方次，需要注意的是返回值为`double`类型，如果原变量是float或其他会报错