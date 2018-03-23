# The order of operations is PEDMAS
# Parentheses Exponents Multiplication Division Addition Subtraction
# This line prints an explanation of what the calculations about
# hens and roosters are for
print "I will now count my chickens"

# this line calculates the number of hens. The order of operations prefers the
# / (division) first, so it's 30/6 (5) plus 25, which is 30.
print "Hens:", 25.0 + 30.0 / 6.0
# this line calculates to 97. How?
# Multiplication is first. 25 * 3 = 75
# Then comes modulo. Modulo gives the remainder of dividing the first number
# by the second, but if the second is larger than the first it just returns
# the first number. The remainder of dividing 75 by 4 is 3.
# 100 minus 3 is 97. So the expression with the order of operations laid bare is
# 100 - ((25 * 3) % 4)
print 'Roosters', 100.0 - 25.0 * 3.0 % 4.0

# This line explains what the following calculation is.
print 'Now I will count my eggs:'
# the calculation returns 7.
# 3 + 2 + 1 - 5 + ( 4 % 2 ) - ( 1 / 4 ) + 6
# 1 + 0 + .25 + 6 = 7
print 3.0 + 2.0 + 1.0 - 5.0 + 4.0 % 2.0 - 1.0 / 4.0 + 6.0

# this is a question that prints out
print 'is it true that 3.0 + 2.0 < 5.0 - 7?'
# this is its answer, but we cannot see why in the console
print 3.0 + 2.0 < 5.0 - 7.0

# until we print out the questions and answers
print 'what is 3.0 + 2.0?', 3.0 + 2.0
# asking what the result of each calculation is
print 'what is 5.0 - 7.0?', 5.0 - 7.0
# and saying to ourselves oh, that's why
print "Oh, that's why it's false."

# how about some more, just so we can get in some more operations
print "How about some more."

# is five greater than negative two?
print "is it greater?", 5.0 > -2.0
# is five greater than or equal to negative two?
print "is it greater or equal?", 5.0 >= -2.0
# is five less than or equal to negative two?
print "is it less or equal?", 5.0 <= -2.0
