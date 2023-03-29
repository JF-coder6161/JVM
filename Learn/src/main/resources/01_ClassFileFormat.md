# JVM

## 1：JVM基础知识

1. 什么是JVM
2. 常见的JVM

## 2：ClassFileFormat

- 二进制字节流
- 数据类型: u1(1个字节) u2 u4 u8 和 _info(表类型)  u-无符号整数
  - _info 的来源是hotspot源码中的写法
- 查看16进制格式的ClassFile
  - sublime /notepad
  - IDEA插件 -BinEd
- 很多可以观察ByteCode的方法
  - javap
  - JBE - 可以直接修改
  - JClassLib - IDEA插件之一

## 3：类编译-加载-初始化

hashcode
锁的信息（2位 四种组合）
GC信息（年龄）
如果是数组，数组的长度

## 4：JMM

new Cat()
pointer -> Cat.class
寻找方法的信息

## 5：对象

1：句柄池 （指针池）间接指针，节省内存
2：直接指针，访问速度快

## 6：GC基础知识

栈上分配
TLAB（Thread Local Allocation Buffer）
Old
Eden
老不死 - > Old

## 7：GC常用垃圾回收器

new Object()
markword          8个字节
类型指针           8个字节
实例变量           0
补齐                  0		
16字节（压缩 非压缩）
Object o
8个字节 
JVM参数指定压缩或非压缩

