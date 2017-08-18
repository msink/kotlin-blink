import lib.*

const val BLINK_LED = 0

fun main(args: Array<String>) {
        gpio_request(BLINK_LED, "blink-led")
        gpio_direction_output(BLINK_LED, 1)
        while (true) {
                mdelay(200)
                gpio_set_value(BLINK_LED, 0)
                mdelay(200)
                gpio_set_value(BLINK_LED, 1)
        }
}
