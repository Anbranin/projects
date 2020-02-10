class List
  attr_accessor :items

  FOOD_TAX = 0.06

  def initialize(items = {})
    unless items.is_a? Hash
      return 'items must be a hash with item keys and amount values'
    end
    @items = items
  end

  def add(item, amount = 1)
    item = item.to_sym
    @items[item] = @items[item].to_i
    @items[item] += amount
    if List.prices[item].nil?
      puts "We don't have that in our price list."
      if similar_item(item)
        puts "Perhaps you meant #{similar_item(item)}?"
      end
    end
    "New item total: #{item}, #{@items[item]}"
  end

  def remove(item)
    item = item.to_sym
    self.items.delete(item)
  end

  def list
    self.items.keys.join(', ')
  end

  def total
    prices = []
    self.items.each do |item, amount|
      if List.prices[item].respond_to? :+
        prices << (List.prices[item] * amount)
      else
        puts "#{item} not found in price list"
        if similar_item(item)
          puts "Perhaps you meant #{similar_item}?"
        end
      end
    end
    (prices.sum + prices.sum * FOOD_TAX).ceil
  end

  def empty
    @items = {}
  end

  def self.prices
    {
      lemon: 0.75,
      snacks: 10,
      eggs: 6.59,
      granola: 7.00,
      seltzer: 5.00,
      blueberries: 8, # per 16 oz (large amount)
      kale: 2, # per bunch
      frozen_vegetables: 3, # per bag
      avocado: 2.49, # per avocado
      meat: 17, # for between 1-2 pounds quality meat
      mushrooms: 5.49, # per pound
      scallions: 1.29,
      potatoes: 3.99, # unit: bag
      feta: 7.99, # organic valley, the expensive stuff.
      dill: 1.99,
      carrots: 1.99, # 32 oz, big bag
      shallots: 3.99, # per lb
      cannellini_beans: 3.59, # 29 oz can, Eden foods
      bell_pepper: 2.99, # per pound
      salad_greens: 4.99, # 16 oz spring mix
      yellow_onion: 0.89 # per pound
    }
  end

  def similar_item(item)
    List.prices.each do |grocery_item, _price|
      existing = grocery_item.to_s
      addition = item.to_s
      if (existing.match? addition) || (addition.match? existing)
        return grocery_item
      end
    end
    nil
  end
end
