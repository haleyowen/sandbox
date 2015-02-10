import sys
from collections import Counter


def to_remove(arr):
    count = Counter()
    odds = []

    if arr == list(reversed(arr)):
        return -1

    for x in arr:
        count[x] += 1

    for x in count:
        if count[x] % 2 == 1:
            odds.append(x)

    for odd in odds:
        indices = [i for i, x in enumerate(arr) if x == odd]
        for i in indices:
            tmp = arr[:i] + arr[i+1:]
            print(tmp)
            if tmp == list(reversed(tmp)):
                return i
    return -1

if __name__ == "__main__":
    for i, line in enumerate(sys.stdin):
        if i > 0:
            str_arr = [char for char in line.strip("\n")]
            index = to_remove(str_arr)
            print(index)
