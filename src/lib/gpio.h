#ifndef __GPIO_H__
#define __GPIO_H__

#ifdef __cplusplus
extern "C" {
#endif

int bfin_gpio_request(unsigned gpio, const char *label);
int bfin_gpio_direction_input(unsigned gpio);
int bfin_gpio_direction_output(unsigned gpio, int value);
int bfin_gpio_get_value(unsigned gpio);
void bfin_gpio_set_value(unsigned gpio, int value);

static inline int gpio_request(unsigned gpio, const char *label)
{
    return bfin_gpio_request(gpio, label);
}

static inline int gpio_direction_input(unsigned gpio)
{
    return bfin_gpio_direction_input(gpio);
}

static inline int gpio_direction_output(unsigned gpio, int value)
{
    return bfin_gpio_direction_output(gpio, value);
}

static inline int gpio_get_value(unsigned gpio)
{
    return bfin_gpio_get_value(gpio);
}

static inline void gpio_set_value(unsigned gpio, int value)
{
    return bfin_gpio_set_value(gpio, value);
}

#ifdef __cplusplus
}
#endif

#endif /* __GPIO_H__ */
