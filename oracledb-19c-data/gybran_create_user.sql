-- create new user
CREATE USER gybran IDENTIFIED BY mypassword;
-- grant priviledges
GRANT CONNECT, RESOURCE, DBA TO gybran;