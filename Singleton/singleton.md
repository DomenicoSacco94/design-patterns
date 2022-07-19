SINGLETON DESIGN PATTERN

This design pattern is used when a single instance is required globally.
It can be implemented in a lazy or eager way. In the lazy version, the singleton instance is initialized only at the moment of the first call, in the eager mode the instance is initialized at the beginning of the application.
The eager mode might result in a waste of resources in case the singleton instance is never called in the application.

In case of a multithreaded application where the singleton instance is supposed to be shared across the threads, the singleton initialization should either belong to a static method or be wrapped using the "synchronized" keyword.

- Single instance required globally throughout the application
- Private constructor to prevent external tampering of the class
- Static getInstance() method to retrieve the initialized value
