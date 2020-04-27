# Kotlin
Kotlin使用语法介绍以及Intent 跳转点击事件的发生
* Kotlin 是一种在 Java 虚拟机上运行的静态类型编程语言，被称之为 Android 世界的Swift，由 JetBrains 设计开发并开源。、
 Kotlin 可以编译成Java字节码，也可以编译成 JavaScript，方便在没有 JVM 的设备上运行。
 * 为什么要使用kotlin？
 * 简洁: 大大减少样板代码的数量。
 * 安全: 避免空指针异常等整个类的错误。
 * 互操作性: 充分利用 JVM、Android 和浏览器的现有库。
 * 初始化时候 apply plugin: 'kotlin-android-extensions'之后kotlin 可以自动找到对应的id,只要我们在主类里面导入
 import kotlinx.android.synthetic.main.layout.*,除了这个还有跳转说明       val intent = Intent() intent.setClass(this@BaseGramActivity, MainActivity::class.java)
 startActivity(intent)
 
 Kotlin USES the syntax and the occurrence of Intent jump click events
* Kotlin is a statically typed programming language running on a Java virtual machine called Swift in the Android world, designed and developed by JetBrains and open source.,
Kotlin can be compiled to Java bytecode or to JavaScript for easy running on a device without a JVM.
* why use kotlin?
* simplicity: greatly reduces the amount of boilerplate code.
* security: avoid class errors such as null pointer exceptions.
* interoperability: leverage existing libraries in the JVM, Android, and browser.
* when the application plugin: 'kotlin-android-extensions' is initialized, then kotlin can automatically find the corresponding id, as long as we import it in the main class
Import kotlinx. Android. Synthetic. Main. Layout. *, in addition to this and jump instructions val intent = intent () intent. SetClass (this @ BaseGramActivity, MainActivity: : class. Java)
StartActivity (intent)

