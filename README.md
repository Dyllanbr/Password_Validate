
 ### API de validação de senha!


de senha que valida o nível de segurança de senha fornecida pelo usuário. Uma senha que atenda às seguintes regras será considerada uma senha válida.

### Regras

Nove ou mais caracteres

Ao menos 1 dígito

Ao menos 1 letra minúscula

Ao menos 1 letra maiúscula

Ao menos 1 caractere especial

Considere como especial os seguintes caracteres: !@#$%^&*()-+

Não possuir caracteres repetidos dentro do conjunto:

### Exemplos:

```
IsValid("") // false  
IsValid("aa") // false  
IsValid("ab") // false  
IsValid("AAAbbbCc") // false  
IsValid("AbTp9!foo") // false  
IsValid("AbTp9!foA") // false
IsValid("AbTp9 fok") // false
IsValid("AbTp9!fok") // true
```

### Como utilizar

1.Certifique-se de que você possui o Java e o Maven instalados em seu sistema.
2.Faça o clone do repositório:

![api](https://github.com/Dyllanbr/Password_Validate/assets/125283848/c9b47f24-2fa2-4de7-8947-086e37d28c90)

O seu uso é bem simples, ao iniciar a aplicação é exposta a URL (http://localhost:8080/?password) utilizando o método HTTP GET.

Para realizar a requisição você deve passar o seguinte body (formato: application/JSON):

```
{
	"password":"your_password"
}
```

### Tecnologias e ferramentas utilizadas

Java 17,
Java Spring Boot,
Postman
