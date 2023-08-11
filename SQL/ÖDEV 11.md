1.actor ve customer tablolarında bulunan first_name sütunları için tüm verileri sıralayalım.

2.actor ve customer tablolarında bulunan first_name sütunları için kesişen verileri sıralayalım.

3.actor ve customer tablolarında bulunan first_name sütunları için ilk tabloda bulunan ancak ikinci tabloda bulunmayan verileri sıralayalım.

4.İlk 3 sorguyu tekrar eden veriler için de yapalım.

CEVAPLAR

--1: (SELECT first_name FROM actor)
     UNION AL
     (SELECT first_name FROM customer)

--2: (SELECT first_name FROM actor)
     INTERSECT
     (SELECT first_name FROM customer)

--3: (SELECT first_name FROM actor)
     EXCEPT
     (SELECT first_name FROM customer)

--4: (SELECT first_name FROM actor)
     INTERSECT
     (SELECT first_name FROM customer)
