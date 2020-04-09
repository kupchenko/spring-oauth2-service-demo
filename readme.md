# Getting starter

## Generate signing token:

* Generate key store:
```
keytool -genkeypair -alias local  -keyalg RSA  -keypass localpass  -keystore local.jks  -storepass localpass
```
* Extract public key:
```
keytool -list -rfc --keystore local.jks | openssl x509 -inform pem -pubkey
```
## Auth flow:

*  Get code:
```
GET http://localhost:8085/oauth/authorize?grant_type=authorization_code&response_type=code&client_id=notes-react-client
```
* Get JWT token:
```
POST http://localhost:8085/oauth/token
```
Headers:
```
Basic notes-react-client:secret
Content-Type: application/x-www-form-urlencoded
```
Body:
```
grant_type: code
code: <code>
```

```
$2a$10$GU0Jgno/7IKd5EUkuqvbhOy8ytcGYWF1xNJa7c.pu.fLSVCUd1q1a
```
empty
