1.  配置 generatorConfig.xml中连接mysql的url

2.  <table tableName="u_user" ..>中为需要mapping的table

3.  在dos窗口中进入mybatis-generator-core-1.3.2\lib目录

4.  执行代码自动生成命令

    ```shell
    Java -jar mybatis-generator-core-1.3.2.jar -configfile generatorConfig.xml -overwrite
    ```

`generatorConfig.xml`详情链接 https://github.com/xurunfei/javaNote/blob/master/java/mybatis/Mybatis%20Generator%E6%9C%80%E5%AE%8C%E6%95%B4%E9%85%8D%E7%BD%AE%E8%AF%A6%E8%A7%A3.md