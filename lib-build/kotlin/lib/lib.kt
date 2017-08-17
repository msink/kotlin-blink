@file:kotlinx.cinterop.InteropStubs
@file:Suppress("UNUSED_VARIABLE", "UNUSED_EXPRESSION")
package lib

import konan.SymbolName
import kotlinx.cinterop.*

fun bfin_gpio_request(gpio: Int, label: String?): Int {
    label?.cstr.usePointer { kniTmp1 ->
        return kniBridge0(gpio, kniTmp1.rawValue)
    }
}

fun bfin_gpio_direction_input(gpio: Int): Int {
    return kniBridge1(gpio)
}

fun bfin_gpio_direction_output(gpio: Int, value: Int): Int {
    return kniBridge2(gpio, value)
}

fun bfin_gpio_get_value(gpio: Int): Int {
    return kniBridge3(gpio)
}

fun bfin_gpio_set_value(gpio: Int, value: Int): Unit {
    return kniBridge4(gpio, value)
}

fun gpio_request(gpio: Int, label: String?): Int {
    label?.cstr.usePointer { kniTmp1 ->
        return kniBridge5(gpio, kniTmp1.rawValue)
    }
}

fun gpio_direction_input(gpio: Int): Int {
    return kniBridge6(gpio)
}

fun gpio_direction_output(gpio: Int, value: Int): Int {
    return kniBridge7(gpio, value)
}

fun gpio_get_value(gpio: Int): Int {
    return kniBridge8(gpio)
}

fun gpio_set_value(gpio: Int, value: Int): Unit {
    return kniBridge9(gpio, value)
}

fun udelay(arg0: Int): Unit {
    return kniBridge10(arg0)
}

fun mdelay(arg0: Int): Unit {
    return kniBridge11(arg0)
}

@SymbolName("lib_kniBridge0")
private external fun kniBridge0(p0: Int, p1: NativePtr): Int
@SymbolName("lib_kniBridge1")
private external fun kniBridge1(p0: Int): Int
@SymbolName("lib_kniBridge2")
private external fun kniBridge2(p0: Int, p1: Int): Int
@SymbolName("lib_kniBridge3")
private external fun kniBridge3(p0: Int): Int
@SymbolName("lib_kniBridge4")
private external fun kniBridge4(p0: Int, p1: Int): Unit
@SymbolName("lib_kniBridge5")
private external fun kniBridge5(p0: Int, p1: NativePtr): Int
@SymbolName("lib_kniBridge6")
private external fun kniBridge6(p0: Int): Int
@SymbolName("lib_kniBridge7")
private external fun kniBridge7(p0: Int, p1: Int): Int
@SymbolName("lib_kniBridge8")
private external fun kniBridge8(p0: Int): Int
@SymbolName("lib_kniBridge9")
private external fun kniBridge9(p0: Int, p1: Int): Unit
@SymbolName("lib_kniBridge10")
private external fun kniBridge10(p0: Int): Unit
@SymbolName("lib_kniBridge11")
private external fun kniBridge11(p0: Int): Unit
