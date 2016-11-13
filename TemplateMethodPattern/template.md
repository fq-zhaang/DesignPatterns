# Definition
Define the skeleton of an algorithm in an operation, deferring some steps to subclasses. The template method lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure.

# Concept
In a template method, we define the minimum or essential structure of an algorithm. Then we defer some functionalities(responsibilities) to the subclasses. As a result, we can redefine certain steps of an algorithm by keeping the key structure fixed for that algorithm.

# Real-life example
Suppose we want to make pizza. The basic mechanism is the same, but extra materials are added based upon the customer's choice - whether he/she wants a vegetarian pizza or a non-vegetarian pizza.

# Illustration
Here we tried to implement our example with a similar concept.
