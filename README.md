# springboot-yaml-config-load-as-array-object
Repository to showcase how to create a SpringBoot *array from config yaml* file.

### Challenge:
Issues in loading array or values (or objects) from SpringBoot YAML file.

### Solution:
Define the configuration (as represented in the class) in yaml file. 

#### Configuration:
In the **application.yaml** file, you can add the array/config values.

```
documentation: 
  baseurl: http://localhost
  swagger: 
    services:   
      - 
        name: Service1
        url: ${documentation.baseurl}:8040/v2/api-docs?group=service1
        version: 2.0
      - 
        name: Service2
        url: ${documentation.baseurl}:8050/v2/api-docs?group=service2
        version: 2.0
```
