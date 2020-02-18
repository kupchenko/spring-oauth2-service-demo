INSERT INTO oauth_client_details
	(client_id, client_secret, scope, authorized_grant_types,
	web_server_redirect_uri, authorities, access_token_validity,
	refresh_token_validity, additional_information, autoapprove)
VALUES
	('fooClientIdPassword',
	'$2a$10$GTw0OUdKzEkHE9q3nwaWGe2SJQmqcdS6gkyHCDdaoB0y8iENXFvAe',
	'foo,read,write',
	'password,authorization_code,refresh_token,client_credentials',
	'http://localhost:9001,http://localhost:9001,http://localhost:9001,http://localhost:9001',
	null,
	60,
	36000,
	null,
	true);
INSERT INTO oauth_client_details
	(client_id, client_secret, scope, authorized_grant_types,
	web_server_redirect_uri, authorities, access_token_validity,
	refresh_token_validity, additional_information, autoapprove)
VALUES
	('sampleClientId', 'secret', 'read,write,foo,bar',
	'implicit', null, null, 36000, 36000, null, false);
INSERT INTO oauth_client_details
	(client_id, client_secret, scope, authorized_grant_types,
	web_server_redirect_uri, authorities, access_token_validity,
	refresh_token_validity, additional_information, autoapprove)
VALUES
	('barClientIdPassword', 'secret', 'bar,read,write',
	'password,authorization_code,refresh_token', null, null, 36000, 36000, null, true);
