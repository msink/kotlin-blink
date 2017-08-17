@echo off
setlocal
set DIR=.
set "PATH=..\kotlin-native\dist\bin;%PATH%"
if "%TARGET%" == "" set TARGET=mingw

set "LFLAGS=%DIR%\src\lib\gpio.c %DIR%\src\lib\time.c -I%DIR%\src"

call cinterop -def "%DIR%\lib.def" -target "%TARGET%" -o lib || exit /b
call konanc -target "%TARGET%" -opt "%DIR%\src\blink.kt" -library lib -linkerOpts "%LFLAGS%" -o blink_Kotlin || exit /b
