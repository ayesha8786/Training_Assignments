Install GIT & make sure it is added into PATH.
Section 0 -Use GIT as local VCS. Steps to follow:
1.	Create a directory ‘project_dir’ & cd to ‘project_dir’.  
$ mkdir project_dir
$ cd project_dir
 
2.	Initialize git version database. (git init)
$ git init
Initialized empty Git repository in C:/Users/aymohamm/project_dir/.git/
3.	Create a new file index.html.
Created
4.	Check the git status. You should find index.html as untracked file.
$ git status 
On branch master
No commits yet
Untracked files:(use "git add <file>..." to include in what will be committed) index.html nothing added to commit but untracked files present (use "git add" to track)

5.	Stage the index.html file.
$ git add index.html
6.	Commit index.html
$ git commit -m “committing”
Output: [master (root-commit) 7e043f8] committing
1 file changed, 0 insertions(+), 0 deletions(-)
create mode 100644 index.html

7.	Make few changes in index.html & create a new file info.txt file.
Added few lines in index.html and created a new file info.txt
8.	Check git status. You should find index.html & info.txt as untracked files.
$ git rm –cached index.html
git status
On branch master
Changes to be committed:
  (use "git restore --staged <file>..." to unstage)
        deleted:    index.html

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        index.html
        info.txt.txt



	
9.	Configure GIT to ignore all txt files.
touch .gitignore – in git bash
A  .gitignore text document gets created in the folder.
Write the name of file to be ignored in .gitignore document and save.

10.	Again check the git status. You should find only index.html as untracked file.

Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
        modified:   .gitignore

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        index.html

11.	State & commit index.html
$ git add index.html
$ git commit -m “committing index.html ”
12.	Log all your comments so far.

 
13.	Make some changes in index.html
Added a few lines in index.html.
14.	Revert the change made in the previous step using git command.
$ git checkout index.html
Updated 1 path from the index.
15.	Again change index.html.
Added some more lines in index.html
16.	Stage index.html
$ git add index.html


17.	Revert back the last stage.
$ git checkout index.html
Updated 0 paths from the index
18.	Rename ‘add’ command to ‘my-add’.
$ git config --global alias.my-add add
19.	Using my_add command Stage index.html again & commit the changes.
$ git commit -m "committing index.html"
[master 14cd574] committing index.html
1 file changed, 2 insertions(+), 1 deletion(-)
20.	Revert the last commit.
$ git reset –hard

GIT Branching
Objective: Commit HTML, CSS & JavaScript assignments into GIT. 
SECTION-1 (HTML assignments) - Steps to follow:
21.	First take a backup of your assignments & projects. This is required because due to incorrect GIT operation you may lose your files.
22.	Create an empty directory ‘Assignments’ & cd to ‘Assignments’.
$ mkdir assignments
$ cd assignments
23.	Create a file README.txt inside ‘Assignments’ & write few lines about the contents of ‘Assignments’ folder.
Created new text document README.txt.
24.	Commit README.txt file.
$ git commit -m “Readme Committing”
25.	Now create a new branch ‘html-assignments’.
$git branch html-assignments
26.	Switch to ‘html-assignments’ branch.
$git checkout html-assignments.
                        or
$git switch html-assignments
27.	Copy all HTML assignments inside ‘Assignments’ folder.
Switch to master i.e assignments then
$git merge html-assignments

28.	Commit HTML assignments into ‘html-assignments’ branch.
$ git commit -m "first commit"
[master (root-commit) 52c46e7] first commit
2 files changed, 3 insertions(+)
create mode 100644 readme.txt
create mode 100644 welcome.txt

29.	Make minor changes into few files belonging to ‘html-assignments’ branch.
Added a few lines to the files.
30.	Commit those changed files.
$ git commit -m "commit"
[html-assignments aa1fe39] commit
 2 files changed, 3 insertions(+), 1 deletion(-)

31.	Switch to master branch.
$ git checkout master
32.	Make minor changes into README.txt file & commit those changes into master.
mdaye@LAPTOP-837S0HP4 MINGW64 ~/source/repos/assignment (master)
$ git add . 
mdaye@LAPTOP-837S0HP4 MINGW64 ~/source/repos/assignment (master)
$ git commit -m "commit"
[master bb9a3f2] commit
1 file changed, 1 insertion(+)

