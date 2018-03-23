while line = ARGF.gets
  if line.match(/(Parameters:).*(daily_log_item).*(stops).*(pax_count).*(commit).*/)

    extraction = line[/"start.+?(?=})/]

    # write the result to a file. the a+ argument creates a read/write file
    # and adds onto existing data upon open
    File.open('data.txt', 'a') do |file|
      file.puts extraction
    end 
    # block closes automatically

  end
end
