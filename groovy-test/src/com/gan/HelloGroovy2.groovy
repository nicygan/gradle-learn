package com.gan

/**
 * 照样能跑
 */
System.out.println("hello groovy java!");
println "helo Groovy!"

/**
 * 字符串定义：
 * 单引号，三引号定义的字符串不含变量， 双引号定义的字符串可以有扩展表达式
 */
def name = "zhang shan"
println "hello ${name}"
println "the sum of 2 and 3 is ${2 + 3}"

/**
 * 字符串运算
 */
println("hello"[0])
println("hello"[0..2])
println("hello word" - " word")

/**
 * 闭包：就是一段代码块，与lambda类似,只有一个参数时，可以直接写${it}, 闭包一定有返回值（null 或 其它）
 */
def closure = { name1, age -> println("hello ${name1}, ${age} years old")}
def closure2 = { "hello2 ${it}"}
closure("zhang shan", 23)
println closure2.call("abc")

/**
 * 闭包求阶乘, 闭包可以放到括号内，也可以放到括号外
 */
static int fab(int number){
    int res = 1
    number.downto(res, {x -> res *= x})
//    res.upto(number) {x -> res *= x}
    return res
}
println(fab(5))

/**
 * 闭包求累加
 */
int cal(int number) {
    int res = number
    number.times { x -> res += x }
    return res
}
println(cal(100))

