#Random类
1.导包  
import java.util.Random;      
2.创建    
Random r = new Random();    
3.使用     
获取一个随机int数字 有正负  
```int num = r.nextInt();```

获取一个指定范围的数字 左闭右开区间  
```
int num = r.nextInt(9);
表示[0,9)
```

获取1-n的随机数[1,n]  
```
int num = r.nextInt(n) + 1;
```

 