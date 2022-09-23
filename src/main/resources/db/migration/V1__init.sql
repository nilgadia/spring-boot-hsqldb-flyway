create schema demo;
CREATE TABLE demo.user (
       id INT NOT NULL,
       first_name VARCHAR(50) NOT NULL,
       last_name VARCHAR(20) NOT NULL,
       email VARCHAR(20) NOT NULL,
       phone_number NUMERIC(20) NOT NULL,
       PRIMARY KEY (id)
);

INSERT INTO demo.user (id, first_name, last_name, email, phone_number  )
VALUES (100, 'Shaikh Shahid','Iqbal', 'nomail@email.com', 9988776655 );