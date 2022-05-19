/*

    * ---------------------- *                     * -------------------- *
    |     patient            |                     |       surgery        |
    * ---------------------- *                     * -------------------- *
    |  PK | id   Long        |           |---------|PK  | id  Long        |
    |     | firstName String |           |         |    | name String     |
    |     | lastName String  |           |         |    |department String|
    |     | age int          |           |         |    |patient `list    |
    | FK  | surgery id       | >----------         * -------------------- *
    * ---------------------- *

One to Many relationship
One Surgery can have multiple patients
primary key - is the id of each table
foreign key is the link - in this case the surgery id

TASK
Your API must demonstrate either a One-to-Many or a Many-to-Many relationship
Your controllers should have the minimum of the following routes: INDEX/SHOW/POST/DELETE
Test your routes using Postman
Create at least 2 derived queries
Test your derived queries with unit tests
Hook your derived queries up to the appropriate controller




 */