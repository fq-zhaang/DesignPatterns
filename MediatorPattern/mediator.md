# Definition
Define an object that encapsulates how a set of objects interacts. The mediator pattern promotes loose coupling by keeping objects from referring to each other explicitly, and it lets you vary their interaction independently.

# Concept
A mediator is the one who takes the responsibility of communication among a group of objects. The mediator acts as an intermediary who can track the communication between two objects. The other objects in the system are also aware of this mediator and they know that if they need to communicate among themselves, they need to go through the mediator. The advantage of *using such a mediator is that we can reduce the direct interconnections among the objects and thus lower the coupling*.

# Real-life example
In an airplane application, before taking off the flight undergoes a series of checks. These checks confirm that all components/parts(which are dependent on each other) are in perfect condition.
Also, the pilot needs to communicate with the towers at the airport. in general, one pilot from one airline will not communicate with another pilot from a different airline before taking off or landing operation. Towers are acting as the mediator here.

# Computer world example
In a business application, in many cases we need to apply constraints(e.g., suppose we have a form for which we need to supply a user id and then a password for that account). In the same form, we may need to supply other mandatory information. Now suppose the functions are implemented as follows: once a user supplies his user id, the form will check whether that user id(supplied by user) is valid. If it is a valid id, then only the password field will be enabled. After supplying 
