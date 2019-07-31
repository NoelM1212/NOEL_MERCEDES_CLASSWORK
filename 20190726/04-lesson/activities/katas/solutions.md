## Kata Solutions

### Min Max Avg

> Note that the object heap address values (after the @) will be different for each person.

1. Line 15 Breakpoint:
    1. args = {String[0]@845} 
    1. scanner = {Scanner@846} java.util.Scanner[delimiters=\p{javaWhitespace}+][position=0][match valid=false][need input=false][source closed=false][skipped=false][group separator=\,][decimal separator=\.][positive prefix=][negative prefix=\Q-\E][positive suffix=][negative suffix=][NaN string=\QNaN\E][infinity string=\Q∞\E]
    1. numbers = {int[10]@847}
    1. numbers.length = 10
1. Line 47:
    1. args = {String[0]@845} 
    1. scanner = {Scanner@846} java.util.Scanner[delimiters=\p{javaWhitespace}+][position=21][match valid=true][need input=false][source closed=false][skipped=false][group separator=\,][decimal separator=\.][positive prefix=][negative prefix=\Q-\E][positive suffix=][negative suffix=][NaN string=\QNaN\E][infinity string=\Q∞\E]
    1. numbers = {int[10]@847}
    1. sum = 55
    1. min = 1
    1. max = 10
1. Line 52:
    1. args = {String[0]@845} 
    1. scanner = {Scanner@846} java.util.Scanner[delimiters=\p{javaWhitespace}+][position=21][match valid=true][need input=false][source closed=false][skipped=false][group separator=\,][decimal separator=\.][positive prefix=][negative prefix=\Q-\E][positive suffix=][negative suffix=][NaN string=\QNaN\E][infinity string=\Q∞\E]
    1. numbers = {int[10]@847}
    1. sum = 55
    1. min = 1
    1. max = 10
    1. avg = 5.5


### Rectangular Paving Company
Errors:
1. Line 23: Reset the value of ```cementCost``` instead of setting ```framingCost```
1. Line 26: The forumla for perimeter is wrong. It should be ```2*length + 2*width```
1. Line 32: The cost of framing/footers is calculated wrong. It should be ```perimieter*fraingCost```
