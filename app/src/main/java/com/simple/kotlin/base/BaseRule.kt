package com.simple.kotlin.base

/**
 *    author : jianghuizhong
 *    date   : 2020/4/26
 *    desc   : 基础语法规则
 */
class BaseRule {
    //定义变量var 、常量 val关键字
    var a: Int = 0
    var b: String = "1"
    var c: Boolean = false
    var d: Float = 0.2f
    var e = 0;//变量不区分大小写，相同的会报错，这样直接命名系统会自动推断为Int
    var f = null

    //$表示一个变量名的或者变量值，$varName 表示变量值，$(varName.fun())表示变量方法返回值
    var s1 = "a is $a"
    val s2 = "${s1.replace("is", "was")},but now is $a"

    //Kotlin的空安全设计对于声明可为空的参数，在使用时要进行空判断处理，
    // 有两种处理方式，字段后加!!像Java一样抛出空异常，另一种字段后加?
    // 可不做处理返回值为 null或配合?:做空判断处理
    //类型 后面加？表示可为空
    var age:String?="27"
    //抛出空指针异常
    val ages =age!!.toInt()
    //不做处理返回null
    val ages1=age?.toInt()
    //age 为空返回 -1
    val age2=age?.toInt()?:-1


    fun init() {
//        QuickToast.showToastDefault("Hello wrold !")
        //区间表达式由具有操作符形式 .. 的 rangeTo 函数辅以 in 和 !in 形成。
        for (i in 1..4) print(i) // 输出“1234”
        for(i in 1..9){  //等同于i 在1和9之間

        }
        // 使用 step 指定步长
        for (i in 1..4 step 2) print(i) // 输出“13”
        // 使用 until 函数排除结束元素
        for (i in 1 until 10) {   // i in [1, 10) 排除了 10
            println(i)
        }
        var k:List<String> = listOf("1","2","3")
        mainkt(k)
    }

    /**
     * kotlin源文件不需要相匹配的目录和包，源文件可以放在任何文件目录
     *
     */
    fun main(args: Array<String>) {
        println("Hello  Kotlin !");
    }

    /**
     * 函数定义使用关键字 fun，参数格式为：参数 : 类型
     */
    fun sum(a: Int, b: Int): Int {
        return a + b
    }

    //表达式作为函数体，返回类型自动推断
    fun sums(a: Int, b: Int) = a + b;

    //函數变长参数可以用vararg
    fun vars(vararg v: Int) {
        for (vt in v) {
            print(vt);
        }
        //数组定义
        val sumLambda: (Int, Int) -> Int = { x, y -> x + y };
        println(sumLambda(1, 2))  // 输出 3
    }

    fun print(args: Array<String>) {
        vars(1, 2, 3, 4)
    }

    /**
     * 我们可以使用 is 运算符检测一个表达式是否某类型的一个实例(类似于Java中的instanceof关键字)。
     */
    fun getStringLength(obj: Any): Int? {
        if (obj is String) {
            // 做过类型判断以后，obj会被系统自动转换为String类型
            return obj.length
        }
        // 这里的obj仍然是Any类型的引用
        return null
    }
    fun mainkt(args: List<String>) {
        print("循环输出：")
        for (i in 1..4) print(i) // 输出“1234”
        println("\n----------------")
        print("设置步长：")
        for (i in 1..4 step 2) print(i) // 输出“13”
        println("\n----------------")
        print("使用 downTo：")
        for (i in 4 downTo 1 step 2) print(i) // 输出“42”
        println("\n----------------")
        print("使用 until：")
        // 使用 until 函数排除结束元素
        for (i in 1 until 4) {   // i in [1, 4) 排除了 4
            print(i)
        }
        println("\n----------------")
    }
}