a = ["1", ["2", "3"], ["4", "5", ["6", "7"]]]

def flatten(arr):
    res = []
    for x in range(len(arr)):
        if type(arr[x]) is not list:
            res.append(arr[x])
        else:
            for i in flatten(arr[x]):
                res.append(i)
    return res

flattened = flatten(a)
print(flattened)

