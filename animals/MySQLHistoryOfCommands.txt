mysql> CREATE DATABASE FriendsOfPeople;
Query OK, 1 row affected (0,04 sec)

mysql> USE FriendsOfPeople;
Database changed

mysql> CREATE TABLE dogs (
    ->     имя VARCHAR(30),
    ->     команды VARCHAR(30),
    ->     дата DATE
    -> );
Query OK, 0 rows affected (0,04 sec)

mysql> CREATE TABLE cats(имя VARCHAR(30), команды VARCHAR(30), дата DATE );
Query OK, 0 rows affected (0,03 sec)

mysql> CREATE TABLE hamsters(имя VARCHAR(30), команды VARCHAR(30), дата DATE);
Query OK, 0 rows affected (0,02 sec)

mysql> CREATE TABLE horses(имя VARCHAR(30), команды VARCHAR(30), дата DATE);
Query OK, 0 rows affected (0,03 sec)

mysql> CREATE TABLE camels(имя VARCHAR(30), команды VARCHAR(30), дата DATE);
Query OK, 0 rows affected (0,02 sec)

mysql> CREATE TABLE donkeys(имя VARCHAR(30), команды VARCHAR(30), дата DATE);
Query OK, 0 rows affected (0,03 sec)

mysql> INSERT INTO dogs (имя, команды, дата)
    -> VALUES ('Барбос', 'сидеть, лежать, покрутиться', '2021-07-20');
Query OK, 1 row affected (0,03 sec)

mysql> SELECT * FROM dogs;
+--------------+----------------------------------------------------+------------+
| имя          | команды                                            | дата       |
+--------------+----------------------------------------------------+------------+
| Барбос       | сидеть, лежать, покрутиться                        | 2021-07-20 |
+--------------+----------------------------------------------------+------------+
1 row in set (0,01 sec)

mysql> INSERT INTO dogs (имя, команды, дата)
    -> VALUES ('Барбос', 'сидеть, лежать, покрутиться', '2021-07-20');
Query OK, 1 row affected (0,01 sec)

mysql> SELECT * FROM dogs;
+--------------+----------------------------------------------------+------------+
| имя          | команды                                            | дата       |
+--------------+----------------------------------------------------+------------+
| Барбос       | сидеть, лежать, покрутиться                        | 2021-07-20 |
| Барбос       | сидеть, лежать, покрутиться                        | 2021-07-20 |
+--------------+----------------------------------------------------+------------+
2 rows in set (0,00 sec)

mysql> DELETE FROM dogs WHERE имя = 'Барбос' LIMIT 1;
Query OK, 1 row affected (0,01 sec)

mysql> SELECT * FROM dogs;
+--------------+----------------------------------------------------+------------+
| имя          | команды                                            | дата       |
+--------------+----------------------------------------------------+------------+
| Барбос       | сидеть, лежать, покрутиться                        | 2021-07-20 |
+--------------+----------------------------------------------------+------------+
1 row in set (0,00 sec)

mysql> INSERT INTO dogs (имя, команды, дата)
    -> VALUES ('Везунчик', 'стоять, сидеть, ползать, лаять', '2021-01-10');
Query OK, 1 row affected (0,01 sec)

mysql> INSERT INTO dogs (имя, команды, дата) VALUES ('Хатико', 'ждать', '2010-01-01');
Query OK, 1 row affected (0,01 sec)

mysql> SELECT * FROM dogs;
+------------------+--------------------------------------------------------+------------+
| имя              | команды                                                | дата       |
+------------------+--------------------------------------------------------+------------+
| Барбос           | сидеть, лежать, покрутиться                            | 2021-07-20 |
| Везунчик         | стоять, сидеть, ползать, лаять                         | 2021-01-10 |
| Хатико           | ждать                                                  | 2010-01-01 |
+------------------+--------------------------------------------------------+------------+
3 rows in set (0,00 sec)

mysql> INSERT INTO dogs (имя, команды, дата) VALUES ('Чак Норрис', 'kill', '2015-01-11');
Query OK, 1 row affected (0,01 sec)

mysql> SELECT * FROM dogs;
+---------------------+--------------------------------------------------------+------------+
| имя                 | команды                                                | дата       |
+---------------------+--------------------------------------------------------+------------+
| Барбос              | сидеть, лежать, покрутиться                            | 2021-07-20 |
| Везунчик            | стоять, сидеть, ползать, лаять                         | 2021-01-10 |
| Хатико              | ждать                                                  | 2010-01-01 |
| Чак Норрис          | kill                                                   | 2015-01-11 |
+---------------------+--------------------------------------------------------+------------+
4 rows in set (0,00 sec)

