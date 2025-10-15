# How to Run the Inventory Management System

## Quick Start

### Option 1: Using Batch Files (Recommended)

1. **Compile the application (IMPORTANT - includes copying icons):**

   ```
   compile.bat
   ```

2. **Run the application:**
   ```
   run.bat
   ```

### Option 2: Manual Commands

1. **Compile the source code:**

   ```cmd
   javac -cp "lib/sqlite-jdbc-3.50.3.0.jar;lib/flatlaf-1.3.jar;lib/flatlaf-intellij-themes-1.3.jar;lib/jcalendar-1.4.jar;lib/jgoodies-common-1.2.0.jar;lib/jgoodies-looks-2.4.1.jar;lib/AbsoluteLayout.jar" -d build/classes src/com/inventory/Database/ConnectionFactory.java src/com/inventory/DTO/*.java src/com/inventory/DAO/*.java src/com/inventory/UI/*.java
   ```

2. **Run the application:**
   ```cmd
   java -cp "build/classes;lib/sqlite-jdbc-3.50.3.0.jar;lib/flatlaf-1.3.jar;lib/flatlaf-intellij-themes-1.3.jar;lib/jcalendar-1.4.jar;lib/jgoodies-common-1.2.0.jar;lib/jgoodies-looks-2.4.1.jar;lib/AbsoluteLayout.jar" com.inventory.UI.LoginPage
   ```

## Login Credentials

### Administrator Accounts:

- **Username:** `root` | **Password:** `root`
- **Username:** `aduser1` | **Password:** `dbadpass`

### Employee Accounts:

- **Username:** `emp1` | **Password:** `emp1`
- **Username:** `stduser1` | **Password:** `dbstdpass`

## System Requirements

- **Java:** JDK 8 or higher (JRE alone won't work - need JDK for compilation)
- **Operating System:** Windows (batch scripts are Windows-specific)
- **Memory:** Minimum 512MB RAM
- **Storage:** 50MB free space

## For New Users Cloning This Repository

This project is **100% portable** and will work on any Windows machine with Java JDK installed. See [SETUP_GUIDE.md](SETUP_GUIDE.md) for detailed setup instructions.

## Database Information

- **Database Type:** SQLite (file-based)
- **Database File:** `./data/inventorydb.sqlite`
- **Auto-Creation:** Database is created automatically on first run
- **Backup:** Simply copy the `inventorydb.sqlite` file

## Features Available

### Administrator Functions:

- User management (add, edit, delete users)
- Product management (add, edit, delete products)
- Customer management
- Supplier management
- Purchase management
- Sales management
- Current stock monitoring
- User activity logs
- Full system access

### Employee Functions:

- View products and stock
- Process sales
- View customer information
- Limited system access

## Troubleshooting

### Common Issues:

1. **"Could not find or load main class" error:**

   - Make sure you compiled the code first using `compile.bat`
   - Check that all JAR files are present in the `lib/` directory

2. **Database connection errors:**

   - Ensure the `data/` directory exists
   - Check file permissions for the database file
   - The database will be created automatically if it doesn't exist

3. **UI not displaying correctly:**

   - Make sure all UI library JAR files are in the classpath
   - Try running with Java 8 or 11 for better compatibility

4. **Compilation errors:**
   - Verify Java JDK is installed (not just JRE)
   - Check that all dependency JAR files are present in `lib/`

### Warning Messages:

- Native access warnings can be safely ignored
- These are related to the UI theme library and don't affect functionality

## File Structure

```
InventoryManagementSystem/
├── src/                    # Source code
├── lib/                    # JAR dependencies
├── data/                   # SQLite database location
├── build/classes/          # Compiled classes
├── compile.bat            # Compilation script
├── run.bat               # Run script
└── HOW_TO_RUN.md         # This file
```

## Support

If you encounter any issues:

1. Check that Java is properly installed: `java -version`
2. Verify all files are present in the correct directories
3. Try recompiling with `compile.bat`
4. Check the database file permissions in the `data/` directory
