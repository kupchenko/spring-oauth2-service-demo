INSERT INTO oauth_client_details
(client_id, client_secret, scope, authorized_grant_types,
 web_server_redirect_uri, authorities, access_token_validity,
 refresh_token_validity, additional_information, autoapprove)
VALUES ('notes-react-client',
        '$2a$10$GTw0OUdKzEkHE9q3nwaWGe2SJQmqcdS6gkyHCDdaoB0y8iENXFvAe',
        'foo,read,write',
        'password,authorization_code,refresh_token,client_credentials',
        'http://localhost/auth/success',
        null,
        60,
        36000,
        null,
        'foo,read,write');
INSERT INTO oauth_client_details
(client_id, client_secret, scope, authorized_grant_types,
 web_server_redirect_uri, authorities, access_token_validity,
 refresh_token_validity, additional_information, autoapprove)
VALUES ('noSecretClient', '$2a$10$GU0Jgno/7IKd5EUkuqvbhOy8ytcGYWF1xNJa7c.pu.fLSVCUd1q1a', 'read,write,foo,bar',
        'password', null, null, 36000, 36000, null, true);
INSERT INTO oauth_client_details
(client_id, client_secret, scope, authorized_grant_types,
 web_server_redirect_uri, authorities, access_token_validity,
 refresh_token_validity, additional_information, autoapprove)
VALUES ('barClientIdPassword', 'secret', 'bar,read,write',
        'password,authorization_code,refresh_token', null, null, 36000, 36000, null, true);
