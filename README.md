# ConsumingAPI-RestTemplate
Consumindo API usando RestTemplate do Spring 
</br>

## Tecnologias usadas: 
<img align="center" alt="Java" height="50" width="60" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg" />
<img align="center" alt="Spring" height="60" width="70" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/spring/spring-original-wordmark.svg" />
 
## Requisitos para rodar o projeto:
- JDK 17+ instalado na sua máquina

## Rotas:
Rotas   | Resultado
--------- | ------
localhost:9000/todos | Retorna um json com uma lista cotendo todas as tarefas
localhost:9000/todos?completed=true/false | Retorna um json com as tarefas completas / incompletas
localhost:9000/todos/{id}| Retorna uma tarefa específica
localhost:9000/todos/user/{id}| Retorna um json com uma lista de tarefas de um usuário específico
localhost:9000/todos/{id}?completed=true/false | Retorna  um json com uma lista de tarefas completas / incompletas de um usário específico

API utilizada: https://jsonplaceholder.typicode.com/todos/3
