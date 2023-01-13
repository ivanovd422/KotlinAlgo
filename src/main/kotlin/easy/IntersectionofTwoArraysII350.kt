package easy


fun main() {
    val result = intersect(intArrayOf(4,9,5), intArrayOf(9,4,9,8,4))

    result.forEach {
        println(it)
    }
}


fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
    val hashMap1 = hashMapOf<Int, Int>()
    val hashMap2 = hashMapOf<Int, Int>()
    val arrayList = arrayListOf<Int>()

    nums1.forEach {
        if (hashMap1.containsKey(it)) {
            hashMap1[it] = hashMap1[it]!! + 1
        } else {
            hashMap1[it] = 1
        }
    }

    nums2.forEach {
        if (hashMap2.containsKey(it)) {
            hashMap2[it] = hashMap2[it]!! + 1
        } else {
            hashMap2[it] = 1
        }
    }

    hashMap1.forEach { (key, value) ->
        if (hashMap2.containsKey(key)) {
            val count = Math.min(hashMap1[key]!!, hashMap2[key]!!)
            repeat(count) {
                arrayList.add(key)
            }
        }
    }

    return arrayList.toIntArray()
}