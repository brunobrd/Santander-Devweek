#Santander Dev Week 
RESTful Api java criada para o Santander Dev Week
## Diagrama de Classes

``` mermaid
classDiagram
    class Customer {
        - String name
    }
    
    class Account {
        - String number
        - String agency
        - Float balance
        - Float limit
    }

    class Feature {
        - String icon
        - String description
    }

    class Card {
        - String number
        - String limit
    }

    class News {
        - String icon
        - String description
    }

    Customer "1" *-- "1" Account
    Customer "1" *-- "1..*" Feature
    Customer "1" *-- "1" Card
    Customer "1" *-- "1..*" News
```
