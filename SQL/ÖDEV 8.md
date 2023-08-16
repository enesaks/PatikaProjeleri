1.test veritabanınızda employee isimli sütun bilgileri id(INTEGER), name VARCHAR(50), birthday DATE, email VARCHAR(100) olan bir tablo oluşturalım.

2.Oluşturduğumuz employee tablosuna 'Mockaroo' servisini kullanarak 50 adet veri ekleyelim.

3.Sütunların her birine göre diğer sütunları güncelleyecek 5 adet UPDATE işlemi yapalım.

4.Sütunların her birine göre ilgili satırı silecek 5 adet DELETE işlemi yapalım.

CEVAPLAR

1:
create table employee (
	id INT PRIMARY KEY, 
	name VARCHAR(50),
	birthday DATE,
	email VARCHAR(50)
);

2:
insert into employee (name, birthday, email) values ('Gardener', '2022-11-12', 'gdagostino0@aboutads.info');
insert into employee (name, birthday, email) values ('Vaughan', '2023-03-01', 'vwhannel1@tumblr.com');
insert into employee (name, birthday, email) values ('Rainer', '2023-07-03', 'roleszkiewicz2@cmu.edu');
insert into employee (name, birthday, email) values ('Janina', '2022-10-04', 'jglabach3@woothemes.com');
insert into employee (name, birthday, email) values ('Ileana', '2023-02-02', 'iskoggings4@ucoz.ru');
insert into employee (name, birthday, email) values ('Desmond', '2023-01-20', 'djosefowicz5@cafepress.com');
insert into employee (name, birthday, email) values ('Kaleb', '2023-05-29', 'kruddock6@soundcloud.com');
insert into employee (name, birthday, email) values ('Corby', '2023-05-20', 'cbelham7@nymag.com');
insert into employee (name, birthday, email) values ('Margette', '2023-04-04', 'mgladdifh8@sun.com');
insert into employee (name, birthday, email) values ('Cary', '2022-12-31', 'ccoudray9@imageshack.us');


3:
UPDATE employee
	SET 
		name = 'Ahmet'
WHERE id = 1;

4:
DELETE FROM employee
WHERE id = 1;
