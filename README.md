
#程序员老皇历

![img](http://ww3.sinaimg.cn/large/bfadf3bejw1e3a18e7ws5j.jpg)

这个东西来自[这里](http://sandbox.runjs.cn/show/ydp3it7b)

Android端源代码: <https://github.com/oa414/CoderCalender>


觉得挺有意思。。而且具体实现赤裸裸的写在页面的JS里面。。也没什么。。想移植到Android。。

然后感觉有点麻烦。。懒得写了。。用傻办法5分钟搞定。。其实就是让Android显示一个本地网页。。

- 新建项目
- 修改布局文件，加入一个长宽都是match_parent的WebView
- 默认Activity里，加载一个本地网页到WebView
- 把那个网页和需要的JQuery保存到Android本地
- Done。

随便弄了一个(DEC25 == OCT31)的文字当Logo。。不会PS的码农伤不起。。欢迎会设计的同学来提供

