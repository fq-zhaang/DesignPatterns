# Definition
Separate the construction of a complex object from its representation so that the same construction processes can create different representations.

# Concept
The pattern is useful when a creational algorithm of a complex object is independent of the assembly of the parts of the object. The construction process is also capble of building a different representation of that object under consideration.

# Real-life example
To create a computer, different parts are assembled depending upon the order received by the customer(e.g., a customer demand a 500 GB hard disk with an Intel processor; another customer can choose a 250 GB with an AMD processor.).

# Computer world example
We sometimes need to convert one text format to another text format.

# Note
1. Here we separate the code of assembling from its representation. So, it hides the complex construction process and represents it as a simple process.
2. Here we focus on "how the product will be made."
3. In general, we have only one method which will finally return the complete object. Other methods will be responsible for partial creation process only.
4. It requires some amount of code duplication - which is considered a drawback with this pattern.
5. Also, if we want a mutable object(an object which can be modified after the creation process is over), we should not use this pattern. 
