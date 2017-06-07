DROP TABLE IF EXISTS Notatka ;

CREATE TABLE Notatka(
id int AUTO_INCREMENT PRIMARY KEY,
tagi varchar(200),
tytul varchar(200),
tresc varchar(500)
);