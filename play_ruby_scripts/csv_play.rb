require 'CSV'

@rows = []
def parse_employee_data(csv)
  CSV.foreach(
    csv,
    headers: true,
    header_converters: ->(h) { h.strip },
    converters: -> (r) { r.strip }
  ).with_index 1 do |row, index|
    @rows << row
    puts row.fetch('Last Name')
  end
end
