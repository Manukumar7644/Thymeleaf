# Thymeleaf
# 🌿 Thymeleaf - README Guide

## 📌 Introduction

Thymeleaf is a **Java-based template engine** used for building dynamic web applications. It is commonly used with **Spring Boot** to render HTML pages by combining frontend templates with backend data.

---

## 🚀 Key Features

* ✅ Easy integration with Spring Boot
* ✅ Uses pure HTML (can be opened directly in browser)
* ✅ Simple and readable syntax
* ✅ Secure by default (prevents XSS attacks)
* ✅ Supports MVC architecture

---

## 🧠 How It Works

Thymeleaf acts as a **bridge between backend and frontend**:

* Backend (Java/Spring Boot) sends data
* Thymeleaf injects that data into HTML
* Final rendered page is shown in browser

---

## 🛠️ Example

### Backend (Spring Boot Controller)

```java
@Controller
public class MyController {

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("name", "Rdx Boy");
        return "index";
    }
}
```

### Frontend (HTML with Thymeleaf)

```html
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Home</title>
</head>
<body>
    <h1 th:text="${name}"></h1>
</body>
</html>
```

### Output in Browser

```
Rdx Boy
```

---

## 📦 Dependency (Maven)

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-thymeleaf</artifactId>
</dependency>
```

---

## ⚙️ Common Attributes

| Attribute  | Description              |
| ---------- | ------------------------ |
| `th:text`  | Replaces text content    |
| `th:href`  | Sets link URL            |
| `th:if`    | Conditional rendering    |
| `th:each`  | Loop through collections |
| `th:value` | Sets input values        |

---

## 📍 Use Cases

* Web applications (login forms, dashboards)
* Dynamic content rendering
* MVC-based projects

---

## 🎯 Conclusion

Thymeleaf is a **powerful yet simple template engine** that makes it easy to build dynamic, secure, and maintainable web applications using Spring Boot.

