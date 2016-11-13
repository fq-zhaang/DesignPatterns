# Definition
Convert the interface of a class into another interface that clients expect. The adapter pattern lets classes work together that couldn't otherwise because of incompatible interfaces.

# Concept
The core concept is best described by the example below.

# Real-life example
The most common example of this type can be found with mobile charging devices.

# Computer world example
In real-life development, in many cases, we cannot communicate between two interfaces directly. They contain some kind of constraint within themselves. To deal with this kind of incompatible between those interfaces, we may need to introduce adapters.

# Illustration
In this example, we can calculate the area of a rectangle easily. If we see the Calculator class and its getArea() method, we'll know that we need to supply a rectangle as an input in the getArea() method to get the area of the rectangle. Now suppose we want to calculate the area of a triangle, but we need to get the area of the triangle through the getArea() method of Calculator. How can we do that ?
To do that we have made a CalculatorAdapter for the triangle and passed a triangle in its getArea() method. The method will translate the triangle input to rectangle input and in turn, it will call the getArea() of Calculator to get the area of it. But from the user's point of view, it it very simple: it seems to the user that he/she is passing a triangle to get the area of that triangle.

# Note
Definition tells us about 2 major kinds of adapters:
1. Class adapter. They generally use multiple inheritance to adapt one interface to another.(But remember, in Java, multiple inheritance through classes is not supported. we need to implement the concept of multiple inheritance)
2. Object adapter. They depend on the object compositions.
