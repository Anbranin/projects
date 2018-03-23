require 'csv'

@ids = []
CSV.foreach('ra_roster.csv', headers:true) do |row|
  @ids << row['Student ID']
end

CSV.foreach('pm_roster.csv', headers:true) do |row|
  @ids << row['ID']
end

@ids.compact!
@id_strings = @ids.join("','").prepend("'").insert(-1, "'")


File.open('spires.txt', 'a') do |file|
  file.puts @id_strings
end
