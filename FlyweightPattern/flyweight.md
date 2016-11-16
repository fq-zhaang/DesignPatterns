# Definition
Use sharing to support large numbers of fine-gained objects efficiently.

# Concept
A flyweight is an object through which we try to minimize memory usage by sharing data as much as possible. Two common terms are used - intrinsic state and extrinsic state. The first category can be stored in the flyweight and is shareable. The other one depends on the flyweight's context and is non-shareable. Client objects need to pass the extrinsic state to the flyweight.
