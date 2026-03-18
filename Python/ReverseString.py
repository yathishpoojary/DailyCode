def reverse_string(s):
    # return s[::-1]

    # reverseString =""
    # for char in s:
    #     reverseString = char+reverseString
    # return reverseString;

    # return "".join(reversed(s))

    if len(s) ==0:
        return s
    return reverse_string(s[1:])+s[0]



print(reverse_string("Hello0"))

print("\n loop Approach")

# for()