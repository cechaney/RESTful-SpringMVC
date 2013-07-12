delete from model
delete from account
delete from account_request_model
delete from account_request

insert into account(email, password, role, first_name, last_name, disabled, locked, failed_login_attempts, read_terms) values ('CHRISTOPHER.CHANEY@phhs.org','9d1afc0d1b3ad9d852272d7c9111e422972bd3287dfa16868e417cab10c41e76','ADMIN','Chris','Chaney',0,0,0,0)
insert into account(email, password, role, first_name, last_name, disabled, locked, failed_login_attempts, read_terms) values ('STEVEN.HEADLEY@phhs.org','9d1afc0d1b3ad9d852272d7c9111e422972bd3287dfa16868e417cab10c41e76','ADMIN','Steven','Headley',0,0,0,0)
insert into account(email, password, role, first_name, last_name, disabled, locked, failed_login_attempts, read_terms) values ('BINOY.THOMAS@phhs.org','9d1afc0d1b3ad9d852272d7c9111e422972bd3287dfa16868e417cab10c41e76','ADMIN','Binoy','Thomas',0,0,0,0)
insert into account(email, password, role, first_name, last_name, disabled, locked, failed_login_attempts, read_terms) values ('JOHN.DOE@phhs.org','9d1afc0d1b3ad9d852272d7c9111e422972bd3287dfa16868e417cab10c41e76','USER','John','Doe',0,0,0,0)
insert into model(account_id,model_type,write_access) values (4,'CHF',1)
insert into model(account_id,model_type,write_access) values (4,'AMI',0)