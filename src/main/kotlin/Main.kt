fun main(args: Array<String>) {
}


open class Point(var x1: Int, var y1: Int){
    fun getPointCoordinates(): Array<Int>{
        val coordinatesList: Array<Int> = arrayOf(x1, y1)
        return coordinatesList
    }

    fun setPointCoordinates(_x1: Int, _y1: Int){
        x1 = _x1
        y1 = _y1
    }
}

class ColoredPoint(_x1: Int, _y1: Int, var color: String): Point(_x1, _y1){
    fun setPointColor(_color: String) {color = _color}
    fun getPointColor(): String {return color}
}


open class Line(_x1: Int, _y1: Int, var x2: Int, var y2: Int): Point(_x1, _y1){
    fun getLineCoordinates(): Array<Int>{
        val coordinatesList: Array<Int> = arrayOf(x1, y1, x2, y2)
        return coordinatesList
    }

    fun setLineCoordinates(_x1: Int, _y1: Int, _x2: Int, _y2: Int){
        x1 = _x1
        y1 = _y1
        x2 = _x2
        y2 = _y2
    }
}

class ColoredLine(_x1: Int, _y1: Int, _x2: Int, _y2: Int, var color: String): Line(_x1, _y1, _x2, _y2){
    fun setLineColor(_color: String) {color = _color}
    fun getLineColor(): String {return color}
}

class Polygone(_x1: Int, _y1: Int, _x2: Int, _y2: Int, var listOfPoints: Array<Int>): Line(_x1, _y1, _x2, _y2){

}