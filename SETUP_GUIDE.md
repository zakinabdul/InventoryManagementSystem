# Setup Guide for New Users

## ✅ **Will it work when someone clones your repo? YES!**

Your project is **100% portable** and will work on any Windows machine with Java installed.

## 📋 **Prerequisites**

### **Required:**

- **Java JDK 8 or higher** (JRE alone won't work for compilation)
- **Windows OS** (batch scripts are Windows-specific)

### **How to check if Java is installed:**

```cmd
java -version
javac -version
```

If both commands work, you're ready to go!

## 🚀 **Quick Start for New Users**

### **Step 1: Clone the Repository**

```bash
git clone <your-repo-url>
cd InventoryManagementSystem
```

### **Step 2: Compile the Project**

```cmd
compile.bat
```

### **Step 3: Run the Application**

```cmd
run.bat
```

### **Step 4: Login**

- **Admin:** `root` / `root`
- **Employee:** `emp1` / `emp1`

## 🔧 **What Makes This Project Portable**

### ✅ **Self-Contained Dependencies**

- All required JAR files are included in `lib/` folder
- No external downloads needed
- No Maven/Gradle dependencies

### ✅ **Relative Paths Only**

- All paths in scripts are relative (no hardcoded system paths)
- Works from any directory location
- No environment variables required

### ✅ **Auto-Created Database**

- SQLite database is created automatically on first run
- No database server installation needed
- Database file: `./data/inventorydb.sqlite`

### ✅ **Included Resources**

- All UI icons are included in source
- No missing image files
- Complete project structure

## 📁 **What's Included in the Repository**

```
InventoryManagementSystem/
├── src/                    # Complete source code
├── lib/                    # All required JAR files
│   ├── sqlite-jdbc-3.50.3.0.jar
│   ├── flatlaf-1.3.jar
│   ├── flatlaf-intellij-themes-1.3.jar
│   ├── jcalendar-1.4.jar
│   ├── jgoodies-common-1.2.0.jar
│   └── jgoodies-looks-2.4.1.jar
├── compile.bat            # Windows compilation script
├── run.bat               # Windows run script
└── Documentation files
```

## 🛠 **Troubleshooting**

### **Problem: "javac is not recognized"**

**Solution:** Install Java JDK and add it to PATH

- Download from: https://www.oracle.com/java/technologies/downloads/
- Or use OpenJDK: https://adoptium.net/

### **Problem: "Could not find or load main class"**

**Solution:** Run `compile.bat` first to compile the source code

### **Problem: Compilation errors**

**Solution:**

1. Ensure Java JDK (not just JRE) is installed
2. Check that all JAR files are present in `lib/` folder
3. Try running as Administrator

### **Problem: Database errors**

**Solution:**

- Database is created automatically
- If issues persist, delete `data/` folder and restart
- Application will recreate the database with sample data

## 🎯 **Success Indicators**

### **After running `compile.bat`:**

- Should see "COMPILATION COMPLETE!" message
- `build/classes/` folder should be created
- No error messages

### **After running `run.bat`:**

- Login window should appear
- Modern dark theme UI
- No console errors

## 📞 **Support**

If someone has issues:

1. Check Java installation: `java -version` and `javac -version`
2. Verify all files were cloned properly
3. Try running `compile.bat` as Administrator
4. Check that antivirus isn't blocking the application

## 🔒 **Security Note**

- No network connections required
- All data stored locally in SQLite file
- No external dependencies or downloads
- Safe to run in corporate environments