mysql> INSERT INTO cats (имя, команды, дата)
    -> VALUES
    ->   ('Малыш', 'кушать', '2023-04-03'),
    ->   ('Мурзик', 'играть, кушать, мяукать', '2021-08-08'),
    ->   ('Леницев', 'кушать', '2021-02-11');
Query OK, 3 rows affected (0,01 sec)
Records: 3  Duplicates: 0  Warnings: 0

mysql> SELECT * FROM cats;
+----------------+--------------------------------------------+------------+
| имя            | команды                                    | дата       |
+----------------+--------------------------------------------+------------+
| Малыш          | кушать                                     | 2023-04-03 |
| Мурзик         | играть, кушать, мяукать                    | 2021-08-08 |
| Леницев        | кушать                                     | 2021-02-11 |
+----------------+--------------------------------------------+------------+
3 rows in set (0,00 sec)

mysql> INSERT INTO hamsters (имя, команды, дата)
    -> VALUES
    ->   ('Джери', 'кушать', '2022-11-12'),
    ->   ('Донни', 'играться, крутить колесо', '2021-05-30'));
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near ')' at line 4
mysql> INSERT INTO hamsters (имя, команды, дата)
    -> VALUES
    ->   ('Джери', 'кушать', '2022-11-12'),
    ->   ('Донни', 'играться, крутить колесо', '2021-05-30');
Query OK, 2 rows affected (0,02 sec)
Records: 2  Duplicates: 0  Warnings: 0

mysql> SELECT * FROM hamsters;
+------------+-----------------------------------------------+------------+
| имя        | команды                                       | дата       |
+------------+-----------------------------------------------+------------+
| Джери      | кушать                                        | 2022-11-12 |
| Донни      | играться, крутить колесо                      | 2021-05-30 |
+------------+-----------------------------------------------+------------+
2 rows in set (0,00 sec)

mysql> INSERT INTO horses (имя, команды, дата)
    -> VALUES
    ->   ('Аполон', 'мчаться, бежать, стоять', '2021-11-24'),
    ->   ('Астон', 'мчаться, бежать, стоять', '2013-02-15');
Query OK, 2 rows affected (0,02 sec)
Records: 2  Duplicates: 0  Warnings: 0

mysql> SELECT * FROM horses;
+--------------+--------------------------------------------+------------+
| имя          | команды                                    | дата       |
+--------------+--------------------------------------------+------------+
| Аполон       | мчаться, бежать, стоять                    | 2021-11-24 |
| Астон        | мчаться, бежать, стоять                    | 2013-02-15 |
+--------------+--------------------------------------------+------------+
2 rows in set (0,00 sec)

