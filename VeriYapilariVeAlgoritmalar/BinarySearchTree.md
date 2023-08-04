## 1.Soru
[7, 5, 1, 8, 3, 6, 0, 9, 4, 2] dizisinin Binary-Search-Tree aşamalarını yazınız.

Örnek: root x'dir. root'un sağından y bulunur. Solunda z bulunur vb.

### Çözüm
Binary Search oluştururken, küçük değerler sol alt ağaçta yer alırken büyük değerler sağ alt ağaçta yer alacak şekilde sıralarız.

1.Adım: 7 ana düğüm (root) olarak belirlenir.
         ```     7```


2.Adım     ```    7
                    \ 
                     5```

3. Adım   ```     7
                    \ 
                     5
                       \
                         1```


4. Adım  8 degeri root un sağına eklenir.```
                  7
                /   \ 
               8     5
                       \
                         1```
5. Adım  6 değeri 5'in sol altına eklenir.```
                  7
                /   \ 
               8     5
                   /   \
                 8       1```
6. Adım ```
                  7
                /   \ 
               8     5
             /     /   \
          9      1      6
           ```               
7. Adım ```

                  7
                /   \ 
               8     5
             /     /   \
          9      1      6
                /        \
               0          3
```
  
8. Adım 
                
                 7
               /   \ 
              5     8
             / \     \
            1   6     9
           /     \      
          0       3     
                 /       
                2         
