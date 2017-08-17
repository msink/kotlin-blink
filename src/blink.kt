import lib.*

const val BLINK_LCD = 0

fun main(args: Array<String>) {
        gpio_request(BLINK_LCD, "blink-lcd");
        gpio_direction_output(BLINK_LCD, 1);
        while (true) {
                mdelay(200);
                gpio_set_value(BLINK_LCD, 0);
                mdelay(200);
                gpio_set_value(BLINK_LCD, 1);
        }
}