mysql> INSERT INTO camels (имя, команды, дата)
    -> VALUES
    ->   ('Пеппи', 'идти, стоять, есть, пить', '2021-03-11'),
    ->   ('Рамзес', ''идти, стоять, есть, пить', '2012-02-10');
    '> ;
    '> ^C
mysql> INSERT INTO camels (имя, команды, дата)
    -> VALUES
    ->   ('Пеппи', 'идти, стоять, есть, пить', '2021-03-11'),
    ->   ('Рамзес', ''идти, стоять, есть, пить', '2012-02-10');
    '> ^C
mysql> INSERT INTO camels (имя, команды, дата)
    -> VALUES
    ->   ('Пеппи', 'идти, стоять, есть, пить', '2021-03-11'),
    ->   ('Рамзес', 'идти, стоять, есть, пить', '2012-02-10');
Query OK, 2 rows affected (0,01 sec)
Records: 2  Duplicates: 0  Warnings: 0

mysql> SELECT * FROM camels;
+--------------+--------------------------------------------+------------+
| имя          | команды                                    | дата       |
+--------------+--------------------------------------------+------------+
| Пеппи        | идти, стоять, есть, пить                   | 2021-03-11 |
| Рамзес       | идти, стоять, есть, пить                   | 2012-02-10 |
+--------------+--------------------------------------------+------------+
2 rows in set (0,00 sec)

mysql> INSERT INTO donkeys (имя, команды, дата)
    -> VALUES
    ->   ('Рональд', ''играть', '2022-02-10');
    '> ^C
mysql> INSERT INTO donkeys (имя, команды, дата)
    -> VALUES
    ->   ('Рональд', 'играть', '2022-02-10');
Query OK, 1 row affected (0,02 sec)

mysql> SELECT * FROM donkeys;
+----------------+----------------+------------+
| имя            | команды        | дата       |
+----------------+----------------+------------+
| Рональд        | играть         | 2022-02-10 |
+----------------+----------------+------------+
1 row in set (0,01 sec)

mysql> DROP TABLE camels;
Query OK, 0 rows affected (0,03 sec)

mysql> SELECT * FROM horses
    -> UNION ALL
    -> SELECT * FROM donkeys;
+----------------+--------------------------------------------+------------+
| имя            | команды                                    | дата       |
+----------------+--------------------------------------------+------------+
| Аполон         | мчаться, бежать, стоять                    | 2021-11-24 |
| Астон          | мчаться, бежать, стоять                    | 2013-02-15 |
| Рональд        | играть                                     | 2022-02-10 |
+----------------+--------------------------------------------+------------+
3 rows in set (0,00 sec)

mysql> CREATE TABLE pack(имя VARCHAR(30), команды VARCHAR(30), дата DATE);
Query OK, 0 rows affected (0,05 sec)

mysql> INSERT INTO new_table
    -> SELECT * FROM table1;
ERROR 1146 (42S02): Table 'FriendsOfPeople.new_table' doesn't exist
mysql> INSERT INTO pack
    -> SELECT * FROM horses;
Query OK, 2 rows affected (0,02 sec)
Records: 2  Duplicates: 0  Warnings: 0

mysql> INSERT INTO pack SELECT * FROM d0nkeys;
ERROR 1146 (42S02): Table 'FriendsOfPeople.d0nkeys' doesn't exist
mysql> INSERT INTO pack SELECT * FROM donkeys;
Query OK, 1 row affected (0,00 sec)
Records: 1  Duplicates: 0  Warnings: 0

mysql> SELECT * FROM pack;
+----------------+--------------------------------------------+------------+
| имя            | команды                                    | дата       |
+----------------+--------------------------------------------+------------+
| Аполон         | мчаться, бежать, стоять                    | 2021-11-24 |
| Астон          | мчаться, бежать, стоять                    | 2013-02-15 |
| Рональд        | играть                                     | 2022-02-10 |
+----------------+--------------------------------------------+------------+
3 rows in set (0,00 sec)

mysql> DROP TABLE donkeys;
Query OK, 0 rows affected (0,03 sec)

mysql> DROP TABLE horses;
Query OK, 0 rows affected (0,02 sec)

mysql> CREATE TABLE YoungAnimals(
    ->     имя VARCHAR(30),
    ->     команды VARCHAR(30),
    ->     дата DATE,
    ->     возраст_в_месяцах INT
    -> );
Query OK, 0 rows affected (0,04 sec)

mysql> INSERT INTO YoungAnimals (имя, команды, дата, возраст_в_месяцах)
    -> SELECT имя, команды, дата, TIMESTAMPDIFF(MONTH, дата, CURDATE()) AS возраст_в_месяцах
    -> FROM dogs
    -> WHERE дата > DATE_SUB(CURDATE(), INTERVAL 3 YEAR) AND дата < DATE_SUB(CURDATE(), INTERVAL 1 YEAR);
Query OK, 2 rows affected (0,02 sec)
Records: 2  Duplicates: 0  Warnings: 0

mysql> SELECT * FROM YoungAnimals;
+------------------+--------------------------------------------------------+------------+----------------------------------+
| имя              | команды                                                | дата       | возраст_в_месяцах                |
+------------------+--------------------------------------------------------+------------+----------------------------------+
| Барбос           | сидеть, лежать, покрутиться                            | 2021-07-20 |                               24 |
| Везунчик         | стоять, сидеть, ползать, лаять                         | 2021-01-10 |                               30 |
+------------------+--------------------------------------------------------+------------+----------------------------------+
2 rows in set (0,00 sec)

mysql> INSERT INTO YoungAnimals (имя, команды, дата, возраст_в_месяцах)
    -> SELECT имя, команды, дата, TIMESTAMPDIFF(MONTH, дата, CURDATE()) AS возраст_в_месяцах
    -> FROM cats
    -> WHERE дата > DATE_SUB(CURDATE(), INTERVAL 3 YEAR) AND дата < DATE_SUB(CURDATE(), INTERVAL 1 YEAR);
Query OK, 2 rows affected (0,02 sec)
Records: 2  Duplicates: 0  Warnings: 0

mysql> INSERT INTO YoungAnimals (имя, команды, дата, возраст_в_месяцах)
    -> SELECT имя, команды, дата, TIMESTAMPDIFF(MONTH, дата, CURDATE()) AS возраст_в_месяцах
    -> FROM hamsters
    -> WHERE дата > DATE_SUB(CURDATE(), INTERVAL 3 YEAR) AND дата < DATE_SUB(CURDATE(), INTERVAL 1 YEAR);
Query OK, 1 row affected (0,02 sec)
Records: 1  Duplicates: 0  Warnings: 0

mysql> INSERT INTO YoungAnimals (имя, команды, дата, возраст_в_месяцах)
    -> SELECT имя, команды, дата, TIMESTAMPDIFF(MONTH, дата, CURDATE()) AS возраст_в_месяцах
    -> FROM horses
    -> WHERE дата > DATE_SUB(CURDATE(), INTERVAL 3 YEAR) AND дата < DATE_SUB(CURDATE(), INTERVAL 1 YEAR);
Query OK, 1 row affected (0,00 sec)
Records: 1  Duplicates: 0  Warnings: 0

mysql> INSERT INTO YoungAnimals (имя, команды, дата, возраст_в_месяцах)
    -> SELECT имя, команды, дата, TIMESTAMPDIFF(MONTH, дата, CURDATE()) AS возраст_в_месяцах
    -> FROM donkeys
    -> WHERE дата > DATE_SUB(CURDATE(), INTERVAL 3 YEAR) AND дата < DATE_SUB(CURDATE(), INTERVAL 1 YEAR);
Query OK, 1 row affected (0,01 sec)
Records: 1  Duplicates: 0  Warnings: 0

mysql> SELECT * FROM YoungAnimals;
+------------------+--------------------------------------------------------+------------+----------------------------------+
| имя              | команды                                                | дата       | возраст_в_месяцах                |
+------------------+--------------------------------------------------------+------------+----------------------------------+
| Барбос           | сидеть, лежать, покрутиться                            | 2021-07-20 |                               24 |
| Везунчик         | стоять, сидеть, ползать, лаять                         | 2021-01-10 |                               30 |
| Мурзик           | играть, кушать, мяукать                                | 2021-08-08 |                               23 |
| Леницев          | кушать                                                 | 2021-02-11 |                               29 |
| Донни            | играться, крутить колесо                               | 2021-05-30 |                               26 |
| Аполон           | мчаться, бежать, стоять                                | 2021-11-24 |                               20 |
| Рональд          | играть                                                 | 2022-02-10 |                               17 |
+------------------+--------------------------------------------------------+------------+----------------------------------+
7 rows in set (0,00 sec)

mysql> SHOW TABLES;
+---------------------------+
| Tables_in_FriendsOfPeople |
+---------------------------+
| YoungAnimals              |
| cats                      |
| dogs                      |
| hamsters                  |
| pack                      |
+---------------------------+
5 rows in set (0,00 sec)

mysql> CREATE TABLE merge(имя VARCHAR(30), команды VARCHAR(30), дата DATE);
Query OK, 0 rows affected (0,05 sec)

mysql> INSERT INTO merge SELECT * FROM pack;
Query OK, 3 rows affected (0,01 sec)
Records: 3  Duplicates: 0  Warnings: 0

mysql> INSERT INTO merge SELECT * FROM cats;
Query OK, 3 rows affected (0,01 sec)
Records: 3  Duplicates: 0  Warnings: 0

mysql> INSERT INTO merge SELECT * FROM dogs;
Query OK, 4 rows affected (0,01 sec)
Records: 4  Duplicates: 0  Warnings: 0

mysql> INSERT INTO merge SELECT * FROM hamsers;
ERROR 1146 (42S02): Table 'FriendsOfPeople.hamsers' doesn't exist
mysql> INSERT INTO merge SELECT * FROM hamsters;
Query OK, 2 rows affected (0,00 sec)
Records: 2  Duplicates: 0  Warnings: 0

mysql> SELECT * FROM merge;
+---------------------+--------------------------------------------------------+------------+
| имя                 | команды                                                | дата       |
+---------------------+--------------------------------------------------------+------------+
| Аполон              | мчаться, бежать, стоять                                | 2021-11-24 |
| Астон               | мчаться, бежать, стоять                                | 2013-02-15 |
| Рональд             | играть                                                 | 2022-02-10 |
| Малыш               | кушать                                                 | 2023-04-03 |
| Мурзик              | играть, кушать, мяукать                                | 2021-08-08 |
| Леницев             | кушать                                                 | 2021-02-11 |
| Барбос              | сидеть, лежать, покрутиться                            | 2021-07-20 |
| Везунчик            | стоять, сидеть, ползать, лаять                         | 2021-01-10 |
| Хатико              | ждать                                                  | 2010-01-01 |
| Чак Норрис          | kill                                                   | 2015-01-11 |
| Джери               | кушать                                                 | 2022-11-12 |
| Донни               | играться, крутить колесо                               | 2021-05-30 |
+---------------------+--------------------------------------------------------+------------+
12 rows in set (0,00 sec)
