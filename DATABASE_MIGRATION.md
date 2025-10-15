# Database Migration: MySQL to SQLite

## Overview
The Inventory Management System has been successfully migrated from MySQL to SQLite.

## Changes Made

### 1. Database Connection (ConnectionFactory.java)
- Updated JDBC URL from MySQL to SQLite: `jdbc:sqlite:./data/inventorydb.sqlite`
- Changed driver from `com.mysql.cj.jdbc.Driver` to `org.sqlite.JDBC`
- Removed dependency on MySQL credentials
- Added `PRAGMA foreign_keys = ON;` for referential integrity

### 2. Database Schema (SQL/InventoryDB_SQLite.sql)
- Converted MySQL-specific syntax to SQLite-compatible syntax
- Changed `AUTO_INCREMENT` to `AUTOINCREMENT`
- Changed `INT` to `INTEGER`
- Changed `VARCHAR(n)` to `TEXT`
- Changed `DOUBLE` to `REAL`
- Removed MySQL-specific engine and charset specifications
- Removed MySQL dump metadata and lock statements

### 3. Database File Location
- SQLite database file: `./data/inventorydb.sqlite`
- No server installation required
- Portable database file

### 4. Dependencies
- SQLite JDBC driver: `lib/sqlite-jdbc-3.50.3.0.jar` (already included)
- Removed dependency on MySQL Connector: `lib/mysql-connector-java-8.0.25.jar`

## Benefits of SQLite Migration

1. **No Server Required**: SQLite is serverless and doesn't require installation
2. **Portable**: Single file database that can be easily backed up and moved
3. **Lightweight**: Smaller footprint and faster for small to medium applications
4. **Zero Configuration**: No database server setup or user management needed
5. **ACID Compliant**: Full transaction support with rollback capabilities

## Database Tables
All original tables have been preserved:
- `users` - User accounts and authentication
- `customers` - Customer information
- `suppliers` - Supplier details
- `products` - Product catalog
- `currentstock` - Current inventory levels
- `purchaseinfo` - Purchase transaction history
- `salesinfo` - Sales transaction history
- `userlogs` - User login/logout logs

## Running the Application
1. Ensure the SQLite JDBC driver is in the classpath
2. The database file will be created automatically in `./data/inventorydb.sqlite`
3. All existing functionality remains the same
4. Login credentials remain unchanged:
   - Admin: username=`root`, password=`root`
   - Employee: username=`emp1`, password=`emp1`

## Notes
- The `lib/DBCredentials.xml` file is no longer used for authentication but kept for compatibility
- Foreign key constraints are enabled for data integrity
- All sample data has been migrated successfully