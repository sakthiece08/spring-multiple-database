CREATE TABLE currency (
                          id INT UNSIGNED NOT NULL AUTO_INCREMENT,
                          currency_name VARCHAR(30) NOT NULL,
                          description VARCHAR(30) NOT NULL,
                          PRIMARY KEY (id),
                          UNIQUE (id)
);
