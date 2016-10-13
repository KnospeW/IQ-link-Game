In addition to the features that are auto-graded, the graphical user interface
of our project implements the following features:

*(Remove those that are unimplemented)*

 - A simple placement viewer (Task 5)
 - A basic playable link game that snaps pieces to pegs and checks for validity (Task 8)
 - A basic implementation  of starting piece placements (Task 9)
 - Solution hints
 - Dynamic hints in partially-complete games
 - Viewable instruction card
 - Music
 - Beautiful welcome page with four buttons that can choose difficulty. For easy/hard/expert, we provide 4 initial placements which they have
   exactly one solution (Task12). Every time enter a new game, we will randomly choose an initial placements according to difficulty.
   For most challenging mode, we make it to be empty that ensure user's multiple choices. If the placement they set
   does have a solution when it contains 8 pieces or more. Our hints suit their own placements.(Dynamic hints in partially-complete game)
 - Invalid placement detection. If it is caused by dragging, snap home. Otherwise a warning will appear in the top right corner.
 - Victory scene, complete the game successfully, the game scene will become semi-transparent, and the screen will show "you win". there will be a button
   "return home" that directs the user to the welcome scene.
 - In the game scene, we provide two buttons for the user. 'New game' directs the user to the welcome page and starts a completely new game.
   'Restart' will start with the same initial placement.
 