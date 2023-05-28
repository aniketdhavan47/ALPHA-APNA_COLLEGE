Git download and install into your pc


Windows PowerShell
Copyright (C) 2009 Microsoft Corporation. All rights reserved.

PS D:\TE> git clone https://github.com/ashokp20/te-try-me.git
Cloning into 'te-try-me'...
remote: Enumerating objects: 3, done.
remote: Counting objects: 100% (3/3), done.
remote: Total 3 (delta 0), reused 0 (delta 0), pack-reused 0
Receiving objects: 100% (3/3), done.
PS D:\TE> git status
fatal: not a git repository (or any of the parent directories): .git
PS D:\TE> cd te-try-me
PS D:\TE\te-try-me> git status
On branch main
Your branch is up to date with 'origin/main'.

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        link.md

nothing added to commit but untracked files present (use "git add" to track)
PS D:\TE\te-try-me> git add .
PS D:\TE\te-try-me> git commit -m 'hello'
[main ca5025c] hello
 1 file changed, 1 insertion(+)
 create mode 100644 link.md
PS D:\TE\te-try-me> git push
Enumerating objects: 4, done.
Counting objects: 100% (4/4), done.
Delta compression using up to 4 threads
Compressing objects: 100% (2/2), done.
Writing objects: 100% (3/3), 281 bytes | 281.00 KiB/s, done.
Total 3 (delta 0), reused 0 (delta 0), pack-reused 0
To https://github.com/ashokp20/te-try-me.git
   bbb8f70..ca5025c  main -> main
PS D:\TE\te-try-me> git pull
Already up to date.
PS D:\TE\te-try-me> git pull
remote: Enumerating objects: 5, done.
remote: Counting objects: 100% (5/5), done.
remote: Compressing objects: 100% (2/2), done.
remote: Total 3 (delta 0), reused 0 (delta 0), pack-reused 0
Unpacking objects: 100% (3/3), 679 bytes | 4.00 KiB/s, done.
From https://github.com/ashokp20/te-try-me
   ca5025c..bb87ac0  main       -> origin/main
Updating ca5025c..bb87ac0
Fast-forward
 link.md | 3 ++-
 1 file changed, 2 insertions(+), 1 deletion(-)
PS D:\TE\te-try-me>

