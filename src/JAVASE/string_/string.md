#java.lang.String
Java程序中所i有字符串都是此类的实例对象
##特点
**字符串的内容创建之后永远不可变**     
字符串效果上是char[]字符数组 但是底层原理是byte[]数组   
##创建字符串的3+1种方式
###public String()
创建一个空白字符串,不含有任何内容   
###public String(char[] array)
根据字符数组内容创建对应字符串
###public String(byte[] array)
根据字节数组创建对应字符串
###直接创建 String 对象名

##字符串的常量池(在堆当中 )
程序当中直接写上双引号的 就在字符串的常量池中 
new出来的不再常量池中        
对基本类型: == 进行数值比较    
对引用类型: == 进行地址值的比较  

##字符串内容比较
###public boolean equals(object obj)
参数可以是任何对象  
只有参数为字符串其内容相同时才会给true  
否则返回false
```
str1.equals(str2)
str1.equals("hello")
"hello".equals(str2)
```
###public boolean equalsIgnoreCase(String str)
忽略大小写比较

##与获取相关的常用方法
###public int length():获取字符串长度
###public String concat(String str)拼接字符串
返回一个新的字符串
###public char charAt(int index)
获取指定索引的单个字符从0开始
###public int indexOf(String str)
查找参数字符串首次出现的位置,如果没有,返回-1值   

##字符串中的截取方法
###public String substring(int index)
从参数到末尾
###public String substring(int begin,int end)
左闭右开[begin,end)

##字符串的转换的方法
###public char[] toCharArray();
返回字符数组
###public byte[] getBytes();
返回字节数组
###public String replace(charSequence oldString,charSequence newString)
将所有出现的老字符串转换为新的 并返回新的字符串    
charSequence:可接受字符串类型  

##字符串的分割方法
###public String[] split(String regex)
按照参数规则分割为若干个字符串     
参数是个 正则表达式!! 


  
