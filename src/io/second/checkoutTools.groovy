package io.second

def checkOutFrom(repoUrl, branchName) {
    git branch: branchName, url: repoUrl
}

return this
