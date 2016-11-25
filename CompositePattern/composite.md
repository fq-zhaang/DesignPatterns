# Definition
Compose objects into tree structures to represent part-whole hierarchies. The composite pattern lets clients treat individual objects and compositions of objects uniformly.

# Concept
This pattern can show part-whole hierarchy among objects.

# Real-life example
We can think of any organization that has many departments, and in turn each department has many employees to serve. Please note that actually all are employees of the organization. Grouping s of employees create a department, and those departments ultimately can be grouped together to build the whole organization.

# Note
1. This pattern is ideal to represent the part-whole hierarchy among objects
2. Here the client can treat composition of objects like a single object
3. Clients can add new types of component easily
4. If we are forced to maintain child ordering(e.g., parse trees as components), we need to take special care to maintain that order.
