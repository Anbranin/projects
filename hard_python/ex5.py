name = 'Karin M. Eichelman'
age = 32 # soon, now, or past
height = 5.6 * 12 # that gives the number of inches
weight = 150 # lbs. I think, anyway.
eyes = 'Brown' # like poo
teeth = 'White' # ish. More beige because I like coffee.
hair = 'Brown' # matches my eyes. Brown looks good on me.
kilogram_weight = weight * .453592
centemeter_height = height * 2.54

print "Let's talk about %s." % name
print "She's %d inches tall." % height
print "She's %d pounds heavy." % weight
print "Actually that's not too heavy."
print "She's got %s eyes and %s hair." % (eyes, hair)
print "Her teeth are usually %s depending on the coffee." % teeth
print "If I add %d, %d, and %d I get %d" % (
    age, height, weight, age + height + weight)
print "Her weight in kilograms: %d" % kilogram_weight
print "Her height in centemeters: %d" % centemeter_height
