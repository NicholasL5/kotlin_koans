fun containsEven(collection: Collection<Int>): Boolean =
        collection.any { x:Int -> x%2 == 0 }

/**
 * cara buat lamda:
 * (tipedata, tipedata) -> return type = {namavar:tipedata, namavar:tipedata -> algoritma}
 */