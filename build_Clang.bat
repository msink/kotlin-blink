@echo off
setlocal
set "PATH=..\kotlin-native\dist\dependencies\msys2-mingw-w64-x86_64-gcc-6.3.0-clang-llvm-3.9.1-windows-x86-64\bin;%PATH%"

clang -O3 -g -I./src src/blink.c src/lib/gpio.c src/lib/time.c -o blink_Clang.exe
