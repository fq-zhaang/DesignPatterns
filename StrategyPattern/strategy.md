# Definition
Define a family of algorithms, encapsulate each one, and make them interchangeable. The strategy pattern lets the algorithm vary independently from client to client.

# Concept
We can select the behavior of an algorithm dynamically at runtime.

# Real-life example
In a football match, at the last moment, in general, if Team A is leading Team B by score of 1 - 0, instead of attacking, Team A becomes defensive. On the other hand, Team B goes for an all-out attack to score.

# Computer world example
The above concept is applicable to a computer football game also. Or, we can think of two dedicated memories where upon fulfillment of one memory, we start storing the data in the second available memory. So, a runtime check is necessary before the storing of data, and based on the situation, we'll proceed.

# Note
What is the power behind the strategy pattern ?
1. This pattern can provide dynamic behavior for us. It can help us to avoid dealing with complex algorithm-specific data structures.
2. With this pattern, the same behavior can be expressed differently. So users can have a wide variety fo choices.

What are the challenges associated with the strategy pattern ?
1. The number of objects are increased in the system.
2. Additional overhead is needed due to communication between the strategies and their contexts.
3. Users need to be fully aware of all kinds of possible behaviors to avoid confusion.