33.	Again switch to ‘html-assignments’ branch.
$git checkout html-assignments
Switched to branch 'html-assignments'
34.	Make minor changes into few files belonging to ‘html-assignments’ branch.
Add some more information to the text documents in html-assignments.
35.	Commit those changes.
mdaye@LAPTOP-837S0HP4 MINGW64 ~/source/repos/assignment (html-assignments)
$ git add .

mdaye@LAPTOP-837S0HP4 MINGW64 ~/source/repos/assignment (html-assignments)
$ git commit -m "commit"
[html-assignments b86f70f] commit
 3 files changed, 6 insertions(+), 3 deletions(-)
36.	Switch to master.
$ git checkout master
37.	Merge ‘html-assignments’ branch into master. Confirm all html assignments are shown in master.
$ git merge html-assignments
Auto-merging readme.txt
CONFLICT (content): Merge conflict in readme.txt
Automatic merge failed; fix conflicts and then commit the result.
mdaye@LAPTOP-837S0HP4 MINGW64 ~/source/repos/assignment (master|MERGING)
$ git add .
mdaye@LAPTOP-837S0HP4 MINGW64 ~/source/repos/assignment (master|MERGING)
$ git commit -m “commit”
[master 237e76f] commit
mdaye@LAPTOP-837S0HP4 MINGW64 ~/source/repos/assignment (master)
$ git merge html-assignments

38.	Finally delete the ‘html-assignments’ branch.
$ git branch -d html-assignments
Deleted branch html-assignments (was b86f70f).

SECTION-2 - (CSS assignments) Steps to follow:
1.	Create a new branch ‘css-assignments’.
$ git branch css-assignments

2.	Switch to ‘css-assignments’ branch.
$$ git checkout css-assignments
Switched to branch 'css-assignments'

3.	Copy all CSS assignments inside ‘Assignments’ folder.
mdaye@LAPTOP-837S0HP4 MINGW64 ~/source/repos/assignment (css-assignments)
$ git checkout master
Switched to branch 'master'
$ git merge css-assignments 
Updating 237e76f..4595496
Fast-forward
css.txt       | 1 +
readmecss.txt | 1 +
2 files changed, 2 insertions(+)
create mode 100644 css.txt
create mode 100644 readmecss.txt

4.	Commit CSS assignments into ‘css-assignments’ branch.
$ git checkout css-assignments
Switched to branch 'css-assignments'

mdaye@LAPTOP-837S0HP4 MINGW64 ~/source/repos/assignment (css-assignments)
$ git add .

mdaye@LAPTOP-837S0HP4 MINGW64 ~/source/repos/assignment (css-assignments)
$ git commit -m "commit"
[css-assignments 1db2a2d] commit
1	file changed, 1 insertion(+)
2	 create mode 100644 css.txt

5.	Make minor changes into README.txt file on line 1 belonging to ‘css-assignments’ branch.
Changed the line number 1 in README.txt
6.	Commit those changed files.
$ git commit -m "commit"
[css-assignments 4595496] commit
1 file changed, 1 insertion(+)
create mode 100644 readmecss.txt

7.	Switch to master branch.
$ git checkout master
Switched to branch 'master'
8.	Make minor changes into README.txt file on line 3 & commit those changes into master.
$ git commit -m "commit"
[master 1fff4e3] commit
 1 file changed, 1 insertion(+), 1 deletion(-)
9.	Again switch to ‘css-assignments’ branch.
$ git checkout css-assignments
Switched to branch 'css-assignments'

10.	Make minor changes into few files belonging to ‘css-assignments’ branch.
Modified some of the text files in css-assignments
11.	Commit those changes.
$ git commit -m "commit"
[css-assignments 20c7dd5] commit
 2 files changed, 4 insertions(+), 1 deletion(-)
