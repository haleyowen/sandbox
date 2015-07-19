# Seed add you the ability to populate your db.
# We provide you a basic shell for interaction with the end user.
# So try some code like below:
#
#   name = shell.ask("What's your name?")
#   shell.say name
#
email     = shell.ask "Which email do you want use for logging into admin?"
password  = shell.ask "Tell me the password to use:"

shell.say ""

account = Account.create(:email => email, :name => "Foo", :surname => "Bar", :password => password, :password_confirmation => password, :role => "admin")

if account.valid?
  shell.say "================================================================="
  shell.say "Account has been successfully created, now you can login with:"
  shell.say "================================================================="
  shell.say "   email: #{email}"
  shell.say "   password: #{password}"
  shell.say "================================================================="
else
  shell.say "Sorry but some thing went wrong!"
  shell.say ""
  account.errors.full_messages.each { |m| shell.say "   - #{m}" }
end

shell.say ""

Breed.all.destroy

BREED_NAMES = [
  'Abyssinian',
  'Akhal Teke',
  'Albanian',
  'Altai',
  'American Cream Draft',
  'American Creme and White',
  'American Curly',
  'American Gaited Mountain Horse',
  'American Gaited Pony',
  'American Saddlebred',
  'American Walking Pony',
  'American Warmblood',
  'Andalusian',
  'Andravida',
  'Anglo-Arab',
  'Anglo-Kabarda',
  'Appaloosa',
  'Appendix Quarter Horse',
  'Araapaloosa',
  'Arabian',
  'Arabian Sporthorse',
  'Ardennes',
  'Argentine Criollo',
  'Asturian',
  'Australian Brumby',
  'Australian Stock Horse',
  'Azteca',
  'Balearic',
  'Baluchi',
  'Ban-ei',
  'Banker',
  'Barb',
  'Bashkir',
  'Bashkir Curly',
  'Basotho Pony',
  'Belgian',
  'Belgian Warmblood',
  'Bhirum Pony',
  'Bhotia Pony',
  'Black Forest',
  'Boer',
  'Brandenburger',
  'Breton',
  'British Riding Pony',
  'Buckskin',
  'Budyonny',
  'Byelorussian Harness',
  'Camargue',
  'Campolina',
  'Canadian Horse',
  'Canadian Sport Horse',
  'Canadian Warmblood',
  'Carthusian',
  'Caspian',
  'Cayuse',
  'Cheju',
  'Chilean Corralero',
  'Chincoteague Pony',
  'Cleveland Bay',
  'Clydesdale',
  'Colorado Ranger Horse',
  'Connemara',
  'Cremello',
  'Crioulo',
  'Dales Pony',
  'Danish Warmblood',
  'Danube',
  'Dartmoor Pony',
  'Deliboz',
  'Djerma',
  'Døle',
  'Dongola',
  'Donkey',
  'Draft',
  'Draft Cross',
  'Drum Horse',
  'Dutch Draft',
  'Dutch Harness',
  'Dutch Warmblood',
  'East Bulgarian',
  'Egyptian',
  'Eriskay Pony',
  'Estonian Native',
  'Exmoor Pony',
  'Faeroes Pony',
  'Falabella',
  'Fell Pony',
  'Finnhorse',
  'Fjord',
  'Fleuve',
  'Florida Cracker',
  'Foundation Quarter Horse',
  'Fouta',
  'Frederiksborg',
  'French Saddlebred',
  'French Trotter',
  'Friesian',
  'Friesian Cross',
  'Galiceño',
  'Galician Pony',
  'Gelderlander',
  'Georgian Grande',
  'German Bred',
  'German Riding Pony',
  'Gidran',
  'Goldern American Saddlebred',
  'Gotland',
  'Groningen',
  'Guangxi',
  'Gypsy Cob',
  'Gypsy Vanner',
  'Hackney',
  'Haflinger',
  'Half-Arabian',
  'Hanovarian',
  'Hequ',
  'Highland Pony',
  'Hokkaido',
  'Holsteiner',
  'Hucul',
  'Hungarian Warmblood',
  'Icelandic',
  'Iomud',
  'Irish Cob',
  'Irish Draught',
  'Irish Sport Horse',
  'Jinzhou',
  'Jutland',
  'Kabarda',
  'Karabair',
  'Karabakh',
  'Kazakh',
  'Kentucky Mountain Saddle Horse',
  'Kerry Bog Pony',
  'Kiger Mustang',
  'Kirdi Pony',
  'Kisber Felver',
  'Kiso',
  'Kladruby',
  'Knabstrup',
  'Kushum',
  'Kustanai',
  'Latvian',
  'Lipizzan',
  'Lithuanian Heavy Draft',
  'Lokai',
  'Losino',
  'Lusitano',
  'Malopolski',
  'Mangalarga',
  'Marsh Tacky',
  'Marwari',
  'M Bayar',
  'Mérens Pony',
  'Messara',
  'Miniature',
  'Misaki',
  'Missouri Fox Trotting Horse',
  'Miyako',
  'Mongolian',
  'Morab',
  'Morgan',
  'Mountain Pleasure Horse',
  'Moyle',
  'Mule',
  'Murgese',
  'Mustang',
  'National Show Horse',
  'New Forest Pony',
  'New Kirgiz',
  'Newfoundland Pony',
  'Nokota',
  'Noma',
  'Nooitgedacht Pony',
  'Nordland',
  'Noric',
  'North Swedish Horse',
  'Northeastern',
  'Ob',
  'Oldenburg',
  'Orlov Trotter',
  'Paint (Overo)',
  'Paint (Solid)',
  'Paint (Tobiano)',
  'Paint (Tovero)',
  'Palomino',
  'Pantaneiro',
  'Paso Fino',
  'Percheron',
  'Peruvian Paso',
  'Pindos Pony',
  'Pinia',
  'Pintabian',
  'Pinto',
  'POA',
  'Ponies',
  'Pottok',
  'Przewalski',
  'Pura Raza Espanola (PRE)',
  'Pyrenean Tarpan',
  'Qatgani',
  'Quarab',
  'Quarter Horse',
  'Quarter Horse Cross',
  'Quarter Pony',
  'Racking Horse',
  'Rheinland Pfalz Saar',
  'Rocky Mountain',
  'Russain Don',
  'Russain Heavy Draft',
  'Russian Trakhener',
  'Russian Trotter',
  'Sanhe',
  'Schleswiger Heavy Draft',
  'Schwarzwälder Fuchs',
  'Selle Francais',
  'Shagya',
  'Shetland Pony',
  'Shire',
  'Single-Footing Horse',
  'Skyros Pony',
  'Somali Pony',
  'Sorraia',
  'Soviet Heavy Draft',
  'Spanish Mustang',
  'Spanish-Barb',
  'Spanish-Norman',
  'Sport Horse Of Color',
  'Spotted Draft',
  'Spotted Mountain Horse',
  'Spotted Saddle',
  'Standardbred',
  'Sudan Country-Bred',
  'Suffolk',
  'Swedish Warmblood',
  'Taishuh',
  'Tarpan',
  'Tawleed',
  'Tennessee Walker',
  'Tersk',
  'Thessalian',
  'Thoroughbred',
  'Thoroughbred Cross',
  'Tiger Horse',
  'Tokara',
  'Tori',
  'Trakehner',
  'Ukrainian Saddle',
  'Virginia Highlander',
  'Vlaamperd',
  'Vladimir Heavy Draft',
  'Vyatka',
  'Walkaloosa',
  'Warmblood',
  'Warmblood Cross',
  'Warmbloods of Color',
  'Welara Pony',
  'Welsh Cob',
  'Welsh Pony',
  'West African Barb',
  'Western Sudan Pony',
  'Westphalian',
  'Wielkopolski',
  'Xilingol',
  'Yakut',
  'Yanqi',
  'Yili',
  'Yonaguni',
  'Zangersheide',
  'Zaniskari Pony',
  'Zhemaichu',
  'Zorse']

  BREED_NAMES.each { |breed| Breed.create(name: breed) }  

  Attribute.all.destroy

  ATTRIBUTE_NAMES = [
    'All-Around Champion',
    'All-Around Reserve Champion',
    'APHA Breeders Trust',
    'Breed Assn Futurity Winner',
    'Breed Assn National Champion',
    'Breed Assn Point Earner',
    'Breed Assn Reserve National Champion',
    'Breed Assn Reserve Show Champion',
    'Breed Assn Reserve World Champion',
    'Breed Assn Show Champion',
    'Breed Assn Top 10 National',
    'Breed Assn Top 10 World',
    'Breed Assn World Champion',
    'Breeders Sweepstakes Enrolled Sire',
    'Breeders Sweepstakes Nominated',
    'Breeders Sweepstakes Nominated Sire',
    'Foundation Eligible',
    'Foundation Registered',
    'Futurity Eligible',
    'Futurity Money Earner',
    'Homozygous',
    'HYPP H/H',
    'HYPP N/H',
    'HYPP N/N',
    'Incentive Fund Eligible',
    'Incentive Fund Enrolled',
    'Jackpot Money Earner',
    'KY Incentive Fund',
    'Mare in Foal',
    'Money Earner',
    'NCHA Money Earner',
    'NCHR Breeders Classic',
    'NCHR Stallion Stakes',
    'NCHR Super Stakes',
    'NRHA Derby Champion',
    'NRHA Futurity Champion',
    'NRHA Money Earner',
    'NRHA Nomination Program',
    'NRHA Open Champion',
    'NRHA Sire & Dam Offspring',
    'NRHA Sire & Dam Sire',
    'NRHA World Champion',
    'Open Show Winner',
    'Performance Winner',
    'Race Money Earner',
    'Register of Merit',
    'Rodeo Winner',
    'SHN Payback Enrolled',
    'Sire & Dam Program',
    'Sire/Dam of Breed Assn Futurity Winner',
    'Sire/Dam of Breed Assn National Champion',
    'Sire/Dam of Breed Assn Point Earner',
    'Sire/Dam of Breed Assn Reserve National Champion',
    'Sire/Dam of Breed Assn Reserve Show Champion',
    'Sire/Dam of Breed Assn Reserve World Champion',
    'Sire/Dam of Breed Assn Show Champion',
    'Sire/Dam of Breed Assn Top 10 National',
    'Sire/Dam of Breed Assn Top 10 World',
    'Sire/Dam of Breed Assn World Champion',
    'Sire/Dam of Register of Merit',
    'Supreme Champion',
    'Versatility Champion']

    ATTRIBUTE_NAMES.each { |attribute| Attribute.create(name: attribute) } 

    Discipline.all.destroy

    DISCIPLINE_NAMES = [
      'All Around',
      'Barrel Racing',
      'Beginner/Family',
      'Breeding',
      'Brood Mare',
      'Calf Roping',
      'Companion',
      'Competitive Trail Competitions',
      'Country Pleasure',
      'Cowboy Mounted Shooting',
      'Cutting',
      'Draft',
      'Dressage',
      'Drill Team',
      'Driving',
      'Endurance Riding',
      'English Pleasure',
      'Equitation',
      'Eventing',
      'Field Hunter',
      'Gaited',
      'Halter',
      'Harness',
      'Horsemanship',
      'Hunter',
      'Hunter Under Saddle',
      'Judged Pleasure Rides',
      'Jumper',
      'Lesson Horse',
      'Longe-Line',
      'Pleasure Driving',
      'Pole Bending',
      'Polo',
      'Racing',
      'Ranch Horse',
      'Reined Cow Horse',
      'Reining',
      'Showmanship',
      'Sidesaddle',
      'Steer Wrestling',
      'Team Penning',
      'Team Roping',
      'Team Sorting',
      'Trail Horse',
      'Vaulting',
      'Western Pleasure',
      'Western Pleasure (Show)',
      'Western Riding',
      'Working Cow Horse',
      'Youth/4-H Horse']

      DISCIPLINE_NAMES.each { |discipline| Discipline.create(name: discipline) } 

      Color.all.destroy

      COLOR_NAMES = [
        'Bay',
        'Black',
        'Brown',
        'Buckskin',
        'Champagne',
        'Chestnut',
        'Cremello',
        'Dun',
        'Grey',
        'Grulla',
        'Palomino',
        'Pearl',
        'Perlino',
        'Pinto',
        'Roan',
        'Silver Dapple',
        'Sorrel',
        'White']

      COLOR_NAMES.each { |color| Color.create(name: color) }