1.film tablosunda film uzunluğu length sütununda gösterilmektedir. Uzunluğu ortalama film uzunluğundan fazla kaç tane film vardır?

2.film tablosunda en yüksek rental_rate değerine sahip kaç tane film vardır?

3.film tablosunda en düşük rental_rate ve en düşün replacement_cost değerlerine sahip filmleri sıralayınız.

4.payment tablosunda en fazla sayıda alışveriş yapan müşterileri(customer) sıralayınız.

CEVAPLAR 

--1: SELECT * FROM film
     WHERE length > 
     (
     SELECT AVG(length) FROM film
     )

--2: SELECT COUNT(*) FROM film
     WHERE rental_rate = 
     (
     SELECT MAX(rental_rate) FROM film
     )

--3: SELECT * FROM film
     WHERE (rental_rate, replacement_cost) = ANY 
     (
     SELECT MIN(rental_rate), MIN(replacement_cost) FROM film
     )

--4: SELECT * FROM payment
     WHERE customer_id = 
     (
     SELECT customer_id FROM customer
     GROUP BY customer_id
     ORDER BY COUNT(*)
     LIMIT 1
     ) 
