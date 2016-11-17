# Definition
Provides an interface for creating families of related or dependent objects without specifying their concrete classes.

# Concept
In this pattern, we provide an encapsulation mechanism to a group of individual factories. These factories have a theme in common. In this process, an interface is used to create related objects. Here we do not call their implementer or concrete classes directly. We sometimes refer to this pattern as a factory of factories or a Super factory.
With this pattern, we can interchange the specific implementations without changing the user's code. But to achieve this, we need to compensate for the complexity of the system. As a result, debugging may be difficult in many scenarios.

# Real-life example
Suppose we are decorating our room. Now suppose we need two different types of almirah - one must be made of wood and one of steel. For the wooden almirah, we need to visit a carpenter shop and for the other type, we can go to a readymade steel almirah shop. Both of these are almirah factories. Based on our demand, we decide what kind of factory we need. This scenario can be considered an example of this pattern.

# Computer world example
ADO.NET has already implemented similar concepts to establish a connection to a database.

# Illustration
In this example, our client is looking for movies and he needs to access an Abstract Factory, IMovieFactory, and Abstract Products, IToolywoodMovie and IBollywoodMovie. The client does not care which of these factories is giving the concrete object for him. He uses only the generic interfaces of their products. The naming conventions are chosen for you easy reference.

# Note
1. We use this pattern when our system does not care about how its products will be created or composed.
2. We use this pattern when we need to deal with multiple factories.
3. This pattern separates concrete classes and makes interchanging the products easier. it can also enhance the reliabilities among production. But, at the same time, we must acknowledge the fact that creating a new product is difficult with this pattern(because we need to extend the interface and, as a result, changes will be required in all of the subclasses that already implemented the interface).
