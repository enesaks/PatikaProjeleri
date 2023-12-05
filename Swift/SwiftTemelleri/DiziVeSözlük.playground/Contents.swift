var array = ["muz","elma","çilek"]

var array2 = [Int]()
var array3: Array<Float> = []

array2.append(3)

print(array2)

array3.append(1.0)
print(array3)

array2.removeAll()
print(array2)

array3.remove(at: 0)
print(array3)

array2.append(1)
array2.append(2)
array2.append(3)

print(array2)

array2.removeLast()
array2.removeFirst()
var array2LastItem = array2.popLast()

print(array2)


var dict = ["ali" : 18, "mustafa" : 19, "enes" : 21]

var dict2  = [String : Float]()

var dict3 : Dictionary<String, Double>

dict2["pi"] = 3.14

//dict2.removeValue(forKey: "pi")
//dict2["pi"] = nil // nil  = null demek
//dict2.removeAll()


print(dict2.count)
