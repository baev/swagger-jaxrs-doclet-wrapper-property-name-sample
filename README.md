# swagger-jaxrs-doclet-wrapper-property-name-sample

The sample project to reproduce swagger-jaxrs-doclet problem. First of all you need to clone the project and run the server: 

```bash
$ mvn jetty:run-war
```

Then open `http://localhost:8080/api/project`. It will returns the project object like this:

```json
{"name":"SuperProject2000","users":["Bob","Alice"]}
```

But apidocs `http://localhost:8080/apidocs/#!/project/getProject` will show you the following response format:

```json
{
  "name": "string",
  "user": [
    "string"
  ]
}
```
