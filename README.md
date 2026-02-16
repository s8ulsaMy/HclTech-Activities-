Professional Workflow: Pull Requests (PR)
To keep the main branch clean and stable, we use a branch-and-merge workflow. Do not push directly to main.


Step 1: Sync your local machine
Before starting new work

git checkout main
git pull origin main


Step 2: Create a Feature Branch
Create a new branch for the specific module or task you are working on:


git checkout -b feature/module-name


Step 3: Commit and Push
Work on your code inside your specific sub-folder (e.g., Module_2), then:


git add .
git commit -m "Brief description of what you did"
git push origin feature/module-name


