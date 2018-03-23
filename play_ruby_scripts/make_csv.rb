CSV.open('play_data.csv', 'wb') do |csv|
  csv << ['NAME', 'COLOR']
  csv << ['karin', 'black']
  csv << ['jon', 'green']
end
