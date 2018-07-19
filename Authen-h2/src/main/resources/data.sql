INSERT INTO users (username, password, enabled)
VALUES ('admin', '$2a$10$6EqKKsOwQIRR2zgkJHruKuE4pFeL93v3.RwYjZpGPLM4cR/BLum3C', TRUE);
INSERT INTO users (username, password, enabled)
VALUES ('user', '$2a$10$WiOpR/9hJ6Eae.D1csNkC.ZndMJVe53E.vLW/9E9O2cVTkhXT9Pay', TRUE);
INSERT INTO users (username, password, enabled)
VALUES ('ameizi', '$2a$10$6QZSpVgc42R8.RTdH3t18Ok4KF.Vzdj6XJ2ypll9a9VJxAQKY6BSe', TRUE);

INSERT INTO authorities (username, authority) VALUES ('ameizi', 'ROLE_USER');
INSERT INTO authorities (username, authority) VALUES ('user', 'ROLE_USER');
INSERT INTO authorities (username, authority) VALUES ('admin', 'ROLE_USER');
INSERT INTO authorities (username, authority) VALUES ('admin', 'ROLE_ADMIN');


INSERT INTO oauth_client_details (client_id, client_secret, scope, access_token_validity, authorized_grant_types)
VALUES ('client', 'secret', 'read,write', 3600, 'password');
INSERT INTO oauth_client_details (client_id, client_secret, scope, access_token_validity, authorized_grant_types)
VALUES
  ('acme', 'acmesecret', 'read,write', 3600, 'password,refresh_token,client_credentials,authorization_code,implicit');