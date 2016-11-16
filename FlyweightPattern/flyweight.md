# Definition
Use sharing to support large numbers of fine-gained objects efficiently.

# Concept
A flyweight is an object through which we try to minimize memory usage by sharing data as much as possible. Two common terms are used - intrinsic state and extrinsic state. The first category can be stored in the flyweight and is shareable. The other one depends on the flyweight's context and is non-shareable. Client objects need to pass the extrinsic state to the flyweight.

# Real-life example
In all real-world business applications, we want to av oid storing similar objects. The concept of this pattern is applicable in those places. I'll also share a story with you: a few years ago, two of my friends were each searching for an apartment to stay nearby their office. However, neither of them was satisfied with the available options. Then, one day, they found a place with all kind of facilities that they both desired. But there were two constraints - first of all, there was only one apartment, and second, the rent was high. So, to avail themselves of all those ficilities, they decided to stay together and share the rent. This can be considered a real-life example of the flyweight pattern.

# Computer world example
The graphical representation of characters in word processors is a common example of this pattern. Also, we can think of a computer game where we have a large number of participants whose looks are same but who differ from each other in their performances(or color, dress, weapons, etc.). We can use flyweight pattern in all those scenarios.
