#include <lib/gpio.h>
#include <lib/time.h>

#define BLINK_LCD       0

int main(int argc, char *argv[])
{
        gpio_request(BLINK_LCD, "blink-lcd");
        gpio_direction_output(BLINK_LCD, 1);
        for (;;) {
                mdelay(200);
                gpio_set_value(BLINK_LCD, 0);
                mdelay(200);
                gpio_set_value(BLINK_LCD, 1);
        }
}
