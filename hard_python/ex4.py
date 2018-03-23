# better if it were number_of_cars.
cars = 100
# does not include the driver, this is passenger capacity.
space_in_a_car = 4
# number_of_drivers would be preferable.
drivers = 30
# number_of_passengers would be preferable.
passengers = 90
# number of cars_not_driven, also. Yes, everything should be prefaced.
# one should not have to extrapolate the variable meaning from its value.
# This is the number of cars minus the number of drivers, which gives us
# the number of cars that cannot be driven, because one driver per car.
cars_not_driven = cars - drivers
# number_. again. This is the number of cars driven, because one driver per car.
# So it would match. Why do we need another variable name? Because when we use
# it later, it is much clearer what we mean. That is the only reason to make
# another variable.
cars_driven = drivers
# this is fine for a variable name. Total pax capacity is number of cars times
# pax capacity of each car.
carpool_capacity = cars * space_in_a_car
# meaning that if the average were below 4, we could put a different
# number of pax in each car as long as the average was the same.
# number of pax divided by number of cars driven equals capacity.
average_passengers_per_car = passengers / cars_driven

# print all this info out.
print "There are", cars, "cars available."
print "There are only", drivers, "drivers available."
print "There will be", cars_not_driven, "empty cars today."
print "We can transport", carpool_capacity, "people today."
print "We have", passengers, "to carpool today."
print "we need to put about", average_passengers_per_car, "in each car."
