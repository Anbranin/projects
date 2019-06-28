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

def add_swipe_ids(csv)
  CSV.foreach(csv, headers: true) do |row|
    last_name = row.fetch('USER_LASTNAME')
    first_name = row.fetch('USER_FIRSTNAME')
    spire = row.fetch('USER_SPIREID')
    user = User.find_by(last_name: last_name, first_name: first_name, spire_id: spire).present?
    if user.present?
      user.update_attributes swipe_id: row.fetch('USER_SWIPEID')
    else
      puts "User not found: #{last_name}, #{first_name}"
    end
  end
end
