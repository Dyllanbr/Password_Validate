
🔐 ### API de validação de senha!


de senha que valida o nível de segurança de senha fornecida pelo usuário. Uma senha que atenda às seguintes regras será considerada uma senha válida.

📃 Regras

Nove ou mais caracteres

Ao menos 1 dígito

Ao menos 1 letra minúscula

Ao menos 1 letra maiúscula

Ao menos 1 caractere especial

Considere como especial os seguintes caracteres: !@#$%^&*()-+

Não possuir caracteres repetidos dentro do conjunto

Exemplos:

IsValid("") // false  
IsValid("aa") // false  
IsValid("ab") // false  
IsValid("AAAbbbCc") // false  
IsValid("AbTp9!foo") // false  
IsValid("AbTp9!foA") // false
IsValid("AbTp9 fok") // false
IsValid("AbTp9!fok") // true

🖱 Como utilizar




💻 Tecnologias e ferramentas utilizadas
Java 17
Java Spring Boot
