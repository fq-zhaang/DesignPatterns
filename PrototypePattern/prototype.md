# Definition
Specify the kinds of objects to create using a prototypical instance, and create new objects by copying this prototype.

# Concept
The prototype pattern provides an alternative method for instantiating new objects by copying or cloning an instance of an existing one. Creating a new instance, in a real-world scenario, is normally treated as an expensive operation. This pattern helps us to deal with this issue. Our focus here is to reduce the expense of this creation process of a new instance.

# Real-life example
Suppose we have master copy of a valuable document. We want to make some change to it to get a different feel. We can make a photocopy of this document and then try to edit our changes.

# Computer world example
Suppose we have make an operation. The next time we want to create a similar application with some small changes, we must start with a copy from our master copy application and make the changes. We'll not start from the scratch.

# Note
1. When the system does not care about the creation mechanism of the products, this pattern is very helpful.
2. We can use this pattern when we need to instantiate classes at runtime.
3. In our example, we have used the default clone method in Java, which is a shallow copy. Thus, it is inexpensive compared to a deep copy.

*What are the advantages of the prototype pattern ?*
1. we can include or discard products at runtime.
2. We can create new instances with a cheaper cost.

*What are the disadvantages ?
1. Each subclass has to implement the cloning mechanism.
2. Implementing the cloning mechanism can be challenging if the objects under consideration do not support copying or if there is any kind of circular reference.
