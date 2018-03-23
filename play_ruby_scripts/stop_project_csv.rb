# To get all transit stops:
# transit_routes = Route.where(number: [list of transit numbers])
# transit_stops = []
# transit_routes.each do |route|
# transit_stops << route.bus_stops
# end
# transit_stops = transit_stops.flatten
# transit_stops.uniq!
def parse_stops(stops)
  attributes = %w(
        id name updated_at completed? accessible bench curb_cut lighting mounting mounting_direction schedule_holder shelter sidewalk sign trash
        bolt_on_base bus_pull_out_exists? extend_pole? has_power? new_anchor? new_pole? solar_lighting? straighten_pole? system_map_exists?
        mounting_clearance_after mounting_clearance_before created_at updated_at completed? completed_at
  )
  headers = attributes.map(&:humanize)
  CSV.open('stop_data.csv', 'wb') do |csv|
    csv << headers
    stops.each do |stop|
      row = []
      attributes.each do |attribute|
        row << stop.send(attribute).to_s || "No Data Available"
      end
      csv << row
    end
  end
end
