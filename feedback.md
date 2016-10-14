# Assignment Two Feedback

## Group members: u5838800, u6127601

## Tutor Comment

Congratulations! Your assignment is of a very high quality and you should be very proud of what you have achieved. It was an absolute pleasure to mark. 

Unfortunately, you do not quite meet the requirements for Interesting starting placements. As a player, having just ~20 end points is not very interesting. Additionally, the task description makes it clear that this solution is not satisfactory.

## Mark

### Manual mark
| Task | Description | Mark |
|:-:|---|:-:|
|8|Basic game                       | 1/1 |
|9|Basic starting placements        | 1/1 |
|11|Hints                           | 1/1 |
|12|Interesting starting placements | 0/1 |

#### Manual mark 3/4


### Test results
| Task | Test | Result |
|:-:|---|:-:|
| |Compiled|1/1|
|3|PiecePlacementWellFormed|5/5|
|4|PlacementWellFormed|4/4|
|6|PegsForPiecePlacement|4/4|
|7|PlacementValid|5/5|
|10|Solutions|2/2|

#### Auto grade 7.0/7
### Deductions
| Description | Deduction |
|---|:-:|
|All files correct                | 0/-1 |
|Authorship clear for all classes | 0/-1 |
|Appropriate use of git           | 0/-1 |
|Classes compile correctly        | 0/-1 |
|Program runs from jar            | 0/-1 |
|Appropriate use of OO features   | 0/-.5 |
|Presentation pdf complete        | 0/-.5 |
|Program well designed            | 0/-.5 |
|Comments clear and sufficient    | 0/-.5 |
|Coding style good                | 0/-.5 |
|Appropriate use of JUnit tests   | 0/-.5 |
|Design and code of very high quality | 0/-.5 |
|Works well and easy to run | 0/-.5 |

#### Total deductions: 0

### Final mark 10/11
## Originality statement

