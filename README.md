# users-api
 users api for labs project


port: 10020

Endpoints

- User

    - Lista Todos - /user/list get
    - Consulta Especifica - /user/{id} get
    - Insertar - /user/add post {"name": "value", "email": "value", "username": "value", "password": "value", "usertype": "value"}
    - Editar - /user/edit/{id} put {"name": "value", "email": "value", "username": "value", "password": "value", "usertype": "value"}
    - Login - /user/login post {"password": "value","username": "value"}