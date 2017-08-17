#include <lib/time.h>

void udelay(unsigned long usec)
{
        /* stub */
}

void mdelay(unsigned long msec)
{
        while (msec--)
                udelay(1000);
}
