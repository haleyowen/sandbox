#!/usr/bin/env ruby

class MegaGreeter
      attr_accessor :names
      
      #Create the object
      def initialize(names = "World")
            @names = names
      end

      #say hi to everyone
      def say_hi
      	if @names.nil?
	           puts "..."
	      elsif @names.respond_to?("each")
      	     #names is a list, so iterate through it
                  @names.each do |name|
                        puts "Hello, #{name}!"
                  end 
            else
                  puts "Hello, #{@names}!"
            end
      end

      #say bye to everyone
      def say_bye
            if @names.nil?
                  puts "..."
            elsif @names.respond_to?("join")
                  #join list with commas
                  puts "Goodbye #{@names.join(", ")}. Come back soon!"
            else
                  puts "Goddbye #{@names}. Come back soon!"
            end
      end
end

if __FILE__ == $0
      mg = MegaGreeter.new
      mg.say_hi
      mg.say_bye


      #Change names to Robin
      mg.names = "Robin"
      mg.say_hi
      mg.say_bye

      #Change names to array of names
      mg.names = ["Barney", "Ted", "Marshall", "Lilly", "Robin"]
      mg.say_hi
      mg.say_bye

      #Change names to nil
      mg.names = nil
      mg.say_hi
      mg.say_bye
end

	     