# definition
Attach additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.

# Concept
This main principle of this pattern says that we cannot modify existing functionalities but we can extend them. In other words, this pattern is **open for extension but closed for modification**. The core concept applies when we want to add some specific functionalities to some specific object instead of the whole class.

# Real-life example
Suppose you already own a house. Now you have decided to add an additional floor. Obviously, you do not want to change the architecture of ground floor(or existing floors). You may want to change the design of the architecture for the newly added floor without affecting the existing architecture for existing floors.

# Computer world example
Suppose in a GUI-based toolkit, we want to add some border properties. We can do this by inheritance. But it cannot be treated as the best solution because our user or client cannot have absolute control from the creation. The core of that choice is static here.
**Decorator** can offer us a more flexible approach: here we may surround the component in another object. The enclosing object is termed "decorator". It conforms to the interface of the component it decorates. It forwards requests to the component. It can perform additional operations before or after those forwarding requests. An unlimited number of responsibilities can be added with this concept.

# Note
* Main advantage
    1. Without disturbing existing objects in the system, we can add new functionality to a particular object.
    2. We can code incrementally.


* Difference from inheritance

With inheritance, we need to create a new class for new responsibilities. So, there will be many classes inside the system, which in turn can make the system complex.

* Major disadvantage
    If we create too many decorators in the system, the system will be hard to maitain and debug. At the same time, the decorator can create unnecessary confusion.
