def prefixCompression(a,b):
    p = ""
    a1 = ""
    b1 = ""

    if len(a) > len(b):
        n = len(a)
        min = len(b)
    else:
        n = len(b)
        min = len(a)

    for i in range(n):
        if i >= min:
            if min == len(b):
                a1 += a[i]
            else:
                b1 += b[i]

        elif i <= len(b):
            if a[i] == b[i]:
                p += a[i]
            else:
                a1 += a[i]
                b1 += b[i]
            
    print(len(p),p)
    print(len(a1),a1)
    print(len(b1),b1)  

a = "kitkat"
b = "kit"
resultado = prefixCompression(a,b)