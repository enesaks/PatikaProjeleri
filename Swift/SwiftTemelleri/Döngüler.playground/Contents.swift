for i in 1..<100 {
print("number : \(i)")
}

var i = 0

while i <= 10 {
    print("number \(i)")
    i += 1
}

var sayilar = [1,3,5,5,7,7,24365,2,424,4,4]

for (index, sayi) in sayilar.enumerated(){
    print("\(index).index : \(sayi)")
}
