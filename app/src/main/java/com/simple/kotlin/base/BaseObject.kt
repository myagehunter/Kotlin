package com.simple.kotlin.base

import kotlin.reflect.KProperty

/**
 *    author : jianghuizhong
 *    date   : 2020/4/26
 *    desc   : 类对象、继承、接口
 */
class BaseObject {
    class Runoob {
        fun foo() { print("Foo") } // 成员函数
        var name: String =""
        var url: String = ""
        var city: String =""
    }
    val site = Runoob() // Kotlin 中没有 new 关键字
//Koltin 中的类可以有一个 主构造器，以及一个或多个次构造器，主构造器是类头部的一部分，位于类名称之后:
    class Person constructor(firstName: String) {}

    open class Base {
        open fun f() {}
    }
    //抽象类
    abstract class Derived : Base() {
        override abstract fun f()
    }
    class Outer {                  // 外部类
        private val bar: Int = 1
        class Nested {             // 嵌套类
            fun foo() = 2
        }
    }

    /**
     * 内部类使用 inner 关键字来表示
     * 内部类会带有一个对外部类的对象的引用，所以内部类可以访问外部类成员属性和成员函数。
     */
    class Outesr {
        private val bar:Int=1
        var v="成员属性"
        inner class Inner{
            fun  foo()=bar;//访问外部类成员
            fun innerTest(){
                var  o=this@Outesr;//获取外部类的成员变量
            }
        }
    }

    /**
     * 匿名类
     */
    class Test {
        var v = "成员属性"

        fun setInterFace(test: TestInterFace) {
            test.test()
        }
    }

    /**
     * 定义接口
     */
    interface TestInterFace {
        fun test()
    }

    fun main(args: Array<String>) {
        var test = Test()

        /**
         * 采用对象表达式来创建接口对象，即匿名内部类的实例。
         */
        test.setInterFace(object : TestInterFace {
            override fun test() {
                println("对象表达式创建匿名内部类的实例")
            }
        })
    }
    // 文件名：example.kt

    private fun foo() {} // 在 example.kt 内可见

    public var bar: Int = 5 // 该属性随处可见

    internal val baz = 6    // 相同模块内可见


    fun Extends(){
        //继承
        open class Base(p: Int)           // 定义基类
        class Derived(p: Int) : Base(p)
    }
    /**
     * 接口
    **/
    interface MyInterface {
        fun bar()
        fun foo() {
            // 可选的方法体
            println("foo")
        }
    }
    class Child : MyInterface {
        override fun bar() {
            // 方法体
            println("bar")
        }
    }
    fun Void(args: Array<String>) {
        val c =  Child()
        c.foo();
        c.bar();

    }

    // 定义包含属性委托的类
    class Example {
        var p: String by Delegate()
    }

    //枚举
    enum class Clor{
        RED,BLACK
    }

    // 委托的类
    class Delegate {
        operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
            return "$thisRef, 这里委托了 ${property.name} 属性"
        }

        operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
            println("$thisRef 的 ${property.name} 属性赋值为 $value")
        }
    }
    fun mains(args: Array<String>) {
        val e = Example()
        println(e.p)     // 访问该属性，调用 getValue() 函数

        e.p = "Runoob"   // 调用 setValue() 函数
        println(e.p)
    }
}