@echo off
echo Compiling Inventory Management System...
echo.

REM Clean build directory
if exist build rmdir /s /q build
mkdir build\classes

REM Compile all Java files
echo Compiling source files...
javac -cp "lib/sqlite-jdbc-3.50.3.0.jar;lib/flatlaf-1.3.jar;lib/flatlaf-intellij-themes-1.3.jar;lib/jcalendar-1.4.jar;lib/jgoodies-common-1.2.0.jar;lib/jgoodies-looks-2.4.1.jar" -d build/classes src/com/inventory/Database/ConnectionFactory.java src/com/inventory/DTO/*.java src/com/inventory/DAO/*.java src/com/inventory/UI/*.java

if %errorlevel% equ 0 (
    echo Compilation successful!
    echo.
    echo Copying resources...
    REM Create directory structure for icons
    mkdir build\classes\com\inventory\UI\Icons 2>nul
    REM Copy icon files
    xcopy src\com\inventory\UI\Icons\*.png build\classes\com\inventory\UI\Icons\ /Y >nul
    echo Resources copied successfully!
    echo.
    echo ========================================
    echo   COMPILATION COMPLETE!
    echo ========================================
    echo You can now run the application using: run.bat
    echo.
    echo Login Credentials:
    echo   Admin: root / root
    echo   Employee: emp1 / emp1
    echo ========================================
) else (
    echo.
    echo Compilation failed!
)

pause