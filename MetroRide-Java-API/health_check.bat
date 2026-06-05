@echo off

echo ====================================
echo MetroRide System Health Check
echo ====================================

echo.
echo 1. Disk Usage
echo ------------------------------------
wmic logicaldisk get size,freespace,caption

echo.
echo 2. Memory Usage
echo ------------------------------------
systeminfo | findstr /C:"Total Physical Memory"
systeminfo | findstr /C:"Available Physical Memory"

echo.
echo 3. Running Java Processes
echo ------------------------------------
tasklist | findstr java

echo.
echo Health check completed successfully.