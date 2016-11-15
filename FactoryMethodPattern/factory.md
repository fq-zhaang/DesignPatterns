# Definition
Define an interface for creating an object, but let subclasses decide which class to instantiate. The factory method lets a class defer instantiation to subclasses.

# Concept
The concept can be best described with the examples below.

# Real-life example
Suppose you have two different types of televisions - one with an LED screen and another with an LCD screen. If any of these starts malfunctioning, you will call a TV repair man to request a visit to your residence. The repairman must aks first what kind of TV is non-operational. As per your input, he'll carry the required instruments with him.

#Computer world example
In a Windows application, we may have different database users. Now whenever we need to insert data in our database we need to create either an SqlConnection or an Oracle connection first; only then we can proceed. If we put them into simple if-else, we need to repeat lots of codes and it doesn't look good. We can use the factory pattern to solve these types of problems. The basic structure is defined with an abstract class; our subclasses will be derived from this class. The subclasses will take the responsibility of the instantiation process.

# Note
1. This pattern is useful when our classes shift the responsibilities of objects creation to its subclasses.

2. This pattern is also useful when implementing parallel class hierarchies and when making a system with loose coupling is possible.

3. One issue that we need to address is that making too many objects often can decrease performance. 
