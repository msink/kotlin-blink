_Kotlin/Native_ code size measurement
=====================================

## C

```c
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
```

compiled code size:  (0x401609 - 0x4015B0) = 89 bytes

## Kotlin

```kotlin
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
```
compiled code size: (0x4351D9 - 0x434E60) + (0x401693 - 0x401620) = 1004 bytes

## Result

Kotlin code is (1004 / 89) = 11.3 times bigger.

Order of magnitude.
