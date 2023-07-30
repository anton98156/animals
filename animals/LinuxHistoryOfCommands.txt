anton@anton-QEMU-Virtual-Machine:~$ cat > pets
собаки: Викинг, Декстер, Буч, Хулиган, Тирион, Плуто, Хатико
кошки: Джессика, Мия, Симона, Фиона, Эльза
хомяки: Алекс, Шон, Барни, Генри, Джерри
^C
anton@anton-QEMU-Virtual-Machine:~$ cat pets
собаки: Викинг, Декстер, Буч, Хулиган, Тирион, Плуто, Хатико
кошки: Джессика, Мия, Симона, Фиона, Эльза
хомяки: Алекс, Шон, Барни, Генри, Джерри

anton@anton-QEMU-Virtual-Machine:~$ cat > packAnimals
лошади: Апполон, Ангел, Астон, Адонис
верблюды: Краса, Пеппи, Рамзес
ослы: Роски, Дизи, Кона, Рональд
^C
anton@anton-QEMU-Virtual-Machine:~$ cat packAnimals
лошади: Апполон, Ангел, Астон, Адонис
верблюды: Краса, Пеппи, Рамзес
ослы: Роски, Дизи, Кона, Рональд

anton@anton-QEMU-Virtual-Machine:~$ cat pets packAnimals > newFile
anton@anton-QEMU-Virtual-Machine:~$ cat newFile
собаки: Викинг, Декстер, Буч, Хулиган, Тирион, Плуто, Хатико
кошки: Джессика, Мия, Симона, Фиона, Эльза
хомяки: Алекс, Шон, Барни, Генри, Джерри
лошади: Апполон, Ангел, Астон, Адонис
верблюды: Краса, Пеппи, Рамзес
ослы: Роски, Дизи, Кона, Рональд

anton@anton-QEMU-Virtual-Machine:~$ mv newFile Friends Of People
anton@anton-QEMU-Virtual-Machine:~$ cat Friends Of People
собаки: Викинг, Декстер, Буч, Хулиган, Тирион, Плуто, Хатико
кошки: Джессика, Мия, Симона, Фиона, Эльза
хомяки: Алекс, Шон, Барни, Генри, Джерри
лошади: Аполлон, Ангел, Астон, Адонис
верблюды: Краса, Пеппи, Рамзес
ослы: Ростки, ДизиКона, Рональд

anton@anton-QEMU-Virtual-Machine:~$ mkdir Animals
anton@anton-QEMU-Virtual-Machine:~$ sudo mv /home/anton/Friends Of People /home/anton/Animals
anton@anton-QEMU-Virtual-Machine:~$ cd /Animals
bash: cd: /Animals: Это не каталог
anton@anton-QEMU-Virtual-Machine:~$ cd Animals
anton@anton-QEMU-Virtual-Machine:~/Animals$ ls
Friends Of People
anton@anton-QEMU-Virtual-Machine:~/Animals$ cat Friends Of People
собаки: Викинг, Декстер, Буч, Хулиган, Тирион, Плуто, Хатико
кошки: Джессика, Мия, Симона, Фиона, Эльза
хомяки: Алекс, Шон, Барни, Генри, Джерри
лошади: Аполлон, Ангел, Астон, Адонис
верблюды: Краса, Пеппи, Рамзес
ослы: Ростки, ДизиКона, Рональд

anton@anton-QEMU-Virtual-Machine:~$ sudo mysql -v
[sudo] \u043f\u0430\u0440\u043e\u043b\u044c \u0434\u043b\u044f anton:
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 13
Server version: 8.0.33-0ubuntu0.22.04.4 (Ubuntu)

Copyright (c) 2000, 2023, Oracle and/or its affiliates.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Reading history-file /root/.mysql_history
Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> exit
Writing history-file /root/.mysql_history
Bye

anton@anton-QEMU-Virtual-Machine:~/test$ sudo dpkg -i htop.deb
dpkg: error: cannot find htop.deb file
anton@anton-QEMU-Virtual-Machine:~/test$ cd
anton@anton-QEMU-Virtual-Machine:~$ ls
 docker-compose.yml   log.log   Python         Python-3.9.7.tgz   test       wget-log   Документы   Изображения   Общедоступные   Шаблоны
 Java                 nodes     Python-3.9.7   snap               test.log   htop.deb   Видео       Загрузки      Музыка         'Рабочий стол'
anton@anton-QEMU-Virtual-Machine:~$ sudo dpkg -i htop.deb
Unpacking htop.deb package...
Installing htop package...
Done! htop package successfully installed.
anton@anton-QEMU-Virtual-Machine:~$ sudo dpkg -r htop
Removing htop package...
htop package successfully removed.