# definition
Ensure a class has only one instance, and provide a global point of access to it.

# Concept
A particular class should have only one instance. We will use only that instance whenever we are in need.

# Real-life example
Suppose you are a member of a cricket team. And in a tournament your team is going to play against another team. As per the rules of the game, the captain of each side must go for a toss to decide which side will bat(or bowl) first. So, if your team does not have a captain, you need to elect someone as a captain first. And at the same time, your team cannot have more than one captain.

# Computer world example
In a software system sometimes we may decide to use only one file system. Usually we may use it for the centralized management of resources. 

# Illustration
We have made the constructor private first, so that we cannot instantiate in normal fashion. When we attempt to create an instance, we checking whether we already have one available copy. If we do not, we'll create it, else we'll simply reuse the existing one.

# Assignment

# thread safety
* Case (I)

```
public static synchronized MakeACaptain getCaptain() {
	// our code
}

```

* Case (II) - eager initialization
```
 public class MakeACaptain {
	private static MakeACaptain _captain = new MakeACaptain();
	private MakeACaptain() {}
	public static MakeACaptain getCaptain(){
		return _captain;
	}
 }
```

