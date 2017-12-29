# DataSave
###### 使用截图
![dataSave.gif](http://upload-images.jianshu.io/upload_images/4179767-be56912a2cc20597.gif?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

###### 项目需求:
* 需要在编辑页面返回时,保存所有已经编辑好的信息
* 由于编辑页面太多,每个页面要保存的数据也都不尽相同,在每个页面都写保存操作,真的很累人
* 所以在需要保存的数据上加上注解,在页面返回时,让其自动将数据保存
###### 使用说明:

在编辑页面声明要保存的变量,以及在变量前加注解,变量类型任意
```java
    @ToSave
    Object object;
```
在需要保存的地方加入
```java
        DataInjector.saveData(this);
```
在需要加载保存的数据时调用
```java
DataInjector.recoverData(this);
```
在需要加载销毁数据时调用
```java
 DataInjector.clearData(this);
```
