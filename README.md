
# SimBank

An online banking simulator made with Spring Boot and React.


## Appendix

A Spring boot back-end application (soon to be full-stack with React frontend)
made with Spring Security, JWT Authentication, and PostgreSQL Database.

## API Reference

#### Login Authentication

```http
  POST /api/v1/auth/authenticate
```

| Parameters | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `login  ` | `string` | **Required**. User email        |
| `password` | `string` | **Required**. Your password |

#### Register

```http
  POST /api/v1/auth/register
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `firstname`      | `string` | **Required**. First Name of User |
| `lastname`      | `string` | **Required**. Last Name of User |
| `email`      | `string` | **Required**. Email of User |
| `password`      | `string` | **Required**. Password |
| `dob`      | `string` | **Required**. Date of Birth of User|




## Tech Stack

**Client:** React, TailwindCSS

**Server:** Node, Spring Boot Express

