# read from file

def extraction(file)
  # Make whodunnit Glenn
  @stops = []
  @pax_count = []
  @result = IO.readlines(file)
  @result.each do |line|
    start_time = line[/"start_time"=>"[^"]+/]
    bus_route_id = line[/"bus_route_id"=>"[^"]+/]
    stops = line[/"stops"=>"[^"]+/]
    pax_count = line[/"pax_count"=>"[^"]+/]
    daily_assignment_id = line[/"daily_assignment_id"=>"[^"]+/]
    employee_assignment_id = line[/"employee_assignment_id"=>"[^"]+/]
=begin
    log = DailyLogItem.create(
      item_type_id: 1,
      employee_assignment_id: employee_assignment_id,
      reporting_user_id: glenn_id,
      daily_assignment_id: daily_assignment_id,
      start_time: start_time,
      bus_route_id: bus_route_id
    )
=end
    @stops << stops
    @pax_count << pax_count
    return
  end
end

# need:
# start_time, bus_route_id, stops, pax_count, daily_assignment_id

# Entire dataset:
    # ["start_time",
    # "bus_route_id",
    # "stops", - array
    # "pax_count", - array, count at leach location
    # "employee_assignment_id",
    # "item_type_id",
    # "daily_assignment_id"]

# result class: OverloadLocations
# attributes: daily_log_item_id
# location_id
