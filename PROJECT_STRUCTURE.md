# Project Structure

## Clean Project Layout

```
InventoryManagementSystem/
├── src/                           # Source code
│   └── com/inventory/
│       ├── Database/              # Database connection
│       ├── DAO/                   # Data Access Objects
│       ├── DTO/                   # Data Transfer Objects
│       └── UI/                    # User Interface
│           └── Icons/             # UI Icons
├── lib/                           # Dependencies
│   ├── sqlite-jdbc-3.50.3.0.jar # SQLite JDBC driver
│   ├── flatlaf-1.3.jar          # Modern UI theme
│   ├── flatlaf-intellij-themes-1.3.jar
│   ├── jcalendar-1.4.jar        # Date picker
│   ├── jgoodies-*.jar           # UI components
│   ├── AbsoluteLayout.jar        # Layout manager
│   └── DBCredentials.xml         # Database config (legacy)
├── data/                          # Database storage
│   └── inventorydb.sqlite        # SQLite database file
├── build/                         # Compiled classes
│   └── classes/                   # .class files
├── nbproject/                     # NetBeans project files
├── screenshots/                   # Application screenshots
├── SQL/                          # Database schema
│   └── InventoryDB_SQLite.sql    # SQLite schema
├── .git/                         # Git repository
├── compile.bat                   # Compilation script
├── run.bat                       # Run script
├── HOW_TO_RUN.md                # Usage instructions
├── DATABASE_MIGRATION.md        # Migration notes
├── PROJECT_STRUCTURE.md         # This file
└── README.md                     # Project overview
```

## Removed Files/Folders

### ✅ **Cleaned Up:**
- `dist/` - Old NetBeans build artifacts with MySQL dependencies
- `SQL/InventoryDB.sql` - Old MySQL schema
- `lib/mysql-connector-java-8.0.25.jar` - MySQL driver
- `lib/junit-4.6.jar` - Unused testing library
- `lib/Icons/` - Duplicate icons (kept in src/)
- `.idea/` - IntelliJ IDEA project files
- `build.xml` - NetBeans build file
- `manifest.mf` - JAR manifest
- `InventoryManagement.iml` - IntelliJ module file
- `InventoryManagement.zip` - Archive file
- `hs_err_pid*.log` - JVM error logs

### 📁 **Kept:**
- `nbproject/` - NetBeans project configuration (for IDE users)
- `screenshots/` - Documentation images
- `.git/` - Version control history
- All source code and essential dependencies

## Dependencies Summary

### **Required JARs:**
- `sqlite-jdbc-3.50.3.0.jar` - SQLite database driver
- `flatlaf-1.3.jar` - Modern look and feel
- `flatlaf-intellij-themes-1.3.jar` - Additional themes
- `jcalendar-1.4.jar` - Date picker component
- `jgoodies-common-1.2.0.jar` - UI utilities
- `jgoodies-looks-2.4.1.jar` - Enhanced UI components
- `AbsoluteLayout.jar` - Layout manager

### **Database:**
- SQLite (file-based, no server required)
- Location: `./data/inventorydb.sqlite`
- Auto-created on first run

## Build Process

1. **Compile:** `compile.bat` - Compiles source and copies resources
2. **Run:** `run.bat` - Starts the application
3. **Clean:** Delete `build/` folder to clean compiled files

## Project Size Reduction

- **Before cleanup:** ~50+ files with MySQL dependencies
- **After cleanup:** ~30 essential files
- **Removed:** ~20 unnecessary files and folders
- **Space saved:** Significant reduction in project size and complexity