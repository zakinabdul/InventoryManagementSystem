@echo off
echo Starting Inventory Management System...
echo.

REM Check if build directory exists
if not exist "build\classes" (
    echo Build directory not found. Please run compile.bat first.
    pause
    exit /b 1
)

REM Run the application
echo Launching application...
echo.
echo Login Credentials:
echo   Admin: root / root
echo   Admin: aduser1 / dbadpass  
echo   Employee: emp1 / emp1
echo   Employee: stduser1 / dbstdpass
echo.
java -cp "build/classes;lib/sqlite-jdbc-3.50.3.0.jar;lib/flatlaf-1.3.jar;lib/flatlaf-intellij-themes-1.3.jar;lib/jcalendar-1.4.jar;lib/jgoodies-common-1.2.0.jar;lib/jgoodies-looks-2.4.1.jar" com.inventory.UI.LoginPage

pause