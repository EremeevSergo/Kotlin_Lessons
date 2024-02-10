class Animal (name: String): Movable{
    var x: Int = 0
    var y: Int = 0
    override fun moveLeft(step: Int) {
        x += step
        println("Я передвинулся влево на $step")
    }

    override fun moveRight(step: Int) {
        x -= step
        println("Я передвинулся вправо на $step")
    }

    override fun moveDown(step: Int) {
        y += step
        println("Я передвинулся вниз на $step")
    }

    override fun moveUp(step: Int) {
        y -= step
        println("Я передвинулся вверх на $step")
    }
}