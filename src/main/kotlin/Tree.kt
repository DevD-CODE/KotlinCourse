fun main() {
    val tree = Tree(82)
    for(i in 0 until 20) {
        tree.insert((Math.random() * 100).toInt())
    }

    tree.preOrder(tree)
    println()
    tree.inOrder(tree)
    println()
    tree.postOrder(tree)
    println()
}

class Tree(private val value : Int) {
    private var left : Tree? = null
    private var right : Tree? = null

    fun insert(value: Int) {
        if(value < this.value) {
            if(this.left == null) this.left = Tree(value)
            else this.left?.insert(value)
        } else if(value > this.value) {
            if(this.right == null) this.right = Tree(value)
            else this.right?.insert(value)
        }
    }

    fun preOrder(tree : Tree?) {
        if(tree != null) {
            print("${tree.value} ")
            this.preOrder(tree.left)
            this.preOrder(tree.right)
        }
    }

    fun inOrder(tree : Tree?) {
        if(tree != null) {
            this.inOrder(tree.left)
            print("${tree.value} ")
            this.inOrder(tree.right)
        }
    }

    fun postOrder(tree : Tree?) {
        if(tree != null) {
            this.postOrder(tree.left)
            this.postOrder(tree.right)
            print("${tree.value} ")
        }
    }
}