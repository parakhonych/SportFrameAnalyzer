# SportFrameAnalyzer

a Java demo program that analyzes image frames to determine whether they are likely from a sports event, using the
dominant color as a heuristic. Designed for educational and demonstration purposes.

## Image Sources

The images used for this project are for **educational/demo purposes only**.

image001 - Photo
by <a href="https://unsplash.com/@imchenyf?utm_content=creditCopyText&utm_medium=referral&utm_source=unsplash">
YIFEI CHEN</a>
on <a href="https://unsplash.com/photos/person-playing-hockey-QWsdUMj8amc?utm_content=creditCopyText&utm_medium=referral&utm_source=unsplash">
Unsplash</a>

image002 - Photo
by <a href="https://unsplash.com/@aprilwalker?utm_content=creditCopyText&utm_medium=referral&utm_source=unsplash">April
Walker</a>
on <a href="https://unsplash.com/photos/men-playing-ice-hockey-on-ice-stadium-sqMPA86yVws?utm_content=creditCopyText&utm_medium=referral&utm_source=unsplash">
Unsplash</a>

image003 - Photo
by <a href="https://unsplash.com/@jesswilsonww24?utm_content=creditCopyText&utm_medium=referral&utm_source=unsplash">
Jessica Vink</a>
on <a href="https://unsplash.com/photos/people-playing-ice-hockey-at-the-arena-SOv0qA0waR4?utm_content=creditCopyText&utm_medium=referral&utm_source=unsplash">
Unsplash</a>

image004 - Photo
by <a href="https://unsplash.com/@klim11?utm_content=creditCopyText&utm_medium=referral&utm_source=unsplash">Klim
Musalimov</a>
on <a href="https://unsplash.com/photos/ice-hockey-players-on-ice-hockey-field-tEk5CVDgGK4?utm_content=creditCopyText&utm_medium=referral&utm_source=unsplash">
Unsplash</a>

image005 - Photo
by <a href="https://unsplash.com/@arnok?utm_content=creditCopyText&utm_medium=referral&utm_source=unsplash">Moises
Alex</a>
on <a href="https://unsplash.com/photos/man-playing-tennis-WqI-PbYugn4?utm_content=creditCopyText&utm_medium=referral&utm_source=unsplash">
Unsplash</a>

image006 - Photo
by <a href="https://unsplash.com/@johnfo?utm_content=creditCopyText&utm_medium=referral&utm_source=unsplash">John
Fornander</a>
on <a href="https://unsplash.com/photos/person-wearing-pair-of-white-low-top-sneakers-while-holding-wilson-tennis-racket-4R9CcBdQTEg?utm_content=creditCopyText&utm_medium=referral&utm_source=unsplash">
Unsplash</a>

image007 - Photo
by <a href="https://unsplash.com/@axga?utm_content=creditCopyText&utm_medium=referral&utm_source=unsplash">
Aleksandr Galichkin</a>
on <a href="https://unsplash.com/photos/a-clay-tennis-court-with-its-net-J5D8cdRWwEk?utm_content=creditCopyText&utm_medium=referral&utm_source=unsplash">
Unsplash</a>

image008 - Photo
by <a href="https://unsplash.com/@ryanjs08?utm_content=creditCopyText&utm_medium=referral&utm_source=unsplash">Ryan
Sepulveda</a>
on <a href="https://unsplash.com/photos/people-watching-basketball-game-on-stadium-o44Kz5UI2N8?utm_content=creditCopyText&utm_medium=referral&utm_source=unsplash">
Unsplash</a>

image009 - Photo
by <a href="https://unsplash.com/@gezerbatu?utm_content=creditCopyText&utm_medium=referral&utm_source=unsplash">Batu
Gezer</a>
on <a href="https://unsplash.com/photos/people-playing-basketball-on-court-Ub7upMdfM0g?utm_content=creditCopyText&utm_medium=referral&utm_source=unsplash">
Unsplash</a>

image010 - Photo
by <a href="https://unsplash.com/@zab24?utm_content=creditCopyText&utm_medium=referral&utm_source=unsplash">Zabdiel
Gonzalez</a>
on <a href="https://unsplash.com/photos/people-watching-soccer-game-during-daytime-6XU8Xbrt95M?utm_content=creditCopyText&utm_medium=referral&utm_source=unsplash">
Unsplash</a>

image011 - Photo
by <a href="https://unsplash.com/@mkaine17?utm_content=creditCopyText&utm_medium=referral&utm_source=unsplash">Fredrick
Lee</a>
on <a href="https://unsplash.com/photos/a-football-game-is-being-played-in-a-stadium-jaRCC8DBS4k?utm_content=creditCopyText&utm_medium=referral&utm_source=unsplash">
Unsplash</a>

