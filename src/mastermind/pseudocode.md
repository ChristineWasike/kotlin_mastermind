# MASTERMIND PSEUDOCODE
## Step One
   Ensure that the input is a string and converted to uppercase

## Step Two
   Initialise the rightPosition and wrongPosition integer variables with an initial value of 0.

## Step Three
   Initialise a dictionary. Loop through the secret code and store in a dictionary, the indices and the values in the
    secret key string.

## Step Four
   Check through the guess string. Check to see a letter in the guess string is in the secret      code(regardless of
    its position). If the letter is in the secret code, increase the value of wrongPosition by one. Do so for each
     correct letter. Within the check, not the index of the correct letter. If it matches the index of the letter in
      the secret code, decrease the wrongPosition by 1 and increse the rightPosition by 1. If the letter is not
       present in the secret code, do nothing.