git download and install into your pc


Microsoft Windows [Version 10.0.22621.1265]
(c) Microsoft Corporation. All rights reserved.

C:\Users\CC LAB>cd desktop

C:\Users\CC LAB\Desktop>cd 2A

C:\Users\CC LAB\Desktop\2A>git init
Initialized empty Git repository in C:/Users/CC LAB/Desktop/2A/.git/

C:\Users\CC LAB\Desktop\2A>git clone https://github.com/ashokp20/te-try-me.git
Cloning into 'te-try-me'...
remote: Enumerating objects: 16, done.
remote: Counting objects: 100% (16/16), done.
remote: Compressing objects: 100% (9/9), done.
remote: Total 16 (delta 0), reused 10 (delta 0), pack-reused 0
Receiving objects: 100% (16/16), done.

C:\Users\CC LAB\Desktop\2A>git status
On branch master

No commits yet

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        te-try-me/

nothing added to commit but untracked files present (use "git add" to track)

C:\Users\CC LAB\Desktop\2A>cd te-try-me

C:\Users\CC LAB\Desktop\2A\te-try-me>git status
On branch main
Your branch is up to date with 'origin/main'.

nothing to commit, working tree clean

C:\Users\CC LAB\Desktop\2A\te-try-me>git add .

C:\Users\CC LAB\Desktop\2A\te-try-me>git commit -m 'hello1'
Author identity unknown

*** Please tell me who you are.

Run

  git config --global user.email "you@example.com"
  git config --global user.name "Your Name"

to set your account's default identity.
Omit --global to set the identity only in this repository.

fatal: unable to auto-detect email address (got 'CC LAB@DESKTOP-M4SMC6P.(none)')

C:\Users\CC LAB\Desktop\2A\te-try-me> git config --global user.email "ashokp20@gmail.com"

C:\Users\CC LAB\Desktop\2A\te-try-me>git config --global user.name "ashok"

C:\Users\CC LAB\Desktop\2A\te-try-me>git add .

C:\Users\CC LAB\Desktop\2A\te-try-me>git commit -m 'hello'
[main b2c77f2] 'hello'
 1 file changed, 1 insertion(+)
 create mode 100644 how.txt

C:\Users\CC LAB\Desktop\2A\te-try-me>git push
Enumerating objects: 4, done.
Counting objects: 100% (4/4), done.
Delta compression using up to 12 threads
Compressing objects: 100% (2/2), done.
Writing objects: 100% (3/3), 268 bytes | 268.00 KiB/s, done.
Total 3 (delta 1), reused 0 (delta 0), pack-reused 0
remote: Resolving deltas: 100% (1/1), completed with 1 local object.
To https://github.com/ashokp20/te-try-me.git
   08846ab..b2c77f2  main -> main

C:\Users\CC LAB\Desktop\2A\te-try-me>git pull
Already up to date.

C:\Users\CC LAB\Desktop\2A\te-try-me>