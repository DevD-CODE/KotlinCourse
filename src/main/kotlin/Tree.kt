fun main() {
    val tree = Tree(22)
    tree.insert(4)
    tree.insert(2)
    tree.insert(6)
    tree.insert(10)
    tree.insert(8)
    tree.insert(14)
    tree.insert(16)
    tree.insert(18)
    tree.insert(20)

    tree.inOrder(tree)
    println()
    tree.preOrder(tree)
    println()
    tree.postOrder(tree)
}

class Tree(private val value : Int) {
    private var left : Tree? = null
    private var right : Tree? = null

    fun insert(value : Int) {
        if(value < this.value) {
            if(this.left == null) this.left = Tree(value)
            else this.left!!.insert(value)
        } else if(value > this.value) {
            if(this.right == null) this.right = Tree(value)
            else this.right!!.insert(value)
        }
    }

    fun inOrder(tree : Tree?) {
        if(tree!= null) {
            this.inOrder(tree.left)
            print("${tree.value} ")
            this.inOrder(tree.right)
        }
    }

    fun preOrder(tree : Tree?) {
        if(tree!= null) {
            print("${tree.value} ")
            this.preOrder(tree.left)
            this.preOrder(tree.right)
        }
    }

    fun postOrder(tree : Tree?) {
        if(tree!= null) {
            this.postOrder(tree.left)
            this.postOrder(tree.right)
            print("${tree.value} ")
        }
    }
}