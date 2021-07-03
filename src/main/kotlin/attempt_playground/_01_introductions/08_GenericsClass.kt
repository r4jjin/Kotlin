package attempt_playground._01_introductions

/*Defines a generic class MutableStack<E> where E is called the generic type parameter.
At use-site, it is assigned to a specific type such as Int by declaring a MutableStack<Int>*/
class MutableStack<E>(vararg items: E) {              // 1

    private val elements = items.toMutableList()

    fun push(element: E) = elements.add(element)        // 2

    fun peek(): E = elements.last()                     // 3

    fun pop(): E = elements.removeAt(elements.size - 1)

    fun isEmpty() = elements.isEmpty()

    fun size() = elements.size

    override fun toString() = "MutableStack(${elements.joinToString()})"
}

