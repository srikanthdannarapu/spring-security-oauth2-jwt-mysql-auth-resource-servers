# Spring-Boot-2.1-OAuth2-Authorization-Server-and-Resource-Server-JWT-and-MySQL
### download open ssl desktop app (Win64OpenSSL-1_1_1h.exe) from here and install
https://slproweb.com/products/Win32OpenSSL.html

### use open ssl to generate private and public keys
genrsa -out jwt.pem 2048

### use below command to get private key
rsa -in jwt.pem

![openssl commands](images/openssl-genkeys.JPG)

### create tables in db as below
SELECT * FROM sridb.permission;
![Permission](images/permission.JPG)

SELECT * FROM sridb.role;
![Role](images/role.JPG)

SELECT * FROM sridb.user;
![User](images/user.JPG)

SELECT * FROM sridb.assign_permission_to_role;
![assign_permission_to_role](images/assign_permission_to_role.JPG)

SELECT * FROM sridb.assign_user_to_role;
![assign_user_to_role](images/assign_user_to_role.JPG)

## postman collection is attached