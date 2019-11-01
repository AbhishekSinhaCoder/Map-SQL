# Map-SQL
MapSQL is a simple in-memory database management system for Java.  It  consists  of  two subsystems:

•	The core database engine
•	A shell for interacting with the database engine (this is a command line based interface)
Overview of Codebase:

The core components of the database engine can be found in the mapsqI.core package. They are:

•	SQLManager: This is the "front” of the database system. All operations are carried out by invoking the execute() method which is overridden for SQLStatements and SQLCommands .
•	SQLStatement: This is the main interface for SQL statements (e.g. CREATE TABLE, SELECT, INSERT, UPDATE, DELETE, DROP TABLE). Implementations of these statement types can be found in the mapsql.sql.statement package (you will be modifying the DropTable class).
•	SQLCommand: This is the main interface of SQL  commands,  which are commands  that can  be entered through the shell, but which are not actually part of the SQL language (e.g. QUIT and SOURCE). Implementations of these commands can be  found  in  the mapsql.sql.command package (vou will be modifying the Sources class).
•	SQLOperation: This  is a common  super  interface  for SQLStatements  and SQLCommands.  It is included purely to allow you to work with both SQLStatements and SQLCommands seamlessly (you can create a list of operations that includes  both  statements  and commands).
•	Table: This  is the core implementation of an SQL table.  In combines  two  other core classes:  a TableDescription and a list of Rows. NOTE: The list implementation used is the one developed on the course. You will be implementing two methods from this class.
•	TableDescription: This class models the description of a table (i.e. its name  and fields).  You will be implementing one of the methods specified in this class.
•	Row: This class implements an individual row in a table. It is basically a wrapper for a Map whose key is the field name and whose value is the data that is associated with that field  in the row. Notice that the table data is stored as a string.
•	Field: A field is a definition of a column in the table. This is an interface that should be implemented for each tvpe of data that can be stored in the database.  For this  assignment, we support only CHAR’s and INT’s (the implementation of these can be found in the mapsql.field package).
•	Condition: A condition is a comparison that is defined in the WHERE clause of an SQL statement. Conditions are basically comparisons that can be combined via AND or OR operations. This file is an interface that should be implemented for each  type  of condition that is supported (the full set of supported conditions can be found in the mapsqI.condition package. You will be completing the implementation of some of these conditions as part of your assignment.
•	SQLException: this is the standard exception that is thrown whenever anything goes wrong. The exception has a constructor that allows you to include an error message that will be printed out by the shell if the exception occurs.
•	SQLResult: this  is an interface  that is used to return the result of executing  a SQLStatement. It contains two methods that return  the TableDescription and a list of rows  (only in the case of a SELECT statement).