12.	Switch to master.
$ git checkout master
Switched to branch 'master'
13.	Merge ‘css-assignments’ branch into master. Confirm all css assignments are shown in master.
$ git merge css-assignments
Auto-merging readme.txt
Merge made by the 'recursive' strategy.
css.txt    | 4 +++-
readme.txt | 3 ++-
2 files changed, 5 insertions(+), 2 deletions(-)

14.	Finally delete the ‘css-assignments’ branch
$ git branch -d css-assignments
Deleted branch css-assignments (was 20c7dd5).

SECTION-3 - (JavaScript assignments) Steps to follow:
1.	Create a new branch ‘js-assignments’.
$ git branch js-assignments

2.	Switch to ‘js-assignments’ branch.
$ git switch js-assignments
Switched to branch 'js-assignments'

3.	Copy all JavaScript assignments inside ‘Assignments’ folder.
$ git switch master
Switched to branch 'master'

mdaye@LAPTOP-837S0HP4 MINGW64 ~/source/repos/assignment (master)
$ git add .
mdaye@LAPTOP-837S0HP4 MINGW64 ~/source/repos/assignment (master)
$ git commit -m "js commit"
[master fefe635] js commit
1 file changed, 1 insertion(+)
create mode 100644 jsfile.txt
$ git merge js-assignments
Already up to date.

4.	Commit JavaScript assignments into ‘js-assignments’ branch.
mdaye@LAPTOP-837S0HP4 MINGW64 ~/source/repos/assignment (js-assignments)
$ git commit -m "js commit"

5.	Make minor changes into README.txt file on line 1 belonging to ‘js-assignments’ branch.
Modified
6.	Commit those changed files.
$ git commit -m "js commit"
[js-assignments 518106d] js commit
1 file changed, 1 insertion(+), 1 deletion(-)

7.	Switch to master branch.
$ git checkout master
Switched to branch 'master'
8.	Make minor changes into README.txt file on line 1 & commit those changes into master.
Modified line 1 in README.txt
9.	Again switch to ‘js-assignments’ branch.
$ git checkout js-assignments
Switched to branch 'js-assignments'
10.	Make minor changes into few files belonging to ‘js-assignments’ branch.
Modified few files in js-assignments branch
11.	Commit those changes.
$ git commit -m "js commit"
[js-assignments 518106d] js commit
1 file changed, 1 insertion(+), 1 deletion(-)

12.	Switch to master.
$ git checkout master
Switched to branch 'master'

13.	Merge ‘js-assignments’ branch into master. Confirm all JavaScript assignments are shown in master.
$ git merge css-assignments

14.	Finally delete the ‘js-assignments’ branch.
$ git branch -d css-assignments
Deleted branch css-assignments (was 20c7dk6).

GIT Remoting
Objective: Pushing source code into GITHUB & collaborate team members. 
SECTION-3 (Pushing assignments to remote repository) - Steps to follow:
39.	Create a github account if you do not have already.
•	Open github page then click on sign up to github account.
•	Enter username and password to create account.
•	Created the github account.
40.	Login on into github account.
•	Open github page ang click on login
•	Enter username and password
•	Successfully Login done.
41.	Create new public repository ‘freshersbatch-oct16’.
•	Click on new Repository
•	Enter Repository name
•	Select public and click on create repository.
42.	Commit & push any sample file to this repository under ‘Assignments’ directory.
$ git remote add origin https://github.com/ayesha8786/FreshersBatch-Jan22.git
$ git push origin master

SECTION-4 (Pushing source code to remote repository using Eclipse GIT plugin) - Steps to follow:
1.	One developer from project team will create eclipse projects ‘SampleProj’ & add sample source code files. Then commit all files through eclipse GIT plugin.
•	Open Eclipse IDE then switch to git perspective.
•	Select add on existing local repository.
•	Then browse the repository folder and add to it.
•	Select to clone a repository and that enter our github url then select next and finish.
2.	Collaborate other team members with your github account so that they can also modify the committed files. 
3.	Other developers from same team will checkout all files from remote repository. This might get conflicts since certain files fail to merge. In such case, merge it manually.
4.	Commit & push the ‘SampleProj’ project.
•	Right click on the project and select team.
•	Select commit
•	We get stagging view then select commit
•	Then right click on the project and select team
•	In that menu select push branch master


