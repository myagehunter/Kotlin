package com.simple.kotlin.base

/**
 *    author : jianghuizhong
 *    date   : 2020/4/26
 *    desc   : 基本数据类型
 */
class BaseDataType {
    /**
     * Kotlin 中没有基础数据类型，只有封装的数字类型，你每定义的一个变量，其实 Kotlin 帮你封装了一个对象，
     * 这样可以保证不会出现空指针。数字类型也一样，所以在比较两个数字的时候，就有比较数据大小和比较两个对象是否相同的区别了。
     * 两数字之间比较
     * === 表示比较对象地址，两个 == 表示比较两个值大小。
     */

    fun main(args: Array<String>) {
        var a: Int = 1000
        print(a === a) //ture, 值相等，对象地址相等

        val boxA: Int? = a //经过装箱，创建了两个不同的对象
        val aoxA: Int? = a

        println(boxA === aoxA) //false 值相等，对象地址不一样
        println(boxA == aoxA) //true 值相等
    }

    /**
     *  类型转换
     *    由于不同的表示方式，较小类型并不是较大类型的子类型，
     *    较小的类型不能隐式转换为较大的类型。
     *    这意味着在不进行显式转换的情况下我们不能把 Byte 型值赋给一个 Int 变量。
     */
    var b: Byte = 1
    var i: Int = b.toInt()


    /**
     * 数组定义
     * 数组的创建两种方式：一种是使用函数arrayOf()；另外一种是使用工厂函数
     */
    fun maink(args: Array<String>) {
        val a = arrayListOf<Int>(1, 2, 3)
        var b = Array(3, { i -> (i * 2) })
        val i = 10
        val s = "i = $i" // 求值结果为 "i = 10"
        val d = "runoob"
        val str = "$d.length is ${d.length}" // 求值结果为 "runoob.length is 6"
    }

    /**
     * 条件语句
     */
    fun mainG() {
        var x = 0
        if (x > 0) {
            println("x 大于 0")
        } else if (x == 0) {
            println("x 等于 0")
        }

        var a = 1
        var b = 2
        val c = if (a >= b) a else b
        println("c 的值为 $c")
        if (x in 1..8) {
            println("x 在区间内")
        }
        when (x) {
            1 -> print("x == 1")
            2 -> print("x == 2")
            3, 4 -> print("x == 3||x == 4")
            else -> { // 注意这个块
                print("x 不是 1 ，也不是 2")
            }
        }
    }

    /**
     * 循环语句
     * for 循环可以对任何提供迭代器（iterator）的对象进行遍历
     */
    fun Iterator() {
        // for(item in collection) print("item")
        //for(item:Int in ints){}
        val items = listOf<String>("a", "b", "c");
        for (item in items) {
            print(item)
        }
        for (index in items.indices) {
            println("item at $items");
        }

    }
}