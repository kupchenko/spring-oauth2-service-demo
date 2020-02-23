# Getting starter

## Generate signing token

```
keytool -genkeypair -alias local  -keyalg RSA  -keypass localpass  -keystore local.jks  -storepass localpass
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
