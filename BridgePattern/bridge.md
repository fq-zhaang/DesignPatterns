# Definition
Decouple an abstraction from its implementation so that the two can vary independently.

# Concept
The abstract class is separated from the implementation class and we provide a bridge interface between them. This interface helps us to make concrete class functionalities independent from the interface implementer class. We can alter these different kind of classes structurally without affecting each other.

# Real-life example
In a software company, the development team and technical support team both play a crucial role. A change in the operational strategy  of one team should not have direct impact on the other team. Here the technical support team plays the role of a bridge between the clients and the development team that implements the product.

# Computer example
This pattern is used in a GUI framework. It separates Window abstraction from Window implementation in Linux/Mac OSs.
 
# Note
1. The pattern is extremely helpful when our class and its associated functionalities may change in frequent intervals.
2. Here we remove the concrete binding between an abstraction and the corresponding implementation. As a result, both hierarchies(abstraction and its implementations) can be extended through child classes.
3. Both hierarchies can grow independently.
