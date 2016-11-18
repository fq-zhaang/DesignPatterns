# Definition
Avoid coupling the sender of a request to its receiver by giving more than one object a chance to handle the request. Chain the receiving objects and pass the request along the chain until and object handles it.

# Concept
Here we process a series of objects one by one. A source will initiate this processing. With this pattern, we constitute a chain where each of the processing objects can have some logic to handle a particular type of command object. After one's processing is done, if anything is still pending, it can be forwarded to the next object in the chain. We can add new objects anytime at the end of a chain.

# Note
1. This pattern is used when we issue a request without specifying the receiver. We expect any of our receivers to handle that request.
2. There may be situation in which more than one receiver can handle the request but the receiver do not know the priority. However, we want to handle the request by the receiver based on the priority. This pattern can help us to design such a scenario.
3. We may need to have the capability to specify objects( that can handle a request) in runtime.
4. We can either define a new link or use an existing link when we need to implement a successor chain.
5. Sometimes we can try to implement and automatic mechanism for forwarding a request. The advantage is that we can avoid implementing a specific forwarding mechanism from one point to another in our chain. Smalltalk's doesnotUnderstand is a typical example in this context.