This two weeks:
* The structure of getSolutions came from [Bob Carpenter](https://bob-carpenter.github.io/games/sudoku/java_sudoku.html).
* Music is sourced from [Bensound](http://www.bensound.com/) and is distributed under the [Creative Commons license](http://www.bensound.com/licensing).
* File reading code in Board is taken from [T.J. Crowder's answer](http://stackoverflow.com/a/7413900) to a question on StackExchange.
* All the fonts come from http://zhongwen.laoxiezi.com/
* Button made from https://dabuttonfactory.com/
* Ideas of having different scenes and the method to deal with changing scene http://blog.csdn.net/lykangjia/article/details/8772964
* Make controls and basic structure are inspired by ass1

Other weeks:
* The idea of having pieces snap to the board's grid was inspired by Steve Blackburn in the habitat assignment.
* Configuration of the PieceLocation class is attributed to Steve Blackburn.
* The idea of distinguish different pieces simply by its order(A,B,C,D...) comes from the test for task #6
* The idea of judging off grid by juding the column and row whether they are neighbours comes from Steve in Boggle
* Various syntax corrections from Oracle's Java documentation.
* The base idea for the FXPiece drag-and-drop code came from Steve Blackburn in the first assignment.
* The solution to implementing setOnKeyPress in FXPiece came from [this](http://stackoverflow.com/questions/32802664/setonkeypressed-event-not-working-properly) StackOverflow answer.
* Syntactical corrections drawn from Oracle's Java documentation.

Signed: Alex Smith (u5838800) Yicong Du(u6127601)

## Git Log
```
commit 7f075ec2c64c9663b82b0b3200fd01cd0cd0d9f9
Author: u5838800 <u5838800@anu.edu.au>
Date:   Fri Oct 14 12:22:25 2016 +1100

    Updated

commit 023cf4385eeb917829d390e70e5159b923d658d0
Author: u5838800 <u5838800@anu.edu.au>
Date:   Fri Oct 14 12:21:45 2016 +1100

    Enabled an earlier threshold for dynamic hints.

commit f8ace416d022e668cb0130d1d93bb5bb953d071b
Author: u5838800 <u5838800@anu.edu.au>
Date:   Fri Oct 14 12:13:58 2016 +1100

    Disabled music again.

commit 7025de2f261c0a04373135bcb0b3d585cc9e177d
Author: u5838800 <u5838800@anu.edu.au>
Date:   Fri Oct 14 12:13:32 2016 +1100

    Removed.

commit 3d111391bd9a6fd0aecc9d6c1e300ebd90041b03
Merge: 56bd90b 51f50c2
Author: u5838800 <u5838800@anu.edu.au>
Date:   Fri Oct 14 11:39:30 2016 +1100

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u5838800/comp1110-ass2-thu09e

commit 56bd90be3367f8c2839bb8125bc758d6159ce047
Author: u5838800 <u5838800@anu.edu.au>
Date:   Fri Oct 14 11:39:22 2016 +1100

    Update to summary page.

commit 51f50c2ddf13279315be63dc031799e71fc69480
Author: u5838800 <u5838800@anu.edu.au>
Date:   Fri Oct 14 09:03:19 2016 +1100

    Enabled music.

commit cf2656bf1d3b77893ee077f662b601b8a22b09d7
Author: u5838800 <u5838800@anu.edu.au>
Date:   Thu Oct 13 22:32:58 2016 +1100

    Added a scrape of a solution string to format to placements later.

commit 0e049ceb668e1880f3427d5e1bfb6d23b71b439c
Merge: ae0eff7 0c44c0a
Author: u5838800 <u5838800@anu.edu.au>
Date:   Thu Oct 13 22:27:22 2016 +1100

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u5838800/comp1110-ass2-thu09e

commit ae0eff7799d73f9899e0a61a86df0e623602b744
Author: u5838800 <u5838800@anu.edu.au>
Date:   Thu Oct 13 22:27:15 2016 +1100

    Added final pdf

commit 0c44c0a6ec189bd056b9c97782a343b3a0768589
Author: Yicong <duyicong515@163.com>
Date:   Thu Oct 13 22:04:29 2016 +1100

    best class document add

commit ce3b5776955c44bc125a1ad359d0a208234e43c6
Author: Yicong <duyicong515@163.com>
Date:   Thu Oct 13 21:50:36 2016 +1100

    sign contribution

commit 7b082776f02af96fb9b246bb17130b732787adc0
Author: Yicong <duyicong515@163.com>
Date:   Thu Oct 13 21:49:00 2016 +1100

    comment out useless println

commit 3ca83d3fca82c7419a5f56a643d15b90b85f522e
Author: Yicong <duyicong515@163.com>
Date:   Thu Oct 13 21:34:47 2016 +1100

    change some originality file and features as task 12 is completed by Alex

commit e797f89192ecd48ccc5515d291e38ede546c0177
Author: Yicong <duyicong515@163.com>
Date:   Thu Oct 13 21:26:47 2016 +1100

    added more features

commit ded0e8e167561e27dd164a090918cb0d4ecccd97
Merge: 17784ee a64e211
Author: Yicong <duyicong515@163.com>
Date:   Thu Oct 13 21:25:04 2016 +1100

    Merge remote-tracking branch 'origin/master'

    # Conflicts:
    #       admin/G-originality.md

commit 17784ee6b3b2187777a7ed12bfd59fe07cc8a7d6
Author: Yicong <duyicong515@163.com>
Date:   Thu Oct 13 21:23:07 2016 +1100

    added and signed originality

commit a64e2111156968a072fb8d8fb6ff25c76acb4d50
Merge: e1ed132 445c2d6
Author: u5838800 <u5838800@anu.edu.au>
Date:   Thu Oct 13 21:20:43 2016 +1100

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u5838800/comp1110-ass2-thu09e

commit e1ed13210dad5c1cfe589054182315964a8b88af
Author: u5838800 <u5838800@anu.edu.au>
Date:   Thu Oct 13 21:20:33 2016 +1100

    Updated with file reading credit.

commit 3da664c2ac46ab354b07554fd96d8167a5ad61ae
Author: u5838800 <u5838800@anu.edu.au>
Date:   Thu Oct 13 21:20:20 2016 +1100

    Testing changes.

commit 70a00f1df23cf18fc3475280dff6a23814efe159
Author: u5838800 <u5838800@anu.edu.au>
Date:   Thu Oct 13 21:19:49 2016 +1100

    Tidied getNearestPeg and commented loadSolutions.

commit ecdcc5e59426b52354f7715c0ffaa34f304ea6c0
Author: u5838800 <u5838800@anu.edu.au>
Date:   Thu Oct 13 21:15:47 2016 +1100

    Disabled dynamic hints on generated boards.

commit bbe2411f04c97d94de0d2c9fcdd797f51fc181e6
Author: u5838800 <u5838800@anu.edu.au>
Date:   Thu Oct 13 21:13:45 2016 +1100

    Added another solution.

commit 17bb2c8569e88661ecea3ec695c53e8944856b9d
Author: u5838800 <u5838800@anu.edu.au>
Date:   Thu Oct 13 21:07:09 2016 +1100

    Updated feature list.

commit be779ce70f8dc72e6457c696702972196901928b
Author: u5838800 <u5838800@anu.edu.au>
Date:   Thu Oct 13 21:06:55 2016 +1100

    Added updated UML diagram.

commit 61c172c41543d223da3105d9f93f5f3a4bc093ab
Author: u5838800 <u5838800@anu.edu.au>
Date:   Thu Oct 13 21:02:23 2016 +1100

    Submitted best statement.

commit b87e07429f97a8acdfaa7789c6df09d961534fe4
Author: u5838800 <u5838800@anu.edu.au>
Date:   Thu Oct 13 21:01:56 2016 +1100

    Broke and fixed getSolution based on me thinking a bad placement was a good one.

commit 4fdb862878496caf77b8c8b69a01ee510d9daf63
Author: u5838800 <u5838800@anu.edu.au>
Date:   Thu Oct 13 21:01:16 2016 +1100

    Removed some old code and made columns for solutionSet.

commit 445c2d62b1bc15d70c4363b8fc6b7b3db3a23735
Author: Yicong <duyicong515@163.com>
Date:   Thu Oct 13 20:59:46 2016 +1100

    renew features

commit 037d932bfc78c8d3ef91abd805d966a154813c6c
Author: u5838800 <u5838800@anu.edu.au>
Date:   Thu Oct 13 20:58:54 2016 +1100

    Restructured solution and placement management.

commit da3f1c0c0787060247b69004f7156202ab663932
Author: u5838800 <u5838800@anu.edu.au>
Date:   Thu Oct 13 18:59:51 2016 +1100

    Unbroke getPiecesForPlacement

commit a007248cd8104dc5fc518e81c6ea46e492bf0d8a
Merge: e655891 c40840f
Author: u5838800 <u5838800@anu.edu.au>
Date:   Thu Oct 13 18:10:22 2016 +1100

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u5838800/comp1110-ass2-thu09e

commit e6558916f7a955fb3aa2d7e6448ad3775066290f
Author: u5838800 <u5838800@anu.edu.au>
Date:   Thu Oct 13 18:09:57 2016 +1100

    Moved generated solutions file.

commit b43d03d97c0ac905f04d879cc54b7aca013f6d85
Author: u5838800 <u5838800@anu.edu.au>
Date:   Thu Oct 13 18:09:36 2016 +1100

    Added loading messages and solutions from text file.

commit 96deb75addf368d641423abfc3b0fc8fe1444309
Author: u5838800 <u5838800@anu.edu.au>
Date:   Thu Oct 13 17:48:27 2016 +1100

    Tidied isPlacementWellFormed, getPegsForPiecePlacement, updatePegsPlacement.

commit c40840f2f17df4822638126683575ad27f0e5081
Author: Yicong <duyicong515@163.com>
Date:   Thu Oct 13 17:31:50 2016 +1100

    upstream pull and add author

commit 010814365afb309dbf4e3e991b23d90a535fcfb1
Merge: 437d7de 43faa56
Author: Yicong <duyicong515@163.com>
Date:   Thu Oct 13 17:27:23 2016 +1100

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/comp1110/comp1110-ass2

commit c896c8cb3412280bbda7bd2bbdcfa18772325370
Author: u5838800 <u5838800@anu.edu.au>
Date:   Thu Oct 13 17:17:52 2016 +1100

    Added unique solution solver.

commit 437d7de5162103626f8d5e0e16d0fc85d8f04ec7
Author: Yicong <duyicong515@163.com>
Date:   Thu Oct 13 15:43:22 2016 +1100

    add new pages that introduce two button functions in the presentation pdf

commit 63c982f3d28fd06179eccdcf9f76b765168da013
Author: Yicong <duyicong515@163.com>
Date:   Thu Oct 13 15:31:23 2016 +1100

    picture for invalid Placement page using in the presentation.pdf

commit 8d0c0505c320d542663fbe18be84b4b1b42123db
Author: Yicong <duyicong515@163.com>
Date:   Thu Oct 13 15:17:24 2016 +1100

    structure of our game pages

commit be5f55d82eaf506a5c93deada80c0af2921b3765
Author: Yicong <duyicong515@163.com>
Date:   Thu Oct 13 14:53:59 2016 +1100

    screenshots added

commit 1afa4e0d4be56f11d986569a708453fd65f82d22
Merge: 430d966 aefff24
Author: u5838800 <u5838800@anu.edu.au>
Date:   Thu Oct 13 13:14:34 2016 +1100

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u5838800/comp1110-ass2-thu09e

commit 430d96637804991754d51238e064a5ab24b9a105
Author: u5838800 <u5838800@anu.edu.au>
Date:   Thu Oct 13 13:14:27 2016 +1100

    Removed random starting placements.

commit aefff24f555d6432895db22371a1558ed199a0d6
Author: Yicong <duyicong515@163.com>
Date:   Thu Oct 13 12:52:16 2016 +1100

    fix bug for most challenging mode

commit 77c26583535e6fbc0aaecc8a9f4b603f7ceddd86
Author: u5838800 <u5838800@anu.edu.au>
Date:   Thu Oct 13 12:45:47 2016 +1100

    Removed old code and added ownership comments.

commit 9f86645be757cb330a5657686d60d0e0474f1553
Author: u5838800 <u5838800@anu.edu.au>
Date:   Thu Oct 13 10:50:12 2016 +1100

    Added WIP pdf

commit 975c828a14a3d4d52373dee711e30eec9c100a68
Merge: 356d058 d77b7db
Author: u5838800 <u5838800@anu.edu.au>
Date:   Thu Oct 13 10:47:50 2016 +1100

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u5838800/comp1110-ass2-thu09e

commit 356d058f40e765f7f92a6407794b48055c5b96f8
Author: u5838800 <u5838800@anu.edu.au>
Date:   Thu Oct 13 10:47:36 2016 +1100

    Added .tex file for presentation

commit d77b7dbec5294aab107091c7407579fcfdbad79f
Author: Yicong <duyicong515@163.com>
Date:   Thu Oct 13 09:53:09 2016 +1100

    fix the bug of restart(clear pieces first)

commit 47b37a997f9b980468827246a4036095f15332f0
Author: u5838800 <u5838800@anu.edu.au>
Date:   Thu Oct 13 09:22:52 2016 +1100

    Added exception to createLockedPieces.

commit 764a143168ec914c42da5910e7a96c8a76bde662
Author: u5838800 <u5838800@anu.edu.au>
Date:   Thu Oct 13 09:22:19 2016 +1100

    Fixed getSolutions and added comments.

commit 8230f1f4f7b1a51461d5bae56c3ea91056e6b204
Author: u5838800 <u5838800@anu.edu.au>
Date:   Wed Oct 12 21:42:59 2016 +1100

    Completed victory screen.

commit 47e684aa071fa3c91fb9fd3ef743281e542c529a
Author: u5838800 <u5838800@anu.edu.au>
Date:   Wed Oct 12 09:46:38 2016 +1100

    Removed unfinished methods.

commit e55871296d915cd5c4fd39562c14a8e72f950693
Author: u5838800 <u5838800@anu.edu.au>
Date:   Wed Oct 12 09:05:13 2016 +1100

    Implemented semi-random off-board piece placements.

commit 742d9eb171223dfba5889f0a6f5e202aa51f73cb
Author: u5838800 <u5838800@anu.edu.au>
Date:   Tue Oct 11 23:45:23 2016 +1100

    Finished createLockedPieces

commit 696ab2b4c51970ba1516edbb5c4057355617cb10
Author: u5838800 <u5838800@anu.edu.au>
Date:   Tue Oct 11 21:28:57 2016 +1100

    WIP reworking loadHints and makePieces.

commit 517e9ad643dd31569c968033d84b252ce6744817
Author: u5838800 <u5838800@anu.edu.au>
Date:   Tue Oct 11 20:53:22 2016 +1100

    Tried to rewrite isPlacementValid

commit 73fe69c06b1622db71a6e1aa6c39a777c9c75875
Author: u5838800 <u5838800@anu.edu.au>
Date:   Tue Oct 11 19:40:20 2016 +1100

    Removed some deprecated code and tidied layout.

commit 2ff7afa3a06738bb65b18368e3afe6ee25ae7b76
Author: u5838800 <u5838800@anu.edu.au>
Date:   Tue Oct 11 19:35:55 2016 +1100

    Set up victory screen to be an overlay on the complete board. Needs beautification.

commit 424804d114262ea6b34df708fc5a82ca7fd8df6b
Author: u5838800 <u5838800@anu.edu.au>
Date:   Tue Oct 11 19:20:49 2016 +1100

    Moved buttons slightly and updated TODO.

commit f3d70f71127d0780281e6a03d620a86892e41ce1
Author: u5838800 <u5838800@anu.edu.au>
Date:   Tue Oct 11 19:19:53 2016 +1100

    Made buttons align on their right edge.

commit 86ccd0322fd41066c9e8ee65d884d181b9cd806a
Author: u5838800 <u5838800@anu.edu.au>
Date:   Tue Oct 11 19:15:29 2016 +1100

    Render hints over pieces instead of under.

commit e469beefb770656454ecc3a977290717ac58010d
Author: u5838800 <u5838800@anu.edu.au>
Date:   Tue Oct 11 17:10:59 2016 +1100

    Updated contribution

commit e3395b3ebd57e99bf7dc9b5a2fc4deec6c975e01
Author: u5838800 <u5838800@anu.edu.au>
Date:   Tue Oct 11 09:58:29 2016 +1100

    Updated shell (need to fill in percentages)

commit e9a74cf0c77e7e6d776364c166306e1d7c2fc788
Author: u5838800 <u5838800@anu.edu.au>
Date:   Tue Oct 11 09:57:30 2016 +1100

    Updated with dynamic hints.

commit 0b2836b5d6a23cbae82448f00b9a374a24b0a8a4
Author: u5838800 <u5838800@anu.edu.au>
Date:   Tue Oct 11 09:56:41 2016 +1100

    Credited music.

commit a4650096009a4e788a5a814a9d02fe67d3581103
Author: u5838800 <u5838800@anu.edu.au>
Date:   Tue Oct 11 09:51:13 2016 +1100

    Fixed a typo.

commit 7e37b82e0e069546f6e78eb12b376c369816deae
Author: u5838800 <u5838800@anu.edu.au>
Date:   Tue Oct 11 09:35:49 2016 +1100

    Added dynamic solutions for board with >= 8 pieces.

commit 7255373b8154e7740cbb39665664da6cee84c195
Author: u5838800 <u5838800@anu.edu.au>
Date:   Mon Oct 10 19:06:27 2016 +1100

    Updated presentation notes

commit 95ea82627f69600fe552c82d0628912c174cdb04
Author: u5838800 <u5838800@anu.edu.au>
Date:   Mon Oct 10 19:03:09 2016 +1100

    Added presentation notes

commit 04f8fe4dedbca3c043dc571c1e596d53376d1d7c
Author: Yicong <duyicong515@163.com>
Date:   Mon Oct 10 16:09:57 2016 +1100

    change victory scene. needs to be improved

commit b4220f2f167ebc777d0c2f452146786e328ad428
Merge: 65dba88 a99748e
Author: Yicong <duyicong515@163.com>
Date:   Mon Oct 10 15:25:15 2016 +1100

    Merge remote-tracking branch 'origin/master'

commit 65dba88f11935bde6239bc9888fbdc98899eaba7
Author: Yicong <duyicong515@163.com>
Date:   Mon Oct 10 15:24:43 2016 +1100

    Author updates for all classes

commit a99748ef081cd987fee353c1cc875f238a6f364e
Author: u5838800 <u5838800@anu.edu.au>
Date:   Mon Oct 10 15:24:29 2016 +1100

    Reformatted the initial placement methods.

commit d03ee58454a48494b13d3cc90c8a0052e3a8e0bd
Author: u5838800 <u5838800@anu.edu.au>
Date:   Mon Oct 10 12:17:00 2016 +1100

    Reformatted and refactored some methods.

commit b5130d1e120b6a65dacf579663ffbe869c6a2a4e
Author: u5838800 <u5838800@anu.edu.au>
Date:   Mon Oct 10 12:08:44 2016 +1100

    Adjusted loadHints to throw an error.

commit 5fd18ac38dea49ecde7bdff7a441fc4ce6be0a91
Author: u5838800 <u5838800@anu.edu.au>
Date:   Mon Oct 10 12:07:09 2016 +1100

    Fixed hints not reloading on a new game.

commit d75a11a3d6971be32136bdad21330b7936293b6a
Author: u5838800 <u5838800@anu.edu.au>
Date:   Sun Oct 9 22:29:17 2016 +1100

    Updated.

commit 3729ee0ede2028dec33b5e5817224bb0753ce65a
Author: u5838800 <u5838800@anu.edu.au>
Date:   Sun Oct 9 22:28:26 2016 +1100

    Updated with progress.

commit 20c63ecc331c29f6fa160a245477002fa0275b8d
Author: u5838800 <u5838800@anu.edu.au>
Date:   Sun Oct 9 22:28:13 2016 +1100

    Attempted to add victory screen. Issues with checking victory condition.

commit 682abbb253311be4c0cb11187106614bed4ef3cf
Author: u5838800 <u5838800@anu.edu.au>
Date:   Sun Oct 9 22:27:49 2016 +1100

    Optimised to run only over the possible pegs. Down to ~33 seconds on a 4-piece placement.

commit 873c2f760ef2dbdcaf29035f2cc69cc58a0a523e
Author: u5838800 <u5838800@anu.edu.au>
Date:   Sun Oct 9 19:50:04 2016 +1100

    Added music player.

commit b3e47803e2751dd920e4736d04b6d3d42c0a2210
Author: u5838800 <u5838800@anu.edu.au>
Date:   Sun Oct 9 14:55:56 2016 +1100

    Updated comments.

commit e3dec0b4da397162129857f07cac026d6d57c887
Author: u5838800 <u5838800@anu.edu.au>
Date:   Sun Oct 9 14:49:45 2016 +1100

    Found where to change things to return multiple solutions. Optimisation needs work.

commit 727333d08dadb4704ad26008f25a38f9887ab4a7
Merge: 7416f3b f230ae8
Author: u5838800 <u5838800@anu.edu.au>
Date:   Sun Oct 9 14:05:16 2016 +1100

    Resolved merge and made working single-solution getSolutions.

commit 7416f3ba36e7c85b13a0931c11bf6790627d5b96
Author: u5838800 <u5838800@anu.edu.au>
Date:   Sat Oct 8 18:45:35 2016 +1100

    Implemented broken getSolutions.

commit 7ea14cfa45dfa715ae898b605450ee24f414c75c
Author: u5838800 <u5838800@anu.edu.au>
Date:   Sat Oct 8 18:45:06 2016 +1100

    Updated originality statement.

commit f230ae8616c143db10216c28a77486a01fa8143d
Author: Yicong <duyicong515@163.com>
Date:   Sat Oct 8 18:43:05 2016 +1100

    fix bug for isPlacementvalid
    forget to consider the situation that ring has two openings and the ball has one connection, and they combined together

commit bd27dd0a95de88c00368240a3690b415b89c674a
Author: u5838800 <u5838800@anu.edu.au>
Date:   Sat Oct 8 14:01:32 2016 +1100

    Tidied isPiecePlacementWellFormed.

commit 8f7e2155ecca8033a29ef5c66d17142eed62dc31
Author: Yicong <duyicong515@163.com>
Date:   Fri Oct 7 13:37:58 2016 +1100

    make detection of overlap works
    invalid drag--->snap to home
    invalid flip/rotation  ---->warning

commit 43faa56d8d61fb5efe5751c20c5cc1177a11f6ad
Author: COMP1110 Sem 2 2016 <steve.blackburn+comp1110-2016@anu.edu.au>
Date:   Thu Oct 6 21:42:02 2016 +1100

    Added two more simple good placements (that demonstrate a ring with a double opening).

commit dfc68df89ac8e96acc3484b4c7ecd1f9b3f43882
Merge: 7af66b4 f7b7fb6
Author: Alex Edward Smith <u5838800@anu.edu.au>
Date:   Thu Oct 6 20:37:07 2016 +1100

    Merge branch 'restructured-location' into 'master'

    Restructured location



    See merge request !2

commit f7b7fb66a8a9d5898542cdfa9dea9c8cf1d2142a
Author: u5838800 <u5838800@anu.edu.au>
Date:   Thu Oct 6 20:33:05 2016 +1100

    Added visual hints

commit 0fee625bada9de448b909299260f02e283603ee4
Author: u5838800 <u5838800@anu.edu.au>
Date:   Thu Oct 6 20:09:39 2016 +1100

    Unbroke snapPeg.

commit 7af66b441541b7bff52d0ecf75e6576a43057e4d
Author: Alex Edward Smith <u5838800@anu.edu.au>
Date:   Thu Oct 6 19:56:03 2016 +1100

    Removed <<<<<< HEAD line that was annoying me.

commit 7a545357aef07f1e484a52e5e43831300d04b7ec
Merge: 11877ad 6a27d9f
Author: Alex Edward Smith <u5838800@anu.edu.au>
Date:   Thu Oct 6 19:55:18 2016 +1100

    Merge branch 'restructured-location' into 'master'

    Restructured location



    See merge request !1

commit 6a27d9f310b6532a420dc89afa853456e0df872e
Author: u5838800 <u5838800@anu.edu.au>
Date:   Thu Oct 6 19:49:19 2016 +1100

    Cleaned up warnings and typos.

commit c3d2228ac52c2c3efe6489e9e36c2d95edfef46e
Author: u5838800 <u5838800@anu.edu.au>
Date:   Thu Oct 6 19:44:13 2016 +1100

    Removed deprecated dependencies.

commit 7683482a5690a4f1e8b8fe80233d25e5d815009f
Author: u5838800 <u5838800@anu.edu.au>
Date:   Thu Oct 6 19:43:23 2016 +1100

    Added comments and credits to most methods and tidied code further.

commit 1b31644baee0fc21e27eb26521d5112c9b85e1b1
Author: u5838800 <u5838800@anu.edu.au>
Date:   Thu Oct 6 18:10:26 2016 +1100

    Tidied code partially.

commit 57df9891b0c4d06902f44c11f94af6540a255a02
Merge: 100f9de 11877ad
Author: u5838800 <u5838800@anu.edu.au>
Date:   Thu Oct 6 17:54:57 2016 +1100

    Resolved merge.

commit 100f9de4c54d121871e2565348575fc970b7a41b
Author: u5838800 <u5838800@anu.edu.au>
Date:   Thu Oct 6 17:46:30 2016 +1100

    Rewrote circle drawing and snapping methods.

commit 11877ad1f7011505e14c2819ce45660ce56ea342
Author: Yicong <duyicong515@163.com>
Date:   Wed Oct 5 17:46:32 2016 +1100

    Instructions added

commit f4d3f26f279148b362b7b4fbb5384c9977879809
Author: Yicong <duyicong515@163.com>
Date:   Wed Oct 5 16:31:01 2016 +1100

    a better solution for the error in the rotation and flip process
    also add restart and new game button to the main page

commit 99aa69637f0c48859f8b7c85e02c0cfef0058dd9
Author: COMP1110 Sem 2 2016 <steve.blackburn+comp1110-2016@anu.edu.au>
Date:   Wed Oct 5 15:16:17 2016 +1100

    Added another simple bad placement

commit ccb967422910deff3e0ff75948ead6d77c8958a1
Author: Yicong <duyicong515@163.com>
Date:   Mon Oct 3 14:21:27 2016 +1100

    fix bug for null input in placement well formed

commit 114ee6d9763b7e9b363aa8512d9e7ffba30ef0cc
Author: Yicong <duyicong515@163.com>
Date:   Sat Oct 1 22:35:20 2016 +1000

    make UI much more beautiful for task9

commit 2f3b7c869b68efa85cd643c5aebf97e8f7674fe5
Author: Yicong <duyicong515@163.com>
Date:   Sat Oct 1 15:48:52 2016 +1000

    different starting string
    the gui is not good I will improve the welcome page tonight

commit 0517ebe072255b36654b75f4fb120d431788850f
Author: Yicong <duyicong515@163.com>
Date:   Fri Sep 30 22:36:27 2016 +1000

    implement starting placement

commit 2d6238a1f89a709765316a9b5b17749d7412dc0c
Merge: 7836e27 dafee32
Author: u5838800 <u5838800@anu.edu.au>
Date:   Thu Sep 29 09:33:24 2016 +1000

    Merge remote-tracking branch 'origin/master'

commit 7836e2727d0bcf3765075b76d10cd2f04a3aa8b2
Author: u5838800 <u5838800@anu.edu.au>
Date:   Thu Sep 29 09:33:17 2016 +1000

    Added notes.

commit dafee32f313d96738d4686571199f7a02df77255
Author: Yicong <duyicong515@163.com>
Date:   Wed Sep 28 22:41:11 2016 +1000

    sign originality and contribution files

commit bba9402262e13ab3a77096f4d037c570eb76a575
Merge: 25df38f 65e05b1
Author: u5838800 <u5838800@anu.edu.au>
Date:   Wed Sep 28 22:37:24 2016 +1000

    Merge remote-tracking branch 'origin/master'

commit 25df38fe0dd627c7bc2602c1ef99d9ee6cfa3ed3
Author: u5838800 <u5838800@anu.edu.au>
Date:   Wed Sep 28 22:27:21 2016 +1000

    Updated contribution declaration.

commit 65e05b199a69fa092dcb3f60465deaf013280ebf
Author: Yicong  Du <u6127601@anu.edu.au>
Date:   Wed Sep 28 11:15:08 2016 +1000

    Update modules.xml

commit bbd997cca18e39ffec2ba180dfce51a8b850e00a
Author: Yicong <duyicong515@163.com>
Date:   Wed Sep 28 10:50:41 2016 +1000

    settings

commit 372421043a4e23896f75bb966a27b366e1dce81a
Author: Alex Edward Smith <u5838800@anu.edu.au>
Date:   Wed Sep 28 09:35:08 2016 +1000

    Tidied code.

commit 5f00e4b9a81f288204fe28222350036157723bcb
Author: Yicong <duyicong515@163.com>
Date:   Wed Sep 28 01:19:06 2016 +1000

    make flip work

commit 7f13b13dd3d6ad8eefed84cb8431f7a0cea69165
Author: Yicong <duyicong515@163.com>
Date:   Wed Sep 28 01:04:22 2016 +1000

    check placement
    if the placement is not good(opening and connection is not matched) then back to the origin

commit 6f8db9643d13512c289cfdf3407e47f58964318f
Merge: afd034b 4b799ec
Author: Yicong <duyicong515@163.com>
Date:   Wed Sep 28 00:46:02 2016 +1000

    Merge remote-tracking branch 'origin/master'

    # Conflicts:
    #       src/comp1110/ass2/LinkGame.java
    #       src/comp1110/ass2/gui/Board.java

commit afd034b5525f5972aded9dd19a40d6d7e18db6bd
Author: Yicong <duyicong515@163.com>
Date:   Wed Sep 28 00:41:18 2016 +1000

    snap to the origin place where the placement is not valid

commit 4b799ecc19ffadfe3da29acec04fcfcf4f842975
Author: Alex Edward Smith <u5838800@anu.edu.au>
Date:   Wed Sep 28 00:01:35 2016 +1000

    Updated.

commit 4c0049526b373b47613bf8d3af4891862a00edb6
Author: Alex Edward Smith <u5838800@anu.edu.au>
Date:   Wed Sep 28 00:01:26 2016 +1000

    Publicised isPlacementValid.

commit ee14341f9ec58e28d9a4b1fa45a518ff83cbdd7c
Author: Alex Edward Smith <u5838800@anu.edu.au>
Date:   Wed Sep 28 00:00:52 2016 +1000

    Fixed piece duplication bug.

commit 1d1db34799379bd4b105d5dc9cb996f2967aac10
Merge: e9d4ef0 ddc4be9
Author: Alex Edward Smith <u5838800@anu.edu.au>
Date:   Tue Sep 27 23:57:43 2016 +1000

    Resolved merge.

commit ddc4be945f00d0329697ad74d51e733b96e4e7cf
Author: Yicong <duyicong515@163.com>
Date:   Tue Sep 27 23:38:48 2016 +1000

    check every movement
    if it is not valid
    then snap it to the initial position

commit 7bebbe4a4a059d7a555414fcfc6e9709f5ef813d
Author: Yicong <duyicong515@163.com>
Date:   Tue Sep 27 23:17:16 2016 +1000

    1.make pieces to be the upper layer
    and pegs to be the bottom layer
    2.get pieceplacement string
    3.in the beginning make the all below  the pegs
    4. make two methods snaptoGrid and grabLocation in the class FXpiece

commit 926cca0b8bf753717a8b411d2d3921bcb25d08a4
Merge: aa41f61 45385f8
Author: Yicong <duyicong515@163.com>
Date:   Tue Sep 27 21:31:04 2016 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/comp1110/comp1110-ass2

commit 45385f86d7e3aac3c0d4a6369bbafcb02bb8a811
Author: COMP1110 Sem 2 2016 <steve.blackburn+comp1110-2016@anu.edu.au>
Date:   Tue Sep 27 06:24:20 2016 +1000

    Increased timeouts by a further factor of 10x (excepting SolutionsTest).   They now all have 100x of slack, except for SolutionsTest, which has 10x.

commit e9d4ef0d597bc7fdfb51a34b73ab8ca15b89d2e8
Author: u5838800 <u5838800@anu.edu.au>
Date:   Mon Sep 26 11:22:09 2016 +1000

    Created jar packaging.

commit 73b5cb9555306d3f2521120426f030722ac9cdf0
Author: u5838800 <u5838800@anu.edu.au>
Date:   Mon Sep 26 11:12:43 2016 +1000

    Added preplaced piece class for starting positions.

commit 9412c6e9993b935a6f5a952ff558c0f4bcc0fd2d
Author: u5838800 <u5838800@anu.edu.au>
Date:   Mon Sep 26 10:56:11 2016 +1000

    Implemented hint viewer.

commit 8429c21e2f2bc629f57a9f2c8e3f2f8e129aa5bb
Author: u5838800 <u5838800@anu.edu.au>
Date:   Mon Sep 26 10:43:43 2016 +1000

    Updated originality.

commit b1066d5da9aada4e7f94eff2c42da225311a14a9
Author: u5838800 <u5838800@anu.edu.au>
Date:   Mon Sep 26 10:29:48 2016 +1000

    Resolved TODO and warnings.

commit 64069ec3ee54afbe7657227a0e435906fcd10005
Author: u5838800 <u5838800@anu.edu.au>
Date:   Mon Sep 26 10:27:02 2016 +1000

    Added initial piece layout and keyboard rotation controls.

commit d0c7b4602ac35a2e55b05ce8c64d7b43def4c1bf
Author: COMP1110 Sem 2 2016 <steve.blackburn+comp1110-2016@anu.edu.au>
Date:   Mon Sep 26 09:23:27 2016 +1000

    Added timeouts to tests

commit aa41f61effa5285f47f026cfcc862c6b04791dec
Author: u5838800 <u5838800@anu.edu.au>
Date:   Sun Sep 25 23:17:35 2016 +1000

    Adjusted grabLocation to be dynamic with border sizes and piece size.

commit 32485dc1db0aeca49ffb7f3ae2a3871690e212ed
Author: u5838800 <u5838800@anu.edu.au>
Date:   Sun Sep 25 22:10:14 2016 +1000

    Added debugging method for snapGrid.

commit 2aa59bdf12da3b9b7ebd1abb9290eab56c49c75f
Author: u5838800 <u5838800@anu.edu.au>
Date:   Sun Sep 25 21:52:33 2016 +1000

    Tidied code.

commit 83903e852a350f146fd417db16f9be9e067f4ac6
Author: u5838800 <u5838800@anu.edu.au>
Date:   Sun Sep 25 21:51:46 2016 +1000

    Adjusted snapGrid bounce to return to the home position.

commit d723031461696bf3f7b3b6780b50a8d47ab7dbe0
Author: u5838800 <u5838800@anu.edu.au>
Date:   Sun Sep 25 21:31:36 2016 +1000

    Implemented snapGrid including bouncing to board when attempting to place off-grid.

commit 36889b848d89dca2a83572a11cddd6f3f2aa6990
Merge: 0ad89bd 36da54c
Author: u5838800 <u5838800@anu.edu.au>
Date:   Sun Sep 25 20:28:34 2016 +1000

    Merged changes.

commit 0ad89bda8f38273fd70f3f45d6ac99e894bef303
Author: u5838800 <u5838800@anu.edu.au>
Date:   Sun Sep 25 20:26:12 2016 +1000

    Basic mouse movement!

commit de814aab29dca7a11e3a5457772bccad8fe9c206
Author: u5838800 <u5838800@anu.edu.au>
Date:   Thu Sep 22 10:33:51 2016 +1000

    Implemented basic piece class

commit 8f8bbb8e8923826c765625e4e7d6d705988bb13f
Author: u5838800 <u5838800@anu.edu.au>
Date:   Thu Sep 22 10:33:25 2016 +1000

    Removed redundant code.

commit 36da54c18f6a62558764f8a403edd9bbc1ed8f25
Author: Yicong <u6127601@anu.edu.au>
Date:   Thu Sep 22 10:26:30 2016 +1000

    make board work

commit 92ab5dfdc76c83ce06cce224247aca266402ad6a
Author: u6127601 <duyicong515@163.com>
Date:   Thu Sep 22 09:32:22 2016 +1000

    original misc file

commit 15dff111ea08019ba93a99976efaf4fdbf07e18f
Merge: 1bd163a a9b6751
Author: u6127601 <duyicong515@163.com>
Date:   Thu Sep 22 09:30:59 2016 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u5838800/comp1110-ass2-thu09e

    trying to fix module files

commit 1bd163a3d1dad8ebfaed01f063002384124b21fd
Author: u6127601 <duyicong515@163.com>
Date:   Thu Sep 22 09:28:52 2016 +1000

    original modules file

commit a9b6751af350f7389091631e886ed2b2f28717ef
Author: Alex Edward Smith <u5838800@anu.edu.au>
Date:   Thu Sep 22 09:19:02 2016 +1000

    Revert "Renamed to try and stop conflicts when cloning a new project"

    This reverts commit 5eb8a989da3a10d375fcddbf69293058f0ce2147

commit 5eb8a989da3a10d375fcddbf69293058f0ce2147
Author: u5838800 <u5838800@anu.edu.au>
Date:   Thu Sep 22 09:06:05 2016 +1000

    Renamed to try and stop conflicts when cloning a new project

commit 19934e61a64cccacf32107adb82917c8b2bd4549
Merge: a74be50 c09d7e9
Author: Yicong <duyicong515@163.com>
Date:   Tue Sep 20 21:09:41 2016 +1000

    Merge remote-tracking branch 'origin/master'

commit a74be508e0146410c66cabab1085f1bf738ca73d
Author: Yicong <duyicong515@163.com>
Date:   Tue Sep 20 21:09:07 2016 +1000

    add comments

commit c09d7e987b48bc14a7a09888ebec3ae51d015066
Author: u5838800 <u5838800@anu.edu.au>
Date:   Tue Sep 20 20:44:45 2016 +1000

    Updated originality doc.

commit fd05b52441aca58d4721041f1dc99d30a18db5fc
Author: Yicong <duyicong515@163.com>
Date:   Tue Sep 20 19:59:37 2016 +1000

    originality for stage E

commit be13d1ddf566960d295832d078204e28fbb56e43
Author: Yicong <duyicong515@163.com>
Date:   Sun Sep 18 15:27:33 2016 +1000

    update task 7
    comments of the codes will be added later

commit 9e473716b12e6fb630b8cdf859247fe6b4a2ee6a
Author: Yicong <duyicong515@163.com>
Date:   Sun Sep 18 01:13:07 2016 +1000

    change the error in the direction for piece
    also update new tests

commit 9cba7d3f78eccae6a936a1ee55b16d142cd691a1
Author: Yicong <duyicong515@163.com>
Date:   Sun Sep 18 00:43:59 2016 +1000

    add new functions to linkgame to update the pegs states for piecePlacement

commit 55e2cd793b1c859b67da6ab60a07d4db39a7f163
Author: Yicong <duyicong515@163.com>
Date:   Sun Sep 18 00:42:15 2016 +1000

    change some errors in the test

commit cf98bfafef43fef3c9f5bfaa1f4f9f86ba8ece54
Author: Yicong <duyicong515@163.com>
Date:   Sat Sep 17 23:35:03 2016 +1000

    change the initializer for pieceInfo

commit 55f6d22d69ac73b74f56ccabc3b387715971bd9c
Author: Yicong <duyicong515@163.com>
Date:   Sat Sep 17 23:34:10 2016 +1000

    change the reference directions for pegs to make it the same with the reference in piece

commit 5c6b82c4bf68a2ff24542321586b34e525fa338c
Author: Yicong <duyicong515@163.com>
Date:   Sat Sep 17 23:31:41 2016 +1000

    change for the tests again
    as the reference direction for pegs changes to make it the same with the reference direction for pieces

commit 39162321dfa1d1a759d65e62d4c041497660a310
Author: Yicong <duyicong515@163.com>
Date:   Sat Sep 17 23:19:44 2016 +1000

    some changes for the tests
    as the first6 indicates the states of the origin
    and then 6 for branch1 segment

commit 838f51deff7c40cc4c50db8555c81dcef4efd83c
Merge: 8964bc6 8d1f07c
Author: Yicong <duyicong515@163.com>
Date:   Sat Sep 17 23:00:03 2016 +1000

    Merge remote-tracking branch 'origin/master'

commit 8964bc6b1e8dbfa6d69f5697608379f85ea5c939
Author: Yicong <duyicong515@163.com>
Date:   Sat Sep 17 22:57:15 2016 +1000

    create tests for the new function
    the function aims to get the states updates according to pieceplacements

commit 8d1f07c2e2e99e1cba2d7ee952e71de0cc9f6e91
Author: u5838800 <u5838800@anu.edu.au>
Date:   Sat Sep 17 17:19:12 2016 +1000

    Added tests for getSegment.

commit 0f8669c10246a3a375693c9ca922690766c2fab5
Author: u5838800 <u5838800@anu.edu.au>
Date:   Sat Sep 17 17:19:00 2016 +1000

    Added fetching methods getSegment(int index) and getPieceType, and made constructor store info to a string array.

commit a5fdbaa37f21a3237819d92e06de9d8a0fc00941
Author: u5838800 <u5838800@anu.edu.au>
Date:   Sat Sep 17 16:55:06 2016 +1000

    Renamed the private Piece class because I was getting confused when using it as reference.

commit 72505dfd9fc1a3149a2885ea70cb7cf88b659eb4
Author: u5838800 <u5838800@anu.edu.au>
Date:   Sat Sep 17 16:30:28 2016 +1000

    Fixed wording.

commit e0907dff40edcae697f1aa9cb4099c3489901489
Author: Yicong <duyicong515@163.com>
Date:   Fri Sep 16 20:23:31 2016 +1000

    try to change the file name of my originality last week

commit ec3bc3a64e5648aaf5eff51e708f6b6797c18201
Author: u5838800 <u5838800@anu.edu.au>
Date:   Thu Sep 15 20:24:20 2016 +1000

    Tidied and reorganised code flow.

commit 301b302e6dda891c20e88228a5f52df940f636f1
Author: u5838800 <u5838800@anu.edu.au>
Date:   Thu Sep 15 20:23:55 2016 +1000

    Added start() and some initialisation of the game.

commit 7fb58bdf6b3f3cc4a7fce17eb73f7e66ca739e4b
Author: u5838800 <u5838800@anu.edu.au>
Date:   Thu Sep 15 20:05:55 2016 +1000

    Made a start on implementing the board.

commit bcdd5d9fc127a2196dcb87d3ded01a88714c8f91
Author: u5838800 <u5838800@anu.edu.au>
Date:   Thu Sep 15 20:05:24 2016 +1000

    Updated.

commit 51d3125b7f8aed4ef720bdce0b2683a4095f1626
Author: u5838800 <u5838800@anu.edu.au>
Date:   Thu Sep 15 20:03:47 2016 +1000

    Tidied code.

commit d264da838368ece575054a656247aae8bfb5110d
Author: u5838800 <u5838800@anu.edu.au>
Date:   Thu Sep 15 19:12:16 2016 +1000

    Fixed ordering bug with returning an assertion on the flip test.

commit e368cafb6c1123906507e45dbe1350a441b55c12
Author: u5838800 <u5838800@anu.edu.au>
Date:   Thu Sep 15 19:10:09 2016 +1000

    Added baseline rotate and flip methods.

commit fd8f1277cdb96eb8778dee05a13318dad95b8e1d
Author: u5838800 <u5838800@anu.edu.au>
Date:   Thu Sep 15 19:09:27 2016 +1000

    Tidied code.

commit ab9206bcc928c50545f4324aba33afc110025ea2
Author: u5838800 <u5838800@anu.edu.au>
Date:   Thu Sep 15 19:09:07 2016 +1000

    Added movement tests.

commit e841ee8fca8e66d60dac7837f140cee2a0467b41
Author: u5838800 <u5838800@anu.edu.au>
Date:   Thu Sep 15 19:08:51 2016 +1000

    Added internal movement, calls, and sets.

commit 2bca18f1fc2f85ea286473f04c39f751ee32ecfd
Merge: 7dc00ae 4953fa5
Author: u5838800 <u5838800@anu.edu.au>
Date:   Thu Sep 15 17:12:32 2016 +1000

    Merged changes

commit c3542a5ae8d5786013954c4a8b9bba93f4618707
Author: COMP1110 Sem 2 2016 <steve.blackburn+comp1110-2016@anu.edu.au>
Date:   Thu Sep 15 13:46:08 2016 +1000

    Removed test case with three starting pieces (the assignment only asks you to solve for four or more starting pieces)

commit c1eb0283e9da160c2f6dcca10056c70e6de7b5a4
Merge: fc179c1 7c23cfd
Author: COMP1110 Sem 2 2016 <steve.blackburn+comp1110-2016@anu.edu.au>
Date:   Wed Sep 14 16:07:16 2016 +1000

    Merge remote-tracking branch 'origin/master'

commit fc179c1d0a21005e67b3b38c340f4604bca231f7
Author: COMP1110 Sem 2 2016 <steve.blackburn+comp1110-2016@anu.edu.au>
Date:   Wed Sep 14 16:06:57 2016 +1000

    Fix bug in invalidPiecePlacement, thanks to group tue13h.

commit 7dc00ae5342f9be4c6fc0f9a8e4551ad02210e8d
Merge: de264cd 73597ca
Author: u5838800 <u5838800@anu.edu.au>
Date:   Mon Sep 12 18:27:05 2016 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u5838800/comp1110-ass2-thu09e

    # Conflicts:
    #       .idea/modules.xml

commit de264cdef90f2d8da85502ba43332aaeb6fdbf07
Author: u5838800 <u5838800@anu.edu.au>
Date:   Mon Sep 12 18:25:51 2016 +1000

    Misc

commit e5542580d040752c12a1bcf309a8c89efbe7c192
Author: u5838800 <u5838800@anu.edu.au>
Date:   Mon Sep 12 18:25:20 2016 +1000

    Tidied code a bit.

commit 80ad4cc4ca1f0679c43e7ef459ea6d9b2d580c61
Author: u5838800 <u5838800@anu.edu.au>
Date:   Sat Sep 3 16:27:49 2016 +1000

    Tidied code a bit.

commit 73597cab66d293c6e8312052eed54990ba8d38e8
Author: COMP1110 Sem 2 2016 <steve.blackburn+comp1110-2016@anu.edu.au>
Date:   Thu Sep 1 10:11:29 2016 +1000

    Restored lost intellij metadata

commit a886622f97bd000fc9483b8bbd7351e21d2afd8e
Author: u5838800 <u5838800@anu.edu.au>
Date:   Thu Sep 1 09:09:33 2016 +1000

    Uploaded originality statement.

commit aa321c76da496625ffd067cb6f3ef428678a84a0
Merge: 8c9262b 8309160
Author: Yicong <duyicong515@163.com>
Date:   Wed Aug 31 14:50:09 2016 +1000

    Merge remote-tracking branch 'origin/master'

commit 8c9262bb2b97cfaa5a26d97d101818a627c9c5ec
Author: Yicong <duyicong515@163.com>
Date:   Thu Aug 25 09:10:56 2016 +1000

    originality file for week7

commit 83091601aec1140430aba6c5319523aed7bebe54
Author: u6127601 <duyicong515@163.com>
Date:   Thu Aug 25 09:10:56 2016 +1000

    sign originality and contribution

commit 717afb131b1475a53626847af27c6209fb30cb81
Author: u5838800 <u5838800@anu.edu.au>
Date:   Wed Aug 24 19:37:42 2016 +1000

    Signed contribution and originality.

commit 08ffa58357b65dc324f47b40f8e8a3a61ab541cb
Merge: f9c8c4e 27ac276
Author: u5838800 <u5838800@anu.edu.au>
Date:   Mon Aug 22 15:52:40 2016 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u5838800/comp1110-ass2-thu09e

commit 27ac276685236f4fccf61e7b30a170a430e6aab3
Author: Yicong <duyicong515@163.com>
Date:   Mon Aug 22 15:50:11 2016 +1000

    solution to task#6 already got!
    a little bit tricky
    actually I think our program structure is a little bit too complicated
    as the shape Line/V/WideV is continuous on piece's index

commit 80e4d9dc141ae076611289f80cd279e015bae19b
Author: Yicong <duyicong515@163.com>
Date:   Mon Aug 22 13:35:00 2016 +1000

    some changes made
    1. draw 24 circles as the map used in the game at first
    2. break placement into pieceplacement
    3. in getting the x coordinate, I think rotation has no effect on the center coordinate, so I change the x calculation method for odd column, and WEB places rightly
    4. erase all the previous pieces at first

commit f9c8c4e2476204895cdee3079b491b843bee5900
Merge: cd3d24e e9d6cae
Author: u5838800 <u5838800@anu.edu.au>
Date:   Mon Aug 22 11:24:44 2016 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u5838800/comp1110-ass2-thu09e

commit e9d6caeb6e40dea4147e414c053be66faf7f5328
Author: Yicong <duyicong515@163.com>
Date:   Mon Aug 22 11:23:24 2016 +1000

    new version for task#4

commit cd3d24ee650b26b807fb1eaea7abe4e889d83c12
Merge: fbcfd5d 7c23cfd
Author: u5838800 <u5838800@anu.edu.au>
Date:   Mon Aug 22 10:49:55 2016 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/comp1110/comp1110-ass2

commit fbcfd5d9268bd649ba0bdcbc70504ee2ab347af0
Author: u5838800 <u5838800@anu.edu.au>
Date:   Sat Aug 20 19:26:10 2016 +1000

    Privatised some classes and modified makePlacement to use declared final variables.

commit b479508e8dda32c4acbeb4dd56534ea6ddd4afae
Author: u5838800 <u5838800@anu.edu.au>
Date:   Sat Aug 20 19:20:39 2016 +1000

    Added piece remover back in.

commit 8e7587806f367ca0c696fd6e9201dc0fe6cc871f
Author: u5838800 <u5838800@anu.edu.au>
Date:   Sat Aug 20 18:58:52 2016 +1000

    Removed deprecated code.

commit b593b10473a8e18024803b79f4988715ee8b70bc
Author: u5838800 <u5838800@anu.edu.au>
Date:   Sat Aug 20 18:57:56 2016 +1000

    Configured viewer to build a piece object given a placement string.

commit 7c23cfdafdbe4291e78f71de9d686684096bd63e
Author: COMP1110 Sem 2 2016 <steve.blackburn+comp1110-2016@anu.edu.au>
Date:   Thu Aug 18 23:53:50 2016 +1000

    Clarify peg numbering

commit c51fa3465daa4ab6b5024ffe66699257fd5fd817
Author: Yicong <duyicong515@163.com>
Date:   Thu Aug 18 15:59:12 2016 +1000

    finish task #4 which is quite similar to ass1
    also, task #3 is needed in task #4 so I write it just for my own need.
    It's not a well-formed method(#3)
    feel free to modify the method in your own way, Joel!

commit ebf1d7e0b6e44b361ec5c8d953b6dce446b00b6a
Merge: 1b726de c78c535
Author: Yicong <duyicong515@163.com>
Date:   Thu Aug 18 15:57:38 2016 +1000

    Merge remote-tracking branch 'origin/master'

    # Conflicts:
    #       src/comp1110/ass2/LinkGame.java

commit 1b726de7d64ecd4c9c38943d9ef8d5d5f47a4d1b
Author: Yicong <duyicong515@163.com>
Date:   Thu Aug 18 15:40:36 2016 +1000

    finish task #4 which is quite similar to ass1
    also, task #3 is needed in task #4 so I write it just for my own need.
    It's not a well-formed method(#3)
    feel free to modify the method in your own way, Joel!

commit c78c53508bc46e8431c7c99a8c905f92bf52f78c
Author: u5838800 <u5838800@anu.edu.au>
Date:   Thu Aug 18 12:16:05 2016 +1000

    Added private Piece class and image creation.

commit 0a5f8739394e44acd3266a72e300af1ec357c22d
Author: u5838800 <u5838800@anu.edu.au>
Date:   Thu Aug 18 09:09:15 2016 +1000

    Added UML diagram

commit 8d96bfbeab54ab26543b08daae80354554aa8bb7
Author: u5838800 <u5838800@anu.edu.au>
Date:   Wed Aug 17 22:23:07 2016 +1000

    Added empty piece generation class.

commit b1c117bb0eda6465beffdea3305159378f0a673b
Author: u5838800 <u5838800@anu.edu.au>
Date:   Wed Aug 17 22:22:48 2016 +1000

    Adjusted enums to not conflict with Piece class.

commit 2119b269c50fc242e729624f58a21608a14c6f32
Author: u5838800 <u5838800@anu.edu.au>
Date:   Wed Aug 17 22:22:29 2016 +1000

    Cleaned up formatting.

commit 39579a9343876f29bf9af62efa02978089a05fee
Author: u5838800 <u5838800@anu.edu.au>
Date:   Wed Aug 17 22:21:52 2016 +1000

    Added constructor and links, and first piece.

commit 4fe7ac6af63326f7703b7ba0d5e18bb506f72c50
Author: u5838800 <u5838800@anu.edu.au>
Date:   Wed Aug 17 22:21:07 2016 +1000

    Added PieceLocation class and updated originality statement.

commit fd70ec36851e24d8e77a050e6124d626bf6cf793
Author: u5838800 <u5838800@anu.edu.au>
Date:   Wed Aug 17 21:29:50 2016 +1000

    Added Piece enum explanation so that we don't forget.

commit 653ca7e0bd371da33e05335ca1064cb956e5283f
Author: u5838800 <u5838800@anu.edu.au>
Date:   Wed Aug 17 21:29:29 2016 +1000

    Added empty flipPiece, snapGrid, and snapHome methods.

commit 8ee2293f88f52125b904869aa09eacbd0c31de90
Author: u5838800 <u5838800@anu.edu.au>
Date:   Wed Aug 17 21:28:49 2016 +1000

    Tidied up Pegs class.

commit 4ee7a01da881b8ebcc4386dcd190d560c7541b64
Author: u5838800 <u5838800@anu.edu.au>
Date:   Wed Aug 17 21:27:42 2016 +1000

    Created enum classes Orientation, PieceSegment, and PieceType for use in Piece class.

commit 854f9bb1c026eae5a7c3550c5e220c51b5b44875
Author: u5838800 <u5838800@anu.edu.au>
Date:   Wed Aug 17 21:25:59 2016 +1000

    Updated details with author substitution. Updated contribution and originality statements for B.

commit 4c615481e3540455bc4e5712180597c4cc612a25
Merge: b89108f c320570
Author: joelmcleod <u6061764@anu.edu.au>
Date:   Wed Aug 17 20:30:52 2016 +1000

    Merge remote-tracking branch 'origin/master'

    # Conflicts:
    #       admin/B-contribution.md
    #       admin/B-originality.md

commit b89108ffb405f977589795aa7141d19722ee2784
Author: joelmcleod <u6061764@anu.edu.au>
Date:   Wed Aug 17 20:30:22 2016 +1000

    Added Piece class, and modified contribution doc

commit 06fdc7c6e5ac2fb521ecf4feffeffe61dbf18de5
Merge: b3456ef 41e98f2
Author: joelmcleod <u6061764@anu.edu.au>
Date:   Wed Aug 17 20:29:36 2016 +1000

    Merge remote-tracking branch 'origin/master'

    # Conflicts:
    #       admin/B-contribution.md

commit c32057094b09312dcc17228a41ebc2e3289c7efa
Author: Yicong <duyicong515@163.com>
Date:   Wed Aug 17 20:29:00 2016 +1000

    originality and contribution

commit b3456ef7305d28b0aaaef3d62b942afa2bc72ff4
Author: joelmcleod <u6061764@anu.edu.au>
Date:   Wed Aug 17 20:28:25 2016 +1000

    Added Piece class, and modified contribution doc

commit 41e98f291d29275d14b0114b42a46807b3b9626e
Merge: de081af 0308992
Author: Yicong <duyicong515@163.com>
Date:   Wed Aug 17 20:25:03 2016 +1000

    Merge remote-tracking branch 'origin/master'

commit de081afbe9c8da3935c50f2895ff4afa672d6355
Author: Yicong <duyicong515@163.com>
Date:   Wed Aug 17 20:24:33 2016 +1000

    the Board and Pegs part of the UML
    some basic methods and fields

commit 03089927161ceb04fd2f879e3a9c8ed9acfd7c76
Author: u5838800 <u5838800@anu.edu.au>
Date:   Wed Aug 17 20:23:27 2016 +1000

    Updated contribution.

commit 272beffbc7328b30f87a3c4e83fe30adf313b455
Author: u5838800 <u5838800@anu.edu.au>
Date:   Wed Aug 17 20:22:01 2016 +1000

    Added empty placement string in LinkGame.

commit ca9fb122f5c6d1b6f46dd63d9884779e9ba81c9c
Author: u5838800 <u5838800@anu.edu.au>
Date:   Wed Aug 17 20:09:45 2016 +1000

    Added empty getPlacement, breakPlacement, and updateBoard functions. Added notes on placement configuration.

commit c4f9a3ce49079e394ae448d7f5efe43d895bb3fb
Author: COMP1110 Sem 2 2016 <steve.blackburn+comp1110-2016@anu.edu.au>
Date:   Tue Aug 16 13:33:12 2016 +1000

    Make it clear how units are numbered.

commit b725d00d654b9cf06b26817e66c5b58e35b7bc24
Author: COMP1110 Sem 2 2016 <steve.blackburn+comp1110-2016@anu.edu.au>
Date:   Tue Aug 16 13:28:47 2016 +1000

    Typos: change 'link' to 'unit'

commit eba477942e797203bcf84123e572c8e8e0bf48c8
Merge: fa7dab6 73ae473
Author: joelmcleod <u6061764@anu.edu.au>
Date:   Tue Aug 16 09:13:23 2016 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/comp1110/comp1110-ass2

commit 73ae4739fc8f0a4804c3c8c1e45a46ea2e55e5ff
Author: COMP1110 Sem 2 2016 <steve.blackburn+comp1110-2016@anu.edu.au>
Date:   Tue Aug 16 06:35:23 2016 +1000

    Added missing test for duplicate pieces

commit 31f8dd7b82d7eeb361fc3e0019189dfbbf090e80
Author: COMP1110 Sem 2 2016 <steve.blackburn+comp1110-2016@anu.edu.au>
Date:   Mon Aug 15 23:06:26 2016 +1000

    Added tests

commit ce45890548e232253feb91620ab04e6a04e55d2a
Author: COMP1110 Sem 2 2016 <steve.blackburn+comp1110-2016@anu.edu.au>
Date:   Mon Aug 15 23:05:49 2016 +1000

    Clarify that the A piece has only six valid orientations

commit 995ba01ac70992a368965f387b4fff25ad1ba246
Author: COMP1110 Sem 2 2016 <steve.blackburn+comp1110-2016@anu.edu.au>
Date:   Mon Aug 15 23:04:48 2016 +1000

    Remove stray line

commit fa7dab67cc3d31617ba41b6e0e9d47950b3b8eb0
Merge: 53aebb5 585221c
Author: u5838800 <u5838800@anu.edu.au>
Date:   Thu Aug 11 13:46:31 2016 +1000

    Merge remote-tracking branch 'origin/master'

    # Conflicts:
    #       src/gittest/Main.java

commit 585221ce037c7fb37e921171799686cedfc55608
Merge: e3bbdeb eae3c72
Author: joelmcleod <u6061764@anu.edu.au>
Date:   Thu Aug 11 13:45:26 2016 +1000

    Merge remote-tracking branch 'origin/master'

    # Conflicts:
    #       src/gittest/Main.java

commit eae3c726aaa35857c73195412b183b85521fac14
Author: Alice <u123456@anu.edu.au>
Date:   Thu Aug 11 13:43:56 2016 +1000

    first push

commit e3bbdeb1fabcbfd359e853103ca7d1fc41cb3ceb
Author: Bob <u1234567@anu.edu.au>
Date:   Thu Aug 11 13:27:50 2016 +1000

    End of Part 8 completed: Commit but no push

commit 53aebb5177ac40b4b4279d87ab30fea9652bb9aa
Author: Cindy <u1234567@anu.edu.au>
Date:   Thu Aug 11 13:13:21 2016 +1000

    C

commit 629e2c4e04869350f554a085a19bdcf9d9a8394b
Author: u5838800 <u5838800@anu.edu.au>
Date:   Thu Aug 11 10:56:10 2016 +1000

    C

commit 23d117df20247ebb9b1f1d974d4c1248c2d6cecf
Merge: 0c9f9ce 0c963a8
Author: joelmcleod <u6061764@anu.edu.au>
Date:   Thu Aug 11 10:44:17 2016 +1000

    Merge remote-tracking branch 'origin/master'

commit 0c963a8fdcc6de2e068234f5b5399858905f0a29
Author: Cindy <u1234567@anu.edu.au>
Date:   Thu Aug 11 10:43:54 2016 +1000

    C

commit 0c9f9ce179f1a0dae41b4f83dd9fa7b4bf1b85d0
Author: Bob <u1234567@anu.edu.au>
Date:   Thu Aug 11 10:42:38 2016 +1000

    message

commit 0afe3499df749ca8049012fd28c05f6bf482b746
Merge: a087e31 725c54f
Author: u6127601 <duyicong515@163.com>
Date:   Thu Aug 11 10:37:17 2016 +1000

    Merge remote-tracking branch 'origin/master'

commit a087e317846c5c30acdecf696dbacdfed7ac2afc
Author: u6127601 <duyicong515@163.com>
Date:   Thu Aug 11 10:37:00 2016 +1000

    Alice <u1234567@anu.edu.au>

commit 5b5bd749d137e8de483533b4ed8b276b86aa3642
Author: u6127601 <duyicong515@163.com>
Date:   Thu Aug 11 10:32:39 2016 +1000

    Alice <u1234567@anu.edu.au>

commit 725c54f7d54699bbcb5923dce87d5ad137e30c5f
Author: u5838800 <u5838800@anu.edu.au>
Date:   Thu Aug 11 10:22:44 2016 +1000

    Added phone numbers to details.md.

commit a2d40cf9eebdb14c19bb6569e459f2157a802ad6
Author: u5838800 <u5838800@anu.edu.au>
Date:   Thu Aug 11 09:58:14 2016 +1000

    Added details in admin folder.
    Contains meeting info, member info, roles, contact info

commit 6de4754635d96596632efa382a422f4ed36a9e4c
Author: COMP1110 Sem 2 2016 <steve.blackburn+comp1110-2016@anu.edu.au>
Date:   Wed Aug 10 06:52:17 2016 +1000

    Update README.md

commit 08f7d62a026f4aa630d6ca9951361fd20c7a6397
Author: COMP1110 Sem 2 2016 <steve.blackburn+comp1110-2016@anu.edu.au>
Date:   Tue Aug 9 02:05:06 2016 +1000

    Initial import

commit 4953fa5d2bd2143f8bcc34429b3404eef8aff746
Author: COMP1110 Sem 2 2016 <steve.blackburn+comp1110-2016@anu.edu.au>
Date:   Mon Jul 18 10:17:55 2016 +1000

    Add new file

commit 0d24fbc5e07a3e3baff6d11b188c037ee2465005
Author: COMP1110 Sem 2 2016 <steve.blackburn+comp1110-2016@anu.edu.au>
Date:   Mon Jul 18 09:00:14 2016 +1000

    Delete .gitkeep

commit 38a420519a95b01da82f29b4491074e618b26c52
Author: COMP1110 Sem 2 2016 <steve.blackburn+comp1110-2016@anu.edu.au>
Date:   Mon Jul 18 09:00:00 2016 +1000

    Delete AdminOverview2016.pdf

commit 17284a68a3d292db6627b8f1f3025902a86c73ae
Author: COMP1110 Sem 2 2016 <steve.blackburn+comp1110-2016@anu.edu.au>
Date:   Mon Jul 18 08:59:37 2016 +1000

    Delete README.md

commit 91acea754d2c6684ee804b6a6eb43cd876f9ba44
Author: COMP1110 Sem 2 2016 <steve.blackburn+comp1110-2016@anu.edu.au>
Date:   Mon Jul 18 08:52:09 2016 +1000

    Update README.md

commit a258981829a7ff6a5c4d36c8992b7c669b9e87f4
Author: COMP1110 Sem 2 2016 <steve.blackburn+comp1110-2016@anu.edu.au>
Date:   Mon Jul 18 08:51:37 2016 +1000

    Update README.md

commit a614bc645ad8085a4eb17f11d9e87a78e7da73f7
Author: COMP1110 Sem 2 2016 <steve.blackburn+comp1110-2016@anu.edu.au>
Date:   Mon Jul 18 08:46:07 2016 +1000

    Update README.md

commit 02cb94abb88e1d75ec1a80462b4c7b0d5bfc8534
Author: COMP1110 Sem 2 2016 <steve.blackburn+comp1110-2016@anu.edu.au>
Date:   Mon Jul 18 08:44:30 2016 +1000

    Upload new file

commit 0154fe93a78c22a7606c231372c32736b1d008a2
Author: COMP1110 Sem 2 2016 <steve.blackburn+comp1110-2016@anu.edu.au>
Date:   Mon Jul 18 08:41:40 2016 +1000

    Add new directory

commit 90d78178a402c5895cf4a4d0bf8b7b54f06eff31
Author: COMP1110 Sem 2 2016 <steve.blackburn+comp1110-2016@anu.edu.au>
Date:   Mon Jul 18 08:32:02 2016 +1000

    Update README.md

commit e5a0a27da728e51089d7bb339cf6bf75e36b445b
Author: COMP1110 Sem 2 2016 <steve.blackburn+comp1110-2016@anu.edu.au>
Date:   Mon Jul 18 08:25:58 2016 +1000

    Update README.md

commit f4e421c62fc64cf564a55cb2ad9d0dbce54c3748
Author: COMP1110 Sem 2 2016 <steve.blackburn+comp1110-2016@anu.edu.au>
Date:   Mon Jul 18 08:23:55 2016 +1000

    Initial cut at this version of page
```
## Changes
```
Only in ../master/comp1110-ass2/.idea: .name
Only in comp1110-ass2/.idea: artifacts
diff -ru -x .git ../master/comp1110-ass2/.idea/comp1110-ass2-dev.iml comp1110-ass2/.idea/comp1110-ass2-dev.iml
--- ../master/comp1110-ass2/.idea/comp1110-ass2-dev.iml	2016-10-14 12:45:36.000000000 +1100
+++ comp1110-ass2/.idea/comp1110-ass2-dev.iml	2016-10-14 12:47:07.000000000 +1100
@@ -4,10 +4,19 @@
     <exclude-output />
     <content url="file://$MODULE_DIR$">
       <sourceFolder url="file://$MODULE_DIR$/src" isTestSource="false" />
-      <sourceFolder url="file://$MODULE_DIR$/src-dev" isTestSource="false" />
       <sourceFolder url="file://$MODULE_DIR$/tests" isTestSource="true" />
     </content>
     <orderEntry type="inheritedJdk" />
     <orderEntry type="sourceFolder" forTests="false" />
+    <orderEntry type="module-library" scope="TEST">
+      <library name="JUnit4">
+        <CLASSES>
+          <root url="jar://$APPLICATION_HOME_DIR$/lib/junit-4.12.jar!/" />
+          <root url="jar://$APPLICATION_HOME_DIR$/lib/hamcrest-core-1.3.jar!/" />
+        </CLASSES>
+        <JAVADOC />
+        <SOURCES />
+      </library>
+    </orderEntry>
   </component>
 </module>
\ No newline at end of file
Only in comp1110-ass2/.idea: comp1110-ass2-thu09e.iml
diff -ru -x .git ../master/comp1110-ass2/README.md comp1110-ass2/README.md
--- ../master/comp1110-ass2/README.md	2016-10-14 12:45:36.000000000 +1100
+++ comp1110-ass2/README.md	2016-10-14 12:47:07.000000000 +1100
@@ -203,3 +203,5 @@
 **High Distinction**
 * _All of the Distinction-level criteria, plus the following..._
 * Tasks #11 and #12
+=======
+Information for COMP1110/COMP1140/COMP1510/COMP6710 can all be found on this repo's [wiki](https://gitlab.cecs.anu.edu.au/comp1110/comp1110/wikis/home).
diff -ru -x .git ../master/comp1110-ass2/admin/B-contribution.md comp1110-ass2/admin/B-contribution.md
--- ../master/comp1110-ass2/admin/B-contribution.md	2016-10-14 12:45:36.000000000 +1100
+++ comp1110-ass2/admin/B-contribution.md	2016-10-14 12:47:07.000000000 +1100
@@ -1,7 +1,7 @@
 We declare that the work toward our submission of Stage B was distributed among the group members as follows:

-* u2345678 30
-* u3456789 40
-* u0234567 30
+u5838800 33
+u6061764 33
+u6127601 33

-Signed: Mary Jones (u2345678), Bob Smith (u3456789), and Sue Black (u0234567)
+Signed by Alex Smith (u5838800), Joel McLeod (u6061764), and Yicong Du (u6127601)
\ No newline at end of file
diff -ru -x .git ../master/comp1110-ass2/admin/B-originality.md comp1110-ass2/admin/B-originality.md
--- ../master/comp1110-ass2/admin/B-originality.md	2016-10-14 12:45:36.000000000 +1100
+++ comp1110-ass2/admin/B-originality.md	2016-10-14 12:47:07.000000000 +1100
@@ -1,9 +1,7 @@
 We declare that the work we have submitted for Stage B of this assignment and all stages before it is entirely our own work, with the following documented exceptions:

-* The idea of using <...> to make the game run faster came from a discussion with <...> (noted in source code comments)
+* The idea of having pieces snap to the board's grid was inspired by Steve Blackburn in the habitat assignment.

-* The code in class <...> is based on a solution we found when researching the problem (URL provided in source code comments)
+* Configuration of the PieceLocation class is attributed to Steve Blackburn.

-*  ....
-
-Signed: Mary Jones (u2345678), Bob Smith (u3456789), and Sue Black (u0123456)
+Signed: Alex Smith (u5838800), Joel McLeod (u6061764), and Yicong Du (u6127601)
\ No newline at end of file
diff -ru -x .git ../master/comp1110-ass2/admin/C-contribution.md comp1110-ass2/admin/C-contribution.md
--- ../master/comp1110-ass2/admin/C-contribution.md	2016-10-14 12:45:36.000000000 +1100
+++ comp1110-ass2/admin/C-contribution.md	2016-10-14 12:47:07.000000000 +1100
@@ -1,7 +1,6 @@
 We declare that the work toward our submission of Stage C was distributed among the group members as follows:

-* u2345678 30
-* u3456789 40
-* u0234567 30
+* u5838800 40
+* u6127601 60

-Signed: Mary Jones (u2345678), Bob Smith (u3456789), and Sue Black (u0234567)
+Signed: Alex Smith (u5838800) Yicong Du(u6127601)
diff -ru -x .git ../master/comp1110-ass2/admin/C-originality.md comp1110-ass2/admin/C-originality.md
--- ../master/comp1110-ass2/admin/C-originality.md	2016-10-14 12:45:36.000000000 +1100
+++ comp1110-ass2/admin/C-originality.md	2016-10-14 12:47:07.000000000 +1100
@@ -1,9 +1,7 @@
-We declare that the work we have submitted for Stage C of this assignment and all stages before it is entirely our own work, with the following documented exceptions:
-
-* The idea of using <...> to make the game run faster came from a discussion with <...> (noted in source code comments)

-* The code in class <...> is based on a solution we found when researching the problem (URL provided in source code comments)
+We declare that the work we have submitted for Stage C of this assignment and all stages before it is entirely our own work, with the following documented exceptions:

-*  ....
+The idea of distinguish different pieces simply by its order(A,B,C,D...) comes from the test for task #6
+The idea of judging off grid by juding the column and row whether they are neighbours comes from Steve in Boggle

-Signed: Mary Jones (u2345678), Bob Smith (u3456789), and Sue Black (u0123456)
+Signed Alex Smith (u5838800) Yicong Du(u6127601)
\ No newline at end of file
Only in ../master/comp1110-ass2/admin: D-originality-u1234567.md
Only in comp1110-ass2/admin: D-originality-u5838800.md
Only in comp1110-ass2/admin: D-originality-u6127601.md
Only in ../master/comp1110-ass2/admin: E-originality-u1234567.md
Only in comp1110-ass2/admin: E-originality-u5838800.md
Only in comp1110-ass2/admin: E-originality-u6127601.md
diff -ru -x .git ../master/comp1110-ass2/admin/F-contribution.md comp1110-ass2/admin/F-contribution.md
--- ../master/comp1110-ass2/admin/F-contribution.md	2016-10-14 12:45:36.000000000 +1100
+++ comp1110-ass2/admin/F-contribution.md	2016-10-14 12:47:07.000000000 +1100
@@ -1,8 +1,7 @@
 We declare that the work toward our submission of Stage F was distributed among the group members as follows:

-* u2345678 30
-* u3456789 40
-* u0123456 30
+* u5838800 70
+* u6127601 30

-Signed: Mary Jones (u2345678), Bob Smith (u3456789), and Sue Black (u0123456)
+Signed: Alex Smith (u5838800) Yicong Du(u6127601)

diff -ru -x .git ../master/comp1110-ass2/admin/F-originality.md comp1110-ass2/admin/F-originality.md
--- ../master/comp1110-ass2/admin/F-originality.md	2016-10-14 12:45:36.000000000 +1100
+++ comp1110-ass2/admin/F-originality.md	2016-10-14 12:47:07.000000000 +1100
@@ -1,9 +1,9 @@
 We declare that the work we have submitted for Stage F of this assignment and all stages before it is entirely our own work, with the following documented exceptions:

-* The idea of using <...> to make the game run faster came from a discussion with <...> (noted in source code comments)
+* The base idea for the FXPiece drag-and-drop code came from Steve Blackburn in the first assignment.

-* The code in class <...> is based on a solution we found when researching the problem (URL provided in source code comments)
+* The solution to implementing setOnKeyPress in FXPiece came from [this](http://stackoverflow.com/questions/32802664/setonkeypressed-event-not-working-properly) StackOverflow answer.

-* ....
+* Syntactical corrections drawn from Oracle's Java documentation.

-Signed: Mary Jones (u2345678), Bob Smith (u3456789), and Sue Black (u0123456)
+Signed: Alex Smith (u5838800) Yicong Du(u6127601)
Only in ../master/comp1110-ass2/admin: G-best-u1234567.md
Only in comp1110-ass2/admin: G-best-u5838800.md
Only in comp1110-ass2/admin: G-best-u6127601.md
diff -ru -x .git ../master/comp1110-ass2/admin/G-contribution.md comp1110-ass2/admin/G-contribution.md
--- ../master/comp1110-ass2/admin/G-contribution.md	2016-10-14 12:45:36.000000000 +1100
+++ comp1110-ass2/admin/G-contribution.md	2016-10-14 12:47:07.000000000 +1100
@@ -1,8 +1,7 @@
 We declare that the work toward our submission of Stage G was distributed among the group members as follows:

-* u2345678 30
-* u3456789 40
-* u0123456 30
+* u5838800 55
+* u6127601 45

-Signed: Mary Jones (u2345678), Bob Smith (u3456789), and Sue Black (u0123456)
+Signed: Alex Smith (u5838800) Yicong Du(u6127601)

diff -ru -x .git ../master/comp1110-ass2/admin/G-features.md comp1110-ass2/admin/G-features.md
--- ../master/comp1110-ass2/admin/G-features.md	2016-10-14 12:45:36.000000000 +1100
+++ comp1110-ass2/admin/G-features.md	2016-10-14 12:47:07.000000000 +1100
@@ -4,12 +4,20 @@
 *(Remove those that are unimplemented)*

  - A simple placement viewer (Task 5)
- - A basic playable link game
  - A basic playable link game that snaps pieces to pegs and checks for validity (Task 8)
  - A basic implementation  of starting piece placements (Task 9)
+ - A _working method_ of generating interesting starting placements (Task 12)
  - Solution hints
- - Interesting starting placements, generated by our code.
-
-additional features...
-
-
+ - Dynamic hints in partially-complete games
+ - Viewable instruction card
+ - Music on Windows (with recompile)
+ - Beautiful welcome page with four buttons that can let users choose difficulty. For easy/hard/expert, we provide 6 different initial placements which they have
+   exactly one solution (Task12). Achieve this by the method findUniqueStart in class LinkGame.
+   Every time enter a new game, we will randomly choose an initial placements according to difficulty.
+   For most challenging mode, we make it to be empty that ensure user's multiple choices. If the placement they set  does have a solution
+   when it contains 6 pieces or more. Our hints suit their own placements.(Dynamic hints in partially-complete game)
+ - Invalid placement detection. If it is caused by dragging, snap home. Otherwise a warning will appear in the top right corner.
+ - Victory scene, when complete the game successfully, the game scene will become semi-transparent, and the screen will show "you win". there will be a button
+   "return home" that directs the user to the welcome scene.
+ - In the game scene, we provide two buttons for the user. 'New game' directs the user to the welcome page and starts a completely new game.
+   'Restart' will start with the same initial placement.
\ No newline at end of file
diff -ru -x .git ../master/comp1110-ass2/admin/G-originality.md comp1110-ass2/admin/G-originality.md
--- ../master/comp1110-ass2/admin/G-originality.md	2016-10-14 12:45:36.000000000 +1100
+++ comp1110-ass2/admin/G-originality.md	2016-10-14 12:47:07.000000000 +1100
@@ -1,9 +1,22 @@
 We declare that the work we have submitted for Stage G of this assignment and all stages before it is entirely our own work, with the following documented exceptions:

-* The idea of using <...> to make the game run faster came from a discussion with <...> (noted in source code comments)
+This two weeks:
+* The structure of getSolutions came from [Bob Carpenter](https://bob-carpenter.github.io/games/sudoku/java_sudoku.html).
+* Music is sourced from [Bensound](http://www.bensound.com/) and is distributed under the [Creative Commons license](http://www.bensound.com/licensing).
+* File reading code in Board is taken from [T.J. Crowder's answer](http://stackoverflow.com/a/7413900) to a question on StackExchange.
+* All the fonts come from http://zhongwen.laoxiezi.com/
+* Button made from https://dabuttonfactory.com/
+* Ideas of having different scenes and the method to deal with changing scene http://blog.csdn.net/lykangjia/article/details/8772964
+* Make controls and basic structure are inspired by ass1

-* The code in class <...> is based on a solution we found when researching the problem (URL provided in source code comments)
+Other weeks:
+* The idea of having pieces snap to the board's grid was inspired by Steve Blackburn in the habitat assignment.
+* Configuration of the PieceLocation class is attributed to Steve Blackburn.
+* The idea of distinguish different pieces simply by its order(A,B,C,D...) comes from the test for task #6
+* The idea of judging off grid by juding the column and row whether they are neighbours comes from Steve in Boggle
+* Various syntax corrections from Oracle's Java documentation.
+* The base idea for the FXPiece drag-and-drop code came from Steve Blackburn in the first assignment.
+* The solution to implementing setOnKeyPress in FXPiece came from [this](http://stackoverflow.com/questions/32802664/setonkeypressed-event-not-working-properly) StackOverflow answer.
+* Syntactical corrections drawn from Oracle's Java documentation.

-* ....
-
-Signed: Mary Jones (u2345678), Bob Smith (u3456789), and Sue Black (u0123456)
+Signed: Alex Smith (u5838800) Yicong Du(u6127601)
\ No newline at end of file
Only in comp1110-ass2/admin: details.md
Only in comp1110-ass2: feedback.md
Only in comp1110-ass2: game.jar
Only in comp1110-ass2: notes on presentation.docx
Only in comp1110-ass2: placement.jpg
Only in comp1110-ass2: presentation.pdf
Only in comp1110-ass2: screenshots
Only in comp1110-ass2/src: META-INF
Only in comp1110-ass2/src/comp1110/ass2: LinkGame.class
diff -ru -x .git ../master/comp1110-ass2/src/comp1110/ass2/LinkGame.java comp1110-ass2/src/comp1110/ass2/LinkGame.java
--- ../master/comp1110-ass2/src/comp1110/ass2/LinkGame.java	2016-10-14 12:45:36.000000000 +1100
+++ comp1110-ass2/src/comp1110/ass2/LinkGame.java	2016-10-14 12:47:07.000000000 +1100
@@ -1,41 +1,75 @@
 package comp1110.ass2;

+import java.io.FileWriter;
+import java.io.IOException;
+import java.util.*;
+
 /**
  * This class provides the text interface for the Link Game
  *
  * The game is based directly on Smart Games' IQ-Link game
+ * Written by Alex and Yicong
  * (http://www.smartgames.eu/en/smartgames/iq-link)
  */
 public class LinkGame {
-
     /**
      * Determine whether a piece placement is well-formed according to the following:
      * - it consists of exactly three characters
      * - the first character is in the range A .. X
      * - the second character is in the range A .. L
      * - the third character is in the range A .. F if the second character is A, otherwise
-     *   in the range A .. L
+     * in the range A .. L
+     * Written by Yicong, and rewritten for presentation by Alex.
      *
      * @param piecePlacement A string describing a piece placement
      * @return True if the piece placement is well-formed
      */
     static boolean isPiecePlacementWellFormed(String piecePlacement) {
-        // FIXME Task 3: determine whether a piece placement is well-formed
-        return false;
+        int len = piecePlacement.length();
+        char[] chars = piecePlacement.toCharArray();
+        //judge the range of each character and for the third character has two different situations
+        return len == 3
+            && chars[0] >= 'A'
+            && chars[0] <= 'X'
+            && chars[1] >= 'A'
+            && chars[1] <= 'L'
+            && ((chars[2] >= 'A'
+                    && chars[2] <= 'L'
+                    && chars[1] != 'A')
+                || (chars[2] >= 'A'
+                    && chars[2] <= 'F'
+                    && chars[1] == 'A')
+        );
     }

     /**
      * Determine whether a placement string is well-formed:
-     *  - it consists of exactly N three-character piece placements (where N = 1 .. 12);
-     *  - each piece placement is well-formed
-     *  - no piece appears more than once in the placement
+     * - it consists of exactly N three-character piece placements (where N = 1 .. 12);
+     * - each piece placement is well-formed
+     * - no piece appears more than once in the placement
+     * Written by Yicong.
      *
      * @param placement A string describing a placement of one or more pieces
      * @return True if the placement is well-formed
      */
     static boolean isPlacementWellFormed(String placement) {
-        // FIXME Task 4: determine whether a placement is well-formed
-        return false;
+        if (placement == null || placement.equals("") || placement.length() % 3 != 0)
+            return false;
+
+        String[] s = new String[placement.length() / 3];  //divide the string placement into sets of 3 characters
+
+        for (int i = 0; i < placement.length() / 3; i++)
+            s[i] = placement.substring(i * 3, i * 3 + 3);      //placement to piece
+        for (String str : s)
+            if (!isPiecePlacementWellFormed(str))
+                return false;
+
+        HashSet set = new HashSet();
+
+        for (String str : s)                //hash set without duplicate,compare hash with the length of String array
+            set.add(str.charAt(1));
+        return set.size() == s.length;          // tighter form
+
     }

     /**
@@ -44,38 +78,456 @@
      * piece.
      * The code needs to account for the origin of the piece, the piece shape, and the piece
      * orientation.
+     * Written by Yicong.
+     *
      * @param piecePlacement A valid string describing a piece placement
      * @return An array of integers corresponding to the pegs which the piece placement touches,
      * listed in the normal order of units for that piece.   The value 0 corresponds to
      * peg 'A', 1 to peg 'B', etc.
      */
     static int[] getPegsForPiecePlacement(String piecePlacement) {
-        // FIXME Task 6: determine the pegs touched by a piece placement
-        return null;
+        int[] PegLocations = new int[3];
+        int[] OddNeighbour = {-1, -7, -6, +1, +6, +5};
+        int[] EvenNeighbour = {-1, -6, -5, +1, +7, +6};
+        int br1, br2;
+
+        /*
+             1    2         neighbours records the origin's neighbour pegs in this order,
+          0  origin  3      pay attention that the relationships are not the same
+             5    4         for odd and even rows
+         */
+        int origin = piecePlacement.charAt(0) - 'A';
+        int PieceType = piecePlacement.charAt(1) - 'A';
+        int orientation = piecePlacement.charAt(2) - 'A';
+
+        int row = 1 + origin / 6;           //row 1 2 3 4
+        int col = 1 + origin % 6;           //column 1 2 3 4 5 6
+
+
+        if (orientation < 6) {
+            br1 = (row % 2 == 0) ? (origin + EvenNeighbour[orientation]) : (origin + OddNeighbour[orientation]);
+            if (PieceType < 3)       //which shows a line type
+                br2 = (row % 2 == 0) ? (origin + EvenNeighbour[(orientation + 3) % 6]) : (origin + OddNeighbour[(orientation + 3) % 6]);
+            else if (PieceType < 8)   //a big v type
+                br2 = (row % 2 == 0) ? (origin + EvenNeighbour[(orientation + 2) % 6]) : (origin + OddNeighbour[(orientation + 2) % 6]);
+            else                        // a v type
+                br2 = (row % 2 == 0) ? (origin + EvenNeighbour[(orientation + 1) % 6]) : (origin + OddNeighbour[(orientation + 1) % 6]);
+        } else {
+            orientation = orientation - 6;      //flip change the start like the position 2 will flip to 4, and 1 flip to 5
+            br1 = (row % 2 == 0) ? (origin + EvenNeighbour[orientation]) : (origin + OddNeighbour[orientation]);
+            if (PieceType < 3)
+                br2 = (row % 2 == 0) ? (origin + EvenNeighbour[(orientation + 3) % 6]) : (origin + OddNeighbour[(orientation + 3) % 6]);
+            else if (PieceType < 8)
+                br2 = (row % 2 == 0) ? (origin + EvenNeighbour[(orientation + 4) % 6]) : (origin + OddNeighbour[(orientation + 4) % 6]);
+            else
+                br2 = (row % 2 == 0) ? (origin + EvenNeighbour[(orientation + 5) % 6]) : (origin + OddNeighbour[(orientation + 5) % 6]);
+        }
+
+        // we should judge whether it's off the grid
+        int rowBr1 = br1 / 6 + 1;
+        int colBr1 = br1 % 6 + 1;
+        int rowBr2 = br2 / 6 + 1;
+        int colBr2 = br2 % 6 + 1;
+        //if the column and row are not ajacent or the index out of 0-23 it is off-grid
+        if (Math.abs(rowBr1 - row) > 1 || Math.abs(colBr1 - col) > 1 || br1 > 23 || br1 < 0) {
+            br1 = -1;
+        }
+        if (Math.abs(rowBr2 - row) > 1 || Math.abs(colBr2 - col) > 1 || br2 > 23 || br2 < 0) {
+            br2 = -1;
+        }
+        PegLocations[0] = br1;
+        PegLocations[1] = origin;
+        PegLocations[2] = br2;
+
+
+        return PegLocations;
     }

+    /**
+     * Translates a piece placement string to update peg states.
+     * Indicates whether the piece's segment has a ball or ring, and the directions for openings and connections.
+     * Written by Yicong.
+     *
+     * @param piecePlacement A three-character piece placement string
+     * @return An integer array containing the states for the origin and branch segments
+     */
+    static int[] updatePegsPiecePlacement(String piecePlacement) {
+       /*
+         three states will contain the states for three pegs
+         0-5 for the peg of origin, 6-11 for branch1,12-17 for branch2
+         each 6 digits have the same meaning of the pegs state
+         _ _ _ _ _ _ an int array first 3 for ball and last 3 for ring
+         _ _ _ the first digits 1/0 indicates whether there exists a ball/ring
+         the second and third one indicates the direction of openings and connections
+           2  3
+         1      4
+           6  5
+        */
+        int[] threeStates = new int[18];
+        Piece currPiece = Piece.valueOf(piecePlacement.substring(1, 2)); // initiate the specific piece
+        int orientation = piecePlacement.charAt(2) - 'A';           //orientation is presented as a int in 0-11
+        String[] pieceInfo = currPiece.getPieceInfo();
+        // do for three times to get the state of three components in one piece, the order
+        // the function behind is to update the states of each ball/ring
+        for (int i = 0; i < 3; i++) {
+            if (pieceInfo[3 * i + 2].equals("BALL")) {
+                threeStates[i * 6] = 1;  // the first element indicates whether a ball exists
+                if (orientation <= 5) {                 //rotating if no openings and connections doesn't change,if have openings, openings should rotates
+                    if (!pieceInfo[3 * i + 3].equals("0"))
+                        threeStates[i * 6 + 1] = (Integer.parseInt(pieceInfo[3 * i + 3]) + orientation) % 6;
+                    if (!pieceInfo[3 * i + 4].equals("0"))
+                        threeStates[i * 6 + 2] = (Integer.parseInt(pieceInfo[3 * i + 4]) + orientation) % 6;
+                } else {
+                    orientation = orientation - 6;    // it's a flip, first flip and then rotate for orientation times
+                    // orientation 1,4 no change when flip, 3,5 exchange and 2.6 exchange when flip
+                    // so the orientation 6 indicates flip, other will first flip then rotates
+
+                    // first do for the second element in the state
+                    if (pieceInfo[3 * i + 3].equals("1") || pieceInfo[3 * i + 3].equals("4"))
+                        threeStates[i * 6 + 1] = (Integer.parseInt(pieceInfo[3 * i + 3]) + orientation) % 6;
+                    else if (pieceInfo[3 * i + 3].equals("3"))
+                        threeStates[i * 6 + 1] = (Integer.parseInt(pieceInfo[3 * i + 3]) + 2 + orientation) % 6;
+                    else if (pieceInfo[3 * i + 3].equals("5"))
+                        threeStates[i * 6 + 1] = (Integer.parseInt(pieceInfo[3 * i + 3]) - 2 + orientation) % 6;
+                    else if (pieceInfo[3 * i + 3].equals("2"))
+                        threeStates[i * 6 + 1] = (Integer.parseInt(pieceInfo[3 * i + 3]) + 4 + orientation) % 6;
+                    else if (pieceInfo[3 * i + 3].equals("6"))
+                        threeStates[i * 6 + 1] = (Integer.parseInt(pieceInfo[3 * i + 3]) - 4 + orientation) % 6;
+                    else
+                        //no opening or connection, no change
+                        threeStates[i * 6 + 1] = 0;
+
+                    // then do for the third element in the states, this is just for components with two openings and connections
+                    if (pieceInfo[3 * i + 4].equals("1") || pieceInfo[3 * i + 4].equals("4"))
+                        threeStates[i * 6 + 2] = (Integer.parseInt(pieceInfo[3 * i + 4]) + orientation) % 6;
+                    else if (pieceInfo[3 * i + 4].equals("3"))
+                        threeStates[i * 6 + 2] = (Integer.parseInt(pieceInfo[3 * i + 4]) + 2 + orientation) % 6;
+                    else if (pieceInfo[3 * i + 4].equals("5"))
+                        threeStates[i * 6 + 2] = (Integer.parseInt(pieceInfo[3 * i + 4]) - 2 + orientation) % 6;
+                    else if (pieceInfo[3 * i + 4].equals("2"))
+                        threeStates[i * 6 + 2] = (Integer.parseInt(pieceInfo[3 * i + 4]) + 4 + orientation) % 6;
+                    else if (pieceInfo[3 * i + 4].equals("6"))
+                        threeStates[i * 6 + 2] = (Integer.parseInt(pieceInfo[3 * i + 4]) - 4 + orientation) % 6;
+                    else
+                        threeStates[i * 6 + 2] = 0;
+
+                    orientation = orientation + 6;
+                }
+                if (threeStates[i * 6 + 1] == 0 && (!pieceInfo[i * 3 + 3].equals("0")))
+                    threeStates[i * 6 + 1] = 6;
+                if (threeStates[i * 6 + 2] == 0 && (!pieceInfo[i * 3 + 4].equals("0")))
+                    threeStates[i * 6 + 2] = 6;
+            } else {
+                // if the component is a ring, the same thing but the update 3,4,5 of the state array
+                threeStates[i * 6 + 3] = 1;
+                if (orientation <= 5) {
+                    if (!pieceInfo[3 * i + 3].equals("0"))
+                        threeStates[i * 6 + 4] = (Integer.parseInt(pieceInfo[3 * i + 3]) + orientation) % 6;
+                    if (!pieceInfo[3 * i + 4].equals("0"))
+                        threeStates[i * 6 + 5] = (Integer.parseInt(pieceInfo[3 * i + 4]) + orientation) % 6;
+                } else {
+                    orientation = orientation - 6;
+                    if (pieceInfo[3 * i + 3].equals("1") || pieceInfo[3 * i + 3].equals("4"))
+                        threeStates[i * 6 + 4] = (Integer.parseInt(pieceInfo[3 * i + 3]) + orientation) % 6;
+                    else if (pieceInfo[3 * i + 3].equals("3"))
+                        threeStates[i * 6 + 4] = (Integer.parseInt(pieceInfo[3 * i + 3]) + 2 + orientation) % 6;
+                    else if (pieceInfo[3 * i + 3].equals("5"))
+                        threeStates[i * 6 + 4] = (Integer.parseInt(pieceInfo[3 * i + 3]) - 2 + orientation) % 6;
+                    else if (pieceInfo[3 * i + 3].equals("2"))
+                        threeStates[i * 6 + 4] = (Integer.parseInt(pieceInfo[3 * i + 3]) + 4 + orientation) % 6;
+                    else if (pieceInfo[3 * i + 3].equals("6"))
+                        threeStates[i * 6 + 4] = (Integer.parseInt(pieceInfo[3 * i + 3]) - 4 + orientation) % 6;
+                    else
+                        threeStates[i * 6 + 4] = 0;
+                    if (pieceInfo[3 * i + 4].equals("1") || pieceInfo[3 * i + 4].equals("4"))
+                        threeStates[i * 6 + 5] = (Integer.parseInt(pieceInfo[3 * i + 4]) + orientation) % 6;
+                    else if (pieceInfo[3 * i + 4].equals("3"))
+                        threeStates[i * 6 + 5] = (Integer.parseInt(pieceInfo[3 * i + 4]) + 2 + orientation) % 6;
+                    else if (pieceInfo[3 * i + 4].equals("5"))
+                        threeStates[i * 6 + 5] = (Integer.parseInt(pieceInfo[3 * i + 4]) - 2 + orientation) % 6;
+                    else if (pieceInfo[3 * i + 4].equals("2"))
+                        threeStates[i * 6 + 5] = (Integer.parseInt(pieceInfo[3 * i + 4]) + 4 + orientation) % 6;
+                    else if (pieceInfo[3 * i + 4].equals("6"))
+                        threeStates[i * 6 + 5] = (Integer.parseInt(pieceInfo[3 * i + 4]) - 4 + orientation) % 6;
+                    else
+                        threeStates[i * 6 + 5] = 0;
+                    orientation = orientation + 6;
+                }
+                //states should contains direction of 1 2 3 4 5 6 but 6%6=0 so if it is 6, the chance is that it should be 6 not zero
+                if (threeStates[i * 6 + 4] == 0 && (!pieceInfo[i * 3 + 3].equals("0")))
+                    threeStates[i * 6 + 4] = 6;
+                if (threeStates[i * 6 + 5] == 0 && (!pieceInfo[i * 3 + 4].equals("0")))
+                    threeStates[i * 6 + 5] = 6;
+            }
+        }
+        return threeStates;
+    }

     /**
      * Determine whether a placement is valid.  To be valid, the placement must be well-formed
      * and each piece must correctly connect with each other.
+     * Written by Yicong.
      *
      * @param placement A placement string
      * @return True if the placement is valid
      */
-    static boolean isPlacementValid(String placement) {
-        // FIXME Task 7: determine whether a placement is valid
-        return false;
+    public static boolean isPlacementValid(String placement) {
+        // first set all the pegs states is{0,0,0,0,0,0}
+         int[] pegStates=new int[6];
+         Pegs a= new Pegs(pegStates);     Pegs b= new Pegs(pegStates);  Pegs c= new Pegs(pegStates);   Pegs d= new Pegs(pegStates);
+         Pegs e= new Pegs(pegStates);     Pegs f= new Pegs(pegStates);  Pegs g= new Pegs(pegStates);   Pegs h= new Pegs(pegStates);
+         Pegs ii= new Pegs(pegStates);    Pegs jj= new Pegs(pegStates); Pegs kk= new Pegs(pegStates);  Pegs l= new Pegs(pegStates);
+         Pegs m= new Pegs(pegStates);     Pegs n= new Pegs(pegStates);  Pegs o= new Pegs(pegStates);   Pegs p= new Pegs(pegStates);
+         Pegs q= new Pegs(pegStates);     Pegs r= new Pegs(pegStates);  Pegs s= new Pegs(pegStates);   Pegs t= new Pegs(pegStates);
+         Pegs u= new Pegs(pegStates);     Pegs v= new Pegs(pegStates);  Pegs w= new Pegs(pegStates);   Pegs x= new Pegs(pegStates);
+         Pegs[] pegs = {a,b,c,d,e,f,g,h,ii,jj,kk,l,m,n,o,p,q,r,s,t,u,v,w,x};
+
+        if (!isPlacementWellFormed(placement))
+            return false;
+        else {
+            String[] str = new String[placement.length() / 3];  //divide the string placement into sets of 3 characters
+            for (int mm= 0; mm < placement.length() / 3; mm++)
+                str[mm] = placement.substring(mm * 3, mm * 3 + 3);      //placement to piece
+
+            for (String piecePlacement : str) {
+                int[] pegIndex = getPegsForPiecePlacement(piecePlacement);   // get the peg number for each piece, the order is br1,origin,br2
+                for(int pegPosition:pegIndex)
+                    if(pegPosition<0||pegPosition>23)            //off-grid is not good
+                        return false;
+
+                int temp=pegIndex[0];
+                pegIndex[0]=pegIndex[1];
+                pegIndex[1]=temp;
+
+                 //exchange the position of br1 and origin to make the order become origin,br1,br2, the same with threeStates from updatePegsState
+                int[] updateStates=updatePegsPiecePlacement(piecePlacement);
+                for(int i=0;i<3;i++) {       // do for three components
+                    int index= pegIndex[i];
+                    int[] currStates=pegs[index].getStateArray();    //the current states of the peg
+                    int[] updatePegStates= Arrays.copyOfRange(updateStates,i*6,i*6+6);  //the states for each component
+                    if(updatePegStates[0]==1)                //the component is a ball
+                    {
+                        // the current states shouldn't involve a ball
+                        if (currStates[0]==0) {
+                            if(currStates[3]==0||(currStates[3]==1&&(currStates[4]==updatePegStates[1]&&currStates[5]==updatePegStates[2])||(currStates[4]==updatePegStates[2]&&currStates[5]==updatePegStates[1]||(currStates[4]==updatePegStates[1]&&updatePegStates[2]==0)||(currStates[5]==updatePegStates[1]&&updatePegStates[2]==0)))) {
+                                  //the current states can involve a ring with the same direction. notice that the order of the two openings doesn't matter.
+                                 // so the judgement involve two different situations
+                                System.arraycopy(currStates, 3, updatePegStates, 3, 3);
+                                pegs[index].updateStates(updatePegStates);
+
+                                //change the pegs states
+
+                            } else
+                                return false;
+                        } else
+                            return false;
+                    } else if(updatePegStates[3]==1) {       //ring is also the same
+                        if (currStates[3]==0) {
+                            if(currStates[0]==0||(currStates[0]==1&&(currStates[1]==updatePegStates[4]&&currStates[2]==updatePegStates[5])||(currStates[1]==updatePegStates[5]&&currStates[2]==updatePegStates[4]||(currStates[1]==updatePegStates[4]&&currStates[2]==0)||(currStates[1]==updatePegStates[5]&&currStates[2]==0)))) {
+                                System.arraycopy(currStates, 0, updatePegStates, 0, 3);
+                                pegs[index].updateStates(updatePegStates);
+                            } else
+                                return false;
+                        } else
+                            return false;
+
+                    }
+                }
+            }
+            return true;
+        }
     }

     /**
      * Return an array of all solutions given a starting placement.
+     * Written by Alex.
      *
      * @param placement  A valid piece placement string.
      * @return An array of strings, each describing a solution to the game given the
-     * starting point provied by placement.
+     * starting point provided by placement.
      */
-    static String[] getSolutions(String placement) {
-        // FIXME Task 10: determine all solutions to the game, given a particular starting placement
-        return null;
+    public static String[] getSolutions(String placement) {
+        ArrayList<String> solutions = new ArrayList<>();
+
+//        System.out.println("Given placement "+placement);
+
+        // Cheat a little bit by starting our search after the last piece given.
+        /* if (placement.length() != 0) {
+            char lastPiece = placement.charAt(placement.length() - 2);
+            findSolution(lastPiece, placement, solutions);
+        } else*/ findSolution('A', placement, solutions);
+
+//        System.out.println();
+//        System.out.println("Solutions:");
+//        solutions.forEach(System.out::println);
+//        System.out.println();
+
+        // Return the solutions as an array rather than a list.
+        String[] solutionString = new String[solutions.size()];
+        for (int i = 0; i < solutions.size(); i++) solutionString[i] = solutions.get(i);
+        return solutionString;
+    }
+
+    /**
+     * Finds all solutions to a given placement string and stores them in a provided array list.
+     * Recurses on itself to pass continually built placement strings and solution arrays.
+     * Structure inspired by Bob Carpenter, adapted by Alex.
+     *  https://bob-carpenter.github.io/games/sudoku/java_sudoku.html
+     *
+     * @param piece The initial piece to start searching from.
+     * @param placement The initial valid piece placement string.
+     * @param solutions The (potentially empty) array of solution strings, which will be written to.
+     * @return True if a solution has been found, or false otherwise.
+     */
+    private static boolean findSolution(char piece, String placement, ArrayList<String> solutions) {
+        // When we hit a full string, check if it's valid (which it should be anyway, but it doesn't hurt to double
+        // check), and unique to what's already found.
+        if (placement.length() == 36) {
+            if(isPlacementWellFormed(placement) && isPlacementValid(placement) && !solutions.contains(placement)) {
+                // Write out results to solutions.txt.
+//                FileWriter writer = null;
+//                try {
+//                    writer = new FileWriter("assets/solutions.txt", true);
+//                    writer.write(placement);
+//                } catch (IOException e) { e.printStackTrace(); }
+//                finally {
+//                    try {
+//                        if (writer != null)
+//                            writer.close();
+//                    } catch (IOException e) { e.printStackTrace(); }
+//                }
+                solutions.add(placement);
+            }
+//            return true;
+            /*
+              Returning true here prevents the algorithm from recursing once it finds a result. This is a good and bad thing.
+              On one hand, it will stop as soon as it finds the first result, giving a much faster return on one-solution systems.
+              On the other hand, it obviously won't find every solution if there is more than one.
+             */
+        }
+
+        // Just a quick way to check what pegs are valid.
+        ArrayList<Character> openPegs = new ArrayList<>();
+        ArrayList<Character> usedPieces = new ArrayList<>();
+        // These pieces are closed rings and can't have any other segment share the same peg.
+        List ringPieces = Arrays.asList('B','C','D','E','F','H');
+
+        for (char p = 'A'; p <= 'X'; p++)
+            openPegs.add(p);
+        for (int i = 0; i < placement.length() / 3; i++) {
+            usedPieces.add(placement.charAt(i * 3 + 1));
+            if (ringPieces.contains(placement.charAt(i * 3 + 1)))
+                openPegs.remove(Character.valueOf(placement.charAt(i*3)));
+        }
+
+        // Don't use anything already on the board.
+        if (usedPieces.contains(piece)) {
+            return findSolution(++piece, placement, solutions);
+        }
+
+        /*
+          Fairly straight-forward recursion. For a given piece, for each peg and rotation combo, check if the piece will
+          fit into the provided placement. If it does, then restart the process with the added piece. Since a valid
+          solution will return true, the return will propagate all the way down to the first added piece call.
+         */
+        for (char peg : openPegs) {
+            for (char rot = 'A'; rot <= 'L'; rot++) {
+                String toPlace = "" + peg + piece + rot;
+                if (isPlacementValid(placement + toPlace)) {
+                    if (findSolution(piece, placement + toPlace, solutions))
+                        return true;
+                }
+            }
+        }
+
+        // If it hits this, then a piece doesn't fit. If one piece doesn't fit, there won't be a solution. At that point,
+        // there's no point continuing.
+        return false;
+    }
+
+    /**
+     * Finds a list of placements that uniquely give the provided solution.
+     * NOT exhaustive; it runs a few iterations of removing a RANDOM piece to find placements.
+     * Written by Alex.
+     *
+     * @param solution A valid solution string.
+     * @return True if a placement is minimal (i.e., 4 pieces long), and false otherwise.
+     */
+    private static boolean findUniqueStart (String solution, ArrayList<String> uniquePlacements) {
+        int iterations = 4;
+
+        if (solution.length() <= 9)
+            return true;   // Stops us from testing 3-piece placements, which take forever.
+
+        for (int c = 0; c < iterations; c++) {
+            String tmp = removeRandomPiece(solution);   // Remove a piece.
+            if (getSolutions(tmp).length == 1) {        // Check if the updated placement has only one solution.
+                uniquePlacements.add(tmp);
+                System.out.println(tmp);
+                if (findUniqueStart(tmp, uniquePlacements))                // Recurse.
+                    return true;
+            }
+        }
+
+        System.out.println(uniquePlacements);            // No more placements, so let's print them.
+        return false;
+    }
+
+    /**
+     * Helper method for findUniqueStart. Removes a random piece from a solution string.
+     *
+     * @param solution A valid solution string.
+     * @return The same solution string, sans one piece.
+     */
+    private static String removeRandomPiece(String solution) {
+        Random r = new Random();
+        List<String> splitPieces = new ArrayList<>();
+        for (int i = 0; i < solution.length() / 3; i ++) {
+            splitPieces.add(solution.substring(i * 3, i * 3 + 3));
+        }
+
+        splitPieces.remove(r.nextInt(splitPieces.size()));
+        String rtn = "";
+        for (String s : splitPieces) {
+            rtn += s;
+        }
+
+        return rtn;
+    }
+
+    /**
+     * Helper method for findUniqueStart. Removes a given piece from a solution string.
+     *
+     * @param solution A valid solution string.
+     * @param piece A piece character.
+     * @return The same solution string, sans the provided piece.
+     */
+    private static String removePiece(String solution, char piece) {
+        List<String> splitPieces = new ArrayList<>();
+        for (int i = 0; i < solution.length() / 3; i ++) {
+            splitPieces.add(solution.substring(i * 3, i * 3 + 3));
+        }
+
+        String rtn = "";
+        for (String s : splitPieces)
+            if (s.charAt(1) != piece)
+                rtn += s;
+
+        return rtn;
+    }
+
+    public static void main(String[] args) {
+        long init = System.nanoTime();
+        String solution = "";
+        String placement = "BAAJEJHHDRFE";
+//        ArrayList<String> placements = new ArrayList<>();
+//        findUniqueStart(solution, placements);
+//        System.out.println(placements);
+
+//        System.out.println(isPlacementValid("BAAEBDVCJODDHEAMFKPGLLHHIICKJGWKCNLE"));
+
+        System.out.println(Arrays.toString(getSolutions(placement)));
+
+        System.out.println("Total time: "+((System.nanoTime() - init) / 1000000)+"ms");
     }
 }
Only in comp1110-ass2/src/comp1110/ass2: Orientation$1.class
Only in comp1110-ass2/src/comp1110/ass2: Orientation$2.class
Only in comp1110-ass2/src/comp1110/ass2: Orientation$3.class
Only in comp1110-ass2/src/comp1110/ass2: Orientation$4.class
Only in comp1110-ass2/src/comp1110/ass2: Orientation$5.class
Only in comp1110-ass2/src/comp1110/ass2: Orientation$6.class
Only in comp1110-ass2/src/comp1110/ass2: Orientation$7.class
Only in comp1110-ass2/src/comp1110/ass2: Orientation.class
Only in comp1110-ass2/src/comp1110/ass2: Orientation.java
Only in comp1110-ass2/src/comp1110/ass2: Pegs.class
Only in comp1110-ass2/src/comp1110/ass2: Pegs.java
Only in comp1110-ass2/src/comp1110/ass2: Piece.class
Only in comp1110-ass2/src/comp1110/ass2: Piece.java
Only in comp1110-ass2/src/comp1110/ass2: PieceLocation.class
Only in comp1110-ass2/src/comp1110/ass2: PieceLocation.java
Only in comp1110-ass2/src/comp1110/ass2: PieceSegment.class
Only in comp1110-ass2/src/comp1110/ass2: PieceSegment.java
Only in comp1110-ass2/src/comp1110/ass2: PieceType.class
Only in comp1110-ass2/src/comp1110/ass2: PieceType.java
Only in comp1110-ass2/src/comp1110/ass2/gui: Board$FXPiece.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Board$ImageButton.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Board$LockedPiece.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Board.class
diff -ru -x .git ../master/comp1110-ass2/src/comp1110/ass2/gui/Board.java comp1110-ass2/src/comp1110/ass2/gui/Board.java
--- ../master/comp1110-ass2/src/comp1110/ass2/gui/Board.java	2016-10-14 12:45:36.000000000 +1100
+++ comp1110-ass2/src/comp1110/ass2/gui/Board.java	2016-10-14 12:47:07.000000000 +1100
@@ -1,22 +1,743 @@
 package comp1110.ass2.gui;

+import comp1110.ass2.Pegs;
 import javafx.application.Application;
+import javafx.scene.Group;
+import javafx.scene.Node;
+import javafx.scene.Scene;
+import javafx.scene.control.Button;
+import javafx.scene.image.Image;
+import javafx.scene.image.ImageView;
+import javafx.scene.input.KeyCode;
+import javafx.scene.media.Media;
+import javafx.scene.media.MediaPlayer;
+import javafx.scene.paint.Color;
+import javafx.scene.shape.Circle;
+import javafx.scene.shape.Rectangle;
+import javafx.scene.text.Font;
+import javafx.scene.text.Text;
 import javafx.stage.Stage;
+import javafx.util.Duration;
+
+import java.io.*;
+import java.nio.charset.Charset;
+import java.util.*;
+
+import static comp1110.ass2.LinkGame.getSolutions;
+import static comp1110.ass2.LinkGame.isPlacementValid;

 public class Board extends Application {
+    // Game board size variables
     private static final int BOARD_WIDTH = 933;
     private static final int BOARD_HEIGHT = 700;
+    private static final int SQUARE_SIZE = 80;
+    private static final int CIRCLE_SIZE = (int) (SQUARE_SIZE * 0.3);
+    private static final int PIECE_IMAGE_SIZE = 3*SQUARE_SIZE;
+    private static final double ROW_HEIGHT = SQUARE_SIZE * 0.8660254; // 60 degrees
+    private static final int X_BORDER = 230 - PIECE_IMAGE_SIZE / 2;
+    private static final int Y_BORDER = 250 - PIECE_IMAGE_SIZE / 2;
+
+    private static final String URI_BASE = "assets/";
+
+    // Group declarations
+    private final Group root = new Group();
+    private final Group pieces = new Group();
+    private final Group pegs = new Group();
+    private final Group controls = new Group();
+    private final Group hints = new Group();
+    private final Group warnings = new Group();
+    private final Group instructions = new Group();
+
+    private final Pegs[] board = new Pegs[24];
+    private final ArrayList<Circle> pegList = new ArrayList<>();
+    private String placement = "";
+    private ArrayList<String> solutions = new ArrayList<>();
+    private String startPlacement = "";
+    private boolean dynamicHints = false;
+
+    private static Stage primaryStage;
+    private Scene startScene, mainScene;
+
+    /*
+      Solutions array is set up as solution, easy, hard, expert [placements].
+      Easy placements have 9 pieces, hard placements have 6 pieces, and expert placements have 4 pieces.
+      Placements have been made by hand, but given time and processing power, could be generated using findUniqueSolution
+        in LinkGame.
+      Any solutions not starting with BAA are taken from Steve Blackburn.
+     */
+    private final String[][] solutionSet = {
+        //  SOLUTION                                    EASY                            HARD                    EXPERT
+            {"GAEWBABCDJDALEFMFCCGLUHBTIAQJCKKBILF",    "WBABCDMFCCGLUHBTIAQJCKKBILF",  "WBACGLTIAQJCKKBILF",   "WBACGLQJCKKB"},
+            {"BAAEBDVCJKDGSEBLFFWGBGHLNIKIJAPKFQLA",    "BAAEBDVCJKDGSEBLFFWGBGHLIJA",  "BAAEBDVCJKDGSEBLFF",   "BAAEBDVCJKDG"},
+            {"BAAEBDVCJODDHEAMFKPGLLHHIICKJGWKCNLE",    "BAAEBDVCJODDHEAMFKPGLLHHIIC",  "BAAEBDVCJODDHEAMFK",   "BAAEBDVCJODD"},
+            {"BAAEBGWCAGDFJEJRFEVGISHBLIHIJAUKHOLA",    "BAAEBGWCAGDFJEJRFEVGISHBLIH",  "BAAEBGWCAGDFJEJSHB",   "BAAJEJWCASHB"},
+            {"BAAEBGUCAGDFLEHWFBPGGSHBNICKJEIKKHLJ",    "BAAEBGUCAGDFLEHWFBPGGSHBHLJ",  "BAAUCALEHPGGSHBHLJ",   "BAAEBGPGGHLJ"},
+            {"BAAEBGWCAGDFJEJRFEVGIHHDLIHSJIUKHPLH",    "BAAEBGWCAJEJRFEVGIHHDLIHSJI",  "BAAWCARFEHHDLIHSJI",   "BAAJEJHHDRFE"}
+    };
+    // Another to format: [BAAEBGWCAGDFJEJRFEHHDLIHSJIUKHPLH, BAAEBGWCAGDFJEJRFELIHSJIUKHPLH, BAAEBGGDFJEJRFELIHSJIUKHPLH, BAAEBGGDFJEJRFESJIUKHPLH, BAAGDFJEJRFESJIUKHPLH, BAAGDFJEJRFESJIUKH, BAAJEJRFESJIUKH, BAAEBGGDFJEJRFESJIUKH, BAAEBGGDFJEJRFESJI, BAAEBGGDFRFESJI, BAAEBGJEJRFESJI, BAAJEJRFESJI, BAAEBGRFESJI, BAAEBGRFESJI, BAAEBGGDFJEJRFESJI, BAAGDFJEJRFESJI, BAAJEJRFESJI, BAAEBGGDFRFESJI, BAAEBGRFESJI, BAAEBGGDFRFESJI] BAAEBGGDFJEJRFESJI BAAEBGJEJRFESJI BAAEBGRFESJI
+
+    /**
+     * The driving class behind the game. Contains anything to do with manipulating or querying a piece.
+     * Written by Alex, except where noted.
+     * Initial inspiration for event methods taken from Steve Blackburn.
+     */
+    private class FXPiece extends ImageView {
+        char id;
+        int initX, initY;
+        double mouseX, mouseY;
+        int position;
+
+        /**
+         * Instantiates a piece.
+         *
+         * @param id A character ID between A and L inclusive, corresponding to the piece.
+         */
+        FXPiece(char id) {
+            if (id > 'L') throw new IllegalArgumentException("Invalid piece id: " + id);
+            this.id = id;
+            setImage(new Image(Viewer.class.getResource(URI_BASE + id + ".png").toString()));
+            setFitHeight(PIECE_IMAGE_SIZE);
+            setFitWidth(PIECE_IMAGE_SIZE);
+            findInitialPlacement();
+
+            setLayoutX(initX);
+            setLayoutY(initY);
+
+            setOnMousePressed(e -> {
+                mouseX = e.getSceneX() - PIECE_IMAGE_SIZE / 2;  // we want to manipulate from the centre of the piece,
+                mouseY = e.getSceneY() - PIECE_IMAGE_SIZE / 2;  // not the corner (which is transparent)
+            });
+
+            setOnMouseDragged(e -> {
+                setLayoutX(mouseX);
+                setLayoutY(mouseY);
+                mouseX = e.getSceneX() - PIECE_IMAGE_SIZE / 2;
+                mouseY = e.getSceneY() - PIECE_IMAGE_SIZE / 2;
+                warnings.getChildren().clear();                 // no point warning someone about something that doesn't matter
+                requestFocus();
+            });
+
+            setOnMouseReleased(e -> snapPeg());
+
+            setOnKeyPressed(e -> {                              // due to limitations in the engine, pieces must first be dragged
+                if (e.getCode() == KeyCode.E)                   // before they can be rotated or flipped
+                    rotatePiece(-1);
+                if (e.getCode() == KeyCode.R)
+                    rotatePiece(1);
+                if (e.getCode() == KeyCode.F)
+                    flipPiece();
+            });
+
+            setOnScroll(e -> rotatePiece(1) );                  // alternate control to rotate piece
+        }
+
+        /**
+         * Querying methods.
+         */
+        int getPosition() { return this.position; }
+        boolean isFlipped() { return getScaleY() == -1; }
+        /**
+         * Sets the position component of the piece's data. Numbered 1 to 24, starting from the top left and working
+         *  left to right, top to bottom. -1 is off the board.
+         * @param pos The position integer.
+         */
+        void setPosition(int pos) {
+            if (pos > 24) throw new IndexOutOfBoundsException("Invalid position coordinate.");
+            else
+                this.position = pos;
+        }
+
+        /**
+         * Fetch method for the initial placement of a piece. Four pieces along the top and bottom, and two
+         *  on either side.
+         */
+        private void findInitialPlacement() {
+            int mod = id - 'A';
+            if (mod < 4) {
+                initX = mod * 2 * SQUARE_SIZE + SQUARE_SIZE * 3 / 2;
+                if (mod % 2 != 0) initY = 40;
+                else initY = -40;
+            } else if (mod < 6) {
+                initX = 0;
+                initY = PIECE_IMAGE_SIZE * 2 / 3 * (mod - 3);
+            } else if (mod < 8) {
+                initX = BOARD_WIDTH - PIECE_IMAGE_SIZE + SQUARE_SIZE / 3;
+                initY = PIECE_IMAGE_SIZE * 2 / 3 * (mod - 5);
+            } else {
+                initX = (mod - 8) * 2 * SQUARE_SIZE + SQUARE_SIZE * 3 / 2;
+                initY = BOARD_HEIGHT - SQUARE_SIZE * 5 / 2;
+            }
+        }
+
+        /**
+         * Visually rotates a piece and adds its info to the placement string. Visualises a warning on an incorrect
+         *  placement.
+         * @param modifier Index to rotate piece by. Will rotate the piece clockwise by 60 degrees multiplied by the
+         *                 modifier. Can be negative.
+         */
+        private void rotatePiece(int modifier) {
+            warnings.getChildren().clear();
+            setRotate((getRotate() + 60 * modifier) % 360);
+            if (pieceOverlaps())
+                setWarning();
+        }
+
+        /**
+         * Visually flips a piece and clears any warnings.
+         */
+        private void flipPiece() {
+            warnings.getChildren().clear();
+            setScaleY(getScaleY() * -1);
+            if (pieceOverlaps())
+                setWarning();
+        }
+
+        /**
+         * Method to find the distance from a piece to a circle/peg.
+         * @param c The circle to find the distance to.
+         * @return Geometric distance.
+         */
+        private double getDistanceTo(Circle c) {
+            double x = c.getLayoutY();
+            double y = c.getCenterY();
+            return Math.sqrt( (x - getLayoutX())*(x - getLayoutX()) + (y - getLayoutY())*(y - getLayoutY()));
+        }
+
+        /**
+         * Alternate method to find distance from a piece to a point.
+         * @param x X coordinate of the location to be measured to.
+         * @param y Matching Y coordinate.
+         * @return Geometric distance to the point.
+         */
+        private double getDistanceTo(double x, double y) {
+            x -= PIECE_IMAGE_SIZE / 2;
+            y -= PIECE_IMAGE_SIZE / 2;
+            return Math.sqrt( (x - getLayoutX())*(x - getLayoutX()) + (y - getLayoutY())*(y - getLayoutY()));
+        }
+
+        /**
+         * Finds the nearest peg to use with snapping a piece.
+         * @return The closest circle.
+         */
+        private Circle getNearestPeg() {
+            Circle n = null;
+            double d = 1000;
+            int i = 0;
+            for (Circle c : pegList) {
+                double distance = getDistanceTo(c.getLayoutX(), c.getLayoutY());
+                if ( distance < d) {
+                    d = distance;
+                    n = c;
+                    this.position=i;
+                }
+                i = i + 1;
+            }
+            return n;
+        }
+
+        /**
+         * Places a piece centred on a peg rather than where the player lets go of the piece.
+         */
+        private void snapPeg() {
+            Circle n = getNearestPeg();
+
+            setLayoutX(n.getLayoutX() - PIECE_IMAGE_SIZE / 2);
+            setLayoutY(n.getLayoutY() - PIECE_IMAGE_SIZE / 2);
+
+            if (pieceOverlaps())
+                snapHome();
+        }
+
+        /**
+         * Draw a warning image if the player places an incorrect piece.
+         * Written by Yicong.
+         */
+        private void setWarning()
+        {
+            ImageView warning=new ImageView(new Image(Board.class.getResource(URI_BASE+"warning.jpg").toString()));
+            warning.setLayoutX(380);
+            warning.setLayoutY(0);
+            warnings.getChildren().add(warning);
+
+        }
+
+        /**
+         * Checks whether or not a placed piece overlaps a piece that is already placed.
+         * @return True if the piece is invalid, false otherwise.
+         */
+        private boolean pieceOverlaps() {
+            String currPlacement = "";
+            for (Node p : pieces.getChildren()) {
+                if (!p.toString().equals(""))
+                    currPlacement += p.toString();
+            }
+           // System.out.println(currPlacement);
+            if (isPlacementValid(currPlacement)) {
+                placement = currPlacement;
+                if (currPlacement.length() == 36)
+                    setVictoryScene();
+                if (currPlacement.length() >= 18) { // Can almost do 21, but there's a bit of lag when placing (0.3s computation time)
+                    String[] tmpSolutions = getSolutions(currPlacement);
+                    if (tmpSolutions.length > 0 && dynamicHints)
+                        loadHints(tmpSolutions[0]);
+                }
+                return false;
+            }
+            else
+                return true;
+        }
+
+        /**
+         * Modularising the returning home mechanic used in snapGrid and snapPeg.
+         */
+        private void snapHome() {
+            setPosition(-1);
+            setLayoutX(initX);
+            setLayoutY(initY);
+        }
+
+        /**
+         * Return a positive angle
+         * Written by Yicong.
+         * @return if angle<0, then make it a positive angle for mode calculation.
+         */
+        private double positiveOrientation(double angle) {
+            while(angle < 0)
+                angle += 360;
+            return angle;
+        }
+        /**
+         * Converts a piece to a string.
+         * Written by Yicong.
+         * @return The three-character string that a piece is referred to by in LinkGame's arguments.
+         */
+        public String toString() {
+            char orientation = (char) ('A' + (int)( (positiveOrientation(getRotate())/ 60)%6));
+            if (isFlipped())
+                orientation = (char) (orientation + 6);
+            return (getPosition() == -1) ? "" : "" + (char) ('A' + getPosition()) + id + orientation;
+        }
+    }
+
+    /**
+     * A subclass of FXPiece that disables any movement commands on the piece. Used for initial placements.
+     * Written by Alex.
+     */
+    private class LockedPiece extends FXPiece {
+        LockedPiece(char id, int xPeg, int yPeg, int rotate, int flip) throws IllegalArgumentException {
+            super(id);
+            int xOffset = 0;
+            if (yPeg % 2 != 0) xOffset += SQUARE_SIZE / 2;
+            initY = (int) (yPeg * ROW_HEIGHT + Y_BORDER);
+            initX = xPeg * SQUARE_SIZE + X_BORDER + xOffset;
+
+            setLayoutX(initX);
+            setLayoutY(initY);
+            setRotate(rotate * 60);
+            setScaleY(flip);
+
+            setOnMousePressed(e -> {});
+            setOnMouseDragged(e -> {});
+            setOnMouseReleased(e -> {});
+            setOnScroll(e -> {});
+        }
+    }
+
+    /**
+     * Creates the board for playing on. Draws 24 circles and initialises the board container.
+     * Written by Yicong, optimised by Alex for readability and dynamicity.
+     */
+    private void createBoard() {
+        int[] blank = {0,0,0,0,0,0};
+        for (int i = 0; i < 24; i++) {
+            board[i]=new Pegs(blank);
+            board[i].updateStates(blank);
+        }
+
+        for (int row = 0; row < 4; row++) {
+            for (int col = 0; col < 6; col++) {
+                double y = (row * ROW_HEIGHT ) + PIECE_IMAGE_SIZE / 2 + Y_BORDER;
+                int xOffset = 0;
+                if (row % 2 != 0) xOffset += SQUARE_SIZE / 2;
+                double x = (col * SQUARE_SIZE) + PIECE_IMAGE_SIZE / 2 + X_BORDER + xOffset;
+
+                Circle a = new Circle(0, 0, CIRCLE_SIZE, Color.LIGHTGRAY);
+                a.setLayoutX(x);
+                a.setLayoutY(y);
+                pegs.getChildren().add(a);
+                pegList.add(a);
+            }
+        }
+    }
+
+    /**
+     * Given a solution string, sets the global initial placement string to a random substring of the solution.
+     * Written by Yicong and added to by Alex.
+     *
+     * @param n Number of pieces to place.
+     */
+    private void makeinitialPlacement(String solution, int n) {
+        primaryStage.setScene(mainScene);
+        if (n == 0)
+            placement = "";
+        else {
+            List<String> so1 = new ArrayList<>();   //so1 contains 12 different piece placement in order
+            List<Boolean> state = new ArrayList<>();  //if it used,then it is true;
+            Random r = new Random();
+            int order;
+
+            for (int i = 0; i < solution.length() / 3; i++) {
+                so1.add(solution.substring(3 * i, 3 * i + 3));
+                state.add(false);
+            }
+
+            for (int j = 0; j < n; j++) {
+                do order = r.nextInt(12);                //pick 6 pieces randomly
+                    while (state.get(order));
+                state.set(order, true);
+                placement += so1.get(order);      //get the placement
+            }
+
+            startPlacement = placement;
+        }
+    }
+
+    /**
+     * Another helper method. Intended for use with generation solutions.
+     * Written by Alex.
+     *
+     * @param difficulty An integer 0 to 2 for easy through expert difficulties, or 3 for free-form
+     */
+    private void makeInitialPlacement(int difficulty) {
+        if (difficulty > 3)
+            throw new IllegalArgumentException("Invalid difficulty " + difficulty);
+
+        // Reset solution list on a new game.
+        while (solutions.size() > 0)
+            solutions.remove(0);
+
+        Random r = new Random();
+        int s;
+
+        if (difficulty == 3) {
+            placement = "";
+            dynamicHints = true;
+        } else {
+            s = r.nextInt(solutionSet.length);
+            placement = solutionSet[s][difficulty + 1];
+            solutions.add(solutionSet[s][0]);
+            loadHints(solutionSet[s][0]);
+        }
+        startPlacement = placement;
+        primaryStage.setScene(mainScene);
+        pieces.getChildren().clear();
+        createLockedPieces(placement, pieces, true);
+    }
+
+    /**
+     * Creates a set of locked pieces given a placement string.
+     * Written by Yicong and modularised by Alex.
+     *
+     * @param placement A valid placement string.
+     * @param g The group to add the pieces to.
+     * @param allPieces If true, will place all pieces not in the placement string in their initial positions, unlocked.
+     */
+    private void createLockedPieces(String placement, Group g, boolean allPieces) {
+        if (!placement.equals("")&&!isPlacementValid(placement))
+            throw new IllegalArgumentException("Not a valid placement string for createLockedPieces");
+        Map<Character,String> placementMap = new HashMap<>();
+        for (int i = 0; i < placement.length() / 3; i++)
+            placementMap.put(placement.charAt(3*i+1), placement.substring(3*i,3*i+3));
+
+        for (char p = 'A'; p <= 'L'; p++) {
+            if (placementMap.containsKey(p)) {
+                String pieces = placementMap.get(p);
+                int location = pieces.charAt(0) - 'A';
+                int rotation = pieces.charAt(2) - 'A';
+                int flip = rotation > 5 ? -1 : 1;
+                int yPeg = location / 6;
+                int xPeg = location % 6;

-    // FIXME Task 8: Implement a basic playable Link Game in JavaFX that only allows pieces to be placed in valid places
+                LockedPiece piece = new LockedPiece(p, xPeg, yPeg, rotation % 6, flip);
+                piece.setPosition(location);
+                g.getChildren().add(piece);
+            } else if (allPieces) {
+                FXPiece piece = new FXPiece(p);
+                piece.setPosition(-1);
+                g.getChildren().add(piece);
+            }
+        }
+    }
+
+    /**
+     * Creates the instruction image.
+     */
+    private void loadInstructions() {
+        ImageView instruction=new ImageView(new Image(Board.class.getResource(URI_BASE+"instruction.jpg").toString()));
+        instructions.getChildren().add(instruction);
+    }
+
+    /**
+     * Creates a visual overlay of a solution.
+     * @param solution A valid placement solution string.
+     */
+    private void loadHints(String solution) {
+        if (solution.length() != 36)
+            throw new IllegalArgumentException("Invalid solution string for loadHints");
+
+        // Reset hints on a new game.
+        hints.getChildren().clear();
+
+        createLockedPieces(solution, hints, false);
+    }
+
+    /**
+     * Creates the button controls (restart and new game) present in the bottom right corner of the game screen.
+     * Written by Yicong.
+     */
+    private void makeControls() {
+        Button button1 = new Button("New Game");
+        button1.setLayoutX(BOARD_WIDTH - 105);
+        button1.setLayoutY(BOARD_HEIGHT - 40);
+        button1.setOnAction(e -> {
+            Scene startScene= setWelcomeScene();
+            primaryStage.setScene(startScene);   // if the restart button is clicked, goes to the main
+        });
+        controls.getChildren().add(button1);
+        Button button2 = new Button("Restart");
+        button2.setLayoutX(BOARD_WIDTH - 80);
+        button2.setLayoutY(BOARD_HEIGHT - 80);
+        button2.setOnAction(e -> {
+            placement = startPlacement;
+            pieces.getChildren().clear();
+            createLockedPieces(startPlacement, pieces, true);
+        });
+        controls.getChildren().add(button2);
+    }
+
+    /**
+     * Modular class to create a button in setWelcomeScene.
+     * Written by Alex.
+     */
+    private class ImageButton extends ImageView {
+        ImageButton(int imageIndex, double x, double y) {
+            setImage(new Image(Board.class.getResource(URI_BASE+imageIndex+".png").toString()));
+            setStyle("-fx-background-color: transparent;");
+            setLayoutX(x);
+            setLayoutY(y);
+        }
+
+        // Alternate constructor, given the pieces are created on the same y coordinate.
+        ImageButton(int imageIndex, double x) {
+            setImage(new Image(Board.class.getResource(URI_BASE+imageIndex+".png").toString()));
+            setStyle("-fx-background-color: transparent;");
+            setLayoutX(x);
+            setLayoutY(450);
+        }
+    }
+
+    /**
+     * Creates the welcoming scene.
+     * Created by Yicong, modularised and tidied by Alex.
+     *
+     * @return The opening splash screen.
+     */
+    private Scene setWelcomeScene() {
+        System.out.println("Loading welcome splash...");
+
+        Group start= new Group();
+        Scene startScene = new Scene(start, BOARD_WIDTH, BOARD_HEIGHT);
+
+        //add background Image
+        Image background=new Image(Board.class.getResource("background.jpg").toString());
+
+        //add button easy , when click, there are 9 pieces already on board
+        ImageButton easyMode = new ImageButton(1, 100);
+        easyMode.setOnMouseReleased(e -> makeInitialPlacement(0));
+
+        //add button hard , when click, there are 6 pieces already on board
+        ImageButton hardMode = new ImageButton(2, 300);
+        hardMode.setOnMouseReleased(e -> makeInitialPlacement(1));
+
+        //add button hard , when click, there are 9 pieces already on board
+        ImageButton expertMode = new ImageButton(3, 500);
+        expertMode.setOnMouseReleased(e -> makeInitialPlacement(2));
+
+        //this button represents brand new game
+        ImageButton normalMode = new ImageButton(4, 700);
+        normalMode.setOnMousePressed(e -> makeInitialPlacement(3));
+
+        System.out.println(".buttons");
+
+        // some hints for the player to click on the button to enter the game
+        ImageView title = new ImageView(new Image(Board.class.getResource(URI_BASE+"title.jpg").toString()));
+        title.setLayoutX(0);
+        title.setLayoutY(550);
+
+        start.getChildren().add(new ImageView(background));
+        start.getChildren().add(easyMode);
+        start.getChildren().add(hardMode);
+        start.getChildren().add(expertMode);
+        start.getChildren().add(normalMode);
+        start.getChildren().add(title);
+
+        System.out.println(".gui");
+
+        this.startScene = startScene;
+        System.out.println("...done");
+        return startScene;
+    }
+
+    /**
+     * Initialises the main game page.
+     * Written by Yicong and Alex.
+     */
+    private void setMainScene() {
+        System.out.println("Loading game screen...");

-    // FIXME Task 9: Implement starting placements
+        Scene scene = new Scene(root, BOARD_WIDTH, BOARD_HEIGHT);
+        root.getChildren().add(pegs);
+        root.getChildren().add(hints);
+            hints.setOpacity(0);
+        root.getChildren().add(pieces);
+        root.getChildren().add(controls);
+        root.getChildren().add(warnings);
+        System.out.println(".resources");

-    // FIXME Task 11: Implement hints
+        createBoard();
+        loadInstructions();
+        makeControls();
+        System.out.println(".gui");

-    // FIXME Task 12: Generate interesting starting placements
+        Text ins = new Text(20, 30, "Press 'I' for Instructions");
+        ins.setFill(Color.DARKBLUE);
+        ins.setFont(new Font(20));
+        root.getChildren().add(ins);
+        System.out.println(".text");
+
+        scene.setOnKeyPressed(e -> {
+            if (e.getCode() == KeyCode.SLASH)
+                hints.setOpacity(0.2);
+            if (e.getCode() == KeyCode.I && !root.getChildren().contains(instructions))
+                root.getChildren().add(instructions);
+        });
+
+        scene.setOnKeyReleased(e -> {
+            if (e.getCode() == KeyCode.SLASH)   hints.setOpacity(0);
+            if (e.getCode() == KeyCode.I)       root.getChildren().remove(instructions);
+        });
+        System.out.println(".keys");
+
+        mainScene = scene;
+        System.out.println("...done");
+    }
+
+    /**
+     * Creates the victory splash on completing the game.
+     * Written by Alex.
+     */
+    private void setVictoryScene() {
+        System.out.println("Loading victory...");
+
+        Group vic = new Group();
+
+        Rectangle bg = new Rectangle(BOARD_WIDTH, BOARD_HEIGHT, Color.WHITE);
+        bg.setOpacity(0.8);
+        vic.getChildren().add(bg);
+
+        System.out.println(".background");
+
+        Text ins = new Text(BOARD_WIDTH / 2 - 100, BOARD_HEIGHT / 2 - 10, "You win!");
+        ins.setFill(Color.DARKBLUE);
+        ins.setFont(new Font(50));
+        vic.getChildren().add(ins);
+
+        System.out.println(".text");
+
+        Button returnButton = new Button("Return home");
+        returnButton.setPrefWidth(150);
+        returnButton.setPrefHeight(20);
+        returnButton.setLayoutX(BOARD_WIDTH / 2 - 75);
+        returnButton.setLayoutY(BOARD_HEIGHT * 3/4 - 10);
+        returnButton.setOnMouseReleased(e -> {
+            primaryStage.setScene(startScene);
+            root.getChildren().remove(vic);
+        });
+        vic.getChildren().add(returnButton);
+
+        System.out.println(".button");
+
+        root.getChildren().add(vic);
+        System.out.println("...done");
+    }
+
+    /**
+     * Loads some BGM.
+     * Written by Alex.
+     * Music is from Bensound and is distributed under the Creative Commons license.
+     */
+    private void loadMusic() {
+        System.out.println("Loading music...");
+
+        MediaPlayer music = new MediaPlayer(new Media(Board.class.getResource(URI_BASE + "music.mp3").toString()));
+
+        music.setAutoPlay(true);
+        music.setOnEndOfMedia(() -> music.seek(Duration.ZERO));
+        music.setVolume(0.2);
+        music.play();
+
+        System.out.println("...done");
+    }
+
+    /**
+     * Loads solutions from a provided file in the assets folder.
+     * Though it ended up unused, code is taken from T.J. Crowder on StackExchange.
+     */
+    private void loadSolutions() {
+//        try {
+//            try (FileInputStream in = new FileInputStream("assets/solutions.txt")) {
+//                for (int i = 0; i < 100; i++) {
+//                    byte b = (byte) in.read();
+//                    System.out.println(b);
+//                }
+//            } catch (FileNotFoundException e) {
+//                e.printStackTrace();
+//            }
+//        } catch (IOException e) {
+//            e.printStackTrace();
+//        }
+        System.out.println("Loading solutions...");
+
+        String line;
+        try (
+                InputStream fis = new FileInputStream("assets/solutions.txt");
+                InputStreamReader isr = new InputStreamReader(fis, Charset.forName("UTF-8"));
+                BufferedReader br = new BufferedReader(isr)
+        ) {
+            while ((line = br.readLine()) != null) {
+                solutions.add(line);
+            }
+        } catch (IOException e) {
+            e.printStackTrace();
+        }
+
+        System.out.println("...done");
+    }
+
+    public static void main(String[] args) {
+        launch(args);
+    }

     @Override
     public void start(Stage primaryStage) throws Exception {
+        Board.primaryStage = primaryStage;
+        primaryStage.setTitle("IQ Link");
+//        loadSolutions();
+        setWelcomeScene();
+        setMainScene();
+//        loadMusic(); // Doesn't run on a typical Unix system due to missing libraries. Works fine on Windows.

+        primaryStage.setScene(startScene);
+        primaryStage.show();
     }
 }
Only in comp1110-ass2/src/comp1110/ass2/gui: Viewer$GFXPiece.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Viewer.class
diff -ru -x .git ../master/comp1110-ass2/src/comp1110/ass2/gui/Viewer.java comp1110-ass2/src/comp1110/ass2/gui/Viewer.java
--- ../master/comp1110-ass2/src/comp1110/ass2/gui/Viewer.java	2016-10-14 12:45:36.000000000 +1100
+++ comp1110-ass2/src/comp1110/ass2/gui/Viewer.java	2016-10-14 12:47:07.000000000 +1100
@@ -1,14 +1,17 @@
 package comp1110.ass2.gui;

 import javafx.application.Application;
-import javafx.event.ActionEvent;
-import javafx.event.EventHandler;
 import javafx.scene.Group;
 import javafx.scene.Scene;
 import javafx.scene.control.Button;
 import javafx.scene.control.Label;
 import javafx.scene.control.TextField;
+import javafx.scene.image.Image;
+import javafx.scene.image.ImageView;
+import javafx.scene.input.KeyCode;
 import javafx.scene.layout.HBox;
+import javafx.scene.paint.Color;
+import javafx.scene.shape.Circle;
 import javafx.stage.Stage;

 /**
@@ -22,40 +25,88 @@

     /* board layout */
     private static final int SQUARE_SIZE = 100;
-    private static final int PIECE_IMAGE_SIZE = 3*SQUARE_SIZE;
     private static final double ROW_HEIGHT = SQUARE_SIZE * 0.8660254; // 60 degrees
-    private static final int VIEWER_WIDTH = 750;
-    private static final int VIEWER_HEIGHT = 500;
+    private static final int VIEWER_WIDTH = 933;
+    private static final int VIEWER_HEIGHT = 700;

     private static final String URI_BASE = "assets/";

     private final Group root = new Group();
     private final Group controls = new Group();
-    TextField textField;
+    private TextField textField;


+    public static void main(String[] args) {
+        launch(args);
+    }
+
     /**
      * Draw a placement in the window, removing any previously drawn one
+     * Written by Alex and Yicong.
      *
      * @param placement  A valid placement string
      */
-    void makePlacement(String placement) {
-        // FIXME Task 5: implement the simple placement viewer
+    private void makePlacement(String placement) {
+        // Will import a location, a piece, and a rotation.
+        while (root.getChildren().size() > 25)
+            root.getChildren().remove(root.getChildren().size()-1);      //remove any pieces before(acturally there's 24 circles at first)
+                                                                                  //break placement into pieceplacement
+        for(int i=0;i<placement.length()/3;i++)
+        {
+            char name = placement.charAt(3*i+1);                                    // pulls the name char
+            Character location = placement.charAt(3*i);                           // pulls the location char
+            Character rotation = placement.charAt(3*i+2);                           // pulls the rotation char
+
+            GFXPiece piece = new GFXPiece(name);                                      // creates the piece
+            int rMod = rotation - 'A';                                          // rotation step
+            double sMod = 1;
+            int iSize = SQUARE_SIZE * (int) sMod;
+            int row = (location - 'A') % 6;
+            int col = (location - 'A') / 6;
+            double x = 0;
+            if (col % 2 != 0)                                          // spacing on odd rows
+                x=iSize/2;                                            //I think the center's position have no relationship with rotation;
+            x = x + 25 + row * iSize;
+            double y = 25 + (ROW_HEIGHT * col);
+
+            piece.setX(x);                                                     //set center coordinate
+            piece.setY(y);
+
+            piece.setScaleX(sMod);                                              // scale pieces if needed
+            if (rMod > 5) piece.setScaleY(-sMod);                               // flips pieces
+            else piece.setScaleY(sMod);
+                                                                         // rotate in multiples of 60 deg
+            piece.setRotate(60 * rMod);
+            root.getChildren().add(piece);
+        }
     }

+    /**
+     * Creates an image of a piece given a character.
+     * Written by Alex.
+     */
+    private class GFXPiece extends ImageView {
+        GFXPiece(char id) {
+            setImage(new Image(Viewer.class.getResource(URI_BASE + id + ".png").toString()));
+        }
+    }

     /**
      * Create a basic text field for input and a refresh button.
+     * Provided by Steve Blackburn, added to by Alex.
      */
     private void makeControls() {
         Label label1 = new Label("Placement:");
         textField = new TextField ();
         textField.setPrefWidth(300);
         Button button = new Button("Refresh");
-        button.setOnAction(new EventHandler<ActionEvent>() {
-            @Override
-            public void handle(ActionEvent e) {
-                makePlacement(textField.getText());
+        button.setOnAction(e -> {
+            makePlacement(textField.getText());
+            textField.clear();
+        });
+        textField.setOnKeyPressed(k -> {                                    // because Steve should know programmers
+            if (k.getCode() == KeyCode.ENTER) {                             // better than thinking that they ever
+                makePlacement(textField.getText());                         // want to use a mouse.
                 textField.clear();
             }
         });
@@ -74,9 +125,25 @@

         root.getChildren().add(controls);

+
+        // ADD PEGS
+        for (int i=0;i<24;i++) {
+            int col = i / 6;
+            int row = i % 6;
+            double x = 0, y;
+            if (col % 2 != 0)
+                x =  SQUARE_SIZE / 2;
+            x= x + 25 + row * SQUARE_SIZE+150;
+            y = 25 + (ROW_HEIGHT * col)+150;
+
+
+            Circle a = new Circle(x,y,30, Color.GRAY);
+            root.getChildren().add(a);
+
+        }
         makeControls();

         primaryStage.setScene(scene);
         primaryStage.show();
     }
-}
+}
\ No newline at end of file
Only in comp1110-ass2/src/comp1110/ass2/gui/assets: 1.png
Only in comp1110-ass2/src/comp1110/ass2/gui/assets: 2.png
Only in comp1110-ass2/src/comp1110/ass2/gui/assets: 3.png
Only in comp1110-ass2/src/comp1110/ass2/gui/assets: 4.png
Only in comp1110-ass2/src/comp1110/ass2/gui/assets: instruction.jpg
Only in comp1110-ass2/src/comp1110/ass2/gui/assets: music.mp3
Only in comp1110-ass2/src/comp1110/ass2/gui/assets: title.jpg
Only in comp1110-ass2/src/comp1110/ass2/gui/assets: title.png
Only in comp1110-ass2/src/comp1110/ass2/gui/assets: warning.jpg
Only in comp1110-ass2/src/comp1110/ass2/gui: background.jpg
Only in comp1110-ass2/src: gittest
diff -ru -x .git ../master/comp1110-ass2/tests/comp1110/ass2/PegsForPiecePlacementTest.java comp1110-ass2/tests/comp1110/ass2/PegsForPiecePlacementTest.java
--- ../master/comp1110-ass2/tests/comp1110/ass2/PegsForPiecePlacementTest.java	2016-10-14 12:45:36.000000000 +1100
+++ comp1110-ass2/tests/comp1110/ass2/PegsForPiecePlacementTest.java	2016-10-14 12:47:07.000000000 +1100
@@ -23,6 +23,7 @@
     @Rule
     public Timeout globalTimeout = Timeout.millis(2000);

+
     void checkPegs(String test, int one, int two, int three) {
         int[] pegs = LinkGame.getPegsForPiecePlacement(test);
         assertTrue("Placement '" + test + "' returned a null pointer", pegs != null);
Only in comp1110-ass2/tests/comp1110/ass2: PieceMovementTest.java
Only in comp1110-ass2/tests/comp1110/ass2: PieceTest.java
Only in comp1110-ass2/tests/comp1110/ass2: updatePegsPiecePlacementTest.java
Only in comp1110-ass2: uml.png
Only in comp1110-ass2: uml_new.png
```
## Test log
```
--javac output--
Note: comp1110-ass2/src/comp1110/ass2/LinkGame.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.
----
java -cp comp1110-ass2/src:/Users/abbiewade/Desktop/comp1110/comp1110-tutors/bin/../ass2/ass2-1110-tests.jar:/Users/abbiewade/Desktop/comp1110/comp1110-tutors/bin/../ass2/hamcrest-core-1.3.jar:/Users/abbiewade/Desktop/comp1110/comp1110-tutors/bin/../ass2/junit-4.12.jar org.junit.runner.JUnitCore comp1110.ass2.PiecePlacementWellFormedTest
---
JUnit version 4.12
.....
Time: 0.016

OK (5 tests)

java -cp comp1110-ass2/src:/Users/abbiewade/Desktop/comp1110/comp1110-tutors/bin/../ass2/ass2-1110-tests.jar:/Users/abbiewade/Desktop/comp1110/comp1110-tutors/bin/../ass2/hamcrest-core-1.3.jar:/Users/abbiewade/Desktop/comp1110/comp1110-tutors/bin/../ass2/junit-4.12.jar org.junit.runner.JUnitCore comp1110.ass2.PlacementWellFormedTest
---
JUnit version 4.12
.....
Time: 0.024

OK (5 tests)

java -cp comp1110-ass2/src:/Users/abbiewade/Desktop/comp1110/comp1110-tutors/bin/../ass2/ass2-1110-tests.jar:/Users/abbiewade/Desktop/comp1110/comp1110-tutors/bin/../ass2/hamcrest-core-1.3.jar:/Users/abbiewade/Desktop/comp1110/comp1110-tutors/bin/../ass2/junit-4.12.jar org.junit.runner.JUnitCore comp1110.ass2.PegsForPiecePlacementTest
---
JUnit version 4.12
....
Time: 0.019

OK (4 tests)

java -cp comp1110-ass2/src:/Users/abbiewade/Desktop/comp1110/comp1110-tutors/bin/../ass2/ass2-1110-tests.jar:/Users/abbiewade/Desktop/comp1110/comp1110-tutors/bin/../ass2/hamcrest-core-1.3.jar:/Users/abbiewade/Desktop/comp1110/comp1110-tutors/bin/../ass2/junit-4.12.jar org.junit.runner.JUnitCore comp1110.ass2.PlacementValidTest
---
JUnit version 4.12
.....
Time: 0.047

OK (5 tests)

java -cp comp1110-ass2/src:/Users/abbiewade/Desktop/comp1110/comp1110-tutors/bin/../ass2/ass2-1110-tests.jar:/Users/abbiewade/Desktop/comp1110/comp1110-tutors/bin/../ass2/hamcrest-core-1.3.jar:/Users/abbiewade/Desktop/comp1110/comp1110-tutors/bin/../ass2/junit-4.12.jar org.junit.runner.JUnitCore comp1110.ass2.SolutionsTest
---
JUnit version 4.12
..
Time: 26.188

OK (2 tests)

```
