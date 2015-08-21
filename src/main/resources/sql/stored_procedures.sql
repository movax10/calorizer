delimiter //
DROP PROCEDURE IF EXISTS createRole;
DROP PROCEDURE IF EXISTS createUserEntry;
DROP PROCEDURE IF EXISTS createUserHasRole;
 
create procedure createRole($name varchar(50), out $id int)
begin
    insert into roles (rolename) values ($name);
    set $id := last_insert_id();
end //
 
create procedure createUserEntry($email varchar(50), out $id int)
begin
    insert into users (email, password, registration_date) values ($email, 'password', CURRENT_TIMESTAMP);
    set $id := last_insert_id();
end //
 
create procedure createUserHasRole($user_id int, $role_id smallint)
begin
    insert into user_roles (user_id, role_id) values ($user_id, $role_id);
end //

delimiter ;