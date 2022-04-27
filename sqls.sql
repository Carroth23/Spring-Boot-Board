use toystudy;

CREATE TABLE user(
	user_seq INT PRIMARY KEY,
    user_id VARCHAR(100),
    user_pw VARCHAR(255),
    user_nickname VARCHAR(120),
    user_birth DATETIME,
    user_address VARCHAR(500),
    user_photo VARCHAR(1000),
    user_join_date DATETIME DEFAULT NOW()
);

INSERT INTO user
VALUES();

commit;

use world;
SELECT *
FROM city
JOIN country ON city.countrycode = country.code;
