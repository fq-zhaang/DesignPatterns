# Definition
Allow an object to alter its behavior when its internal state changes. The object will appear to change its class.

# Concept

# Real-life example
Consider a network connection for the moment. Here the object(that is responsible for communication) can be in various states(e.g., already a connection is established, a connection is closed, or the object is listening through the connection). We can also think of a traffic signal in this context.

# Computer world example
We have a job processing application where we can process only one job(or any certain number of jobs) at a time. Now if a new job appears, either the application will process that job or it will signal that the new job cannot be processed at this moment because the system is already processing the maximum number of jobs in it.

# Illustration
Suppose we have remote control to turn the TV on/off. Initially the TV is in the off state. When we press the power button, the TV will be on; upon the next press of the button, the TV will go off.

# Note
If the number of states increases significantly in the system, then it becomes extemely hard to maitain that system.
