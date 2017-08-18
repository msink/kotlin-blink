#include <lib/gpio.h>
#include <lib/time.h>

#define BLINK_LED       0

int main(int argc, char *argv[])
{
        gpio_request(BLINK_LED, "blink-led");
        gpio_direction_output(BLINK_LED, 1);
        for (;;) {
                mdelay(200);
                gpio_set_value(BLINK_LED, 0);
                mdelay(200);
                gpio_set_value(BLINK_LED, 1);
        }
}
