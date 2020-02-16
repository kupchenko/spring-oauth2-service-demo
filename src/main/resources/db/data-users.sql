INSERT INTO users(idUser, username, firstName, lastName, password)
VALUES (0, 'admin', 'Dmitrii', 'Kupchenko', '$2a$10$u5iC6KiNdSFOB9Ch41oW7eU8uE5Y/RduiN9q8ftPw34Ia1CTsIXSu');

INSERT INTO users(idUser, username, firstName, lastName, password)
VALUES (1, 'admin1', 'Dmitrii', 'Kupchenko', '$2a$10$u5iC6KiNdSFOB9Ch41oW7eU8uE5Y/RduiN9q8ftPw34Ia1CTsIXSu');

INSERT INTO users(idUser, username, firstName, lastName, password)
VALUES (2, 'admin2', 'Dmitrii', 'Kupchenko', '$2a$10$u5iC6KiNdSFOB9Ch41oW7eU8uE5Y/RduiN9q8ftPw34Ia1CTsIXSu');

INSERT INTO users(idUser, username, firstName, lastName, password)
VALUES (3, 'test', 'Dmitrii', 'Kupchenko', '$2a$10$u5iC6KiNdSFOB9Ch41oW7eU8uE5Y/RduiN9q8ftPw34Ia1CTsIXSu');

INSERT INTO roles (name)
VALUES ('ROLE_USER');
INSERT INTO roles(name)
VALUES ('ROLE_ADMIN');

INSERT INTO user_has_roles(user, role)
VALUES (0, 0);
INSERT INTO user_has_roles(user, role)
VALUES (0, 1);