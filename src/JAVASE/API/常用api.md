#JAVASE.API
##引用类型使用步骤
1.导包  
```java
import 包路径.类名称;
```
如果目标类和当前类在同一包下可省略  
只有java.lang下不需要导包 其它都需要  
2.创建  
类名称 对象名 = new 类名称();  
3.使用  
调用其中成员方法  
对象名.成员方法();  
##Scanner键盘输入
1.所属包:java.util.Scanner  
2.创建Scanner sc = new Scanner(System.in);  
System.in表示从键盘输入     
int num = sc.nextInt();
String str = sc.next();
##匿名对象只能使用唯一一次
```
new 类名().方法();
```
可以作为参数或者返回值  
```
return new Scanner(System.in)

methodParam(new Scanner(System.in))
```
##String类:java.lang
 
##