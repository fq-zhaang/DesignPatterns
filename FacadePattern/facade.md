# Definition
Provide a unified interface to a set of interfaces in a system. Facade defines a higher-level interface that makes the subsystem easier to use.

# Concept
it is one of those patterns that supports loose coupling. Here we emphasize the abstraction and hide the complex details by exposing a simple interface.

# Note
1. We use Facade to represent a simple interface instead of a complex subsystem.
2. Here we promote weak coupling among subsystems - so, in this way, we are making them portable.
3. We already mentioned that we separate subsystems from client by a simple interface. With this model, we not only make the system easier to use but also reduce the number of objects that the clients need to deal with.
4. There is truly no major disadvantage associated with this pattern. On the other hand, it has proven its usefulness in libraries like jQuery also. 