image012 - Photo
by <a href="https://unsplash.com/@anders_kj1?utm_content=creditCopyText&utm_medium=referral&utm_source=unsplash">
Anders Krøgh Jørgensen</a>
on <a href="https://unsplash.com/photos/los-angeles-chargers-waving-flags-LwX1bBi0dwY?utm_content=creditCopyText&utm_medium=referral&utm_source=unsplash">
Unsplash</a>

image013 - Photo
by <a href="https://unsplash.com/@acrehuet98?utm_content=creditCopyText&utm_medium=referral&utm_source=unsplash">Adrià
Crehuet Cano</a>
on <a href="https://unsplash.com/photos/children-playing-soccer-LIhB1_mAGhY?utm_content=creditCopyText&utm_medium=referral&utm_source=unsplash">
Unsplash</a>

image014 - Photo
by <a href="https://unsplash.com/@alexazabache?utm_content=creditCopyText&utm_medium=referral&utm_source=unsplash">Alex
Azabache</a>
on <a href="https://unsplash.com/photos/green-soccer-field-inside-stadium-1cPWeb3Ud30?utm_content=creditCopyText&utm_medium=referral&utm_source=unsplash">
Unsplash</a>

image015 - Photo
by <a href="https://unsplash.com/@focusmitch?utm_content=creditCopyText&utm_medium=referral&utm_source=unsplash">
Mitch Rosen</a>
on <a href="https://unsplash.com/photos/crowd-watching-football-game-inside-stadium-g9SNY0aLMF0?utm_content=creditCopyText&utm_medium=referral&utm_source=unsplash">
Unsplash</a>

image016 -Photo
by <a href="https://unsplash.com/@kris1902?utm_content=creditCopyText&utm_medium=referral&utm_source=unsplash">Krzysztof
Dubiel</a>
on <a href="https://unsplash.com/photos/people-watching-soccer-game-in-stadium-hQBIJsBtyBw?utm_content=creditCopyText&utm_medium=referral&utm_source=unsplash">
Unsplash</a>

image017 - Photo
by <a href="https://unsplash.com/@stemlist?utm_content=creditCopyText&utm_medium=referral&utm_source=unsplash">Stem
List</a>
on <a href="https://unsplash.com/photos/man-and-woman-sitting-on-chair-in-front-of-monitor-E01xSjvm4eQ?utm_content=creditCopyText&utm_medium=referral&utm_source=unsplash">
Unsplash</a>

image018 - Photo
by <a href="https://unsplash.com/@deonfosu?utm_content=creditCopyText&utm_medium=referral&utm_source=unsplash">Deon
Fosu</a>
on <a href="https://unsplash.com/photos/a-bunch-of-billboards-that-are-on-the-side-of-a-building-ZQZrvL7DwiI?utm_content=creditCopyText&utm_medium=referral&utm_source=unsplash">
Unsplash</a>

image019 - Photo
by <a href="https://unsplash.com/@jpvalery?utm_content=creditCopyText&utm_medium=referral&utm_source=unsplash">Jp
Valery</a>
on <a href="https://unsplash.com/photos/mcdonalds-signage-JZX_jf9Tkco?utm_content=creditCopyText&utm_medium=referral&utm_source=unsplash">
Unsplash</a>

image020 - Photo
by <a href="https://unsplash.com/@jannerboy62?utm_content=creditCopyText&utm_medium=referral&utm_source=unsplash">Nick
Fewings</a>
on <a href="https://unsplash.com/photos/red-ferrari-car-rHlvWD8Mv_s?utm_content=creditCopyText&utm_medium=referral&utm_source=unsplash">
Unsplash</a>

image021 - Photo
by <a href="https://unsplash.com/@flovayn?utm_content=creditCopyText&utm_medium=referral&utm_source=unsplash">Florian
van Duyn</a>
on <a href="https://unsplash.com/photos/two-cans-of-energy-drink-sitting-in-the-snow-uCrLAxSS5wI?utm_content=creditCopyText&utm_medium=referral&utm_source=unsplash">
Unsplash</a>

image022 - Photo
by <a href="https://unsplash.com/@campful?utm_content=creditCopyText&utm_medium=referral&utm_source=unsplash">
Campbell</a>
on <a href="https://unsplash.com/photos/running-black-porsche-sedan-3ZUsNJhi_Ik?utm_content=creditCopyText&utm_medium=referral&utm_source=unsplash">
Unsplash</a>

image023 - Photo
by <a href="https://unsplash.com/@bangyuwang?utm_content=creditCopyText&utm_medium=referral&utm_source=unsplash">
Bangyu Wang</a>
on <a href="https://unsplash.com/photos/people-walking-on-street-during-daytime-OD7Z09OVM80?utm_content=creditCopyText&utm_medium=referral&utm_source=unsplash">
Unsplash</a>
      
      
      
      
      
      