# Definition
Without violating encapsulation, capture and externalize an object's internal state so that the object can be restored to this state later.

#Concept
Our aim is to save the state of an object, so that in the future, we can go back to the specified state. Three objects are playing the game here - a memento, a caretaker, and the originator. The memento will store the internal states of the originator. The originator can have the internal states and it has the ability to restore into its earlier state. An originator can also retrieve information from the memento. The caretaker takes care of the memento's safekeeping or protection and it should not examine the contents of the memento.

# Real-life example
In notepad we use undo frequently by pressing ctrl + z.

# Computer world example
A classic example in this category includes the state in a finite state machine. Apart from this, in real-world database programming, often we may need to roll back a transaction operation.

# Note
1. We are advised to treat the memento object as an opaque(i.e., Ideally, caretaker should not be allowed to change them).

2. We should pay special attention so that other objects are not affected by the change made in the originator to the mememto.

3. Sometimes, use of this pattern can cost more(e.g., if we want to store and restore large amount of data frequently). ALso, from a caretaker point of view, the caretaker has no idea about how much state is kept in the memento that it wants to delete.
