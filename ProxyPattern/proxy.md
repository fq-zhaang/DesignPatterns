# definition
Provide a surrogate or placeholder for another object to control access to it.

# Concept
We want to use a class which can perform as interface to something else.

# Real-life example
In a class room, when one student is absent, during roll call, his best friend may try to mimic his voice to keep his friend from being marked as absent.

# Computer world example
Consider an ATM implementation for a bank. Here we will find multiple proxy objects. Actual bank information will be stored in a remote server. We must remember that in the real programming world, the creation of multiple instances of a complex objects(heavy objects) is very costly. In such situations, we can create multiple proxy objects(which must point to an original object) and the total creation of actual objects can be carried out on a demand basis. Thus we can save both the memory and creation time.

# Illustration
We call the doSomeWork() function of the proxy object, which in turn calls the doSomeWork() of the concrete object. With the output, we are getting the result directly through the concrete object.

# Types of proxy
* Remote proxy - they will hide that actual object which is in a different address space.
* Virtual proxy - they are used to perform optimization techniques like the creation of a heavy object on a demand basis.
* Protection proxy - they generally deal with different access rights.
* Smart reference - it can also perform some additional housekeeping work when an object is accessed. A typical operation is counting the number of reference to the actual object.