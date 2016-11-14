# Definition
Provide a way to access the elements of an aggregate object sequentially without exposing its underlying representation.

# Concept
Iterators are generally used to traverse a container to access its elements.

# Real-life example
Suppose there are two companies: A and B, A stores is employee records in a linked list and B stores its employee data in a big array. On day the two companies decide to work together. The iterator pattern is handy in such situation. We need not write codes from scratch. We'll have common interface through which we can access data for both companies. We'll simply call the same methods without rewriting the codes.

# Computer world example
Similarly, say, in a college, the arts department may use array data structure and the science department may use linked list data structure. The main administrative department will access those data through the common methods - it doesn't care which data structure is used by individual departments. 
